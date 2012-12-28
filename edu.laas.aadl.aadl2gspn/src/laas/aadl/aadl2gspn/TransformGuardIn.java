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

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Feature;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureInstance;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;
import edu.laas.aadl.dependency.hasAbstractEM;


/**
 * 
 * This class contains methods used to transform 
 * Guard_In properties into Petri subnets
 * 
 * @author Ana Rugina, Marilena Bruffa
 *
 */
public class TransformGuardIn {

	/**
	 * This method looks for all the guard_in properties defined for the given component 
	 * ci in order and transforms them into a relative subnet of the Petri Net
	 * @param ci ComponentInstance it represents the component with the guard_in(s)
	 * @param UpperComponentsEM EList of components with Error Model, to be taken into account
	 * @param pn Petri Net to which attach the guard_in subnet
	 * @return intermediaryPlaces Elist of all propagation places created in the transformation
	 * 
	 */
	public static void GuardIns2PetriNet(ComponentInstance ci, EList UpperComponentsEM, PetriNet pn){
		EAXUtil utilEMA = new EAXUtil();
		EList fiList = ci.getFeatureInstances();
		// for each feature instance get Guard_In and call the transformation method
		for (Iterator it_fi = fiList.iterator(); it_fi.hasNext();){
			FeatureInstance fi = (FeatureInstance) it_fi.next();
			Feature f = fi.getFeature();
			InErrorPropagationGuard GuardIn = utilEMA.getInErrorPropagationGuard(ci, f);
			if (GuardIn != null){
				GuardIn2PetriNet(ci, f, GuardIn, UpperComponentsEM, pn);
			}// end if
		}// end for each feature instance
	//	return intermediaryPlaces;
	}// end method

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param GuardIn InErrorPropagationGuard
	 * @param UpperComponentsEM EList
	 * @param pn PetriNet
	 * @return intermediaryPlaces EList 
	 */
	protected static void GuardIn2PetriNet(ComponentInstance ci, Feature f, InErrorPropagationGuard GuardIn, EList UpperComponentsEM, PetriNet pn){
		int suffix;

		EList eprList = GuardIn.getErrorPropagationRule();
		//for each error propagation rule get the boolean error expression
		for (Iterator it_epr = eprList.iterator(); it_epr.hasNext();){
			ErrorPropagationRule epr = (ErrorPropagationRule)it_epr.next();
			if(!epr.isMask()){
			//gets the in error propagation name
			String propName = epr.getErrorPropagation().getName();
			suffix = 1;
			
				//get the boolean error expression and transform it in the disjunctive normal form
				BooleanErrorExpression bee = epr.getErrorExpression();
				EList rules = GuardIn.getErrorPropagationRule();
				EList or = ToDisjunctiveNormalForm.make_canonical(ci, bee, rules, UpperComponentsEM);
				if (or == null) {
					//TODO
					// use a newly-defined marker instead of: error(bee, "Error in Guard_In expression (property not handled)");
				}
				else{
					//for each element in the or list creates the receiver side subnet and
					//then the sender side subnet
					for (Iterator it_or = or.iterator(); it_or.hasNext();){
						EList and = (EList) it_or.next();
						transformGuardInIntoPNSubnet(pn, ci, f, propName, and, suffix, UpperComponentsEM);
						suffix = suffix + 1;
					}//end for each element in the or list
				}//end if or == null
			}//end if mask
		}// for each error propagation rule
	
	}// end method

	/**
	 * This method creates the whole guard in subnet, this means that it finds the 
	 * senders of the error state or propagation and for each of them it creates the
	 * corresponding guard_in transitions and link them to the places corresponding to 
	 * sender and receiver
	 *
	 * @param pn PetriNet
	 * @param ci ComponentInstance for which the guard_in is defined
	 * @param f Feature
	 * @param propName String the name of the in error propagation
	 * @param and EList, a single element of the or list
	 * @param int suffix, to build the name of the transitions
	 * @param UpperComponentsEM EList
	 * @return EList of Structure objects corrsponding to propagation places
	 * 
	 * @author Marilena Bruffa
	 */
	protected static void transformGuardInIntoPNSubnet(PetriNet pn, ComponentInstance ci, Feature f, String propName, EList and, int suffix, EList UpperComponentsEM){
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();			
		EList l = ErrorModel2PetriNet.createErrorGuardSenderSideLogic(pn, ci, fsrem, and, UpperComponentsEM, false); 
		EList toCombine = (EList) l.get(1);		
		EList comb = Combination.combineBooleanExpressions(toCombine, and.size());
		createGuardInSubnet(ci, f, propName, comb, suffix, pn);
	}

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param f Feature
	 * @param propName String
	 * @param comb EList
	 * @param suffix int
	 * @param pn PetriNet
	 */
	protected static void createGuardInSubnet(ComponentInstance ci, Feature f, String propName, EList comb, int suffix, PetriNet pn){
		int internal_suffix = 1;
		Transition t_in = null;
		//get error model of the receiver
		ErrorModelImplementation emi = hasAbstractEM.getErrorModelImplementation(ci);
		//get the list of trigger transitions declared in the error model
		EList ets = emi.getErrorTransitions().getErrorTransition();
		for(Iterator it = comb.iterator(); it.hasNext();){
			BooleanExpression be = (BooleanExpression) it.next();
			EList expr = be.getExpression();
			for(Iterator it2 = expr.iterator(); it2.hasNext();){
				BooleanOperand bo = (BooleanOperand) it2.next();
				for(Iterator it_t = ets.iterator();it_t.hasNext();){
					ErrorTransition et=(ErrorTransition)it_t.next();
					EList triggers = et.getTransitionTrigger();
					for (Iterator it_n = triggers.iterator();it_n.hasNext();){
						ErrorEventOrPropagation trigger = (ErrorEventOrPropagation)it_n.next();
						//if the trigger is the in propagation declared in the guard_in property
						if(trigger.getName().equals(propName)){
							//get origin/dest places 
							EList sources = et.getOrigin();
							ErrorState dest = et.getDestination();
							String placeName = ci.getInstanceObjectPath() + "_" + dest.getName();
							Place destPlace = ErrorModel2PetriNet.getPlaceByName(pn, placeName);
							//creates the transition that represents the guard in and link it to the 
							//destination place
							String name = propName + "_guardin_"+ f.getName()+ "_" + suffix + "_" + internal_suffix;
							t_in = ErrorModel2PetriNet.createNamedTransition(pn, ci, name, "1");
							ErrorModel2PetriNet.link1TransitionPlace(pn, t_in, destPlace);
							internal_suffix++;
							//add arcs for the receiver side
							//for each origin state gets the relative place and links it to the transition
							for(Iterator it_s = sources.iterator();it_s.hasNext();){
								ErrorState src = (ErrorState)it_s.next();
								placeName = ci.getInstanceObjectPath() + "_" + src.getName();
								Place originPlace = ErrorModel2PetriNet.getPlaceByName(pn, placeName);
								ErrorModel2PetriNet.link1PlaceTransition(pn, originPlace, t_in);
							}
							//add arcs for the sender side
							EList b_variables = bo.getOperands();
							for(Iterator it3 = b_variables.iterator(); it3.hasNext();){
								BooleanVariable bv = (BooleanVariable) it3.next();
								Place senderPlace = bv.getPlace();
								if(bv.getNot()){
									ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, senderPlace, t_in);
								}
								else{
									ErrorModel2PetriNet.link2PlacesTransition(pn, senderPlace, senderPlace, t_in);
								}
							}
						}
					}
				}
			}
		}
	}

}// end class
