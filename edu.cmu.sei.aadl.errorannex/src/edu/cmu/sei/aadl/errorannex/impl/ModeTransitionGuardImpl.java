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
 * @version $Id: ModeTransitionGuardImpl.java,v 1.2.2.1 2011-05-04 21:23:06 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.osate.aadl2.ModeTransition;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mode Transition Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl#getErrorExpression <em>Error Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl#getAppliesToFeatureContextName <em>Applies To Feature Context Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl#getAppliesToModeTransition <em>Applies To Mode Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModeTransitionGuardImpl extends ErrorGuardImpl implements ModeTransitionGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getErrorExpression() <em>Error Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorExpression()
	 * @generated
	 * @ordered
	 */
	protected BooleanErrorExpression errorExpression;

	/**
	 * The cached value of the '{@link #getAppliesToFeatureContextName() <em>Applies To Feature Context Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToFeatureContextName()
	 * @generated
	 * @ordered
	 */
	protected EList appliesToFeatureContextName;

	/**
	 * The cached value of the '{@link #getAppliesToModeTransition() <em>Applies To Mode Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToModeTransition()
	 * @generated
	 * @ordered
	 */
	protected ModeTransition appliesToModeTransition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModeTransitionGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.MODE_TRANSITION_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanErrorExpression getErrorExpression() {
		return errorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorExpression(BooleanErrorExpression newErrorExpression, NotificationChain msgs) {
		BooleanErrorExpression oldErrorExpression = errorExpression;
		errorExpression = newErrorExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION, oldErrorExpression, newErrorExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorExpression(BooleanErrorExpression newErrorExpression) {
		if (newErrorExpression != errorExpression) {
			NotificationChain msgs = null;
			if (errorExpression != null)
				msgs = ((InternalEObject)errorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION, null, msgs);
			if (newErrorExpression != null)
				msgs = ((InternalEObject)newErrorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION, null, msgs);
			msgs = basicSetErrorExpression(newErrorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION, newErrorExpression, newErrorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliesToFeatureContextName() {
		if (appliesToFeatureContextName == null) {
			appliesToFeatureContextName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME);
		}
		return appliesToFeatureContextName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransition getAppliesToModeTransition() {
		if (appliesToModeTransition != null && ((EObject)appliesToModeTransition).eIsProxy()) {
			InternalEObject oldAppliesToModeTransition = (InternalEObject)appliesToModeTransition;
			appliesToModeTransition = (ModeTransition)eResolveProxy(oldAppliesToModeTransition);
			if (appliesToModeTransition != oldAppliesToModeTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION, oldAppliesToModeTransition, appliesToModeTransition));
			}
		}
		return appliesToModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransition basicGetAppliesToModeTransition() {
		return appliesToModeTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToModeTransition(ModeTransition newAppliesToModeTransition) {
		ModeTransition oldAppliesToModeTransition = appliesToModeTransition;
		appliesToModeTransition = newAppliesToModeTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION, oldAppliesToModeTransition, appliesToModeTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION:
				return basicSetErrorExpression(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION:
				return getErrorExpression();
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME:
				return getAppliesToFeatureContextName();
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION:
				if (resolve) return getAppliesToModeTransition();
				return basicGetAppliesToModeTransition();
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
			case ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)newValue);
				return;
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME:
				getAppliesToFeatureContextName().clear();
				getAppliesToFeatureContextName().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION:
				setAppliesToModeTransition((ModeTransition)newValue);
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
			case ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)null);
				return;
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME:
				getAppliesToFeatureContextName().clear();
				return;
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION:
				setAppliesToModeTransition((ModeTransition)null);
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
			case ErrorannexPackage.MODE_TRANSITION_GUARD__ERROR_EXPRESSION:
				return errorExpression != null;
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME:
				return appliesToFeatureContextName != null && !appliesToFeatureContextName.isEmpty();
			case ErrorannexPackage.MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION:
				return appliesToModeTransition != null;
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
		result.append(" (appliesToFeatureContextName: ");
		result.append(appliesToFeatureContextName);
		result.append(')');
		return result.toString();
	}

} //ModeTransitionGuardImpl
