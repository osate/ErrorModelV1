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
 * @version $Id: OccurrencePropertyImpl.java,v 1.1.4.1 2011-05-04 21:23:07 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import edu.cmu.sei.aadl.errorannex.DistributionName;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl#getNonStandardId <em>Non Standard Id</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl#getEventOrPropagationName <em>Event Or Propagation Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl#getAppliesToErrorEventOrPropagation <em>Applies To Error Event Or Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OccurrencePropertyImpl extends ErrorModelPropertyImpl implements OccurrenceProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DistributionName TYPE_EDEFAULT = DistributionName.POISSON_LITERAL;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DistributionName type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonStandardId() <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardId()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_STANDARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonStandardId() <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardId()
	 * @generated
	 * @ordered
	 */
	protected String nonStandardId = NON_STANDARD_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameterList() <em>Parameter List</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterList()
	 * @generated
	 * @ordered
	 */
	protected EList parameterList;

	/**
	 * The default value of the '{@link #getEventOrPropagationName() <em>Event Or Propagation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOrPropagationName()
	 * @generated
	 * @ordered
	 */
	protected static final String EVENT_OR_PROPAGATION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventOrPropagationName() <em>Event Or Propagation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventOrPropagationName()
	 * @generated
	 * @ordered
	 */
	protected String eventOrPropagationName = EVENT_OR_PROPAGATION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAppliesToErrorEventOrPropagation() <em>Applies To Error Event Or Propagation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliesToErrorEventOrPropagation()
	 * @generated
	 * @ordered
	 */
	protected ErrorEventOrPropagation appliesToErrorEventOrPropagation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrencePropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.OCCURRENCE_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionName getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DistributionName newType) {
		DistributionName oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.OCCURRENCE_PROPERTY__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonStandardId() {
		return nonStandardId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonStandardId(String newNonStandardId) {
		String oldNonStandardId = nonStandardId;
		nonStandardId = newNonStandardId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.OCCURRENCE_PROPERTY__NON_STANDARD_ID, oldNonStandardId, nonStandardId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParameterList() {
		if (parameterList == null) {
			parameterList = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.OCCURRENCE_PROPERTY__PARAMETER_LIST);
		}
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEventOrPropagationName() {
		return eventOrPropagationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventOrPropagationName(String newEventOrPropagationName) {
		String oldEventOrPropagationName = eventOrPropagationName;
		eventOrPropagationName = newEventOrPropagationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME, oldEventOrPropagationName, eventOrPropagationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventOrPropagation getAppliesToErrorEventOrPropagation() {
		if (appliesToErrorEventOrPropagation != null && ((EObject)appliesToErrorEventOrPropagation).eIsProxy()) {
			InternalEObject oldAppliesToErrorEventOrPropagation = (InternalEObject)appliesToErrorEventOrPropagation;
			appliesToErrorEventOrPropagation = (ErrorEventOrPropagation)eResolveProxy(oldAppliesToErrorEventOrPropagation);
			if (appliesToErrorEventOrPropagation != oldAppliesToErrorEventOrPropagation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION, oldAppliesToErrorEventOrPropagation, appliesToErrorEventOrPropagation));
			}
		}
		return appliesToErrorEventOrPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventOrPropagation basicGetAppliesToErrorEventOrPropagation() {
		return appliesToErrorEventOrPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliesToErrorEventOrPropagation(ErrorEventOrPropagation newAppliesToErrorEventOrPropagation) {
		ErrorEventOrPropagation oldAppliesToErrorEventOrPropagation = appliesToErrorEventOrPropagation;
		appliesToErrorEventOrPropagation = newAppliesToErrorEventOrPropagation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION, oldAppliesToErrorEventOrPropagation, appliesToErrorEventOrPropagation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.OCCURRENCE_PROPERTY__TYPE:
				return getType();
			case ErrorannexPackage.OCCURRENCE_PROPERTY__NON_STANDARD_ID:
				return getNonStandardId();
			case ErrorannexPackage.OCCURRENCE_PROPERTY__PARAMETER_LIST:
				return getParameterList();
			case ErrorannexPackage.OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME:
				return getEventOrPropagationName();
			case ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION:
				if (resolve) return getAppliesToErrorEventOrPropagation();
				return basicGetAppliesToErrorEventOrPropagation();
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
			case ErrorannexPackage.OCCURRENCE_PROPERTY__TYPE:
				setType((DistributionName)newValue);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__NON_STANDARD_ID:
				setNonStandardId((String)newValue);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__PARAMETER_LIST:
				getParameterList().clear();
				getParameterList().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME:
				setEventOrPropagationName((String)newValue);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION:
				setAppliesToErrorEventOrPropagation((ErrorEventOrPropagation)newValue);
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
			case ErrorannexPackage.OCCURRENCE_PROPERTY__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__NON_STANDARD_ID:
				setNonStandardId(NON_STANDARD_ID_EDEFAULT);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__PARAMETER_LIST:
				getParameterList().clear();
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME:
				setEventOrPropagationName(EVENT_OR_PROPAGATION_NAME_EDEFAULT);
				return;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION:
				setAppliesToErrorEventOrPropagation((ErrorEventOrPropagation)null);
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
			case ErrorannexPackage.OCCURRENCE_PROPERTY__TYPE:
				return type != TYPE_EDEFAULT;
			case ErrorannexPackage.OCCURRENCE_PROPERTY__NON_STANDARD_ID:
				return NON_STANDARD_ID_EDEFAULT == null ? nonStandardId != null : !NON_STANDARD_ID_EDEFAULT.equals(nonStandardId);
			case ErrorannexPackage.OCCURRENCE_PROPERTY__PARAMETER_LIST:
				return parameterList != null && !parameterList.isEmpty();
			case ErrorannexPackage.OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME:
				return EVENT_OR_PROPAGATION_NAME_EDEFAULT == null ? eventOrPropagationName != null : !EVENT_OR_PROPAGATION_NAME_EDEFAULT.equals(eventOrPropagationName);
			case ErrorannexPackage.OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION:
				return appliesToErrorEventOrPropagation != null;
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
		result.append(", nonStandardId: ");
		result.append(nonStandardId);
		result.append(", parameterList: ");
		result.append(parameterList);
		result.append(", eventOrPropagationName: ");
		result.append(eventOrPropagationName);
		result.append(')');
		return result.toString();
	}

} //OccurrencePropertyImpl
