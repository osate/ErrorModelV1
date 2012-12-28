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
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;

import PetriNet.NamedElement;
import PetriNet.OccurrenceType;
import PetriNet.PetriNet;
import PetriNet.PetriNetFactory;
import PetriNet.Place;
import PetriNet.PlaceToTransition;
import PetriNet.Transition;
import PetriNet.TransitionToPlace;
import PetriNet.impl.PlaceImpl;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;
import edu.laas.aadl.dependency.FindSenderOrReceiverErrorModel;

public class ErrorModel2PetriNet {
	protected static EAXUtil utilEMA = new edu.cmu.sei.aadl.errorannex.util.EAXUtil();

	/**
	 * Transforms AADL Error propagation with its Occurrence property into a Petri Net transition
	 * 
	 * @param error model feature      
	 * @param instance object (component instance or connectioninstance)
	 * @return PN Transition or null if the error model feature is not an Error Event
	 *
	 */   
	private static Transition propagation2transition(ErrorPropagation ee, InstanceObject iobj, ErrorState origin) {
		// doesn't set petri net as the link to the petri net is done
		// once for all in the method containing the global transformation
		// algorithm
		// create Petri net transition
		Transition t = PetriNetFactory.eINSTANCE.createTransition();
		t.setName(iobj.getInstanceObjectPath() + "_"+origin.getName()+"_out_" + ee.getName());
		// get Occurrence property if declared
		// and put it on the Petri net transition as attributes
		OccurrenceProperty op = null;
		if (iobj instanceof ComponentInstance) {
			op =  utilEMA.getOccurrenceProperty((ComponentInstance)iobj, ee);
		}
		else
			op = utilEMA.getOccurrenceProperty((ConnectionInstance)iobj, ee);
		//OccurrenceProperty op = ((ErrorEventOrPropagation) ee).getOccurrenceProperty();
		if (op != null) {
			t.setOccurrence(OccurrenceType.get(op.getType().getValue()));
			t.setNonStandardId(op.getNonStandardId());
			t.setParam((String)op.getParameterList().get(0));
		}// end if
		else {
			// if no Occurrence property defined for the event
			// the Occurrence property of the PN transition if a probability of
			// 1
			t.setOccurrence(OccurrenceType.FIXED_LITERAL);
			// put 1 in the parameter
			t.setParam("1");
		} // end else
		return t;
	}

	/**
	 * Transforms AADL error event with its Occurrence property into a Petri Net transition
	 * 
	 * @param error model feature      
	 * @param instance object (component instance or connectioninstance)
	 * @return PN Transition or null if the error model feature is not an Error Event
	 *
	 */   
	private static Transition event2transition(ErrorEvent ee, InstanceObject iobj, ErrorState origin) {
		// doesn't set petri net as the link to the petri net is done
		// once for all in the method containing the global transformation
		// algorithm
		// create Petri net transition
		Transition t = PetriNetFactory.eINSTANCE.createTransition();
		t.setName(iobj.getInstanceObjectPath() + "_"+origin.getName()+"_" + ee.getName());
		// get Occurrence property if declared
		// and put it on the Petri net transition as attributes
		OccurrenceProperty op = null;
		if (iobj instanceof ComponentInstance) {
			op =  utilEMA.getOccurrenceProperty((ComponentInstance)iobj, ee);
		}
		else
			op = utilEMA.getOccurrenceProperty((ConnectionInstance)iobj, ee);
	//	OccurrenceProperty op = ((ErrorEventOrPropagation) ee).getOccurrenceProperty();
		if (op != null) {
			t.setOccurrence(OccurrenceType.get(op.getType().getValue()));
			t.setNonStandardId(op.getNonStandardId());
			t.setParam((String)op.getParameterList().get(0));
		}// end if
		else {
			// if no Occurrence property defined for the event
			// the Occurrence property of the PN transition if a probability of
			// 1
			t.setOccurrence(OccurrenceType.FIXED_LITERAL);
			// put 1 in the parameter
			t.setParam("1");
		} // end else
		return t;
	}

	
	/**
	 * Transforms AADL Error Event or Propagation with its Occurrence property into a Petri Net transition
	 * 
	 * @param PetriNet to attach transition to
	 * @param error model feature      
	 * @param instance object (component instance or connectioninstance)
	 * @return PN Transition 
	 *
	 */   
	public static Transition eventOrPropagation2transition( PetriNet pn, ErrorEventOrPropagation ee, InstanceObject iobj, ErrorState origin) {
		Transition t = null;
		if (ee instanceof ErrorPropagation){
			t = (Transition) findPNElement(pn, iobj.getInstanceObjectPath() + "_"+origin.getName()+"_out_" + ee.getName()); 
			if(t == null){
				t = propagation2transition((ErrorPropagation)ee,iobj,origin);
				t.setPetriNet(pn);
			}
		}
		else {
			t = (Transition) findPNElement(pn, iobj.getInstanceObjectPath() + "_"+origin.getName()+"_" + ee.getName());
			if (t == null) {
				t = event2transition((ErrorEvent)ee,iobj,origin);	
				t.setPetriNet(pn);
			}

		}
		return t;
	}

