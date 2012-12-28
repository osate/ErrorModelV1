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

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.instance.InstanceObject;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;

/**
 * 
 * This class contains methods that are used to build the complementary
 * subnet relative to name-matching propagations with a fixed probability
 * other that 1
 *
 * @author Marilena Bruffa
 */

public class TransformComplementaryNameMatchingPropag {

	/**
	 * 
	 * @param pn PetriNet to which attach the subnet
	 * @param currentCompOrConnection InstanceObject
	 * @param intermediaryInfoList EList of instances of class Structure, it contains the list of 
	 * intermediaryPlace built in the NameMatching Transformation for this component or connection
	 * 
	 */

	public static void ComplementaryNameMatchingPropag2PetriNet(PetriNet pn, InstanceObject currentCompOrConnection, Hashtable intermediaryInfoList){
		String remainingProbability = null; 
		for(Enumeration e = intermediaryInfoList.keys(); e.hasMoreElements();){
			String currentPropagSrcName = (String)e.nextElement();
			EList listOfStructures = (EList)intermediaryInfoList.get(currentPropagSrcName);
			Place p = ErrorModel2PetriNet.getPlaceByName(pn, currentPropagSrcName);
			if((remainingProbability = ErrorModel2PetriNet.getRemainingProbability(p))!= null){	
				    createComplementaryNameMatchingSubnet(pn, p,currentCompOrConnection, listOfStructures, remainingProbability);
			}	
		}
	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param originPlace Place
	 * @param iobj InstanceObject
	 * @param intermediaryInfoList EList of Structure objects corresponding to out propagation from originPlace
	 * @param probability
	 */
	protected static void createComplementaryNameMatchingSubnet(PetriNet pn, Place originPlace, InstanceObject iobj, EList listOfStructures, String probability){
		// create the No Propagation subnet
		String name = originPlace.getName() + "_noPropEvacuation";
		Transition t_evacuation2 = ErrorModel2PetriNet.createNamedTransition(pn, null, name, "1");
		name = originPlace.getName() + "_noOutPropagation";
		Transition t_no_out = ErrorModel2PetriNet.createNamedTransition(pn, null, name, probability);
		Place noPropagPlace = ErrorModel2PetriNet.createNoPropagPlace(pn, originPlace.getName());
		//adding the arcs
		ErrorModel2PetriNet.link2PlacesTransition(pn, originPlace, originPlace, t_no_out);
		ErrorModel2PetriNet.link1TransitionPlace(pn, t_no_out, noPropagPlace);
		ErrorModel2PetriNet.link1PlaceTransitionInhib(pn,noPropagPlace, t_no_out);
		ErrorModel2PetriNet.link1PlaceTransition(pn, noPropagPlace, t_evacuation2);
		ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, originPlace, t_evacuation2);
		// add inhibitor arcs to authorize only one prop place or NoProp place to have  token
		completeNameMatchingSubnet(pn, iobj, originPlace, noPropagPlace, t_no_out, listOfStructures);
	}

	/**
	 * @author Marilena Bruffa 
	 * @param pn PetriNet
	 * @param iobj InstanceObject (sender)
	 * @param originPlace origin place of the current out prop
	 * @param noPropagPlace place representing NoPropag from originPlace
	 * @param t_no_out transition representing NoPropag from originPlace
	 * @param listOfStructures EList of Structure objects corresponding to propagations out from the same place (originPlace)
	 * 
	 */
	protected static void completeNameMatchingSubnet(PetriNet pn, InstanceObject iobj, Place originPlace, Place noPropagPlace, Transition t_no_out, EList listOfStructures){
		for(Iterator it = listOfStructures.iterator(); it.hasNext();){
			Structure struct = (Structure)it.next();
			Place intermediaryPlace = struct.getPlace();
			Transition t_out = struct.getTransition();
			ErrorModel2PetriNet.link1PlaceTransitionInhib(pn,noPropagPlace, t_out);
			ErrorModel2PetriNet.link1PlaceTransitionInhib(pn,intermediaryPlace, t_no_out);	
		
			// if there are other out propagations from the same state, add inhibitor arcs from intermediaryPlace to them  

			for(Iterator it2 = listOfStructures.iterator(); it2.hasNext();){
				Structure otherStruct = (Structure)it2.next();
				Place otherIntermediaryPlace = otherStruct.getPlace();
				Transition other_t_out = otherStruct.getTransition();
				if(intermediaryPlace != otherIntermediaryPlace && t_out!= other_t_out){
					ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, intermediaryPlace, other_t_out);
				}
			}
				
		}
	}
}
