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
 * @version $Id: ErrorGuardImpl.java,v 1.1.4.1 2011-05-04 21:23:08 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadl2.Feature;

import edu.cmu.sei.aadl.errorannex.ErrorGuard;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl#getAppliesToFeatureName <em>Applies To Feature Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl#getAppliesToFeature <em>Applies To Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ErrorGuardImpl extends ErrorModelPropertyImpl implements ErrorGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getAppliesToFeatureName() <em>Applies To Feature Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToFeatureName()
	 * @generated
	 * @ordered
	 */
	protected EList appliesToFeatureName;

	/**
	 * The cached value of the '{@link #getAppliesToFeature() <em>Applies To Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToFeature()
	 * @generated
	 * @ordered
	 */
	protected EList appliesToFeature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliesToFeatureName() {
		if (appliesToFeatureName == null) {
			appliesToFeatureName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE_NAME);
		}
		return appliesToFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getAppliesToFeature() {
		if (appliesToFeature == null) {
			appliesToFeature = new EObjectResolvingEList(Feature.class, this, ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE);
		}
		return appliesToFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE_NAME:
				return getAppliesToFeatureName();
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE:
				return getAppliesToFeature();
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
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE_NAME:
				getAppliesToFeatureName().clear();
				getAppliesToFeatureName().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE:
				getAppliesToFeature().clear();
				getAppliesToFeature().addAll((Collection)newValue);
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
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE_NAME:
				getAppliesToFeatureName().clear();
				return;
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE:
				getAppliesToFeature().clear();
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
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE_NAME:
				return appliesToFeatureName != null && !appliesToFeatureName.isEmpty();
			case ErrorannexPackage.ERROR_GUARD__APPLIES_TO_FEATURE:
				return appliesToFeature != null && !appliesToFeature.isEmpty();
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
		result.append(" (appliesToFeatureName: ");
		result.append(appliesToFeatureName);
		result.append(')');
		return result.toString();
	}

	/**
	 * returns the error propagation rule for the specified error propagation
	 * @param prop ErrorPropagation
	 * @return ErrorPropagationRule
	 */
	public ErrorPropagationRule getErrorPropagationRule( ErrorPropagation prop){
		EList rl = null;
		if (this instanceof InErrorPropagationGuard){
			rl = ((InErrorPropagationGuard)this).getErrorPropagationRule();
		} else if (this instanceof OutErrorPropagationGuard){
			rl = ((OutErrorPropagationGuard)this).getErrorPropagationRule();
		} else {
			return null;
		}
		for (Iterator it = rl.iterator(); it.hasNext();){
			ErrorPropagationRule epr = (ErrorPropagationRule)it.next();
			if (epr.getErrorPropagation() == prop){
				return epr;
			}
		}
		return null;
	}

} //ErrorGuardImpl