	/**
	 * Creates a new named transition with the given probability
	 * 
	 * @param pn PetriNet object
	 * @param iobj InstanceObject
	 * @param probability String
	 * @param name String
	 * @return t Transition
	 */

	public static Transition createNamedTransition(PetriNet pn, InstanceObject iobj, String name, String probability){
		String transName = null;
		if(iobj != null){
			transName = iobj.getInstanceObjectPath()+ "_" + name;
		}
		else 
			transName = name;
		Transition t = (Transition)findPNElement(pn, transName);
		if(t == null){
			t = createNamedTransition(iobj, name, probability);
			t.setPetriNet(pn);
		}
		return t;
	}

	/**
	 * Creates a new named transition with the given probability
	 * 
	 * @param iobj InstanceObject
	 * @param probability String
	 * @param name String
	 * @return t Transition
	 */

	private static Transition createNamedTransition(InstanceObject iobj, String name, String probability){
		Transition t = PetriNetFactory.eINSTANCE.createTransition();
		if(iobj != null)
			t.setName(iobj.getInstanceObjectPath() + "_" + name);
		else
			t.setName(name);
		t.setOccurrence(OccurrenceType.FIXED_LITERAL);
		t.setParam(probability);

		return t;
	}


	/**
	 * Transforms AADL in Error Propagation into a Petri Net transition of probability 1
	 * 
	 * @param name String (name of transition to create)
	 * @return PN Transition 
	 *
	 */   
	private static Transition inPropagation2transition(String t_name) {
		// doesn't set petri net as the link to the petri net is done
		// once for all in the method containing the global transformation
		// algorithm
		// create Petri net transition
			
		Transition t = PetriNetFactory.eINSTANCE.createTransition();
		t.setName(t_name);
		// get Occurrence property if declared
		// and put it on the Petri net transition as attributes
		t.setOccurrence(OccurrenceType.FIXED_LITERAL);
		// put 1 in the parameter
		t.setParam("1");

		return t;
	}


	/**
	 * Transforms AADL in Error Propagation into a Petri Net transition of probability 1
	 * 
	 * @param pn PetriNet to attach transition to
	 * @param error model feature      
	 * @param instance object (component instance or connectioninstance) - sender
	 * @param instance object (component instance or connectioninstance) - receiver
	 * @param suffix int (several PN transitions correspond to one in propagation)
	 * @return PN Transition 
	 *
	 */   
	public static Transition inPropagation2transition(PetriNet pn, ErrorPropagation ep, InstanceObject sender, InstanceObject receiver, int suffix) {
		String t_name = receiver.getInstanceObjectPath() + "_" + ep.getName()+ "_from" +sender.getInstanceObjectPath() + "_" +suffix;
		Transition t = (Transition)findPNElement(pn, t_name);
		if(t == null){
			t = inPropagation2transition(t_name); 
			t.setPetriNet(pn);
		}
		return t;
	}

