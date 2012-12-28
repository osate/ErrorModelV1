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
 * @version $Id: ErrorModelFeatureImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadl2.impl.NamedElementImpl;

import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelFeatureImpl#getOccurrenceProperty <em>Occurrence Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ErrorModelFeatureImpl extends NamedElementImpl implements ErrorModelFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getOccurrenceProperty() <em>Occurrence Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceProperty()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceProperty occurrenceProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_MODEL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceProperty getOccurrenceProperty() {
		return occurrenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOccurrenceProperty(OccurrenceProperty newOccurrenceProperty, NotificationChain msgs) {
		OccurrenceProperty oldOccurrenceProperty = occurrenceProperty;
		occurrenceProperty = newOccurrenceProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY, oldOccurrenceProperty, newOccurrenceProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrenceProperty(OccurrenceProperty newOccurrenceProperty) {
		if (newOccurrenceProperty != occurrenceProperty) {
			NotificationChain msgs = null;
			if (occurrenceProperty != null)
				msgs = ((InternalEObject)occurrenceProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY, null, msgs);
			if (newOccurrenceProperty != null)
				msgs = ((InternalEObject)newOccurrenceProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY, null, msgs);
			msgs = basicSetOccurrenceProperty(newOccurrenceProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY, newOccurrenceProperty, newOccurrenceProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY:
				return basicSetOccurrenceProperty(null, msgs);
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
			case ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY:
				return getOccurrenceProperty();
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
			case ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY:
				setOccurrenceProperty((OccurrenceProperty)newValue);
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
			case ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY:
				setOccurrenceProperty((OccurrenceProperty)null);
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
			case ErrorannexPackage.ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY:
				return occurrenceProperty != null;
		}
		return super.eIsSet(featureID);
	}

} //ErrorModelFeatureImpl
