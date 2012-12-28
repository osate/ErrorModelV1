/** 
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of this library is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package edu.laas.aadl.dependency;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;
import org.osate.aadl2.Feature;
import org.osate.aadl2.Property;
import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.FeatureInstance;
import org.osate.aadl2.instance.InstanceObject;
import org.osate.aadl2.instance.InstanceReferenceValue;
import org.osate.aadl2.properties.PropertyNotPresentException;
import org.osate.ui.actions.AaxlReadOnlyActionAsJob;
import org.osate.xtext.aadl2.properties.util.DeploymentProperties;
import org.osate.xtext.aadl2.properties.util.PropertyUtils;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

/** 
 * This class contains the methods that are used to support the dependency rules
 * @author Marilena Bruffa mbruffa@laas.fr
 */
public class SupportingOperations { //extends AaxlReadOnlyActionAsJob {

	protected void doAaxlAction(IProgressMonitor monitor, Element obj) {
	}
	
	protected String getActionName() {
		return "support";
	}
//	
//	/** Gets the component to which the subprogram call is bound, component can either be a bus,
//	 * a processor or a memory instance
//	 * 
//	 * @param io InstanceOject, represents the subprogram call
//	 * @return a ComponentInstance object that represents the bus, the processor or the memory to which
//	 * the subprogram call is bound
//	 * @throws PropertyNotPresentException
//	 */
//	public ComponentInstance getActualSubprogramCallBinding(InstanceObject io) throws PropertyNotPresentException{
//		Property actualSubprogramCallBinding = lookupPropertyDefinition(DeploymentProperties.ACTUAL_SUBPROGRAM_CALL_BINDING);		
//		return (ComponentInstance) PropertyUtils.getInstanceObjectReference(io, actualSubprogramCallBinding);
//	}
//
//	/**
//	 * 
//	 * @param io InstanceOject, represents the subprogram
//	 * @return a ComponentInstance object that represents the server subprogram
//	 * @throws PropertyNotPresentException
//	 */
//	public ComponentInstance getActualSubprogramCall(InstanceObject io) throws PropertyNotPresentException{
//		Property actualSubprogramCall = lookupPropertyDefinition(DeploymentProperties.ACTUAL_SUBPROGRAM_CALL);		
//		return (ComponentInstance) PropertyUtils.getInstanceObjectReference(io, actualSubprogramCall);
//	}

	/**
	 * 
	 * This method checks if the ComponentInstance given as parameter defines a guard_in for the incoming
	 * error propagation whose name is errorPropName
	 * 
	 * @param ci ComponentInstance
	 * @param errorPropName String
	 * @return true if the receiver component defines a guard_in property for errorProp sent by the sender component, false otherwise
	 */
	public static boolean hasAGuardIn(ComponentInstance sender, ComponentInstance receiver, String errorPropName, EList UpperComponentsEM){
		EAXUtil emu = new EAXUtil();
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		EList features = receiver.getFeatureInstances();
		for(Iterator it = features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance)it.next();
			Feature feature = fi.getFeature();
			InErrorPropagationGuard guardIn = emu.getInErrorPropagationGuard(receiver, feature);
			if(guardIn != null){
				EList errorPropRules = guardIn.getErrorPropagationRule();
				for(Iterator it_r = errorPropRules.iterator(); it_r.hasNext();){
					ErrorPropagationRule epr = (ErrorPropagationRule)it_r.next();
					BooleanErrorExpression bee = epr.getErrorExpression();
					if(test(sender, receiver, fsrem, bee, errorPropName, UpperComponentsEM))
						return true;
				}		
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param sender ComponentInstance
	 * @param receiver ComponentInstance
	 * @param fsrem FindSenderOrReceiverErrorModel
	 * @param bee BooleanErrorExpression
	 * @param errorPropName String
	 * @param UpperComponentsEM EList
	 * @return true if the receiver component defines a guard_in property for errorProp sent by the sender component 
	 */
	private static boolean test(ComponentInstance sender, ComponentInstance receiver,FindSenderOrReceiverErrorModel fsrem, BooleanErrorExpression bee, String errorPropName, EList UpperComponentsEM){
		EList features = receiver.getFeatureInstances();
		if(bee == null)
			return false;
		if(bee.getType() == BooleanExpressionType.ERRORSOURCENAME_LITERAL){
			ErrorSourceName esn = bee.getErrorSourceName();
			EList errorStateOrPropNames = esn.getErrorStateOrPropagationName();
			if(esn.getSubcomponentOrFeature() != null){//sender != receiver
				if(errorStateOrPropNames.contains(errorPropName)){
					for(Iterator it = features.iterator(); it.hasNext();){
						FeatureInstance fi = (FeatureInstance)it.next();
						if(esn.getSubcomponentOrFeature().getName().equals(fi.getName())){
							Hashtable possibleSenders = fsrem.getSenders(errorPropName,receiver,fi,UpperComponentsEM);
							if(possibleSenders.containsKey(sender)){
								return true;
							}
						}
					}
				}
			}
		}
		else{
			EList containedBees = bee.getContainedExpressions();
			for(Iterator it = containedBees.iterator(); it.hasNext();){
				BooleanErrorExpression containedBee = (BooleanErrorExpression) it.next();
				if(test(sender,receiver,fsrem,containedBee,errorPropName,UpperComponentsEM))
					return true;
			}
		}
		return false;
	}
	
	/**
	 * This method tests if the sender component defines a guard_out property on the feature 
	 * that connects it to the receiver component 
	 * 
	 * @param sender ComponentInstance
	 * @param receiver ComponentInstance
	 * @param errorPropName String
	 * @param UpperComponentsEM EList
	 * @return boolean value
	 */
	public static boolean hasAGuardOut(ComponentInstance sender, ComponentInstance receiver, String errorPropName, EList UpperComponentsEM){
		EAXUtil emu = new EAXUtil();
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		EList features = receiver.getFeatureInstances();
		for(Iterator it=features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance) it.next();
			Hashtable senders = fsrem.getSenders(errorPropName, receiver, fi, UpperComponentsEM);
			if(senders.containsKey(sender)){
				EList elementInfo = (EList)senders.get(sender);
				FeatureInstance sender_fi = (FeatureInstance) elementInfo.get(2); 
				OutErrorPropagationGuard guardOut= emu.getOutErrorPropagationGuard(sender, sender_fi.getFeature());
				if(guardOut != null){
					return true;
				}
			}
		}
		return false;
	}

	
	
	/**
	 * This method tests if the receiver component declares a guard_transition property 
	 * for an event raised by a guard_event property in the sender component 
	 * 
	 * @param sender ComponentInstance
	 * @param possibleReceiver ComponentInstance
	 * @param upperComponentsEM EList
	 * @return boolean value
	 */
	public static boolean hasAGuardTransition(ComponentInstance sender, ComponentInstance possibleReceiver, EList upperComponentsEM) {
		FindSenderOrReceiverErrorModel fsrem = new FindSenderOrReceiverErrorModel();
		EList features = possibleReceiver.getFeatureInstances();
		for(Iterator it=features.iterator(); it.hasNext();){
			FeatureInstance fi = (FeatureInstance) it.next();
			Hashtable senders = fsrem.getGuardTransitionSenders(possibleReceiver, fi, upperComponentsEM);
			if(senders.containsKey(sender))
				return true;
		}
		return false;
	}
}