	/**
	 * Transforms AADL Error State into a Petri Net place
	 * 
	 * @param error
	 *            model feature
	 * @param instance
	 *            object (component instance or connectioninstance)
	 * @return PN Place
	 * 
	 */
	private static Place state2place(ErrorState es, InstanceObject iobj) {
		// doesn't set petri net as the link to the petri net is done
		// once for all in the method containing the global transformation
		// algorithm
		Place p = PetriNetFactory.eINSTANCE.createPlace();
		p.setName(iobj.getInstanceObjectPath() + "_" + es.getName());
		if (es.isInitial()) // change that when dealing with modal systems to
			// take into account "inactive"
			p.setInitialMarking(1);
		else
			p.setInitialMarking(0);
		return p;
	}// end method

	/**
	 * Transforms AADL Error State into a Petri Net place
	 * 
	 * @param error
	 *            model feature
	 * @param instance
	 *            object (component instance or connectioninstance)
	 * @return PN Place
	 * 
	 */
	private static Place state2place(String name) {
		// doesn't set petri net as the link to the petri net is done
		// once for all in the method containing the global transformation
		// algorithm
		Place p = PetriNetFactory.eINSTANCE.createPlace();
		p.setName(name);
		return p;
	}// end method

	/**
	 * Creates an intermediate place for the AADL propagation and links it to the Petri net transition 
	 * corresponding to the out propagation
	 * 
	 * @param pn PetriNet object
	 * @param t Transition 
	 * @param iobj InstanceObject
	 * @param receiverObj InstanceObject
	 * @param name String
	 * @return generated Place
	 */
	public static Place createIntermediaryPlace(PetriNet pn, InstanceObject iobj, String name){
		String placeName = iobj.getInstanceObjectPath() + "_" + name;
		Place p = createNamedPlace(pn, placeName);
		return p;
	} // end method

	/**
	 * Creates a place that corresponds to a non-propagation
	 * 
	 * @param pn PetriNet object
	 * @param es ErrorState 
	 * @param currentAction ErrorEventOrPropagation
	 * @param iobj IstanceObject
	 * @return p Place
	 * 
	 */
	public static Place createNoPropagPlace(PetriNet pn, ErrorState origin, ErrorPropagation currentAction, InstanceObject iobj){
		String name = iobj.getInstanceObjectPath() + origin.getName() + "_" + currentAction.getName() + "_noPropag";
		Place p = (Place) findPNElement(pn, name);
		if (p == null) {
			p = state2place(origin, iobj);
			p.setName(name);
			p.setPetriNet(pn);
		}
		return p;
	}

	/**
	 * Creates a place that corresponds to a non-propagation
	 * 
	 * @param pn PetriNet object
	 * @param currentAction String
	 * @param instanceObjectPath String
	 * @return p Place
	 * 
	 */
	public static Place createNoPropagPlace(PetriNet pn, String instanceObjectPath){
		String name = instanceObjectPath + "_no_Propag";
		Place p = (Place) findPNElement(pn, name);
		if (p == null) {
			p = PetriNetFactory.eINSTANCE.createPlace();
			p.setName(name);
			p.setPetriNet(pn);
		}
		return p;
	}

	/**
	 * Returns the object Place of the Petri Net whose name corresponds to the value of the parameter 
	 * String placeName, if it exists, null otherwise 
	 * 
	 * @param pn PetriNet object
	 * @param placeName String
	 * @return p Place
	 * 
	 */
	public static Place getPlaceByName(PetriNet pn, String placeName){
		Place p = (Place)findPNElement(pn, placeName);
		if(p == null){
			p = createNamedPlace(pn, placeName);
		}
		return p;
	}

	/**
	 * Returns the object Transition of the Petri Net whose name corresponds to the value of the parameter 
	 * String transitionName, if it exists, null otherwise 
	 * 
	 * @param pn PetriNet object
	 * @param transitionName String
	 * @return p Transition
	 * 
	 */
	public static Transition getTransitionByName(PetriNet pn, String transitionName){
		Transition t = (Transition)findPNElement(pn, transitionName);
		return t;
	}

