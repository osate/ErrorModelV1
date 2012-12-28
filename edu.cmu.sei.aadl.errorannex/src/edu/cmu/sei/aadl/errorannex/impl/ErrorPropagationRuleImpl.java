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
 * @version $Id: ErrorPropagationRuleImpl.java,v 1.1.4.1 2011-05-04 21:23:08 relief Exp $
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
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Propagation Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl#isMask <em>Mask</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl#getErrorExpression <em>Error Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl#getErrorPropagationIdentifier <em>Error Propagation Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl#getErrorPropagation <em>Error Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorPropagationRuleImpl extends ElementImpl implements ErrorPropagationRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #isMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMask()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MASK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMask() <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMask()
	 * @generated
	 * @ordered
	 */
	protected boolean mask = MASK_EDEFAULT;

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
	 * The default value of the '{@link #getErrorPropagationIdentifier() <em>Error Propagation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPropagationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_PROPAGATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorPropagationIdentifier() <em>Error Propagation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPropagationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String errorPropagationIdentifier = ERROR_PROPAGATION_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorPropagation() <em>Error Propagation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPropagation()
	 * @generated
	 * @ordered
	 */
	protected ErrorPropagation errorPropagation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorPropagationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_PROPAGATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMask() {
		return mask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMask(boolean newMask) {
		boolean oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_PROPAGATION_RULE__MASK, oldMask, mask));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION, oldErrorExpression, newErrorExpression);
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
				msgs = ((InternalEObject)errorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION, null, msgs);
			if (newErrorExpression != null)
				msgs = ((InternalEObject)newErrorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION, null, msgs);
			msgs = basicSetErrorExpression(newErrorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION, newErrorExpression, newErrorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorPropagationIdentifier() {
		return errorPropagationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPropagationIdentifier(String newErrorPropagationIdentifier) {
		String oldErrorPropagationIdentifier = errorPropagationIdentifier;
		errorPropagationIdentifier = newErrorPropagationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER, oldErrorPropagationIdentifier, errorPropagationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagation getErrorPropagation() {
		if (errorPropagation != null && ((EObject)errorPropagation).eIsProxy()) {
			InternalEObject oldErrorPropagation = (InternalEObject)errorPropagation;
			errorPropagation = (ErrorPropagation)eResolveProxy(oldErrorPropagation);
			if (errorPropagation != oldErrorPropagation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION, oldErrorPropagation, errorPropagation));
			}
		}
		return errorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagation basicGetErrorPropagation() {
		return errorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorPropagation(ErrorPropagation newErrorPropagation) {
		ErrorPropagation oldErrorPropagation = errorPropagation;
		errorPropagation = newErrorPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION, oldErrorPropagation, errorPropagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION:
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
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__MASK:
				return isMask() ? Boolean.TRUE : Boolean.FALSE;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION:
				return getErrorExpression();
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER:
				return getErrorPropagationIdentifier();
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION:
				if (resolve) return getErrorPropagation();
				return basicGetErrorPropagation();
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
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__MASK:
				setMask(((Boolean)newValue).booleanValue());
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)newValue);
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER:
				setErrorPropagationIdentifier((String)newValue);
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION:
				setErrorPropagation((ErrorPropagation)newValue);
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
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__MASK:
				setMask(MASK_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)null);
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER:
				setErrorPropagationIdentifier(ERROR_PROPAGATION_IDENTIFIER_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION:
				setErrorPropagation((ErrorPropagation)null);
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
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__MASK:
				return mask != MASK_EDEFAULT;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_EXPRESSION:
				return errorExpression != null;
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER:
				return ERROR_PROPAGATION_IDENTIFIER_EDEFAULT == null ? errorPropagationIdentifier != null : !ERROR_PROPAGATION_IDENTIFIER_EDEFAULT.equals(errorPropagationIdentifier);
			case ErrorannexPackage.ERROR_PROPAGATION_RULE__ERROR_PROPAGATION:
				return errorPropagation != null;
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
		result.append(" (mask: ");
		result.append(mask);
		result.append(", errorPropagationIdentifier: ");
		result.append(errorPropagationIdentifier);
		result.append(')');
		return result.toString();
	}

} //ErrorPropagationRuleImpl
