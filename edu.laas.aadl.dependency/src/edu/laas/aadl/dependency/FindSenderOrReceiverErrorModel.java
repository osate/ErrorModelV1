/** 
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of this library is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 */

package edu.laas.aadl.dependency;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.ComponentCategory;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.impl.SubprogramSubcomponentImpl;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.ConnectionInstanceEnd;
import org.osate.aadl2.instance.ConnectionKind;
import org.osate.aadl2.instance.FeatureCategory;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.instance.ModeInstance;
import org.osate.aadl2.instance.ModeTransitionInstance;
import org.osate.aadl2.instance.SystemInstance;
import org.osate.aadl2.modelsupport.modeltraversal.ForAllElement;
import org.osate.aadl2.parsesupport.AObject;
import org.osate.aadl2.properties.PropertyNotPresentException;
import org.osate.xtext.aadl2.properties.util.GetProperties;

import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.impl.ErrorStateImpl;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

/**
 * @author Ana Elena Rugina & Marilena Bruffa {aerugina, mbruffa}@laas.fr
 *
 */

public class FindSenderOrReceiverErrorModel {
	EAXUtil utilEMA = new EAXUtil();

	/**
	 * This method finds the sender components of out error propagation or error states named in 
	 * the boolean error expression of a guard_in property
	 *  
	 * @param ci ComponentInstance with the guard_in
	 * @param ph NamedElement, it represents the feature of subcomponent through which ci receives the error state or propagation
	 * @param errorStateOrPropName String, name of the error state or propagation
	 * @param UpperComponentsEM EList of components with EM to take into account
	 * @return Hashtable containing the sender components and relative out feature
	 * 
	 * @author Marilena Bruffa
	 */
	public Hashtable getGuardInSenders(ComponentInstance ci, NamedElement ph, String errorStateOrPropName, EList UpperComponentsEM){
		return getErrorGuardSenders(ci, ph, errorStateOrPropName, UpperComponentsEM, false);		
	}

	/**
	 * This method finds the sender components of out error propagation or error states named in 
	 * the boolean error expression of a guard_out property
	 *  
	 * @param ci ComponentInstance with guard_out
	 * @param ph NamedElement through which the component receives the error state or propagation from the sender
	 * @param errorStateOrPropName String, name of the error state or propagation
	 * @param UpperComponentsEM EList of components with EM to take into account
	 * @return Hashtable containing the sender components and relative out feature
	 * 
	 * @author Marilena Bruffa
	 */
	public Hashtable getGuardOutSenders(ComponentInstance ci, NamedElement ph, String errorStateOrPropName, EList UpperComponentsEM){
		return getErrorGuardSenders(ci, ph, errorStateOrPropName, UpperComponentsEM, false);		
	}

	/**
	 * This method finds the sender components of out error propagation or error states named in 
	 * the boolean error expression of a guard_event property
	 * 
	 * @param ci ComponentInstance with guard_event property
	 * @param ph NamedElement, it represents the feature of subcomponent through which the component receives the error propagation or state 
	 * @param errorStateOrPropName String, name of error state of propagation
	 * @param UpperComponentsEM EList of components with EM to take into account
	 * @return Hashtable containing the sender components and relative out feature 
	 * 
	 * @author Marilena Bruffa
	 */
	public Hashtable getGuardEventSenders(ComponentInstance ci, NamedElement ph, String errorStateOrPropName, EList UpperComponentsEM){
		return getErrorGuardSenders(ci, ph, errorStateOrPropName, UpperComponentsEM, false);		
	}

	/**
	 * This method finds the sender components that raise an event that reaches the in event port
	 * named in the boolean error expression of the guard_transition property declared by the current 
	 * component
	 * 
	 * @param ci ComponentInstance with guard_event property
	 * @param ph NamedElement, it represents the feature or subcomponent through which the component receives the event
	 * @param UpperComponentsEM EList of components with error model
	 * @return Hashtable containing the sender components and relative out feature 
	 * 
	 * @author Marilena Bruffa 
	 */
	public Hashtable getGuardTransitionSenders(ComponentInstance ci, NamedElement ph, EList UpperComponentsEM){
		return getErrorGuardSenders(ci, ph, "", UpperComponentsEM, true);
	}

	/**
	 * 
	 * This method is used to find the sender components for a given error state or error 
	 * propagation. 
	 * For each feature of the component ci that appears in the guard_in, guard_out or guard_event property it finds the
	 * senders calling the method getSenders(String errorStateOrPropName, ComponentInstance ci, Feature fi, EList UpperComponentsEM)
	 * of class FindSenderOrReceiverErrorModel
	 * 
	 * @param ci ComponentInstance with guard_in, guard_out or guard_event properties
	 * @param ph NamedElement, it represents a subcomponent or a feature
	 * @param errorStateOrPropName String
	 * @param UpperComponentsEM EList
	 * @param flagGuardTransition boolean, its value is true when looking for senders of a guard_transition property
	 * @return senders Hashtable containing all the senders for the error state of propagation
	 * whose name is errorStateOrPropName
	 * 
	 * @author Marilena Bruffa
	 */
	public Hashtable getErrorGuardSenders(ComponentInstance ci, NamedElement ph, String errorStateOrPropName, EList UpperComponentsEM, boolean flagGuardTransition) {
		Hashtable senders = new Hashtable();
		EList fiList = ci.getFeatureInstances();
		boolean done = false;
		
		for (Iterator it_fi = fiList.iterator(); it_fi.hasNext();){
			FeatureInstance fi = (FeatureInstance) it_fi.next();
			if(ph == null){ //case self reference 
				if(!done){
					senders.clear();
					EList l = new BasicEList();
					Object o = new Object();
					l.add(o);
					l.add(o);
					l.add(null);
					senders.put(ci,l); //this esn refers to the component itself
					done = true;	
				}
			}
			else if(ph.getName().equals(fi.getName())){
					senders.clear();
					if(!flagGuardTransition){
						// senders for guard_in, guard_out, guard_event
						senders = getSenders(errorStateOrPropName, ci, fi, UpperComponentsEM);
					}
					else{
						//senders for guard_transition 
						EList sendersList = getSenders(ci, fi, UpperComponentsEM);
						for(Iterator it = sendersList.iterator(); it.hasNext();){
							EList el = (EList)it.next();
							EList l = new BasicEList();
							Object o = new Object();
							l.add(o);
							l.add(o);
							l.add(el.get(1));//feature
							senders.put(el.get(0), l);//component/connection and feature
						}
					}
				}
			

		}

		return senders;
	}