	/**
	 * Creates a place from an AADL error state if a place with the same name 
	 * does not exist in the petri net 
	 * 
	 * @param pn PetriNet object
	 * @param es ErrorState 
	 * @return iobj IstanceObject
	 * 
	 */
	public static Place createPlace(PetriNet pn, ErrorState es,
			InstanceObject iobj) {
		String placeName = iobj.getInstanceObjectPath() + "_" + es.getName();
		Place ret = (Place) findPNElement(pn, placeName);
		if (ret == null) {
			ret = state2place(es, iobj);
			ret.setPetriNet(pn);
		}
		return ret;
	}// end method

	/**
	 * Creates a place from an AADL error state if a place with the same name 
	 * does not exist in the petri net 
	 * 
	 * @param pn PetriNet object
	 * @param es ErrorState 
	 * @param iobj IstanceObject
	 * @param name String
	 * @return Place
	 * 
	 */
	public static Place createNamedPlace(PetriNet pn, ErrorState es,
			InstanceObject iobj, String name) {
		Place p = createPlace(pn, es,iobj);
		p.setName(name);
		return p;
	}// end method

	/**
	 * Creates a place from an AADL error state if a place with the same name 
	 * does not exist in the petri net 
	 * 
	 * @param pn PetriNet object
	 * @param es ErrorState 
	 * @param iobj IstanceObject
	 * @param name String
	 * @return Place
	 * 
	 */
	public static Place createNamedPlace(PetriNet pn, String name) {
		Place ret = (Place) findPNElement(pn, name);
		if (ret == null) {
			ret = PetriNetFactory.eINSTANCE.createPlace();
			ret.setName(name);
			ret.setPetriNet(pn);
		}
		return ret;
	}// end method

	/**
	 * Links PN place to PN transition through normal arc of weight 1
	 * 
	 * @param origin Place
	 * @param trans Transition
	 * @return PlaceToTransition arc
	 * 
	 */ 
	private static PlaceToTransition link1PlaceTransition(Place origin, Transition trans) {
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(false);	
		p2t_arc.setWeight(1);	
		return p2t_arc;
	}// end method

	/**
	 * Links PN place to PN transition through normal arc of weight 1
	 * 
	 * @pn PetriNet
	 * @param origin Place
	 * @param trans Transition
	 * @return EList containing 2 arcs
	 * 
	 */ 
	public static void link1PlaceTransition(PetriNet pn, Place origin, Transition trans) {
		PlaceToTransition arc= link1PlaceTransition(origin, trans); 
		arc.setPetriNet(pn);
	}// end method

	/**
	 * Links PN place to PN transition through ihibitor arc of weight 1
	 * 
	 * @param origin
	 *            Place
	 * @param trans
	 *            Transition
	 * @return EList containing 2 arcs
	 * 
	 */ 
	private static PlaceToTransition link1PlaceTransitionInhib(Place origin, Transition trans) {
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(true);	
		p2t_arc.setWeight(1);	
		return p2t_arc;
	}// end method

	/**
	 * Links PN place to PN transition through inhibitor arc of weight 1
	 * 
	 * @pn PetriNet
	 * @param origin Place
	 * @param trans Transition
	 * @return EList containing 2 arcs
	 * 
	 */ 
	public static void link1PlaceTransitionInhib(PetriNet pn, Place origin, Transition trans) {
		PlaceToTransition arc= link1PlaceTransitionInhib(origin, trans); 
		arc.setPetriNet(pn);
	}// end method


	/**
	 * Links PN place to PN transition through normal arc of weight 1
	 * 
	 * @param origin
	 *            Place
	 * @param dest
	 *            Place
	 * @param trans
	 *            Transition
	 * @return EList containing 2 arcs
	 * 
	 */ 
	private static EList link2PlacesTransition(Place origin, Place dest, Transition trans) {
		EList arcs= new BasicEList();
		// arc from origin place to transition
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(false);	
		p2t_arc.setWeight(1);		
		// arc from transition to dest place
		TransitionToPlace t2p_arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		t2p_arc.setPlace(dest);
		t2p_arc.setTransition(trans);
		t2p_arc.setWeight(1);
		arcs.add(p2t_arc);
		arcs.add(t2p_arc);
		return arcs;
	}// end method

