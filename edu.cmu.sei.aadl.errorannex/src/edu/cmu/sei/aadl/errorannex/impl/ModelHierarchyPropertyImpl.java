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
 * @version $Id: ModelHierarchyPropertyImpl.java,v 1.1.4.1 2011-05-04 21:23:06 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.ModelSelectionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Hierarchy Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ModelHierarchyPropertyImpl#getErrorModelSelection <em>Error Model Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelHierarchyPropertyImpl extends ErrorModelPropertyImpl implements ModelHierarchyProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #getErrorModelSelection() <em>Error Model Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelSelection()
	 * @generated
	 * @ordered
	 */
	protected static final ModelSelectionType ERROR_MODEL_SELECTION_EDEFAULT = ModelSelectionType.ABSTRACT_LITERAL;

	/**
	 * The cached value of the '{@link #getErrorModelSelection() <em>Error Model Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelSelection()
	 * @generated
	 * @ordered
	 */
	protected ModelSelectionType errorModelSelection = ERROR_MODEL_SELECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelHierarchyPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.MODEL_HIERARCHY_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSelectionType getErrorModelSelection() {
		return errorModelSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModelSelection(ModelSelectionType newErrorModelSelection) {
		ModelSelectionType oldErrorModelSelection = errorModelSelection;
		errorModelSelection = newErrorModelSelection == null ? ERROR_MODEL_SELECTION_EDEFAULT : newErrorModelSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION, oldErrorModelSelection, errorModelSelection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION:
				return getErrorModelSelection();
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
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION:
				setErrorModelSelection((ModelSelectionType)newValue);
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
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION:
				setErrorModelSelection(ERROR_MODEL_SELECTION_EDEFAULT);
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
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION:
				return errorModelSelection != ERROR_MODEL_SELECTION_EDEFAULT;
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
		result.append(" (errorModelSelection: ");
		result.append(errorModelSelection);
		result.append(')');
		return result.toString();
	}

} //ModelHierarchyPropertyImpl
