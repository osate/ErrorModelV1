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
 * @version $Id: DerivedErrorStateMappingGuardImpl.java,v 1.1.4.1 2011-05-04 21:23:10 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Derived Error State Mapping Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.DerivedErrorStateMappingGuardImpl#getErrorStateMappingRule <em>Error State Mapping Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DerivedErrorStateMappingGuardImpl extends ErrorModelPropertyImpl implements DerivedErrorStateMappingGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached value of the '{@link #getErrorStateMappingRule() <em>Error State Mapping Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorStateMappingRule()
	 * @generated
	 * @ordered
	 */
	protected EList errorStateMappingRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DerivedErrorStateMappingGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.DERIVED_ERROR_STATE_MAPPING_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorStateMappingRule() {
		if (errorStateMappingRule == null) {
			errorStateMappingRule = new EObjectContainmentEList(ErrorStateMappingRule.class, this, ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE);
		}
		return errorStateMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE:
				return ((InternalEList)getErrorStateMappingRule()).basicRemove(otherEnd, msgs);
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
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE:
				return getErrorStateMappingRule();
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
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE:
				getErrorStateMappingRule().clear();
				getErrorStateMappingRule().addAll((Collection)newValue);
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
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE:
				getErrorStateMappingRule().clear();
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
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE:
				return errorStateMappingRule != null && !errorStateMappingRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * returns the mapping rule for the specified error state
	 * @param state ErrorState
	 * @return ErrorStateMappingRule
	 */
	public ErrorStateMappingRule getErrorStateMappingRule( ErrorState state){
		for (Iterator it = this.getErrorStateMappingRule().iterator(); it.hasNext();){
			ErrorStateMappingRule dsr = (ErrorStateMappingRule)it.next();
			if (dsr.getErrorState() == state){
				return dsr;
			}
		}
		return null;
	}

} //DerivedErrorStateMappingGuardImpl
