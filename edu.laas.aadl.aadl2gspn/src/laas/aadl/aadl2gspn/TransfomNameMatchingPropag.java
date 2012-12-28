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
import org.osate.aadl2.instance.InstanceObject;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;

/**
 * 
 * @author Ana Rugina This class contains methods that are used for trasforming
 *         name-matching propagations into petri subnets
 * 
 */
public class TransfomNameMatchingPropag {

	/**
	 * This method creates a subnet for each name-matching couple of propagations 
	 * It considers each out propagation and calls the method createNameMatchingSubnet
	 * that searches for name-matching in propagations and generates corresponding subnets
	 * 
	 * @param InstanceObject iobj (sender)
	 * @param ErrorModelImplementation emi
	 * @param EList of components to process
	 * @param The PetriNet pn (to which to attach the subnet)
	 * @return Hashtable whose key is a error state which is source of propagations and whose elements are ELists of instances of class Structure - the list of intermediaryPlaces
	 */
	public static Hashtable NameMatchingPropag2PetriNet(InstanceObject iobj,ErrorModelImplementation emi, EList UpperComponentsEM, PetriNet pn) {
		EList Transitions = ((ErrorModelImplementation) emi).getErrorTransitions().getErrorTransition();
		// for each transition transform origin and destination states (if not created yet)
		Hashtable intermediaryInfoList = new Hashtable();
		for (Iterator itTrans = Transitions.iterator(); itTrans.hasNext();) {
			ErrorTransition currentTrans = (ErrorTransition) itTrans.next();
			// get dest state and transform it into PN place 
			ErrorState Dest = currentTrans.getDestination();
			Place destPlace = ErrorModel2PetriNet.createPlace(pn, Dest, iobj);
			EList Src = currentTrans.getOrigin();
			for (Iterator itSrc = Src.iterator(); itSrc.hasNext();) {
				ErrorState currentSrc = (ErrorState) itSrc.next();
				EList transAction = currentTrans.getTransitionAction();
				for (Iterator itAct = transAction.iterator(); itAct.hasNext();) {
					ErrorPropagation currentAction = (ErrorPropagation) itAct.next();
					// for each action, create name-matching subnet and get the Structure instance corresponding to the propagation
					Structure intermediaryInfo = createNameMatchingSubnet(pn, currentAction, currentSrc, destPlace, iobj, UpperComponentsEM);
					// if such a structure exists, refresh the intermediaryInfoList
					if(intermediaryInfo != null){
						EList outPropagList = (EList) intermediaryInfoList.get(iobj.getInstanceObjectPath()+"_"+currentSrc.getName());
						if (outPropagList != null)
							outPropagList.add(intermediaryInfo);
						else{
							outPropagList= new BasicEList();
							outPropagList.add(intermediaryInfo);
						}
							intermediaryInfoList.put(iobj.getInstanceObjectPath()+"_"+currentSrc.getName(),outPropagList);
					}
				}// end for each out propagation
			}// end for each origin error state
		}// end for each transition
		return intermediaryInfoList;
	} // end method

	/**
	 * This method searches for name-matching in propagations by calling getReceivers (FindReceiverErrorModel class)
	 * Then generates the corresponding subnets
	 * 
	 * @param PetriNet pn to which to attach the subnet 
	 * @param ErrorPropagation currentAction
	 * @param Place originPlace (of the out propag)
	 * @param Place destPlace (of the out propag)
	 * @param InstanceObject currentCompOrConnection (sender)
	 * @param EList UpperComponentsEM (compnents to process)
	 * @return Structure in which are stored the informations related to the intermediaryPlace
	 */
	protected static Structure createNameMatchingSubnet(PetriNet pn, ErrorPropagation currentAction, ErrorState originState, Place destPlace,InstanceObject currentCompOrConnection, EList UpperComponentsEM) {
		Structure intermediaryInfo = null;
		String currentOutPropName = currentAction.getName();
		FindSenderOrReceiverErrorModel frem = new FindSenderOrReceiverErrorModel();
		// get the receivers of currentOutPropName and source/dest error states
		Hashtable receivers = frem.getNameMatchingReceivers(currentCompOrConnection, currentOutPropName, UpperComponentsEM);
		// create the transition corresponding to the out propagation 
		// and add the arcs
		Place originPlace = ErrorModel2PetriNet.createPlace(pn,originState, currentCompOrConnection);
		Transition t_out = ErrorModel2PetriNet.eventOrPropagation2transition(pn, (ErrorEventOrPropagation) currentAction, currentCompOrConnection, originState);
		ErrorModel2PetriNet.link2PlacesTransition(pn, originPlace, destPlace, t_out);
		Place intermediaryPlace = ErrorModel2PetriNet.createIntermediaryPlace(pn, currentCompOrConnection, currentAction.getName()+"_"+originState.getName());
		ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, intermediaryPlace, t_out);
		ErrorModel2PetriNet.link1TransitionPlace(pn, t_out, intermediaryPlace);
		
		if(!receivers.isEmpty()){
			//intermediaryInfo = new Structure(originState, currentAction, intermediaryPlace, t_out);
			for (Enumeration e = receivers.keys(); e.hasMoreElements();) {
				int suffix = 0;
				InstanceObject currentReceiver = (InstanceObject) e.nextElement();
				// get the list of source/dest error states in the current receiver
				EList coupleList = (EList) receivers.get(currentReceiver);
				for (Iterator itCouple = coupleList.iterator(); itCouple.hasNext();) {
					// for each couple, create one PN transition and then link it to the (existing) places
					EList currentCouple = (EList) itCouple.next();
					suffix++;
					Transition t_in = ErrorModel2PetriNet.inPropagation2transition(	pn, (ErrorPropagation) currentAction, currentCompOrConnection, currentReceiver, suffix);
					// add the arcs
					String srcPlaceName_in = currentReceiver.getInstanceObjectPath()+ "_" + ((ErrorState) currentCouple.get(0)).getName();
					Place srcPlace_in = ErrorModel2PetriNet.createNamedPlace(pn,(ErrorState) currentCouple.get(0), currentReceiver,srcPlaceName_in);
					String destPlaceName_in = currentReceiver.getInstanceObjectPath().concat("_").concat(((ErrorState) currentCouple.get(1)).getName());
					Place destPlace_in = ErrorModel2PetriNet.createNamedPlace(pn,(ErrorState) currentCouple.get(1), currentReceiver,destPlaceName_in);
					ErrorModel2PetriNet.link3PlacesTransition(pn,intermediaryPlace, srcPlace_in, destPlace_in, t_in);
					ErrorModel2PetriNet.link1TransitionPlace(pn, t_in, intermediaryPlace);
				}// end for each receiver couple
			} // end for each receiver component
		}

		intermediaryInfo = new Structure(currentAction, intermediaryPlace, t_out);
		return intermediaryInfo;
	} //end method createNameMatchingSubnet

	
}	//end class
