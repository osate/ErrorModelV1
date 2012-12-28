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
 * @version $Id: BooleanErrorExpressionImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadl2.impl.ElementImpl;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boolean Error Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl#getContainedExpressions <em>Contained Expressions</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl#getErrorSourceName <em>Error Source Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl#getNumericLiteral <em>Numeric Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BooleanErrorExpressionImpl extends ElementImpl implements BooleanErrorExpression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getContainedExpressions() <em>Contained Expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedExpressions()
	 * @generated
	 * @ordered
	 */
	protected EList containedExpressions;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanExpressionType TYPE_EDEFAULT = BooleanExpressionType.NOT_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected BooleanExpressionType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorSourceName() <em>Error Source Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorSourceName()
	 * @generated
	 * @ordered
	 */
	protected ErrorSourceName errorSourceName;

	/**
	 * The default value of the '{@link #getNumericLiteral() <em>Numeric Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMERIC_LITERAL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumericLiteral() <em>Numeric Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumericLiteral()
	 * @generated
	 * @ordered
	 */
	protected int numericLiteral = NUMERIC_LITERAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BooleanErrorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.BOOLEAN_ERROR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getContainedExpressions() {
		if (containedExpressions == null) {
			containedExpressions = new EObjectContainmentEList(BooleanErrorExpression.class, this, ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS);
		}
		return containedExpressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(BooleanExpressionType newType) {
		BooleanExpressionType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSourceName getErrorSourceName() {
		return errorSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorSourceName(ErrorSourceName newErrorSourceName, NotificationChain msgs) {
		ErrorSourceName oldErrorSourceName = errorSourceName;
		errorSourceName = newErrorSourceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME, oldErrorSourceName, newErrorSourceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorSourceName(ErrorSourceName newErrorSourceName) {
		if (newErrorSourceName != errorSourceName) {
			NotificationChain msgs = null;
			if (errorSourceName != null)
				msgs = ((InternalEObject)errorSourceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME, null, msgs);
			if (newErrorSourceName != null)
				msgs = ((InternalEObject)newErrorSourceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME, null, msgs);
			msgs = basicSetErrorSourceName(newErrorSourceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME, newErrorSourceName, newErrorSourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumericLiteral() {
		return numericLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumericLiteral(int newNumericLiteral) {
		int oldNumericLiteral = numericLiteral;
		numericLiteral = newNumericLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL, oldNumericLiteral, numericLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS:
				return ((InternalEList)getContainedExpressions()).basicRemove(otherEnd, msgs);
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME:
				return basicSetErrorSourceName(null, msgs);
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
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS:
				return getContainedExpressions();
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__TYPE:
				return getType();
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME:
				return getErrorSourceName();
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL:
				return new Integer(getNumericLiteral());
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
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS:
				getContainedExpressions().clear();
				getContainedExpressions().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__TYPE:
				setType((BooleanExpressionType)newValue);
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME:
				setErrorSourceName((ErrorSourceName)newValue);
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL:
				setNumericLiteral(((Integer)newValue).intValue());
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
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS:
				getContainedExpressions().clear();
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME:
				setErrorSourceName((ErrorSourceName)null);
				return;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL:
				setNumericLiteral(NUMERIC_LITERAL_EDEFAULT);
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
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS:
				return containedExpressions != null && !containedExpressions.isEmpty();
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__TYPE:
				return type != TYPE_EDEFAULT;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME:
				return errorSourceName != null;
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL:
				return numericLiteral != NUMERIC_LITERAL_EDEFAULT;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", numericLiteral: ");
		result.append(numericLiteral);
		result.append(')');
		return result.toString();
	}

} //BooleanErrorExpressionImpl
