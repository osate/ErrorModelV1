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
import org.osate.aadl2.EventPort;
import org.osate.aadl2.Feature;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.ModeInstance;

import PetriNet.PetriNet;
import PetriNet.Place;
import PetriNet.Transition;
import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;

/**
 * This class contains all the methods used  to transform the Guard_Event property into a PetriNet
 * subnet
 * 
 * @author Marilena Bruffa
 *
 */
public class TransformGuardEvent{

	public static EList GuardEvents2PetriNet(PetriNet pn,ComponentInstance ci, EList UpperComponentsEM){
		EAXUtil util = new EAXUtil();
		EList intermediaryInfoList = new BasicEList();
		EList features = ci.getFeatureInstances();
		EList toGuardTransitionTransformation = new BasicEList();
		//for each EventPort looks for the Guard_event property
		for(Iterator it = features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance) it.next();
			int fc = fi.getCategory().getValue();
			if(fc == FeatureCategory.EVENT_PORT_VALUE){
				Feature f = fi.getFeature();
				PortEventGuard guardEvent = util.getPortEventGuard(ci, (EventPort) f);
				if(guardEvent != null){
					EList infos = GuardEventToPetriNet(pn,ci,fi,guardEvent,UpperComponentsEM);
					Structure propPlaceInfo = (Structure) infos.get(0);
					EList componentsWithGuardTransitionProp = (EList) infos.get(1);
					intermediaryInfoList.add(propPlaceInfo);
					//list of components that should be processed for the guard transition
					//transformation step
					toGuardTransitionTransformation.addAll(componentsWithGuardTransitionProp);
				}
			}
		}
		EList toReturn = new BasicEList();
		toReturn.add(intermediaryInfoList);
		toReturn.add(toGuardTransitionTransformation);
		return toReturn;
	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param ci COmponentInstance
	 * @param port FeatureInstance
	 * @param guardEvent PortEventGuard
	 * @param UpperComponentsEM EList
	 * @return EList containing 2 elements: a Structure object and an EList to be passed to the GuardTransition transfo
	 */
	private static EList GuardEventToPetriNet(PetriNet pn, ComponentInstance ci, FeatureInstance port, PortEventGuard guardEvent, EList UpperComponentsEM) {
		EList rules = new BasicEList();
		EList toReturn = new BasicEList();
		BooleanErrorExpression bee = guardEvent.getErrorExpression();
		EList or = ToDisjunctiveNormalForm.make_canonical(ci, bee, rules, UpperComponentsEM);
		String eventPlaceName = ci.getInstanceObjectPath()+"_event_"+port.getName();
		//creates the propagation place 
		Place eventPlace = ErrorModel2PetriNet.createNamedPlace(pn, eventPlaceName);
		int suffix = 1;
		for(Iterator it = or.iterator(); it.hasNext();){
			EList and = (EList) it.next();
			transformGuardEventIntoPNSubnet(pn, ci, port, eventPlace, and, suffix, UpperComponentsEM);
			suffix++;
		}
		//creates the information structure to pass to the following steps
		Structure s = new Structure(null, eventPlace,null);
		EList toGuardTransitionTransformation = createGuardEventReceiverSideSubnet(ci, port, eventPlace, pn, UpperComponentsEM);
		toReturn.add(s);
		toReturn.add(toGuardTransitionTransformation);
		return toReturn;
	}