	/**
	 * Finds the Sender components for the out propagation propName that occurs
	 * in the error model associated with the component instance given in
	 * parameter of the method
	 * 
	 * @param propName String name of the out propagation (from sender to receiver component ci)
	 * @param ci ComponentInstance 
	 * @param fi the feature which is the source of the sender search
	 * @param UpperComponentsEM EList of components with error models to be taken into account
	 * @return Hashtable of Sender components/connections (they have error models)containing 
	 * EList of PN transitions corresp. to the out prop / states
	 */
	public Hashtable getSenders(String errorStateOrPropName, ComponentInstance ci, FeatureInstance fi, EList UpperComponentsEM) {
		EAXUtil emu = new EAXUtil();
		EList possibleSenders = getSenders(ci, fi, UpperComponentsEM);

		Hashtable Senders = new Hashtable();
		EList coupleList = new BasicEList();
		// for each possible Sender search for out propagations or states propName
		//get a list of all error model features in order to find all states declared
		//by the possible sender
		for (Iterator it = possibleSenders.iterator(); it.hasNext();){
			EList possibleSenderInfo = (EList)it.next();
			InstanceObject possibleSender = (InstanceObject) possibleSenderInfo.get(0);
			ErrorModelImplementation emi = hasAbstractEM.getErrorModelImplementation(possibleSender);
			EList errModelFeatures = emi.getErrorModelType().getFeatures();
			for(Iterator it_f = errModelFeatures.iterator(); it_f.hasNext();){
				ErrorModelFeature emf = (ErrorModelFeature)it_f.next();
				//if the error model feature is an error state, check if it is errorStateOrPropName
				if(emf.getClass() == ErrorStateImpl.class){
					if(emf.getName().equals(errorStateOrPropName)){
						EList l = new BasicEList();
						Object emptyObject = new Object();
						l.add(emptyObject);
						l.add(emptyObject);
						l.add(null);
						Senders.put(possibleSenderInfo.get(0),l);
					}
				}
			}
			//checks for out propagations
			EList transitions = emi.getErrorTransitions().getErrorTransition();
			// for each transition look for its "action" (out propagation)
			for (Iterator it_trans = transitions.iterator(); it_trans.hasNext();)
			{
				ErrorTransition trans = (ErrorTransition) it_trans.next();
				EList outPropag = trans.getTransitionAction();//gets the out propagations
				for (Iterator it_prop = outPropag.iterator(); it_prop.hasNext();)
				{
					ErrorPropagation outPropagation = (ErrorPropagation) it_prop.next();		
					if (outPropagation.getName().equals(errorStateOrPropName))
					{
						// if the out propagation is found, put its source / dest couples in an EList
						// add the couple EList in the EList for the component
						EList Src = trans.getOrigin();
						for (Iterator itSrc = Src.iterator(); itSrc.hasNext();) 
						{
							ErrorState currentSrc = (ErrorState) itSrc.next();
							EList srcDstCouple = new BasicEList();
							srcDstCouple.add(currentSrc);
							srcDstCouple.add(trans.getDestination());
							coupleList.addAll(srcDstCouple);
							coupleList.add(possibleSenderInfo.get(1));//feature
							Senders.put(possibleSender, coupleList);
						}
					}
				}
			}

			//  checks for Guard_Outs as senders
			if (possibleSender instanceof ComponentInstance) 
			{
				OutErrorPropagationGuard guardOut= emu.getOutErrorPropagationGuard((FeatureInstance)possibleSenderInfo.get(1));

				if (guardOut!=null)
				{
					EList rules = guardOut.getErrorPropagationRule();
					//for each error propagation rule get the boolean error expression
					for (Iterator it_epr = rules.iterator(); it_epr.hasNext();)
					{
						ErrorPropagationRule epr = (ErrorPropagationRule)it_epr.next();
						//gets the out error propagation and transforms it in a PN place
						if(!epr.isMask())
						{
							String propName = epr.getErrorPropagation().getName();
							if (propName.equals(errorStateOrPropName))
							{
								EList l = new BasicEList();
								Object o = new Object();
								l.add(o);
								l.add(o);
								l.add(possibleSenderInfo.get(1));//feature
								Senders.put(possibleSender, l); // the Hashtable's key is the component instance and the element is the feature with the GuardOut
							}
						}
					}
					
				}
			}
		}
		return Senders;
	}

