/**
 * <copyright>
 * Copyright (c) 2004-2005 Carnegie Mellon University and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   SEI - AADL Meta Model and EMF generated editor
 *
 * </copyright>
 *
 * @version $Id: ErrorTransitionImpl.java,v 1.1.4.1 2011-05-04 21:23:10 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadl2.impl.ElementImpl;

import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getActivationTrigger <em>Activation Trigger</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getTransitionTrigger <em>Transition Trigger</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getTransitionActionName <em>Transition Action Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl#getTransitionTriggerName <em>Transition Trigger Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorTransitionImpl extends ElementImpl implements ErrorTransition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList origin;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected ErrorState destination;

	/**
	 * The cached value of the '{@link #getTransitionAction() <em>Transition Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionAction()
	 * @generated
	 * @ordered
	 */
	protected EList transitionAction;

	/**
	 * The cached value of the '{@link #getActivationTrigger() <em>Activation Trigger</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivationTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList activationTrigger;

	/**
	 * The cached value of the '{@link #getTransitionTrigger() <em>Transition Trigger</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTrigger()
	 * @generated
	 * @ordered
	 */
	protected EList transitionTrigger;

	/**
	 * The cached value of the '{@link #getOriginName() <em>Origin Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginName()
	 * @generated
	 * @ordered
	 */
	protected EList originName;

	/**
	 * The default value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationName() <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationName()
	 * @generated
	 * @ordered
	 */
	protected String destinationName = DESTINATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionActionName() <em>Transition Action Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionActionName()
	 * @generated
	 * @ordered
	 */
	protected EList transitionActionName;

	/**
	 * The cached value of the '{@link #getTransitionTriggerName() <em>Transition Trigger Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionTriggerName()
	 * @generated
	 * @ordered
	 */
	protected EList transitionTriggerName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOrigin() {
		if (origin == null) {
			origin = new EObjectResolvingEList(ErrorState.class, this, ErrorannexPackage.ERROR_TRANSITION__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorState getDestination() {
		if (destination != null && ((EObject)destination).eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (ErrorState)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_TRANSITION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorState basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(ErrorState newDestination) {
		ErrorState oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_TRANSITION__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionAction() {
		if (transitionAction == null) {
			transitionAction = new EObjectResolvingEList(ErrorPropagation.class, this, ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION);
		}
		return transitionAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getActivationTrigger() {
		if (activationTrigger == null) {
			activationTrigger = new EDataTypeUniqueEList(TriggerType.class, this, ErrorannexPackage.ERROR_TRANSITION__ACTIVATION_TRIGGER);
		}
		return activationTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionTrigger() {
		if (transitionTrigger == null) {
			transitionTrigger = new EObjectResolvingEList(ErrorEventOrPropagation.class, this, ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER);
		}
		return transitionTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOriginName() {
		if (originName == null) {
			originName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_TRANSITION__ORIGIN_NAME);
		}
		return originName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationName() {
		return destinationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationName(String newDestinationName) {
		String oldDestinationName = destinationName;
		destinationName = newDestinationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_TRANSITION__DESTINATION_NAME, oldDestinationName, destinationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionActionName() {
		if (transitionActionName == null) {
			transitionActionName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION_NAME);
		}
		return transitionActionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionTriggerName() {
		if (transitionTriggerName == null) {
			transitionTriggerName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER_NAME);
		}
		return transitionTriggerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN:
				return getOrigin();
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION:
				return getTransitionAction();
			case ErrorannexPackage.ERROR_TRANSITION__ACTIVATION_TRIGGER:
				return getActivationTrigger();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER:
				return getTransitionTrigger();
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN_NAME:
				return getOriginName();
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION_NAME:
				return getDestinationName();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION_NAME:
				return getTransitionActionName();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER_NAME:
				return getTransitionTriggerName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION:
				setDestination((ErrorState)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION:
				getTransitionAction().clear();
				getTransitionAction().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__ACTIVATION_TRIGGER:
				getActivationTrigger().clear();
				getActivationTrigger().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER:
				getTransitionTrigger().clear();
				getTransitionTrigger().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN_NAME:
				getOriginName().clear();
				getOriginName().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION_NAME:
				setDestinationName((String)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION_NAME:
				getTransitionActionName().clear();
				getTransitionActionName().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER_NAME:
				getTransitionTriggerName().clear();
				getTransitionTriggerName().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN:
				getOrigin().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION:
				setDestination((ErrorState)null);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION:
				getTransitionAction().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__ACTIVATION_TRIGGER:
				getActivationTrigger().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER:
				getTransitionTrigger().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN_NAME:
				getOriginName().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION_NAME:
				setDestinationName(DESTINATION_NAME_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION_NAME:
				getTransitionActionName().clear();
				return;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER_NAME:
				getTransitionTriggerName().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN:
				return origin != null && !origin.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION:
				return destination != null;
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION:
				return transitionAction != null && !transitionAction.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__ACTIVATION_TRIGGER:
				return activationTrigger != null && !activationTrigger.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER:
				return transitionTrigger != null && !transitionTrigger.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__ORIGIN_NAME:
				return originName != null && !originName.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__DESTINATION_NAME:
				return DESTINATION_NAME_EDEFAULT == null ? destinationName != null : !DESTINATION_NAME_EDEFAULT.equals(destinationName);
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_ACTION_NAME:
				return transitionActionName != null && !transitionActionName.isEmpty();
			case ErrorannexPackage.ERROR_TRANSITION__TRANSITION_TRIGGER_NAME:
				return transitionTriggerName != null && !transitionTriggerName.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (activationTrigger: ");
		result.append(activationTrigger);
		result.append(", originName: ");
		result.append(originName);
		result.append(", destinationName: ");
		result.append(destinationName);
		result.append(", transitionActionName: ");
		result.append(transitionActionName);
		result.append(", transitionTriggerName: ");
		result.append(transitionTriggerName);
		result.append(')');
		return result.toString();
	}

} //ErrorTransitionImpl
