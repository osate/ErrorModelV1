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
import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.PlaceToTransition;
import PetriNet.Transition;
import PetriNet.TransitionToPlace;

/**
 * 
 * This class contains some methods used in the final step of the transformation of the aadl
 * dependability model into a gspn. This last transformation is performed to complete the petri 
 * net with some specific transitions needed to evacuate the propagation places 
 * (those which correspond to out propagations) 
 * It implements the General rule for emptying GSPN propagation places
 * 
 * @author Marilena Bruffa mbruffa@laas.fr
 *
 */
public class CompleteTransformationAADL2GSPN{

	/**
	 * 
	 * @param pn PetriNet
	 * @param intermediaryInfoList, EList of Structure objects, that represent the 
	 * propagation places
	 * 
	 */
	public static void completePetriNet(PetriNet pn, EList intermediaryInfoList){
		for(Iterator it = intermediaryInfoList.iterator(); it.hasNext();){
				Structure s = (Structure) it.next();
				completePetriNet(pn, s);
		}	
	}

	/**
	 * 
	 * @param pn PetriNet 
	 * @param s Structure containing the informations for the current intermediary place
	 */
	protected static void completePetriNet(PetriNet pn, Structure s){
		Place intermediaryPlace = s.getPlace();
		Hashtable linkedTransitions = getTransitions(pn, intermediaryPlace);
		EList not_causes = new BasicEList();
		for(Enumeration e = linkedTransitions.elements(); e.hasMoreElements();){
			Transition t_in = (Transition)e.nextElement();
			BooleanOperand be_cause = BooleanOperations.getTransitionCauseExpression(pn, intermediaryPlace, t_in);
			BooleanExpression not_be_cause = BooleanOperations.notBooleanOperand(be_cause);
			not_causes.add(not_be_cause);
		}
		BooleanExpression be_evac_condition = BooleanOperations.and(not_causes);
		EList orList = be_evac_condition.getExpression();
		BooleanOperand bo = null;
		int suffix = 1;
		for(Iterator it2 = orList.iterator(); it2.hasNext();){
			bo = (BooleanOperand) it2.next();
			String t_name = intermediaryPlace.getName()+ "_evacuation_" + suffix++; //fill here
			Transition evacuation = ErrorModel2PetriNet.createNamedTransition(pn, null, t_name, "1");
			ErrorModel2PetriNet.link1PlaceTransition(pn, intermediaryPlace, evacuation);
			for(Iterator it3 = bo.getOperands().iterator(); it3.hasNext();){
				BooleanVariable bv = (BooleanVariable) it3.next();
				Place p = bv.getPlace();
				if(bv.getNot()){	
					//add inhibitor arc from place to transition evacuation
					ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, p, evacuation);
				}
				else{
					//add direct arc from place to transition evacuation
					ErrorModel2PetriNet.link2PlacesTransition(pn, p, p, evacuation);
				}
			}
		}
	}

	/**
	 * This method gets the list of all the transitions of the petri net linked to the 
	 * intermediary place, except the evacuation transitions
	 * 
	 * @param pn PetriNet
	 * @param intermediaryPlace Place
	 * @return trans Hashtable containing all the transitions that are linked to the intermediaryPlace
	 * in the petri net
	 */
	public static Hashtable getTransitions(PetriNet pn, Place intermediaryPlace){
		Hashtable trans = new Hashtable();
		EList outgoingArcs = intermediaryPlace.getPlaceToTransition(); 
		EList incomingArcs = intermediaryPlace.getTransitionToPlace();
		for(Iterator it = outgoingArcs.iterator(); it.hasNext();){
			PlaceToTransition arc = (PlaceToTransition) it.next();
			Transition t_out = arc.getTransition();
			if(!t_out.getName().contains("evacuation"))
				trans.put(t_out.getName(), t_out);
		}
		for(Iterator it = incomingArcs.iterator(); it.hasNext();){
			TransitionToPlace arc = (TransitionToPlace) it.next();
			Transition t_in = arc.getTransition();
			if(!t_in.getName().contains("evacuation"))
				trans.put(t_in.getName(), t_in);
		}
		return trans;
	}
}