	/**
	 * Links PN place to PN transition through normal arc of weight 1
	 * 
	 * @param pn PetriNet to attach arcs to
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition
	 * 
	 */ 
	public static void link2PlacesTransition(PetriNet pn, Place origin, Place dest, Transition trans) {
		EList arcs = link2PlacesTransition(origin, dest, trans);
		((PlaceToTransition) arcs.get(0)).setPetriNet(pn);
		((TransitionToPlace) arcs.get(1)).setPetriNet(pn);
	}// end method

	/**
	 * Links PN place to PN transition through inhibitor arc, weight 1
	 * 
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition     
	 * @return EList containing 2 arcs
	 *
	 */ 
	private static EList link2PlacesTransitionInhib(Place origin, Place dest, Transition trans) {
		EList arcs = new BasicEList();
		// arc from origin place to transition
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(true);	
		p2t_arc.setWeight(1);
		// arc from transition to dest place
		TransitionToPlace t2p_arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		t2p_arc.setPlace(dest);
		t2p_arc.setTransition(trans);
		t2p_arc.setWeight(1);
		arcs.add(p2t_arc);
		arcs.add(t2p_arc);
		return arcs;
	}// end method

	/**
	 * Links PN place to PN transition through inhibitor arc, weight 1
	 * 
	 * @param pn PetriNet to attach arcs to
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition     
	 * @return EList containing 2 arcs
	 *
	 */ 
	public static void link2PlacesTransitionInhib(PetriNet pn, Place origin, Place dest, Transition trans) {
		EList arcs = link2PlacesTransitionInhib(origin,dest,trans);
		((PlaceToTransition) arcs.get(0)).setPetriNet(pn);
		((TransitionToPlace) arcs.get(1)).setPetriNet(pn);
	}// end method


	/**
	 * Links PN places to PN transition through normal arc, user specified weight
	 * 
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition  
	 * @param weight_p2t int (the weight of the Place2Transition arc)   
	 * @param weight_t2p int (the weight of the Transition2Place arc)   
	 * @return EList containing 2 arcs
	 *
	 */ 
	private static EList link2PlacesTransition(Place origin, Place dest, Transition trans, int weight_p2t, int weight_t2p) {
		EList arcs = new BasicEList();
		// arc from origin place to transition
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(false);	
		p2t_arc.setWeight(weight_p2t);
		// arc from transition to dest place
		TransitionToPlace t2p_arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		t2p_arc.setPlace(dest);
		t2p_arc.setTransition(trans);
		t2p_arc.setWeight(weight_t2p);
		arcs.add(p2t_arc);
		arcs.add(t2p_arc);
		return arcs;
	}// end method


	/**
	 * Links PN places to PN transition through normal arc, user specified weight
	 * 
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition  
	 * @param weight_p2t int (the weight of the Place2Transition arc)   
	 * @param weight_t2p int (the weight of the Transition2Place arc)   
	 *
	 */ 
	public static void link2PlacesTransition(PetriNet pn, Place origin, Place dest, Transition trans, int weight_p2t, int weight_t2p) {
		EList arcs = link2PlacesTransition(origin, dest, trans, weight_p2t, weight_t2p);
		((PlaceToTransition) arcs.get(0)).setPetriNet(pn);
		((TransitionToPlace) arcs.get(1)).setPetriNet(pn);
	}// end method


