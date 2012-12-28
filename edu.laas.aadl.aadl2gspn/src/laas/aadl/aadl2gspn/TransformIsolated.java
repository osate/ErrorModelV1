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
import org.osate.aadl2.instance.InstanceObject;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.laas.aadl.dependency.hasAbstractEM;

/**
 * 
 * @author Ana Rugina This class contains methods used for the transformation of
 *         isolated component EMs (if they are not isolated, they are seen as
 *         isolated for this step of the transformation)
 * 
 */
public class TransformIsolated {

	/**
	 * 
	 * @param InstanceObjcet iobj (whose error model to be transformed)
	 * @param PetriNet pn (to which the petri net subnet is attached)
	 * @return {@link ErrorModelImplementation} of iobj or null if it doesn't have one
	 */
	public static ErrorModelImplementation IsolatedEM2PetriNet(InstanceObject iobj, PetriNet pn) {
		ErrorModelImplementation emi = hasAbstractEM.getErrorModelImplementation(iobj);
		if (emi != null) {
			// the EM classifier is an implementation => step 1 : transformation
			// for isolated components
			EList Transitions = ((ErrorModelImplementation) emi).getErrorTransitions().getErrorTransition();
			// for each transition transform origin and
			// destination states and event triggers
			for (Iterator itTrans = Transitions.iterator(); itTrans.hasNext();) {
				ErrorTransition currentTrans = (ErrorTransition) itTrans.next();
				// get dest state and transform it into PN
				// place if the PN places don't already exist
				ErrorState Dest = currentTrans.getDestination();
				Place destPlace = ErrorModel2PetriNet.createPlace(pn, Dest,iobj);
				EList Src = currentTrans.getOrigin();
				for (Iterator itSrc = Src.iterator(); itSrc.hasNext();) {
					ErrorState currentSrc = (ErrorState) itSrc.next();
					Place originPlace = ErrorModel2PetriNet.createPlace(pn,currentSrc, iobj);
					EList transTrig = currentTrans.getTransitionTrigger();
					for (Iterator itTrig = transTrig.iterator(); itTrig.hasNext();) {
						ErrorEventOrPropagation currentTrig = (ErrorEventOrPropagation) itTrig.next();
						if (currentTrig instanceof ErrorEvent) {
							// we just deal with events for now (isolated EM)
							Transition t = ErrorModel2PetriNet.eventOrPropagation2transition(pn,(ErrorEvent)currentTrig,iobj,currentSrc);
							// add arcs to link the transition to the origin and
							// dest Places
							ErrorModel2PetriNet.link2PlacesTransition(pn,originPlace, destPlace, t);
						}// end if
					} // end for each trigger
				}// end for each source state
			}// end for each transition
			return emi;
		}// if emi!= null
		else {
			return null;
		}
	}// end method

}// end class