	/**
	 * Finds the Sender componets for propagations that occur in the error model associated 
	 * with the component instance given in parameter of the method
	 * 
	 * @param iobj InstanceObject that sends propagations (component instance or connection instance)
	 * @param fi FeatureInstance referred to in the Guard_In property
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of Sender components/connections (they have error models). Each element contains the component and the feature
	 *
	 */   
	public EList getSenders(ComponentInstance ci, FeatureInstance fi, EList UpperComponentsEM) {
		EList element = new BasicEList();
		EList Senders = new BasicEList();
		FeatureCategory fc = fi.getCategory();
		if(fc == FeatureCategory.DATA_PORT || fc == FeatureCategory.EVENT_PORT || fc == FeatureCategory.EVENT_DATA_PORT){
			EList incommingConnections = fi.getDstConnectionInstances();
			for (Iterator it_incommingConn = incommingConnections.iterator(); it_incommingConn.hasNext();){
				ConnectionInstance incomingConnection = (ConnectionInstance) it_incommingConn.next();
				if (UpperComponentsEM.contains(incomingConnection)){
					// if yes, put the connection in the Senders list
					element.clear();
					element.add(incomingConnection);
					 ConnectionInstanceEnd src_fi = incomingConnection.getSource();
					element.add(src_fi);
					Senders.add(element);
				}
				else {// if no, search for components with error models connected to the connection
					ComponentInstance possibleSender = incomingConnection.getSource().getContainingComponentInstance();
					ComponentInstance Sender = getSenderComponentUp(possibleSender, UpperComponentsEM);
					if(Sender == null)
						Sender = getSenderComponentDown(possibleSender, UpperComponentsEM);
					if (Sender!=null){
						ConnectionInstanceEnd src_fi = incomingConnection.getSource();
						element.clear();
						element.add(Sender);
						element.add(src_fi);
						Senders.add(element);
					}
				}
			}
		}//end if
		else{
			if(fc == FeatureCategory.SUBPROGRAM_ACCESS){
				SupportingOperations suppOperations = new SupportingOperations();
				//should find all subprograms which declare Actual_Subprogram_Call property whose
				//referenced object is the server subprogram
				ComponentInstance server = fi.getContainingComponentInstance();
				for(Iterator it = UpperComponentsEM.iterator(); it.hasNext();){
					InstanceObject iobj = (InstanceObject) it.next();
//					if(iobj.getClass() == SubprogramSubcomponentImpl.class){	
//						ComponentInstance ref = (ComponentInstance)suppOperations.getActualSubprogramCall(iobj);
//						if(ref == server){
//							element.clear();
//							element.add(iobj);
//							element.add(fi);
//							Senders.add(element);
//						}
//					}
				}
			}
			else{
				if(fc == FeatureCategory.BUS_ACCESS || fc == FeatureCategory.DATA_ACCESS){
					EList conn = fi.getDstConnectionInstances();
					for(Iterator it = conn.iterator(); it.hasNext();){
						ConnectionInstance ac = (ConnectionInstance) it.next();
						if(UpperComponentsEM.contains(ac)){
							element.clear();
							element.add(ac);
							element.add(fc);
							Senders.add(element);
						}
						else{
							 ConnectionInstanceEnd possibleSender = ac.getSource();
							 if (possibleSender instanceof ComponentInstance){
							ComponentInstance Sender = getSenderComponentUp((ComponentInstance)possibleSender, UpperComponentsEM);
							if(Sender == null)
								Sender = getSenderComponentDown((ComponentInstance)possibleSender, UpperComponentsEM);
							if (Sender!=null){
								element.clear();
								element.add(Sender);
								element.add(fc);
								Senders.add(element);
							}
							 }
						}
					}
				}
			}
		}
		return Senders;
	}

	/**
	 * This method finds the receivers for the name matching propagation. 
	 * In the case in which the sender is a component it checks if there's any guard-out
	 * property defined for the error propagation we're considering
	 * 
	 * @param sender InstanceObject
	 * @param propName String
	 * @param UpperComponentsEM EList
	 * @return Hashtable containing the receivers component/connection
	 */
	public Hashtable getNameMatchingReceivers(InstanceObject sender, String propName, EList UpperComponentsEM){
		Hashtable possibleReceivers = getReceivers(propName, sender, UpperComponentsEM);
		Hashtable receivers = new Hashtable();
		Enumeration e = possibleReceivers.keys();
		for(;e.hasMoreElements();){
			InstanceObject possibleReceiver = (InstanceObject) e.nextElement();
			if(sender instanceof ComponentInstance){
				if(!SupportingOperations.hasAGuardOut((ComponentInstance)sender, (ComponentInstance)possibleReceiver, propName, UpperComponentsEM)){
					receivers.put(possibleReceiver,possibleReceivers.get(possibleReceiver));
				}
			}
			else { //connection instance
				receivers.put(possibleReceiver, possibleReceivers.get(possibleReceiver));
			}
		}
		return receivers;
	}	

	/**
	 * This method creates a hashtable containing the receivers for a propagation sent out from a 
	 * feature with a guard_out property
	 * 
	 * @param sender ComponentInstance
	 * @param fi FeatureInstance having the GuardOut
	 * @param propName String
	 * @param UpperComponentsEM EList
	 * @return Hashtable containing the receiver components and the couple of src/dest states
	 */
	public Hashtable getGuardOutReceivers(ComponentInstance sender, FeatureInstance fi, String propName, EList UpperComponentsEM){
		EList possibleReceivers = ruleCompFeature2Conn(fi, UpperComponentsEM);
		Hashtable receivers = getReceiversFromPossibleReceivers(propName, sender, possibleReceivers, UpperComponentsEM);
		return receivers;
	}

	/**
	 * This method creates a list containing the receivers for an event raised by the 
	 * feature port with guard_event property, these receivers don't have any guard_transition
	 * declared for the event raised by the sender component
	 * 
	 * @param ci ComponentInstance
	 * @param port FeatureInstance
	 * @param UpperComponentsEM
	 * @return EList
	 */
	public EList getGuardEventReceivers(ComponentInstance ci, FeatureInstance port, EList UpperComponentsEM){
		Hashtable receivers = new Hashtable();
		EList toGuardTransitionTransformation = new BasicEList();
		EList toReturn = new BasicEList();
		Hashtable possibleReceivers = getGuardEventReceivers(ci, port);
		for(Enumeration e = possibleReceivers.keys(); e.hasMoreElements();){
			ComponentInstance possibleReceiver = (ComponentInstance) e.nextElement();
			if(!SupportingOperations.hasAGuardTransition(ci, possibleReceiver, UpperComponentsEM)){
				receivers.put(possibleReceiver, possibleReceivers.get(possibleReceiver));
			}
			else{
				toGuardTransitionTransformation.add(possibleReceiver);	
			}
		}
		toReturn.add(receivers);
		toReturn.add(toGuardTransitionTransformation);
		return toReturn;
	}