	/**
	 * Links PN places to PN transition through inhibitor arc, user specified weight
	 * 
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition  
	 * @param weight_p2t int (the weight of the Place2Transition arc)   
	 * @param weight_t2p int (the weight of the Transition2Place arc)   
	 * @return EList containing 2 arcs
	 *
	 */ 
	private static EList link2PlacesTransitionInhib(Place origin, Place dest, Transition trans, int weight_p2t, int weight_t2p) {
		EList arcs = new BasicEList();
		// arc from origin place to transition
		PlaceToTransition p2t_arc = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc.setPlace(origin);
		p2t_arc.setTransition(trans);
		p2t_arc.setInhibitor(true);	
		p2t_arc.setWeight(weight_p2t);
		// arc from transition to dest place
		TransitionToPlace t2p_arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		t2p_arc.setPlace(dest);
		t2p_arc.setTransition(trans);
		t2p_arc.setWeight(weight_t2p);
		arcs.add(p2t_arc);
		arcs.add(t2p_arc);
		return arcs;
	}// end method

	/**
	 * Links PN places to PN transition through inhibitor arc, user specified weight
	 * 
	 * @param origin Place
	 * @param dest Place
	 * @param trans Transition  
	 * @param weight_p2t int (the weight of the Place2Transition arc)   
	 * @param weight_t2p int (the weight of the Transition2Place arc)   
	 *
	 */ 
	public static void link2PlacesTransitionInhib(PetriNet pn, Place origin, Place dest, Transition trans, int weight_p2t, int weight_t2p) {
		EList arcs = link2PlacesTransitionInhib(origin, dest, trans, weight_p2t, weight_t2p);
		((PlaceToTransition) arcs.get(0)).setPetriNet(pn);
		((TransitionToPlace) arcs.get(1)).setPetriNet(pn);
	}// end method

	/**
	 * Links 3 PN places to PN transition through normal arcs of weight 1
	 * 
	 * @param origin1 Place
	 * @param origin2 Place
	 * @param dest Place
	 * @param trans Transition
	 * @return EList containing 3 arcs
	 * 
	 */ 
	private static EList link3PlacesTransition(Place origin1, Place origin2, Place dest, Transition trans) {
		EList arcs= new BasicEList();
		// arcs from origin places to transition
		PlaceToTransition p2t_arc1 = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc1.setPlace(origin1);
		p2t_arc1.setTransition(trans);
		p2t_arc1.setInhibitor(false);	
		p2t_arc1.setWeight(1);	
		PlaceToTransition p2t_arc2 = PetriNetFactory.eINSTANCE.createPlaceToTransition();
		p2t_arc2.setPlace(origin2);
		p2t_arc2.setTransition(trans);
		p2t_arc2.setInhibitor(false);	
		p2t_arc2.setWeight(1);	
		// arc from transition to dest place
		TransitionToPlace t2p_arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		t2p_arc.setPlace(dest);
		t2p_arc.setTransition(trans);
		t2p_arc.setWeight(1);
		arcs.add(p2t_arc1);
		arcs.add(p2t_arc2);
		arcs.add(t2p_arc);
		return arcs;
	}// end method

	/**
	 * Links 3 PN places to PN transition through normal arcs of weight 1
	 * 
	 * @param origin1 Place
	 * @param origin2 Place
	 * @param dest Place
	 * @param trans Transition
	 * 
	 */ 
	public static void link3PlacesTransition(PetriNet pn, Place origin1, Place origin2, Place dest, Transition trans) {
		EList arcs = link3PlacesTransition(origin1, origin2, dest, trans);
		((PlaceToTransition) arcs.get(0)).setPetriNet(pn);
		((PlaceToTransition) arcs.get(1)).setPetriNet(pn);
		((TransitionToPlace) arcs.get(2)).setPetriNet(pn);
	}// end method

	/**
	 * Links 1 PN transition to PN place through normal arcs of weight 1
	 * 
	 * @param pn PetriNet
	 * @param t_origin Transition
	 * @param p_dest Place
	 * 
	 */ 
	public static void link1TransitionPlace(PetriNet pn, Transition t_origin, Place p_dest){
		TransitionToPlace arc = PetriNetFactory.eINSTANCE.createTransitionToPlace();
		arc.setTransition(t_origin);
		arc.setPlace(p_dest);
		arc.setWeight(1);
		arc.setPetriNet(pn);
	}