	/**
	 * 
	 * @param pn PetriNet
	 * @param ci ComponentInstance
	 * @param port FeatureInstance
	 * @param propPlace Place
	 * @param and EList
	 * @param suffix int
	 * @param UpperComponentsEM EList
	 */
	private static void transformGuardEventIntoPNSubnet(PetriNet pn, ComponentInstance ci, FeatureInstance port, Place propPlace, EList and, int suffix, EList UpperComponentsEM) {
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		//gets the combinations of senders' propagation places
		EList l = ErrorModel2PetriNet.createErrorGuardSenderSideLogic(pn, ci, fsrem, and, UpperComponentsEM, false);
		EList toCombine = (EList) l.get(1);
		EList comb = Combination.combineBooleanExpressions(toCombine, and.size());
		createGuardEventSenderSideSubnet(ci, fsrem, port, propPlace, comb, pn, suffix, UpperComponentsEM);
	}

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param fsrem FindSenderOrReceiverErrorModel
	 * @param port FeatureInstance
	 * @param propPlace Place
	 * @param comb EList
	 * @param pn PetriNet
	 * @param suffix int
	 * @param UpperComponentsEM ELit
	 */
	private static void createGuardEventSenderSideSubnet(ComponentInstance ci, FindSenderOrReceiverErrorModel fsrem, FeatureInstance port/*EventPort port*/, Place propPlace, EList comb, PetriNet pn, int suffix, EList UpperComponentsEM) {
		//all receivers for guard_event, doesn't take into account those ones 
		//with a guard_transition property
		int internal_suffix = 1;
		//for each combination 
		for(Iterator it = comb.iterator(); it.hasNext(); ){
			BooleanExpression be = (BooleanExpression) it.next();
			EList operands = be.getExpression();
			//for each boolean operand of the boolean expression creates a transition in the petri net
			for(Iterator it2 = operands.iterator(); it2.hasNext();){
				BooleanOperand bo = (BooleanOperand) it2.next(); 
				String t_name = "guardevent_" + port.getName()+"_"+ suffix + "_"+internal_suffix++;
				Transition t_event = ErrorModel2PetriNet.createNamedTransition(pn, ci, t_name, "1");
				//link the transition to the propagation place
				ErrorModel2PetriNet.link1TransitionPlace(pn, t_event, propPlace);
				ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, propPlace, t_event);
				for(Iterator it3 = bo.getOperands().iterator(); it3.hasNext();){
					//adds the arcs from the single places to the transition and back
					BooleanVariable bv = (BooleanVariable) it3.next();
					Place origin = bv.getPlace();
					//add inhibitor or bidirectional arcs from the sender place to transition t_out
					if(bv.getNot()){
						ErrorModel2PetriNet.link1PlaceTransitionInhib(pn, origin, t_event);
					}
					else{
						ErrorModel2PetriNet.link2PlacesTransition(pn, origin, origin, t_event);
					}
				}
			}		
		}
	}

	/**
	 * 
	 * @param ci ComponentInstance
	 * @param port FetureInstance
	 * @param propPlace Place
	 * @param pn PetriNet
	 * @param UpperComponentsEM EList
	 * @return EList containing the ComponentInstance objects that should be processed in the 
	 * guard_transition transformation
	 */
	private static EList createGuardEventReceiverSideSubnet(ComponentInstance ci, FeatureInstance port, Place propPlace, PetriNet pn, EList UpperComponentsEM){
		int suffix1 = 1;
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		//gets all the receivers for this guard_event, they don't have a guard_transition property
		EList receiversInfo = fsrem.getGuardEventReceivers(ci, port, UpperComponentsEM);
		Hashtable receivers = (Hashtable) receiversInfo.get(0);
		//components with a guard_transition 
		EList toGuardTransitionTransformation = (EList) receiversInfo.get(1);
		//for each receiver creates a petri net transition and links it to the propagation place
		for(Enumeration e = receivers.keys(); e.hasMoreElements();){
			ComponentInstance receiver = (ComponentInstance) e.nextElement();
			String t_in_name = "event_"+port.getName()+"_"+suffix1++;
			Transition t_in = ErrorModel2PetriNet.createNamedTransition(pn, ci, t_in_name, "1");
			ErrorModel2PetriNet.link2PlacesTransition(pn, propPlace, propPlace, t_in);
			//gets the source and destination modes in the receiver and creates the corresponding places
			EList modes = (EList) receivers.get(receiver);
			ModeInstance srcMode = (ModeInstance) modes.get(0);
			ModeInstance dstMode = (ModeInstance) modes.get(1);
			String name = receiver.getInstanceObjectPath()+"_"+srcMode.getName();
			Place srcPlace = ErrorModel2PetriNet.createNamedPlace(pn, name);
			if (srcMode.getMode().isInitial())
				srcPlace.setInitialMarking(1);
			name = receiver.getInstanceObjectPath()+"_"+dstMode.getName();
			Place dstPlace = ErrorModel2PetriNet.createNamedPlace(pn, name);
			if (dstMode.getMode().isInitial())
				dstPlace.setInitialMarking(1);
			//links the places to the transition
			ErrorModel2PetriNet.link2PlacesTransition(pn, srcPlace, dstPlace, t_in);
		}
		return toGuardTransitionTransformation;
	}
}