	/**
	 * This method finds all the possible receivers for an guard_event without taking into account 
	 * if they define a guard_transition property for that event
	 * 
	 * @param ci ComponentInstance, sender of the event
	 * @param portInstance FeatureInstance through which the event is sent out of the component
	 * @return Hashtble containing the possible receivers and the couples of src/dst modes
	 */
	private Hashtable getGuardEventReceivers(ComponentInstance ci, FeatureInstance portInstance) {
		Hashtable receivers = new Hashtable();
		//look for mode transitions in the containing component
		ComponentInstance upperComp = ci.getContainingComponentInstance();
		EList modeTransitions = upperComp.getModeTransitionInstances();
		for(Iterator it = modeTransitions.iterator(); it.hasNext();){
			ModeTransitionInstance mti = (ModeTransitionInstance) it.next();
			EList triggersPorts = mti.getModeTransition().getOwnedTriggers();
			//checks if the port is a trigger for the mode transition
			if(triggersPorts.contains(portInstance)){
				//add to the receivers
				ModeInstance src_mode = mti.getSource();
				ModeInstance dst_mode = mti.getDestination();
				EList couple = new BasicEList();
				couple.add(src_mode);
				couple.add(dst_mode);
				receivers.put(upperComp, couple);
			}	
		}
		//looks for possible receivers through an event port connection
		EList mode_transitions = portInstance.getSrcConnectionInstances();
		for(Iterator it2 = mode_transitions.iterator(); it2.hasNext();){
			ConnectionInstance mtc = (ConnectionInstance) it2.next();
			 ConnectionInstanceEnd mti = mtc.getDestination();
			 if (mti instanceof ModeTransitionInstance) {
					ModeInstance src_mode = ((ModeTransitionInstance)mti).getSource();
					ModeInstance dst_mode = ((ModeTransitionInstance)mti).getDestination();
					EList couple = new BasicEList();
					ComponentInstance dest = mti.getContainingComponentInstance();
					couple.add(src_mode);
					couple.add(dst_mode);
					receivers.put(dest, couple);
			}
		}
		return receivers;
	}

	/**
	 * Finds the receiver components for the out propagation propName that occurs
	 * in the error model associated with the component instance given in
	 * parameter of the method
	 * 
	 * @param propName String
	 * @param iobj InstanceObject (sender)
	 * @param UpperComponentsEM EList of components with error models to be taken into account
	 * @return Hashtable of receiver components/connections (they have error models) 
	 * containing list of couples of source/dest states
	 */
	public Hashtable getReceivers(String propName, InstanceObject iobj, EList UpperComponentsEM) {
		EList possibleReceivers = getPossibleReceivers(iobj, UpperComponentsEM);
		Hashtable receivers = getReceiversFromPossibleReceivers(propName, iobj, possibleReceivers, UpperComponentsEM);
		Enumeration e = receivers.keys();
		for(;e.hasMoreElements();){
			InstanceObject receiver = (InstanceObject) e.nextElement();
			EList srcDstCouples = (EList) receivers.get(receiver);
			for (Iterator it = srcDstCouples.iterator(); it.hasNext();) {
				EList couple = (EList) it.next();
				ErrorState currentSrc = (ErrorState) couple.get(0);
				ErrorState currentDst = (ErrorState) couple.get(1);
			}
		}
		return receivers;
	}
	
		
	
