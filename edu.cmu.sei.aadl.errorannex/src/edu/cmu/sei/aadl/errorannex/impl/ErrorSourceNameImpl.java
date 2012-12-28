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
 * @version $Id: ErrorSourceNameImpl.java,v 1.2.2.1 2011-05-04 21:23:07 relief Exp $
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.impl.ElementImpl;

import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Source Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getComponentNameOrFeatureName <em>Component Name Or Feature Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getErrorStateOrPropagationName <em>Error State Or Propagation Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getErrorStateOrPropagation <em>Error State Or Propagation</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getSubcomponentOrFeature <em>Subcomponent Or Feature</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getSubcomponentName <em>Subcomponent Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl#getContextSubcomponent <em>Context Subcomponent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorSourceNameImpl extends ElementImpl implements ErrorSourceName {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The default value of the '{@link #getComponentNameOrFeatureName() <em>Component Name Or Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNameOrFeatureName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPONENT_NAME_OR_FEATURE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComponentNameOrFeatureName() <em>Component Name Or Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentNameOrFeatureName()
	 * @generated
	 * @ordered
	 */
	protected String componentNameOrFeatureName = COMPONENT_NAME_OR_FEATURE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getErrorStateOrPropagationName() <em>Error State Or Propagation Name</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorStateOrPropagationName()
	 * @generated
	 * @ordered
	 */
	protected EList errorStateOrPropagationName;

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
	 * The cached value of the '{@link #getSubcomponentOrFeature() <em>Subcomponent Or Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponentOrFeature()
	 * @generated
	 * @ordered
	 */
	protected NamedElement subcomponentOrFeature;

	/**
	 * The default value of the '{@link #getSubcomponentName() <em>Subcomponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponentName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBCOMPONENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubcomponentName() <em>Subcomponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubcomponentName()
	 * @generated
	 * @ordered
	 */
	protected String subcomponentName = SUBCOMPONENT_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContextSubcomponent() <em>Context Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextSubcomponent()
	 * @generated
	 * @ordered
	 */
	protected NamedElement contextSubcomponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorSourceNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_SOURCE_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComponentNameOrFeatureName() {
		return componentNameOrFeatureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentNameOrFeatureName(String newComponentNameOrFeatureName) {
		String oldComponentNameOrFeatureName = componentNameOrFeatureName;
		componentNameOrFeatureName = newComponentNameOrFeatureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME, oldComponentNameOrFeatureName, componentNameOrFeatureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorStateOrPropagationName() {
		if (errorStateOrPropagationName == null) {
			errorStateOrPropagationName = new EDataTypeUniqueEList(String.class, this, ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME);
		}
		return errorStateOrPropagationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorStateOrPropagation() {
		if (errorStateOrPropagation == null) {
			errorStateOrPropagation = new EObjectResolvingEList(ErrorStateOrPropagation.class, this, ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION);
		}
		return errorStateOrPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getSubcomponentOrFeature() {
		if (subcomponentOrFeature != null && ((EObject)subcomponentOrFeature).eIsProxy()) {
			InternalEObject oldSubcomponentOrFeature = (InternalEObject)subcomponentOrFeature;
			subcomponentOrFeature = (NamedElement)eResolveProxy(oldSubcomponentOrFeature);
			if (subcomponentOrFeature != oldSubcomponentOrFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE, oldSubcomponentOrFeature, subcomponentOrFeature));
			}
		}
		return subcomponentOrFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetSubcomponentOrFeature() {
		return subcomponentOrFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcomponentOrFeature(NamedElement newSubcomponentOrFeature) {
		NamedElement oldSubcomponentOrFeature = subcomponentOrFeature;
		subcomponentOrFeature = newSubcomponentOrFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE, oldSubcomponentOrFeature, subcomponentOrFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubcomponentName() {
		return subcomponentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubcomponentName(String newSubcomponentName) {
		String oldSubcomponentName = subcomponentName;
		subcomponentName = newSubcomponentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME, oldSubcomponentName, subcomponentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getContextSubcomponent() {
		if (contextSubcomponent != null && ((EObject)contextSubcomponent).eIsProxy()) {
			InternalEObject oldContextSubcomponent = (InternalEObject)contextSubcomponent;
			contextSubcomponent = (NamedElement)eResolveProxy(oldContextSubcomponent);
			if (contextSubcomponent != oldContextSubcomponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT, oldContextSubcomponent, contextSubcomponent));
			}
		}
		return contextSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetContextSubcomponent() {
		return contextSubcomponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContextSubcomponent(NamedElement newContextSubcomponent) {
		NamedElement oldContextSubcomponent = contextSubcomponent;
		contextSubcomponent = newContextSubcomponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT, oldContextSubcomponent, contextSubcomponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME:
				return getComponentNameOrFeatureName();
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME:
				return getErrorStateOrPropagationName();
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION:
				return getErrorStateOrPropagation();
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE:
				if (resolve) return getSubcomponentOrFeature();
				return basicGetSubcomponentOrFeature();
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME:
				return getSubcomponentName();
			case ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT:
				if (resolve) return getContextSubcomponent();
				return basicGetContextSubcomponent();
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
			case ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME:
				setComponentNameOrFeatureName((String)newValue);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME:
				getErrorStateOrPropagationName().clear();
				getErrorStateOrPropagationName().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION:
				getErrorStateOrPropagation().clear();
				getErrorStateOrPropagation().addAll((Collection)newValue);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE:
				setSubcomponentOrFeature((NamedElement)newValue);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME:
				setSubcomponentName((String)newValue);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT:
				setContextSubcomponent((NamedElement)newValue);
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
			case ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME:
				setComponentNameOrFeatureName(COMPONENT_NAME_OR_FEATURE_NAME_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME:
				getErrorStateOrPropagationName().clear();
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION:
				getErrorStateOrPropagation().clear();
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE:
				setSubcomponentOrFeature((NamedElement)null);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME:
				setSubcomponentName(SUBCOMPONENT_NAME_EDEFAULT);
				return;
			case ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT:
				setContextSubcomponent((NamedElement)null);
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
			case ErrorannexPackage.ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME:
				return COMPONENT_NAME_OR_FEATURE_NAME_EDEFAULT == null ? componentNameOrFeatureName != null : !COMPONENT_NAME_OR_FEATURE_NAME_EDEFAULT.equals(componentNameOrFeatureName);
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME:
				return errorStateOrPropagationName != null && !errorStateOrPropagationName.isEmpty();
			case ErrorannexPackage.ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION:
				return errorStateOrPropagation != null && !errorStateOrPropagation.isEmpty();
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE:
				return subcomponentOrFeature != null;
			case ErrorannexPackage.ERROR_SOURCE_NAME__SUBCOMPONENT_NAME:
				return SUBCOMPONENT_NAME_EDEFAULT == null ? subcomponentName != null : !SUBCOMPONENT_NAME_EDEFAULT.equals(subcomponentName);
			case ErrorannexPackage.ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT:
				return contextSubcomponent != null;
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
		result.append(" (componentNameOrFeatureName: ");
		result.append(componentNameOrFeatureName);
		result.append(", errorStateOrPropagationName: ");
		result.append(errorStateOrPropagationName);
		result.append(", subcomponentName: ");
		result.append(subcomponentName);
		result.append(')');
		return result.toString();
	}

} //ErrorSourceNameImpl
