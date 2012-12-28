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
 * @version $Id: ComponentErrorModelPropertyImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Error Model Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl#getPackageIdentifier <em>Package Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl#getErrorModelTypeIdentifier <em>Error Model Type Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl#getErrorModelImplementationIdentifier <em>Error Model Implementation Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl#getErrorModelClassifier <em>Error Model Classifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl#getInplaceErrorModelType <em>Inplace Error Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentErrorModelPropertyImpl extends ErrorModelPropertyImpl implements ComponentErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #getPackageIdentifier() <em>Package Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackageIdentifier() <em>Package Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String packageIdentifier = PACKAGE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorModelTypeIdentifier() <em>Error Model Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MODEL_TYPE_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorModelTypeIdentifier() <em>Error Model Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelTypeIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String errorModelTypeIdentifier = ERROR_MODEL_TYPE_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getErrorModelImplementationIdentifier() <em>Error Model Implementation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelImplementationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String ERROR_MODEL_IMPLEMENTATION_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getErrorModelImplementationIdentifier() <em>Error Model Implementation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelImplementationIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String errorModelImplementationIdentifier = ERROR_MODEL_IMPLEMENTATION_IDENTIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorModelClassifier() <em>Error Model Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelClassifier()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelClassifier errorModelClassifier;

	/**
	 * The cached value of the '{@link #getInplaceErrorModelType() <em>Inplace Error Model Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInplaceErrorModelType()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelType inplaceErrorModelType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentErrorModelPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.COMPONENT_ERROR_MODEL_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackageIdentifier() {
		return packageIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackageIdentifier(String newPackageIdentifier) {
		String oldPackageIdentifier = packageIdentifier;
		packageIdentifier = newPackageIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER, oldPackageIdentifier, packageIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorModelTypeIdentifier() {
		return errorModelTypeIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModelTypeIdentifier(String newErrorModelTypeIdentifier) {
		String oldErrorModelTypeIdentifier = errorModelTypeIdentifier;
		errorModelTypeIdentifier = newErrorModelTypeIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER, oldErrorModelTypeIdentifier, errorModelTypeIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getErrorModelImplementationIdentifier() {
		return errorModelImplementationIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModelImplementationIdentifier(String newErrorModelImplementationIdentifier) {
		String oldErrorModelImplementationIdentifier = errorModelImplementationIdentifier;
		errorModelImplementationIdentifier = newErrorModelImplementationIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER, oldErrorModelImplementationIdentifier, errorModelImplementationIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelClassifier getErrorModelClassifier() {
		if (errorModelClassifier != null && ((EObject)errorModelClassifier).eIsProxy()) {
			InternalEObject oldErrorModelClassifier = (InternalEObject)errorModelClassifier;
			errorModelClassifier = (ErrorModelClassifier)eResolveProxy(oldErrorModelClassifier);
			if (errorModelClassifier != oldErrorModelClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER, oldErrorModelClassifier, errorModelClassifier));
			}
		}
		return errorModelClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelClassifier basicGetErrorModelClassifier() {
		return errorModelClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModelClassifier(ErrorModelClassifier newErrorModelClassifier) {
		ErrorModelClassifier oldErrorModelClassifier = errorModelClassifier;
		errorModelClassifier = newErrorModelClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER, oldErrorModelClassifier, errorModelClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType getInplaceErrorModelType() {
		return inplaceErrorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInplaceErrorModelType(ErrorModelType newInplaceErrorModelType, NotificationChain msgs) {
		ErrorModelType oldInplaceErrorModelType = inplaceErrorModelType;
		inplaceErrorModelType = newInplaceErrorModelType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE, oldInplaceErrorModelType, newInplaceErrorModelType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInplaceErrorModelType(ErrorModelType newInplaceErrorModelType) {
		if (newInplaceErrorModelType != inplaceErrorModelType) {
			NotificationChain msgs = null;
			if (inplaceErrorModelType != null)
				msgs = ((InternalEObject)inplaceErrorModelType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE, null, msgs);
			if (newInplaceErrorModelType != null)
				msgs = ((InternalEObject)newInplaceErrorModelType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE, null, msgs);
			msgs = basicSetInplaceErrorModelType(newInplaceErrorModelType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE, newInplaceErrorModelType, newInplaceErrorModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
				return basicSetInplaceErrorModelType(null, msgs);
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
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER:
				return getPackageIdentifier();
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER:
				return getErrorModelTypeIdentifier();
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER:
				return getErrorModelImplementationIdentifier();
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER:
				if (resolve) return getErrorModelClassifier();
				return basicGetErrorModelClassifier();
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
				return getInplaceErrorModelType();
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
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER:
				setPackageIdentifier((String)newValue);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER:
				setErrorModelTypeIdentifier((String)newValue);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER:
				setErrorModelImplementationIdentifier((String)newValue);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER:
				setErrorModelClassifier((ErrorModelClassifier)newValue);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
				setInplaceErrorModelType((ErrorModelType)newValue);
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
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER:
				setPackageIdentifier(PACKAGE_IDENTIFIER_EDEFAULT);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER:
				setErrorModelTypeIdentifier(ERROR_MODEL_TYPE_IDENTIFIER_EDEFAULT);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER:
				setErrorModelImplementationIdentifier(ERROR_MODEL_IMPLEMENTATION_IDENTIFIER_EDEFAULT);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER:
				setErrorModelClassifier((ErrorModelClassifier)null);
				return;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
				setInplaceErrorModelType((ErrorModelType)null);
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
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER:
				return PACKAGE_IDENTIFIER_EDEFAULT == null ? packageIdentifier != null : !PACKAGE_IDENTIFIER_EDEFAULT.equals(packageIdentifier);
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER:
				return ERROR_MODEL_TYPE_IDENTIFIER_EDEFAULT == null ? errorModelTypeIdentifier != null : !ERROR_MODEL_TYPE_IDENTIFIER_EDEFAULT.equals(errorModelTypeIdentifier);
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER:
				return ERROR_MODEL_IMPLEMENTATION_IDENTIFIER_EDEFAULT == null ? errorModelImplementationIdentifier != null : !ERROR_MODEL_IMPLEMENTATION_IDENTIFIER_EDEFAULT.equals(errorModelImplementationIdentifier);
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER:
				return errorModelClassifier != null;
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE:
				return inplaceErrorModelType != null;
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
		result.append(" (packageIdentifier: ");
		result.append(packageIdentifier);
		result.append(", errorModelTypeIdentifier: ");
		result.append(errorModelTypeIdentifier);
		result.append(", errorModelImplementationIdentifier: ");
		result.append(errorModelImplementationIdentifier);
		result.append(')');
		return result.toString();
	}

} //ComponentErrorModelPropertyImpl
