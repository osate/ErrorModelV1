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
 * @version $Id: ErrorAnnexSubClauseImpl.java,v 1.2.4.1 2011-05-04 21:23:08 relief Exp $
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
import org.osate.aadl2.Feature;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.impl.AnnexSubclauseImpl;

import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorGuard;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Annex Sub Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl#getErrorModelProperty <em>Error Model Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorAnnexSubClauseImpl extends AnnexSubclauseImpl implements ErrorAnnexSubClause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached value of the '{@link #getErrorModelProperty() <em>Error Model Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelProperty()
	 * @generated
	 * @ordered
	 */
	protected EList errorModelProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorAnnexSubClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_ANNEX_SUB_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorModelProperty() {
		if (errorModelProperty == null) {
			errorModelProperty = new EObjectContainmentEList(ErrorModelProperty.class, this, ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY);
		}
		return errorModelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY:
				return ((InternalEList)getErrorModelProperty()).basicRemove(otherEnd, msgs);
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
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY:
				return getErrorModelProperty();
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
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY:
				getErrorModelProperty().clear();
				getErrorModelProperty().addAll((Collection)newValue);
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
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY:
				getErrorModelProperty().clear();
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
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY:
				return errorModelProperty != null && !errorModelProperty.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * get the error model property for the error model feature from an error annex subclause 
	 * this method takes into account that guards may apply to certain features only
	 * this method takes into account applies to if target is non-null 
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext the context of a component feature for ModeTransition Guards
	 * @param target subcomponent or connection whose error model property we try to retrieve
	 * @return ErrorModelProperty
	 */
	public ErrorModelProperty getErrorModelProperty( EClass eclass, NamedElement feature, NamedElement featureContext, EList target){
		ErrorModelProperty found = null;
		for (Iterator it = this.getErrorModelProperty().iterator(); it.hasNext();){
			ErrorModelProperty next = (ErrorModelProperty)it.next();
			found = null;
			if (next.eClass() == eclass ){
				if (next instanceof OccurrenceProperty){
					OccurrenceProperty occ = (OccurrenceProperty)next;
					if(occ.getAppliesToErrorEventOrPropagation() == feature ){
						found = next;
					}
				} else if (next instanceof ErrorGuard){
					ErrorGuard eg = (ErrorGuard)next;
					if (feature != null ){
						int cnt = 0;  // index into feature context list
						for (Iterator fit = eg.getAppliesToFeature().iterator();fit.hasNext();){
							Feature f = (Feature)fit.next();
							if (f == feature){
								if (eg instanceof ModeTransitionGuard && featureContext != null){
									
//									if (((ModeTransitionGuard)eg).getAppliesToFeatureContext().get(cnt) == featureContext){
//										found = eg;
//										break;
//									}
								} else {
									found = eg;
									break;
								}
							}
							cnt++;
						}
					}
				} else {
					found = next;
				}
				if (found != null && (target == null || target.isEmpty()) && next.getAppliesTo().isEmpty()){
					return found;
				} else if (found != null && target != null && target.size() > 0 ){
					if ( next.getAppliesTo().size() == target.size()&& target.equals(next.getAppliesTo())){
						return found;
					} else if (next.getAppliesToName().size() == target.size()&& target.equals(next.getAppliesToName())){
						return found;
					}
				}
			}
		}
		return null;
	}

} //ErrorAnnexSubClauseImpl
