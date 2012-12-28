/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Feature;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;

/**
 * This class contains methods used to transform 
 * Guard_Out properties into Petri subnets
 * 
 * @author Marilena Bruffa
 *
 */

public class TransformGuardOut {

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList
	 * @param pn PetriNet
	 * @return intermediaryPlaces EList containing objects of class Structure, they represent
	 * all the propagation places created in the transformation
	 */
	public static EList GuardOuts2PetriNet(ComponentInstance ci, EList UpperComponentsEM, PetriNet pn){
		EAXUtil utilEMA = new EAXUtil();
		EList intermediaryPlaces = new BasicEList();
		EList fiList = ci.getFeatureInstances();
		//for each feature of the current components looks for guard_out property
		for(Iterator it=fiList.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance) it.next();
			Feature f = fi.getFeature();
			OutErrorPropagationGuard guardOut = utilEMA.getOutErrorPropagationGuard(ci, f);
			if (guardOut != null){
				intermediaryPlaces.addAll(GuardOut2PetriNet(ci, fi, guardOut, UpperComponentsEM, pn));
			}
		}
		return intermediaryPlaces;
	}

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param fi FeatureInstance
	 * @param guardOut OutErrorPropagationGuard
	 * @param UpperComponentsEM EList
	 * @param pn PetriNet
	 * @return EList of Structure objects representing out propagations
	 */
	private static EList GuardOut2PetriNet(ComponentInstance ci, FeatureInstance fi, OutErrorPropagationGuard guardOut, EList UpperComponentsEM, PetriNet pn) {
		EList intermediaryPlaces = new BasicEList();
		EList rules = guardOut.getErrorPropagationRule();
		//for each error propagation rule get the boolean error expression
		for (Iterator it_epr = rules.iterator(); it_epr.hasNext();){
			ErrorPropagationRule epr = (ErrorPropagationRule)it_epr.next();
			//gets the out error propagation and transforms it in a PN place
			if(!epr.isMask()){
				String propName = epr.getErrorPropagation().getName();
				String propPlaceName = ci.getInstanceObjectPath()+"_"+propName+"_"+fi.getName();
				Place propPlace = ErrorModel2PetriNet.createNamedPlace(pn, propPlaceName);
				Structure s = new Structure(null,propPlace,null);
				intermediaryPlaces.add(s);
				//get the boolean error expression and transform it in the disjunctive normal form
				BooleanErrorExpression bee = epr.getErrorExpression();
				EList or = ToDisjunctiveNormalForm.make_canonical(ci, bee, rules, UpperComponentsEM);
				if (or == null) {
					//TODO
					// use a newly-defined marker instead of: error(bee, "Error in Guard_Out expression (property not handled)");
				}
				else{
					for(Iterator it_or = or.iterator(); it_or.hasNext();){
						EList and = (EList) it_or.next();
						EList moreIntermediaryPlaces = transformGuardOutIntoPNSubnet(pn, ci, propPlace, fi, propName, and, UpperComponentsEM);
						//intermediaryPlaces.addAll(moreIntermediaryPlaces);
					}//end for each element in the or list
				}//end if or == null
			}//end if mask
		}// for each error propagation rule
		return intermediaryPlaces;

	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param ci ComponentInstance
	 * @param propPlace Place
	 * @param fi FeatureInstance
	 * @param propName String
	 * @param and EList
	 * @param UpperComponentsEM EList
	 * @return intermediaryPlaces EList
	 */
	private static EList transformGuardOutIntoPNSubnet(PetriNet pn, ComponentInstance ci,Place propPlace, FeatureInstance fi, String propName, EList and, EList UpperComponentsEM) 
	{
		EList intermediaryPlaces = new BasicEList();
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();			
		EList l = ErrorModel2PetriNet.createErrorGuardSenderSideLogic(pn, ci, fsrem, and, UpperComponentsEM, false); 
		intermediaryPlaces = (EList) l.get(0);
		EList toCombine = (EList) l.get(1);
		// comb is a list of BooleanExpression objects 
		// corresponding to extended conjunctions of the Guard bool exp 
		EList comb = Combination.combineBooleanExpressions(toCombine, and.size());
		createGuardOutSubnet(ci, fsrem, fi, propPlace, propName, comb, pn, UpperComponentsEM);	
		return intermediaryPlaces;
	}

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param fsrem FindSenderOrReceiverErrorModel
	 * @param fi FeatureInstance
	 * @param propPlace Place
	 * @param propName String
	 * @param comb EList
	 * @param pn PetriNet
	 * @param UpperComponentsEM EList
	 */
	private static void createGuardOutSubnet(ComponentInstance ci, FindSenderOrReceiverErrorModel fsrem, FeatureInstance fi, Place propPlace, String propName, EList comb, PetriNet pn, EList UpperComponentsEM) {
		int internal_suffix = 0;
		for(Iterator it = comb.iterator(); it.hasNext();){
			BooleanExpression be = (BooleanExpression) it.next();
			EList operands = be.getExpression();
			for(Iterator it2 = operands.iterator(); it2.hasNext();){
				internal_suffix++;
				BooleanOperand bo = (BooleanOperand) it2.next(); 
				String t_name = propName+"_guardout_" + fi.getName()+"_"+ internal_suffix;
				Transition t_out = ErrorModel2PetriNet.createNamedTransition(pn, ci, t_name, "1");
				//add inhibitor arc from propagation place to transition t_out
				//and a direct arc from transition t_out to propagation place
				ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, propPlace, t_out);
				ErrorModel2PetriNet.link1TransitionPlace(pn, t_out, propPlace);
				for(Iterator it3 = bo.getOperands().iterator(); it3.hasNext();){
					BooleanVariable bv = (BooleanVariable) it3.next();
					Place origin = bv.getPlace();
					//add inhibitor or bidirectional arcs from the sender place to transition t_out
					if(bv.getNot()){
						ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, origin, t_out);
					}
					else{
						ErrorModel2PetriNet.link2PlacesTransition(pn, origin, origin, t_out);
					}
				}
				// create the subnet linking the outProp place to the receivers
				Hashtable guardOutReceivers = fsrem.getGuardOutReceivers(ci, fi, propName, UpperComponentsEM);
				for (Enumeration e = guardOutReceivers.keys(); e.hasMoreElements();) {
					int suffix = 0;
					InstanceObject currentReceiver = (InstanceObject) e.nextElement();
					// get the list of source/dest error states in the current receiver
					EList coupleList = (EList) guardOutReceivers.get(currentReceiver);
					for (Iterator itCouple = coupleList.iterator(); itCouple.hasNext();) {
						// for each couple, create one PN transition and then link it to
						// the (existing) places
						EList currentCouple = (EList) itCouple.next();
						suffix++;
						String name = currentReceiver.getInstanceObjectPath()+"_" + propName+ "_" + suffix;
						Transition t_in = ErrorModel2PetriNet.createNamedTransition(pn, ci, name, "1");
						// add the arcs
						String srcPlaceName_in = currentReceiver.getInstanceObjectPath()+ "_" + ((ErrorState) currentCouple.get(0)).getName();
						Place srcPlace_in = ErrorModel2PetriNet.createNamedPlace(pn,(ErrorState) currentCouple.get(0), currentReceiver,srcPlaceName_in);
						String destPlaceName_in = currentReceiver.getInstanceObjectPath().concat("_").concat(((ErrorState) currentCouple.get(1)).getName());
						Place destPlace_in = ErrorModel2PetriNet.createNamedPlace(pn,(ErrorState) currentCouple.get(1), currentReceiver,destPlaceName_in);
						ErrorModel2PetriNet.link3PlacesTransition(pn,propPlace, srcPlace_in, destPlace_in, t_in);
						ErrorModel2PetriNet.link1TransitionPlace(pn, t_in, propPlace);
					}// end for each receiver couple
				}
			}	
		}

	}
}