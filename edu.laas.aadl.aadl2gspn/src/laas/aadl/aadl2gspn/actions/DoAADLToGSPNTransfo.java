/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn.actions;

import java.util.Hashtable;
import java.util.Iterator;

import laas.aadl.aadl2gspn.CompleteTransformationAADL2GSPN;
import laas.aadl.aadl2gspn.PN2Surf;
import laas.aadl.aadl2gspn.Structure;
import laas.aadl.aadl2gspn.TransfomNameMatchingPropag;
import laas.aadl.aadl2gspn.TransformComplementaryNameMatchingPropag;
import laas.aadl.aadl2gspn.TransformGuardEvent;
import laas.aadl.aadl2gspn.TransformGuardIn;
import laas.aadl.aadl2gspn.TransformGuardOut;
import laas.aadl.aadl2gspn.TransformGuardTransition;
import laas.aadl.aadl2gspn.TransformIsolated;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.osate.aadl2.Element;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.ui.actions.AaxlModifyActionAsJob;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;

import PetriNet.PetriNet;
import PetriNet.PetriNetFactory;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.laas.aadl.dependency.AADLDependabilityModel;

public class DoAADLToGSPNTransfo extends AaxlModifyActionAsJob {
	protected PetriNet pn;

	/**
	 * returns the aadlResource (file) that will contain the resulting petri net
	 * @param si SystemInstance 
	 * @return Resource
	 * 
	 */
	protected Resource buildPetriNetFile(SystemInstance si) {
		URI Instanceuri = si.eResource().getURI();
		URI PNmodel_URI = Instanceuri.trimSegments(1).appendSegment(si.getName());
		PNmodel_URI = PNmodel_URI.appendFileExtension("pn");
		return OsateResourceUtil.getEmptyAaxl2Resource(PNmodel_URI);
	}


	protected String getActionName() {
		return "AADL2GSPN Transformation for dependability analysis";
	}

	
	
	protected void doAaxlAction(IProgressMonitor monitor, Element obj) {
		try {
			monitor.beginTask("AADL2GSPN Transformation",1);
//			getErrorManager().getReporter(root.eResource()).deleteMessages();
			// get root object of model get system instance
			SystemInstance si = ((InstanceObject)obj).getSystemInstance();
			if (si == null) {
				error(obj, "no system instance specified");
			} 
			else {
				// create a new AADLDependabilityModel object and run it over the instance model
				AADLDependabilityModel a2g = new AADLDependabilityModel();
				EList UpperComponentsEM = a2g.processPreOrderComponentInstanceStop(si);
				if (UpperComponentsEM == null || UpperComponentsEM.size() == 0) {
					info(si, " No component of the model has an error annex subclause ");
				} 
				else {
					pn = PetriNetFactory.eINSTANCE.createPetriNet();
					Resource petriNetResource = this.buildPetriNetFile(si);
					EList intermediaryPlacesList = new BasicEList(); 
					// for each component in the list to process	
					
					for (Iterator it = UpperComponentsEM.iterator(); it.hasNext();) {
						InstanceObject currentCompOrConnection =  (InstanceObject) it.next();
						// transformation step 1: as if it were isolated 
						ErrorModelImplementation emi = TransformIsolated.IsolatedEM2PetriNet(currentCompOrConnection, pn);
						if (emi == null){
							error (currentCompOrConnection, "No Error Model Implementation to transform");
						}
						//transformation step 2: name matching propagations
						Hashtable complementaryInfoList = TransfomNameMatchingPropag.NameMatchingPropag2PetriNet(currentCompOrConnection, emi, UpperComponentsEM, pn);
						//put all the propagation places in the list that will be used to complete the
						//petri net with the necessary evacuation transitions
						intermediaryPlacesList.addAll(Structure.putHashtableElementsInList(complementaryInfoList));
						//transformation step 3: complementary name matching propagations
						TransformComplementaryNameMatchingPropag.ComplementaryNameMatchingPropag2PetriNet(pn, currentCompOrConnection, complementaryInfoList);
					}// end for each component
					
					EList allComponentsWithGuardTransitionProp = new BasicEList();
					for (Iterator it = UpperComponentsEM.iterator(); it.hasNext();) {
						InstanceObject currentCompOrConnection =  (InstanceObject) it.next();
						if (currentCompOrConnection instanceof ComponentInstance){
							//transformation step 4: Guard_Ins (only for COMPONENT instances)		
							EList otherIntermediaryPlaces ;
								TransformGuardIn.GuardIns2PetriNet((ComponentInstance) currentCompOrConnection, UpperComponentsEM, pn);
							
							//transformation step 5: Guard_Outs (only for COMPONENT instances)		
							otherIntermediaryPlaces = TransformGuardOut.GuardOuts2PetriNet((ComponentInstance) currentCompOrConnection, UpperComponentsEM, pn);
							intermediaryPlacesList.addAll(otherIntermediaryPlaces);
							otherIntermediaryPlaces.clear();
							//transformation step 6: Guard_Events (only for COMPONENT instances)		
							EList l = TransformGuardEvent.GuardEvents2PetriNet(pn, (ComponentInstance)currentCompOrConnection, UpperComponentsEM);
							intermediaryPlacesList.addAll((EList) l.get(0));
							EList componentsWithGuardTransitionProp = (EList) l.get(1);
							allComponentsWithGuardTransitionProp.addAll(componentsWithGuardTransitionProp);	
						}
					}
					for(Iterator it = allComponentsWithGuardTransitionProp.iterator(); it.hasNext();){
						//transformation step 7: Guard_Transitions (only for COMPONENT instances)		
						ComponentInstance ci = (ComponentInstance) it.next();
						TransformGuardTransition.GuardTransitions2PetriNet(ci, UpperComponentsEM, pn);					
					}
					//transformation step 8: General rule for emptying GSPN propagation places (only for COMPONENT instances)		
					
					CompleteTransformationAADL2GSPN.completePetriNet(pn, intermediaryPlacesList);
					petriNetResource.getContents().add(pn);	//write to file
					OsateResourceUtil.save(petriNetResource);
					monitor.done();	
					PN2Surf.PN2Surf2(pn, si, UpperComponentsEM, "Net");

				} // end else
			} // end else
		
	}
		catch (Throwable e) {
			System.out.println(" ===========================");
			e.printStackTrace();
		}
	}// end method

} // end class
