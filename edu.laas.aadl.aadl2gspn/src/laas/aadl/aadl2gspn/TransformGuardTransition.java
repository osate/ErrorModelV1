/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.internal.impl.ComponentImpl;
import org.osate.aadl2.ComponentImplementation;
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.ModeInstance;
import org.osate.aadl2.instance.ModeTransitionInstance;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;

/**
 * 
 * This class contains methods used to transform a Guard_Transition property into 
 * a subnet of the the existing petri net
 * 
 * @author Marilena Bruffa
 *
 */
public class TransformGuardTransition{

	public static void GuardTransitions2PetriNet(ComponentInstance ci, EList UpperComponentsEM, PetriNet pn){
		EAXUtil util = new EAXUtil();
		EList features = ci.getFeatureInstances();
		//for each event port looks for guard_transition property
		for(Iterator it = features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance) it.next();
			int fc = fi.getCategory().getValue();
			if(fc == FeatureCategory.EVENT_PORT_VALUE){
				Feature f = fi.getFeature();
				ComponentImplementation featureContext=fi.getContainingComponentImpl();
				ModeTransitionGuard guardTransition = util.getModeTransitionGuard(ci, (EventPort)f, featureContext);
				if(guardTransition != null){
					GuardTransitionToPetriNet(pn,ci,fi,guardTransition,UpperComponentsEM);
				}
			}
		}
	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param ci ComponentInstance
	 * @param fi FeatureInstance, it is an event port
	 * @param guardTransition ModeTransitionGuard
	 * @param upperComponentsEM EList
	 */
	private static void GuardTransitionToPetriNet(PetriNet pn, ComponentInstance ci, FeatureInstance fi, ModeTransitionGuard guardTransition, EList upperComponentsEM) {
		//gets the BooleanErrorExpression and puts it in the DNF
		BooleanErrorExpression bee = guardTransition.getErrorExpression();
		EList or = ToDisjunctiveNormalForm.make_canonical(ci, bee, new BasicEList(), upperComponentsEM);
		int suffix = 1;
		for(Iterator it = or.iterator(); it.hasNext();){
			EList and = (EList)it.next();
			createGuardTransitionSubnet(pn,ci,and,fi,suffix,upperComponentsEM);
			suffix++;
		}
	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param ci ComponentInstance
	 * @param and EList, it represents a disjunt of the boolean error expression in DNF
	 * @param fi FeatureInstance
	 * @param suffix int
	 * @param upperComponentsEM EList
	 */
	private static void createGuardTransitionSubnet(PetriNet pn, ComponentInstance ci, EList and, FeatureInstance fi, int suffix, EList upperComponentsEM) {
		int internal_suffix = 1;
		Transition t_guard_trans = null;
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		//gets all the combinations of senders propagation places
		EList l = ErrorModel2PetriNet.createErrorGuardSenderSideLogic(pn, ci, fsrem, and, upperComponentsEM, true);
		EList toCombine = (EList) l.get(1);
		EList comb = Combination.combineBooleanExpressions(toCombine, and.size());
		//for each combination
		for(Iterator it_c = comb.iterator(); it_c.hasNext();){
			BooleanExpression be = (BooleanExpression) it_c.next();
			//for each operand in the combination creates a petri net transition  
			for(Iterator it_b = be.getExpression().iterator(); it_b.hasNext();){
				BooleanOperand bo = (BooleanOperand) it_b.next();
				EList modeTransitions = ci.getModeTransitionInstances();
				int suff = 1;
				String t_name = "guard_trans_" + fi.getName() + "_" + suffix + "_" + internal_suffix++ +"_"+suff++;;
				t_guard_trans = ErrorModel2PetriNet.createNamedTransition(pn, ci, t_name, "1");
				//looks for mode transition triggered by the event port represented by fi
				for(Iterator it = modeTransitions.iterator(); it.hasNext();){
					ModeTransitionInstance mti = (ModeTransitionInstance) it.next();
					if(isAModeTransitionTrigger(mti, fi)){
						//finds source and destination modes and creates the corresponding places
						ModeInstance src = mti.getSource();
						String name = ci.getInstanceObjectPath()+"_"+src.getName();
						Place srcPlace = ErrorModel2PetriNet.createNamedPlace(pn, name);
						if (src.getMode().isInitial())
							srcPlace.setInitialMarking(1);
						ModeInstance dst = mti.getDestination();
						name = ci.getInstanceObjectPath()+"_"+dst.getName();
						Place dstPlace = ErrorModel2PetriNet.createNamedPlace(pn, name);
						if (dst.getMode().isInitial())
							dstPlace.setInitialMarking(1);
						//links the places to the transition
						ErrorModel2PetriNet.link2PlacesTransition(pn, srcPlace, dstPlace, t_guard_trans);	
					}
				}
				createGuardTransitionSenderSideSubnet(pn, ci, bo, t_guard_trans, upperComponentsEM);
			}
		}
	}

	/**
	 * 
	 * This method creates the sender side part of the guard_transition subnet
	 * 
	 * @param pn PetriNet
	 * @param ci ComponentInstance
	 * @param bo BooleanOperand
	 * @param t_guard_trans Transition
	 * @param upperComponentsEM EList
	 */
	private static void createGuardTransitionSenderSideSubnet(PetriNet pn, ComponentInstance ci, BooleanOperand bo, Transition t_guard_trans, EList upperComponentsEM) {
		//for each propagation place adds the necessary arcs
		for(Iterator it = bo.getOperands().iterator(); it.hasNext();){
			BooleanVariable bv = (BooleanVariable) it.next();
			Place senderPlace = bv.getPlace();
			if(bv.getNot()){
				//add inhibitor arc
				ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, senderPlace, t_guard_trans);
			}
			else{
				//add bidirectional arc
				ErrorModel2PetriNet.link2PlacesTransition(pn, senderPlace, senderPlace, t_guard_trans);
			}
		}
	}

	/**
	 * 
	 * This method tests if a feature passed as parameter is a trigger for a given
	 * mode transition
	 * 
	 * @param mti ModeTransition whose elements are objects of class EventPort
	 * @param fi FeatureInstance
	 * @return boolean 
	 */
	private static boolean isAModeTransitionTrigger(ModeTransitionInstance mti, FeatureInstance fi){
		EList triggerPorts = mti.getModeTransition().getOwnedTriggers();
		for(Iterator it = triggerPorts.iterator(); it.hasNext();){
			// TODO case from ModeTransitionTriggers to eventPort
			EventPort port = (EventPort) it.next();
			if(port.getName().equals(fi.getName()))
				return true;	
		}
		return false;
	}
}