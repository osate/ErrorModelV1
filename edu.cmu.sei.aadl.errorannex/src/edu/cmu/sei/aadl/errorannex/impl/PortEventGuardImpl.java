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
 * @version $Id: PortEventGuardImpl.java,v 1.1.4.1 2011-05-04 21:23:08 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Event Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.PortEventGuardImpl#getErrorExpression <em>Error Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortEventGuardImpl extends ErrorGuardImpl implements PortEventGuard {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortEventGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.PORT_EVENT_GUARD;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION, oldErrorExpression, newErrorExpression);
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
				msgs = ((InternalEObject)errorExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION, null, msgs);
			if (newErrorExpression != null)
				msgs = ((InternalEObject)newErrorExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION, null, msgs);
			msgs = basicSetErrorExpression(newErrorExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION, newErrorExpression, newErrorExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION:
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
			case ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION:
				return getErrorExpression();
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
			case ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)newValue);
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
			case ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION:
				setErrorExpression((BooleanErrorExpression)null);
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
			case ErrorannexPackage.PORT_EVENT_GUARD__ERROR_EXPRESSION:
				return errorExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //PortEventGuardImpl