	/**
	 * Finds a Place object in the Petri net by its name
	 * 
	 * @param pn Petri net object      
	 * @param name String     
	 * @return PN Place or transition
	 *
	 */
	public static NamedElement findPNElement(PetriNet pn, String name) {
		for (Iterator it = pn.getNamedElement().iterator(); it.hasNext();) {
			NamedElement current = (NamedElement) it.next();
			if (current.getName().equals(name))
				return current;
		}
		return null;
	}// end method

	/**
	 * 
	 * This method returns a list containing all the places of the petri net whose name
	 * begins with the string contained in prefix
	 * 
	 * @param pn PetriNet
	 * @param prefix String it represents the prefix of the place_name
	 * @return places, EList containing elements of class Place
	 */
	public static EList getPlacesByPrefix(PetriNet pn, String prefix) {
		EList places = new BasicEList();
		for (Iterator it = pn.getNamedElement().iterator(); it.hasNext();) {
			NamedElement current = (NamedElement) it.next();
			if(current.getClass() == PlaceImpl.class){
				String name = current.getName();
				if (name.contains(prefix))
					places.add(current);
			}
		}
		return places;
	}// end method

	/**
	 * Checks if the sum of the probabilities on the outgoing events or propagations 
	 * from a place is less or equals to 1, in order to check if 
	 * the complementary name-matching subnet is necessary
	 * 
	 * @param origin Place
	 * @return remainingPropability String
	 * 
	 */ 
	public static String getRemainingProbability(Place origin){
		double digit_sum = 0;
		double occurrenceIncr = 0;
		String xprob = new String();
		String remainingProbability = new String();
		OccurrenceValues ov = new OccurrenceValues();
		EList outgoingArcs = origin.getPlaceToTransition();
		for(Iterator it = outgoingArcs.iterator();it.hasNext();){
			PlaceToTransition pt = (PlaceToTransition)it.next();
			Transition t = pt.getTransition();
			if(t.getOccurrence().getName().equals("fixed")){
				if(!pt.isInhibitor()){
					String prob = t.getParam();
					try{
						digit_sum = digit_sum + Double.parseDouble(prob);
					}
					catch(NumberFormatException e){
						StringTokenizer st = null;
						String digit = null;
						try{
							st = new StringTokenizer(prob,"-");
							digit = st.nextToken();
							xprob = st.nextToken();
							occurrenceIncr = -1;
						}
						catch(NoSuchElementException ex1){
							try{
								st = new StringTokenizer(prob, "+");
								digit = st.nextToken();
								xprob = st.nextToken();
								occurrenceIncr = 1;
							}
							catch(NoSuchElementException ex2){
								try{
									st = new StringTokenizer(prob, "*");
									digit = "";
									String occ = st.nextToken();
									occurrenceIncr = Double.parseDouble(occ);
									xprob = st.nextToken();
								}
								catch(NumberFormatException ex3){
									occurrenceIncr = 1;
									xprob = prob;
								}//end try-catch ex3
							}//end try-catch ex2
						}//end try-catch ex1	
						if(digit != "")
							digit_sum = digit_sum + Double.parseDouble(digit);
					}//end try catch e
					ov.setOccurrenceValue(xprob, occurrenceIncr);
				}//end if inhibitor arc
			}
		}//end for
		if(!ov.inverseOccIsNegative())
			if(digit_sum >= 1 || digit_sum==0){
				return null;
			}
			else{
				String inverseOcc = ov.inverseOccurrenceValue();
				remainingProbability = Double.toString(1 - digit_sum) + inverseOcc;
				return remainingProbability;
			}
		return remainingProbability;
	}

