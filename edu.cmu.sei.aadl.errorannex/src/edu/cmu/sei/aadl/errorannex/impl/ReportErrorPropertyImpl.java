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
 * @version $Id: ReportErrorPropertyImpl.java,v 1.1.4.1 2011-05-04 21:23:08 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report Error Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl#getStateAndPropagationList <em>State And Propagation List</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl#getErrorStateOrPropagation <em>Error State Or Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportErrorPropertyImpl extends ErrorModelPropertyImpl implements ReportErrorProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getStateAndPropagationList() <em>State And Propagation List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateAndPropagationList()
	 * @generated
	 * @ordered
	 */
	protected EList stateAndPropagationList;

	/**
	 * The cached value of the '{@link #getErrorStateOrPropagation() <em>Error State Or Propagation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorStateOrPropagation()
	 * @generated
	 * @ordered
	 */
	protected EList errorStateOrPropagation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReportErrorPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.REPORT_ERROR_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getStateAndPropagationList() {
		if (stateAndPropagationList == null) {
			stateAndPropagationList = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST);
		}
		return stateAndPropagationList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorStateOrPropagation() {
		if (errorStateOrPropagation == null) {
			errorStateOrPropagation = new EObjectResolvingEList(ErrorStateOrPropagation.class, this, ErrorannexPackage.REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION);
		}
		return errorStateOrPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST:
				return getStateAndPropagationList();
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION:
				return getErrorStateOrPropagation();
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
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST:
				getStateAndPropagationList().clear();
				getStateAndPropagationList().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION:
				getErrorStateOrPropagation().clear();
				getErrorStateOrPropagation().addAll((Collection)newValue);
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
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST:
				getStateAndPropagationList().clear();
				return;
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION:
				getErrorStateOrPropagation().clear();
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
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST:
				return stateAndPropagationList != null && !stateAndPropagationList.isEmpty();
			case ErrorannexPackage.REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION:
				return errorStateOrPropagation != null && !errorStateOrPropagation.isEmpty();
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
		result.append(" (stateAndPropagationList: ");
		result.append(stateAndPropagationList);
		result.append(')');
		return result.toString();
	}

} //ReportErrorPropertyImpl