	/**
	 * Finds the receiver components for the out propagation propName that occurs
	 * in the error model associated with the component instance given in
	 * parameter of the method. Searches the true receivers in the list of possible receivers
	 * 
	 * @param propName String
	 * @param iobj InstanceObject 
	 * @param possibleReceivers EList of possibleReceivers
	 * @param UpperComponentsEM EList of components with error models to be taken into account
	 * @return Hashtable of receiver components/connections (they have error models) 
	 * containing list of couples of source/dest states
	 */
	public Hashtable getReceiversFromPossibleReceivers(String propName, InstanceObject iobj, EList possibleReceivers, EList UpperComponentsEM) {
		Hashtable receivers = new Hashtable();
		ErrorModelClassifier emc = null;
		// for each possible receiver search for in propagations propName
		for (Iterator it = possibleReceivers.iterator(); it.hasNext();){
			InstanceObject possibleReceiver = (InstanceObject) it.next();
			if (possibleReceiver instanceof ComponentInstance){
				emc = utilEMA.getComponentErrorModelPropertyValue((ComponentInstance) possibleReceiver);
			}
			else if (possibleReceiver instanceof ConnectionInstance){
				emc = utilEMA.getComponentErrorModelPropertyValue((ConnectionInstance) possibleReceiver);
			}
			if ( emc instanceof ErrorModelImplementation){
				if(iobj != possibleReceiver)
					if(iobj instanceof ConnectionInstance || (iobj instanceof ComponentInstance && !SupportingOperations.hasAGuardIn((ComponentInstance)iobj,(ComponentInstance)possibleReceiver, propName,UpperComponentsEM))){
						EList coupleList = new BasicEList();
						EList transitions = ((ErrorModelImplementation)emc).getErrorTransitions().getErrorTransition();
						// for each transition see if the in propagation is a trigger
						for (Iterator it_trans = transitions.iterator(); it_trans.hasNext();){
							ErrorTransition trans = (ErrorTransition) it_trans.next();
							EList inPropagationsAndEvents = trans.getTransitionTrigger();
							for (Iterator it_prop = inPropagationsAndEvents.iterator(); it_prop.hasNext();){
								ErrorEventOrPropagation inPropagation = (ErrorEventOrPropagation) it_prop.next();
								if (inPropagation instanceof ErrorPropagation){
									if (inPropagation.getName().equals(propName)){
										// if the in propagation is found, put its source / dest couples in an EList
										// add the couple EList in the EList for the component
										EList Src = trans.getOrigin();
										for (Iterator itSrc = Src.iterator(); itSrc.hasNext();) {
											ErrorState currentSrc = (ErrorState) itSrc.next();
											EList srcDstCouple = new BasicEList();
											srcDstCouple.add(currentSrc);
											srcDstCouple.add(trans.getDestination());
											coupleList.add(srcDstCouple);
										}	
									}

								}
							}
						}
						receivers.put(possibleReceiver, coupleList);
					}
			}
		}
		return receivers;
	}
	

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance given in parameter of the method
	 * The research is done differently for different kinds of components and for connections 
	 * 
	 * @param iobj InstanceObject that sends propagations (component instance or connection instance) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getPossibleReceivers(InstanceObject iobj, EList UpperComponentsEM) {
		EList receivers = new BasicEList();
		if (iobj instanceof ConnectionInstance){
			receivers = getReceiversConnection((ConnectionInstance)iobj, UpperComponentsEM);
		}
		else 
			if (iobj instanceof ComponentInstance){
				int categ = ((ComponentInstance)iobj).getCategory().getValue();
				switch (categ){
				case ComponentCategory.SYSTEM_VALUE: 
					//apply propagation rules out of system components
					receivers = getReceiversSystem((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.PROCESSOR_VALUE:
					try{
						receivers = getReceiversProcessor((ComponentInstance)iobj, UpperComponentsEM);
					}
					catch(PropertyNotPresentException e){
						System.out.println("Property " + e.getDefinition().getName() + " is not present");
					}
					break;
				case ComponentCategory.DEVICE_VALUE:
					// apply propagation rules out of device components
					receivers = getReceiversDevice((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.BUS_VALUE:
					// apply propagation rules out of bus components
					receivers = getReceiversBus((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.MEMORY_VALUE:
					// apply propagation rules out of memory components
					receivers = getReceiversMemory((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.PROCESS_VALUE:
					// apply propagation rules out of system components
					receivers = getReceiversProcess((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.THREAD_VALUE:
					// apply propagation rules out of thread components
					receivers = getReceiversThread((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.THREAD_GROUP_VALUE:
					// apply propagation rules out of thread group components
					receivers = getReceiversThreadGroup((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.DATA_VALUE:
					// apply propagation rules out of data components
					receivers = getReceiversData((ComponentInstance)iobj,UpperComponentsEM);
					break;
				case ComponentCategory.SUBPROGRAM_VALUE:
					// apply propagation rules out of subprogram components
					receivers = getReceiversSubprogram((ComponentInstance)iobj,UpperComponentsEM);
					break;
				default:
					break;
				}				
			}
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category SYSTEM
	 * 
	 * @param ci ComponentInstance (whose category is SYSTEM) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversConnection(ConnectionInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		ComponentInstance receiver = ruleConn2Comp(ci, UpperComponentsEM);
		if (receiver != null)
			receivers.add(receiver);
		receivers.addAll(ruleConn2Conn(ci, UpperComponentsEM));
		if(ci.getKind().equals(ConnectionKind.PORT_CONNECTION) )
			receivers.addAll(ruleEventConn2ModeTrans(ci, UpperComponentsEM));	
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category SYSTEM
	 * 
	 * @param ci ComponentInstance (whose category is SYSTEM) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversSystem(ComponentInstance ci, EList UpperComponentsEM) {
		EList possibleReceivers = ruleComp2Conn(ci, UpperComponentsEM);
		EList morePossibleReceivers = ruleComp2SharedComp(ci, UpperComponentsEM);
		possibleReceivers.addAll(morePossibleReceivers);

		return possibleReceivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category PROCESSOR
	 * 
	 * @param ci ComponentInstance (whose category is PROCESSOR) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversProcessor(ComponentInstance ci, EList UpperComponentsEM) {
		EList receivers = ruleProcessor2Thread(ci, UpperComponentsEM);
		receivers.addAll(ruleProcessor2Conn(ci, UpperComponentsEM));
		receivers.addAll(ruleComp2Subprogram(ci, UpperComponentsEM));
		receivers.addAll(ruleComp2Conn(ci, UpperComponentsEM));
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category DEVICE
	 * 
	 * @param ci ComponentInstance (whose category is DEVICE) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversDevice(ComponentInstance ci, EList UpperComponentsEM) {	
		EList receivers = ruleDevice2Conn(ci, UpperComponentsEM);
		receivers.addAll(ruleComp2Conn(ci, UpperComponentsEM));
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category BUS
	 * 
	 * @param ci ComponentInstance (whose category is BUS) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversBus(ComponentInstance ci, EList UpperComponentsEM) {	
		EList receivers = ruleBus2Conn(ci, UpperComponentsEM);
		receivers.addAll(ruleComp2Subprogram(ci, UpperComponentsEM));
		receivers.addAll(ruleSharedComp2Comp(ci, UpperComponentsEM));
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category MEMORY
	 * 
	 * @param ci ComponentInstance (whose category is MEMORY) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversMemory(ComponentInstance ci, EList UpperComponentsEM) {
		EList receivers = ruleMemory2SoftwareComp(ci, UpperComponentsEM);
		receivers.addAll(ruleMemory2Conn(ci, UpperComponentsEM));
		receivers.addAll(ruleComp2Subprogram(ci, UpperComponentsEM));		
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category PROCESS
	 * 
	 * @param ci ComponentInstance (whose category is PROCESS) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversProcess(ComponentInstance ci, EList UpperComponentsEM) {
		EList possibleReceivers = ruleComp2Conn(ci, UpperComponentsEM);
		possibleReceivers.addAll(ruleComp2SharedComp(ci, UpperComponentsEM));
		possibleReceivers.addAll(ruleProcess2OtherProcess(ci, UpperComponentsEM));	
		return possibleReceivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category THREAD
	 * 
	 * @param ci ComponentInstance (whose category is THREAD) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversThread(ComponentInstance ci, EList UpperComponentsEM) {
		EList possibleReceivers = ruleComp2Conn(ci, UpperComponentsEM);
		possibleReceivers.addAll(ruleComp2SharedComp(ci, UpperComponentsEM));		
		possibleReceivers.addAll(ruleSubcomp2SubcompSameProcess(ci, UpperComponentsEM));		
		return possibleReceivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category THREAD_GROUP
	 * 
	 * @param ci ComponentInstance (whose category is THREAD_GROUP) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversThreadGroup(ComponentInstance ci, EList UpperComponentsEM) {
		EList possibleReceivers = ruleComp2Conn(ci, UpperComponentsEM);
		possibleReceivers.addAll(ruleComp2SharedComp(ci, UpperComponentsEM));
		possibleReceivers.addAll(ruleSubcomp2SubcompSameProcess(ci, UpperComponentsEM));		
		return possibleReceivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category DATA
	 * 
	 * @param ci ComponentInstance (whose category is DATA) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversData(ComponentInstance ci, EList UpperComponentsEM) {
		EList receivers = ruleSharedComp2Comp(ci, UpperComponentsEM);
		receivers.addAll(ruleSubcomp2SubcompSameProcess(ci, UpperComponentsEM));
		return receivers;
	}

	/**
	 * Finds the receiver components for propagations that occur in the error model associated 
	 * with the component instance of category SUBPROGRAM
	 * 
	 * @param ci ComponentInstance (whose category is SUBPROGRAM) 
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return EList of receiver components/connections (they have error models)
	 *
	 */   
	public static EList getReceiversSubprogram(ComponentInstance ci, EList UpperComponentsEM) {
		EList receivers = ruleComp2Conn(ci, UpperComponentsEM);
		receivers.addAll(ruleClientSubprog2ServerSubprog(ci, UpperComponentsEM));
		receivers.addAll(ruleServerSubprog2ClientSubprog(ci, UpperComponentsEM));
		return receivers;
	}

	/**
	 * Finds the receiver component for propagations that occur in the error model associated 
	 * with a port connection instance 
	 * 
	 * @param ci PortConnectionInstance  
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return ComponentInstance receiver component if it has an error model, else null
	 *
	 */   
	private static ComponentInstance ruleConn2Comp(ConnectionInstance ci, EList UpperComponentsEM) {		
		ComponentInstance receiver = getReceiverUltimateDest(ci, UpperComponentsEM);
		if(receiver == null){
			ComponentInstance dest = ci.getDestination().getContainingComponentInstance();
			receiver = getReceiverComponentUp(dest,UpperComponentsEM);
			if(receiver == null)
				receiver = getReceiverComponentDown(dest, UpperComponentsEM);
		}
		return receiver;
	}

	/**
	 * Recursive search of a receiver UP in the instance hierarchy
	 * 
	 * This method implements the inheritance rule for which a propagation occurs into the error model 
	 * associated with the containing component if the considered component doesn't have one.
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components in the hierarchy that have an error model
	 * @return ComponentInstance receiver of the propagation, it has an error model
	 */
	public static ComponentInstance getReceiverComponentUp(ComponentInstance ci, EList UpperComponentsEM){
		return findComponentUp(ci, UpperComponentsEM);
	}

	/**
	 * 
	 * Recursive search of a receiver DOWN in the instance hierarchy
	 * 
	 * This method implements the inheritance rule for which a propagation occurs into the error model 
	 * associated with a contained component if the considered component doesn't have one.
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components in the hierarchy that have an error model
	 * @return ComponentInstance receiver of the propagation, it has an erro model
	 */
	public static ComponentInstance getReceiverComponentDown(ComponentInstance ci, EList UpperComponentsEM){
		return findComponentDown(ci, UpperComponentsEM);
	}

	/**
	 * Recursive search of a sender UP in the instance hierarchy
	 * 
	 * This method implements the inheritance rule for which a propagation occurs out of the error model 
	 * associated with the containing component if the considered component doesn't have one.
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components in the hierarchy that have an error model
	 * @return ComponentInstance sender of the propagation, it has an error model
	 */
	public static ComponentInstance getSenderComponentUp(ComponentInstance ci, EList UpperComponentsEM){
		return findComponentUp(ci, UpperComponentsEM);
	}

	/**
	 * 
	 * Recursive search of a sender DOWN in the instance hierarchy
	 * 
	 * This method implements the inheritance rule for which a propagation occurs out of the error model 
	 * associated with the contained component if the considered component doesn't have one.
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components in the hierarchy that have an error model
	 * @return ComponentInstance sender of the propagation, it has an erro model
	 */
	public static ComponentInstance getSenderComponentDown(ComponentInstance ci, EList UpperComponentsEM){
		return findComponentDown(ci, UpperComponentsEM);
	}

	/**
	 * 
	 * This method implements the inheritance rule for which if an error propagation occurs
	 * into a semantic connection that doesn't have an error model, then the propagation occurs 
	 * to all ultimate destinations of the connection 
	 * 
	 * @param ci ConnectionInstance
	 * @param UpperComponentsEM EList
	 * @return ComponentInstance that is the ultimate destination of the semantic connection 
	 * given as parameter fo the method
	 */
	public static ComponentInstance getReceiverUltimateDest(ConnectionInstance ci, EList UpperComponentsEM){
		ComponentInstance cii = ci.getDestination().getContainingComponentInstance();
		if(UpperComponentsEM.contains(cii))
			return cii;
		return null;

	}

	/**
	 * Recursive search of a receiver UP in the instance hierarchy
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return Component Instance that is in the UpperComponentsEM 
	 *
	 */   
	private static ComponentInstance findComponentUp(ComponentInstance ci, EList UpperComponentsEM){
		if (UpperComponentsEM.contains(ci)){
			return ci;
		}
		else {
			ci=ci.getContainingComponentInstance();	//list of higher level component (the nearest ancestors)
			if(ci != null){
				for (Iterator i=UpperComponentsEM.iterator();i.hasNext();)
					return findComponentUp(ci,UpperComponentsEM);
			}
		}
		return null;
	}
	/**
	 * Recursive search of a receiver DOWN in the instance hierarchy
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return Component Instance that is in the UpperComponentsEM 
	 *
	 */   
	private static ComponentInstance findComponentDown(ComponentInstance ci, EList UpperComponentsEM){
		if (UpperComponentsEM.contains(ci))
			return ci;
		else {
			EList children = ci.getChildren();
			for (Iterator it = children.iterator(); it.hasNext();){
				Object io = it.next();
				if (io instanceof ComponentInstance){
					return findComponentDown((ComponentInstance)io,UpperComponentsEM);
				}
			}	
		}
		return null;
	}

	/**
	 * Searches up and down the hierarchy for a component having an error model 
	 * (the component must be in the UpperComponentsEM list)
	 * 
	 * @param ci ComponentInstance
	 * @param UpperComponentsEM EList of components with error models to be taken into account    
	 * @return Component Instance that is in the UpperComponentsEM 
	 *
	 */   
	private static ComponentInstance findSenderOrReceiverComponent(ComponentInstance ci, EList UpperComponentsEM){
		ComponentInstance receiver = findComponentUp(ci,UpperComponentsEM);
		if (receiver!=null)
			return receiver;
		else {
			receiver = findComponentDown(ci,UpperComponentsEM);
			if (receiver!=null)
				return receiver;
		}
		return null;
	}

	/**
	 * Gets a list of components, with error model, that are bound to the component boundObj
	 * boundObj can be either a processor, a bus, a device or a memory component. 
	 * The method looks for the components that specify the properties ACTUAL_PROCESSOR_BINDING,
	 * ACTUAL_MEMORY_BINDING, ACTUAL_CONNECTION_BINDING and ACTUAL_SUBPROGRAM_CALL_BINDING
	 * 
	 * @author Marilena Bruffa
	 * @param boundObj ComponentInstance is the object bound
	 * @return bindingComponents EList is the list of components bound to the boundObj component
	 */

	private static EList getActualBindings(ComponentInstance boundObj, EList UpperComponentsEM){

		EList bindingComponents = new BasicEList();
		SupportingOperations operations = new SupportingOperations();
		ComponentInstance ref = null;
		SystemInstance root = boundObj.getSystemInstance();
		EList allComponents = new ForAllElement(){
			protected boolean suchThat(Element obj){
				return obj instanceof ComponentInstance || obj instanceof ConnectionInstance;  
			}
		}.processPreOrderAll(root);
		boolean flag = true;

		for(Iterator it = allComponents.iterator(); it.hasNext();){
			InstanceObject ci = (InstanceObject)it.next();
			int category = boundObj.getCategory().getValue();
			try{
				switch (category){
				case ComponentCategory.PROCESSOR_VALUE : 
					List<ComponentInstance> res;
					if(ci instanceof ComponentInstance){
						if(((ComponentInstance)ci).getCategory()== ComponentCategory.THREAD || ((ComponentInstance)ci).getCategory()==ComponentCategory.THREAD_GROUP || ((ComponentInstance)ci).getCategory()==ComponentCategory.PROCESS || ((ComponentInstance)ci).getCategory()==ComponentCategory.SYSTEM)
						{
							res = GetProperties.getActualProcessorBinding((ComponentInstance)ci);
							if (res.size() > 0)
							ref = res.get(0);
						}
//						else 
//							if(((ComponentInstance)ci).getCategory()== ComponentCategory.SUBPROGRAM)
//					TOD phf not handled old code			ref = operations.getActualSubprogramCallBinding(ci);
					}
					else 	
						if(ci instanceof ConnectionInstance){
							res = GetProperties.getActualConnectionBinding((ConnectionInstance)ci);	  			
							if (res.size() > 0)
								ref = res.get(0);
						}
					break;
				case ComponentCategory.BUS_VALUE:
					if(ci instanceof ConnectionInstance){
						res = GetProperties.getActualConnectionBinding((ConnectionInstance)ci);
						if (res.size() > 0)
							ref = res.get(0);
					}
//					else 
//						if(((ComponentInstance)ci).getCategory()== ComponentCategory.SUBPROGRAM)
//							ref = operations.getActualSubprogramCallBinding(ci); 
					break;
				case ComponentCategory.DEVICE_VALUE:
					if(ci instanceof ConnectionInstance){
						res = GetProperties.getActualConnectionBinding((ConnectionInstance)ci);	  			
						if (res.size() > 0)
							ref = res.get(0);
					}
					break;
				case ComponentCategory.MEMORY_VALUE:
					if(ci instanceof ComponentInstance){
						if(((ComponentInstance)ci).getCategory()== ComponentCategory.DATA || ((ComponentInstance)ci).getCategory()== ComponentCategory.SUBPROGRAM || ((ComponentInstance)ci).getCategory()== ComponentCategory.THREAD || ((ComponentInstance)ci).getCategory()== ComponentCategory.THREAD_GROUP || ((ComponentInstance)ci).getCategory()== ComponentCategory.PROCESS){
							res = GetProperties.getActualMemoryBinding(ci);
							if (res.size() > 0)
								ref = res.get(0);
						}
						if(((ComponentInstance)ci).getCategory()== ComponentCategory.SUBPROGRAM){
//							ref = operations.getActualSubprogramCallBinding(ci);	
						}
					}
					else 
						if(ci instanceof ConnectionInstance){
							//add code here
							ref = null;
							flag = false;
						}
					break;
				default: 
					System.out.println("Not a category for actual binding"); 
				ref = null;
				flag = false;
				break;
				}//end switch
			}// end try
			catch(PropertyNotPresentException e){
				ref = null;
			}
			if(ref == boundObj && flag){
				if(UpperComponentsEM.contains(ci))
					bindingComponents.add(ci);
				else{
					ComponentInstance ciEM = null;
					if(ci instanceof ComponentInstance){
						ciEM = getReceiverComponentUp((ComponentInstance)ci, UpperComponentsEM);
						if(ciEM == null)
							ciEM = getReceiverComponentDown((ComponentInstance)ci, UpperComponentsEM);
					}
					else { //ci instanceof ConnectionInstance		  
						ComponentInstance cii = getReceiverUltimateDest((ConnectionInstance)ci, UpperComponentsEM);
						if(cii == null){
							ComponentInstance dest = ((ConnectionInstance)ci).getDestination().getContainingComponentInstance();
							ciEM = getReceiverComponentUp(dest, UpperComponentsEM);
							if(ciEM == null)
								ciEM = getReceiverComponentDown(dest, UpperComponentsEM);
						}
					}
					if(ciEM != null)
						bindingComponents.add(ciEM);
				}
			}
		}//end for
		return bindingComponents;
	}

	/**
	 * Finds the possible receiver components of the ComponetInstance ci, given by the 
	 * propagation rule "from a component to all outgoing connections with error models 
	 * or to their destination components if they have error models"
	 * 
	 * @param ci ComponentInstance     
	 * @return EList of receiver components/connections 
	 *
	 */   
	private static EList ruleComp2Conn(ComponentInstance ci, EList UpperComponentsEM) {
		EList receivers = new BasicEList();
		EList partialReceivers = null;
		EList features = ((ComponentInstance)ci).getFeatureInstances();

		// for each feature get outgoing connections
		for (Iterator i_f = features.iterator(); i_f.hasNext();){
			FeatureInstance feature = (FeatureInstance) i_f.next();
			partialReceivers = ruleCompFeature2Conn(feature, UpperComponentsEM);
			
			for (Iterator it = partialReceivers.iterator(); it.hasNext();) {
				InstanceObject r = (InstanceObject) it.next();
				receivers.addAll(partialReceivers);
			}
		}
		
		return receivers;
	}

	/**
	 * Finds the receiver components reachable through the FeatureInstance feature, 
	 * 
	 * @param feature FeatureInstance     
	 * @return EList of receiver components/connections 
	 *
	 */   
	private static EList ruleCompFeature2Conn(FeatureInstance feature, EList UpperComponentsEM) {
		EList receivers = new BasicEList();

		EList portConnections = feature.getSrcConnectionInstances();
		// for each outgoing connection see if it has an error model
		for (Iterator i_pc = portConnections.iterator(); i_pc.hasNext();){
			ConnectionInstance pci = (ConnectionInstance) i_pc.next();
			if (UpperComponentsEM.contains(pci)){
				// if yes, put the connection in the receivers list
				receivers.add(pci);
			}
			else {//CALL METHOD getReceiverUltimateDest
				// if no, search for a receiver(having an abstract error model) of the connection
				ComponentInstance dest = getReceiverUltimateDest(pci, UpperComponentsEM);
				if(dest!=null){
					receivers.add(dest);
				}
				else{
					ComponentInstance cii = pci.getDestination().getContainingComponentInstance();
					ComponentInstance receiver = getReceiverComponentUp(cii, UpperComponentsEM);
					if(receiver == null){
						receiver = getReceiverComponentDown(cii, UpperComponentsEM);
					}
					if(receiver != null)
						receivers.add(receiver);		
				}	
			}	
		}
		for (Iterator it = receivers.iterator(); it.hasNext();) {
			InstanceObject r = (InstanceObject) it.next();
		}
		return receivers;
}
	
	/**
	 * 
	 * This method looks for the bus or data components shared by an application component, 
	 * they are possible receivers of propagations from an application component.
	 * 
	 * @author Marilena Bruffa 
	 * @param iobj ComponentInstance, it represents the application component
	 * @return receivers EList, it's the list that contains the shared bus or data components
	 */

	private static EList ruleComp2SharedComp(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		EList features = ci.getFeatureInstances();
		for(Iterator it = features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance)it.next();
			FeatureCategory fc = fi.getCategory();
			if(fc == FeatureCategory.DATA_ACCESS || fc == FeatureCategory.BUS_ACCESS){
				EList conn = fi.getDstConnectionInstances();
				for(Iterator it2 = conn.iterator();it2.hasNext();){
					ConnectionInstance c = (ConnectionInstance)it2.next();					
					 ConnectionInstanceEnd sharedComp = c.getSource();
					if(UpperComponentsEM.contains(sharedComp))
						receivers.add(sharedComp);
					else{ //look up and down in the hierarchy to find a comp with EM
						if (sharedComp instanceof ComponentInstance) {
						ComponentInstance ciEM = getReceiverComponentUp((ComponentInstance)sharedComp, UpperComponentsEM);
						if (ciEM == null){
							ciEM = getReceiverComponentDown((ComponentInstance)sharedComp, UpperComponentsEM);
						}
						if(ciEM != null)
							receivers.add(ciEM);
						}
					}
				}//end for
			}//end if
		}//end for
		return receivers;
	}//end method

	private static EList ruleProcessor2Thread(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		if (receivers.contains(ci))
			receivers.remove(ci);
		
		return receivers;
	}

	private static EList ruleProcessor2Conn(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		return receivers;
	}
	private static EList ruleComp2Subprogram(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		return receivers;
	}
	private static EList ruleMemory2SoftwareComp(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		return receivers;
	}
	private static EList ruleBus2Conn(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		return receivers;
	}
	private static EList ruleDevice2Conn(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = getActualBindings(ci, UpperComponentsEM);
		return receivers;
	}	  
	private static EList ruleSharedComp2Comp(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleClientSubprog2ServerSubprog(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleServerSubprog2ClientSubprog(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleProcess2OtherProcess(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleMemory2Conn(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleConn2Conn(ConnectionInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleEventConn2ModeTrans(ConnectionInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}
	private static EList ruleSubcomp2SubcompSameProcess(ComponentInstance ci, EList UpperComponentsEM){
		EList receivers = new BasicEList();
		return receivers;
	}

}// end class
