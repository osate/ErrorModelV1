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
 * @version $Id: ErrorModelPropertyImpl.java,v 1.1.4.1 2011-05-04 21:23:08 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.impl.ElementImpl;

import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl#getAppliesToName <em>Applies To Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ErrorModelPropertyImpl extends ElementImpl implements ErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getAppliesTo() <em>Applies To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesTo()
	 * @generated
	 * @ordered
	 */
	protected EList appliesTo;

	/**
	 * The cached value of the '{@link #getAppliesToName() <em>Applies To Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToName()
	 * @generated
	 * @ordered
	 */
	protected EList appliesToName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_MODEL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliesTo() {
		if (appliesTo == null) {
			appliesTo = new EObjectResolvingEList(NamedElement.class, this, ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO);
		}
		return appliesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliesToName() {
		if (appliesToName == null) {
			appliesToName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO_NAME);
		}
		return appliesToName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO:
				return getAppliesTo();
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO_NAME:
				return getAppliesToName();
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
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO:
				getAppliesTo().clear();
				getAppliesTo().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO_NAME:
				getAppliesToName().clear();
				getAppliesToName().addAll((Collection)newValue);
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
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO:
				getAppliesTo().clear();
				return;
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO_NAME:
				getAppliesToName().clear();
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
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO:
				return appliesTo != null && !appliesTo.isEmpty();
			case ErrorannexPackage.ERROR_MODEL_PROPERTY__APPLIES_TO_NAME:
				return appliesToName != null && !appliesToName.isEmpty();
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
		result.append(" (appliesToName: ");
		result.append(appliesToName);
		result.append(')');
		return result.toString();
	}

} //ErrorModelPropertyImpl