	/**
	 * This method is used in the transformation of guardIn, guardOut and guardEvent properties
	 * @param pn
	 * @param ci
	 * @param and
	 * @param UpperComponentsEM
	 * @param flagGuardTransition boolean, true if called by the GuardTransitionTransformation process
	 * @return EList containing 2 elements: a EList of Structure objects (storing info on 
	 * the propagation places) and a list of BooleanExpression 
	 * objects that represents all the combinations for which transitions are to be created
	 */
	public static EList createErrorGuardSenderSideLogic(PetriNet pn, ComponentInstance ci, FindSenderOrReceiverErrorModel fsrem, EList and, EList UpperComponentsEM, boolean flagGuardTrans){
		EList intermediaryPlaces = new BasicEList();
		EList toCombine = new BasicEList();
		//for each element in the AND list, gets the list of error states / propagations
		for (Iterator it_and = and.iterator(); it_and.hasNext();){
			ErrorSourceNameEnc esne = (ErrorSourceNameEnc) it_and.next();
			ErrorSourceName esn = esne.getEsn();
			EList errorStateOrPropNames = esn.getErrorStateOrPropagationName();
			//for each propagation looks for its senders
			BooleanExpression be = new BooleanExpression();
			String senderPlacePrefix = new String();
			for(Iterator it_prop = errorStateOrPropNames.iterator(); it_prop.hasNext();){
				String errorStateOrPropName = (String)it_prop.next();
				Hashtable senders = fsrem.getErrorGuardSenders(ci, esn.getSubcomponentOrFeature(), errorStateOrPropName, UpperComponentsEM,flagGuardTrans);
				EList statePlaces = new BasicEList();
				for (Enumeration e = senders.keys(); e.hasMoreElements();){
					ComponentInstance currentSender = (ComponentInstance) e.nextElement();
					EList elementInfo = (EList) senders.get(currentSender);
					FeatureInstance sender_out_f = (FeatureInstance) elementInfo.get(2);

					EList propPlaces = new BasicEList();
					if(sender_out_f != null){
						if(flagGuardTrans){
							senderPlacePrefix = currentSender.getInstanceObjectPath()+"_event_"+sender_out_f.getName();
							propPlaces.add(ErrorModel2PetriNet.getPlaceByName(pn, senderPlacePrefix));
						}
						else{
							senderPlacePrefix = currentSender.getInstanceObjectPath()+"_"+errorStateOrPropName+"_"+sender_out_f.getName();
							EList currentSenderPropPlaces = ErrorModel2PetriNet.getPlacesByPrefix(pn, senderPlacePrefix);
							if (currentSenderPropPlaces.isEmpty()){
								senderPlacePrefix = currentSender.getInstanceObjectPath()+"_"+errorStateOrPropName;
								currentSenderPropPlaces =ErrorModel2PetriNet.getPlacesByPrefix(pn, senderPlacePrefix);
							}
							propPlaces.addAll(currentSenderPropPlaces);
						}
					}
					else{
						// feature is null
						//this happens if i don't have places created in the guard_out transformation
						//I look for places created in the name matching transformation
						String name = currentSender.getInstanceObjectPath()+"_"+errorStateOrPropName;

						propPlaces.addAll(ErrorModel2PetriNet.getPlacesByPrefix(pn, name));
						if(propPlaces.size() == 0){
							//this means we take into account a state in the sender error model
							name = currentSender.getInstanceObjectPath()+"_"+errorStateOrPropName;
							//it creates the place if it doesn't exist
							Place statePlace = ErrorModel2PetriNet.getPlaceByName(pn, name);
							statePlaces.add(statePlace);
							propPlaces.add(statePlace);
						}
					}
					for(Iterator it_p = propPlaces.iterator(); it_p.hasNext();){
						Place senderPlace = (Place) it_p.next();
						if(!statePlaces.contains(senderPlace)){
							Structure s = new Structure(null,senderPlace,null);
							intermediaryPlaces.add(s);
						}
						BooleanVariable bv = new BooleanVariable(senderPlace.getName(), senderPlace, false);
						BooleanOperand bo = new BooleanOperand(bv);
						be.addBooleanOperand(bo); //or es K0_1 or K0_2 or K0_3
					}
				}//end for each sender
			}//end for errorStateOrPropagations
			if(esne.getNot()){
				be = BooleanOperations.not(be);
			 // be.printExpression();
			}
			toCombine.add(be);
		}//end for errorSourceNameEnc in the and list
		EList toReturn = new BasicEList();
		toReturn.add(intermediaryPlaces);
		toReturn.add(toCombine);
		return toReturn;
	}
}
