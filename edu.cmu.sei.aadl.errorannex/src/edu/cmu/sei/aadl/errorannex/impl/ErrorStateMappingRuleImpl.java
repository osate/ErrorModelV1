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
 * @version $Id: ErrorStateMappingRuleImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadl2.impl.ElementImpl;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error State Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl#getComponentErrorStateIdentifier <em>Component Error State Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl#getErrorExpression <em>Error Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl#getErrorState <em>Error State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorStateMappingRuleImpl extends ElementImpl implements ErrorStateMappingRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #getComponentErrorStateIdentifier() <em>Component Error State Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentErrorStateIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_ERROR_STATE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentErrorStateIdentifier() <em>Component Error State Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentErrorStateIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String componentErrorStateIdentifier = COMPONENT_ERROR_STATE_IDENTIFIER_EDEFAULT;

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
	 * The cached value of the '{@link #getErrorState() <em>Error State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorState()
	 * @generated
	 * @ordered
	 */
	protected ErrorState errorState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorStateMappingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_STATE_MAPPING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentErrorStateIdentifier() {
		return componentErrorStateIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentErrorStateIdentifier(String newComponentErrorStateIdentifier) {
		String oldComponentErrorStateIdentifier = componentErrorStateIdentifier;
		componentErrorStateIdentifier = newComponentErrorStateIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER, oldComponentErrorStateIdentifier, componentErrorStateIdentifier));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION, oldErrorExpression, newErrorExpression);
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
				msgs = ((InternalEObject)errorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION, null, msgs);
			if (newErrorExpression != null)
				msgs = ((InternalEObject)newErrorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION, null, msgs);
			msgs = basicSetErrorExpression(newErrorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION, newErrorExpression, newErrorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorState getErrorState() {
		if (errorState != null && ((EObject)errorState).eIsProxy()) {
			InternalEObject oldErrorState = (InternalEObject)errorState;
			errorState = (ErrorState)eResolveProxy(oldErrorState);
			if (errorState != oldErrorState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE, oldErrorState, errorState));
			}
		}
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorState basicGetErrorState() {
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorState(ErrorState newErrorState) {
		ErrorState oldErrorState = errorState;
		errorState = newErrorState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE, oldErrorState, errorState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION:
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
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER:
				return getComponentErrorStateIdentifier();
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION:
				return getErrorExpression();
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE:
				if (resolve) return getErrorState();
				return basicGetErrorState();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER:
				setComponentErrorStateIdentifier((String)newValue);
				return;
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)newValue);
				return;
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE:
				setErrorState((ErrorState)newValue);
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
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER:
				setComponentErrorStateIdentifier(COMPONENT_ERROR_STATE_IDENTIFIER_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)null);
				return;
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE:
				setErrorState((ErrorState)null);
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
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER:
				return COMPONENT_ERROR_STATE_IDENTIFIER_EDEFAULT == null ? componentErrorStateIdentifier != null : !COMPONENT_ERROR_STATE_IDENTIFIER_EDEFAULT.equals(componentErrorStateIdentifier);
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION:
				return errorExpression != null;
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE__ERROR_STATE:
				return errorState != null;
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
		result.append(" (componentErrorStateIdentifier: ");
		result.append(componentErrorStateIdentifier);
		result.append(')');
		return result.toString();
	}

} //ErrorStateMappingRuleImpl
