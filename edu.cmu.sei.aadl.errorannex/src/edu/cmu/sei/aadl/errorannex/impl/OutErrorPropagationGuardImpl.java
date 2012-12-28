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
 * @version $Id: OutErrorPropagationGuardImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Out Error Propagation Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OutErrorPropagationGuardImpl#getErrorPropagationRule <em>Error Propagation Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OutErrorPropagationGuardImpl extends ErrorGuardImpl implements OutErrorPropagationGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached value of the '{@link #getErrorPropagationRule() <em>Error Propagation Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPropagationRule()
	 * @generated
	 * @ordered
	 */
	protected EList errorPropagationRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutErrorPropagationGuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.OUT_ERROR_PROPAGATION_GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorPropagationRule() {
		if (errorPropagationRule == null) {
			errorPropagationRule = new EObjectContainmentEList(ErrorPropagationRule.class, this, ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE);
		}
		return errorPropagationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE:
				return ((InternalEList)getErrorPropagationRule()).basicRemove(otherEnd, msgs);
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
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE:
				return getErrorPropagationRule();
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
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE:
				getErrorPropagationRule().clear();
				getErrorPropagationRule().addAll((Collection)newValue);
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
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE:
				getErrorPropagationRule().clear();
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
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE:
				return errorPropagationRule != null && !errorPropagationRule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //OutErrorPropagationGuardImpl
