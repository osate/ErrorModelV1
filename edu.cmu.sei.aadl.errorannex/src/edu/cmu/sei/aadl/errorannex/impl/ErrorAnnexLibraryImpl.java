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
 * @version $Id: ErrorAnnexLibraryImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.impl.AnnexLibraryImpl;
import org.osate.aadl2.modelsupport.util.AadlUtil;

import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Annex Library</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl#getErrorModelClassifier <em>Error Model Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorAnnexLibraryImpl extends AnnexLibraryImpl implements ErrorAnnexLibrary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached value of the '{@link #getErrorModelClassifier() <em>Error Model Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList errorModelClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorAnnexLibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_ANNEX_LIBRARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getErrorModelClassifier() {
		if (errorModelClassifier == null) {
			errorModelClassifier = new EObjectContainmentEList(ErrorModelClassifier.class, this, ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER);
		}
		return errorModelClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER:
				return ((InternalEList)getErrorModelClassifier()).basicRemove(otherEnd, msgs);
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
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER:
				return getErrorModelClassifier();
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
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER:
				getErrorModelClassifier().clear();
				getErrorModelClassifier().addAll((Collection)newValue);
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
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER:
				getErrorModelClassifier().clear();
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
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER:
				return errorModelClassifier != null && !errorModelClassifier.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * find ErrorModelType in the error model. 
	 * @param emtname ErrorModelType name
	 * @return ErrorModelType
	 */
	public ErrorModelType findErrorModelType(String emtname){
			NamedElement ne = AadlUtil.findNamedElementInList(this.getErrorModelType(),emtname);
			if (ne instanceof ErrorModelType){
				return (ErrorModelType)ne;
			}
		return null;
	}
	
	/**
	 * find ErrorModelImplementation in the error model. 
	 * @param eminame ErrorModelImplementation name
	 * @return ErrorModelImplementation
	 */
	public ErrorModelImplementation findErrorModelImplementation(String eminame){
			EList el = this.getErrorModelImplementation();
	        if (el != null) {
	            Iterator it = el.iterator();
	            while (it.hasNext()) {
	                Object o = it.next();

	                if (o instanceof ErrorModelImplementation){
	                    ErrorModelImplementation emi = (ErrorModelImplementation)o;
	                    String n = emi.getName();
	                    if (n != null && n.length() > 0 && eminame.equalsIgnoreCase(n)) {
		                    return emi;
	                    }
	                }
	            }
	        }
		return null;
	}

	public EList getErrorModelType() {
		EList list = new BasicEList();
		for (Iterator it = getErrorModelClassifier().iterator(); it.hasNext();){
			Object obj = it.next();
			if (obj instanceof ErrorModelType){
				list.add(obj);
			}
		}
		return list;
	}

	public EList getErrorModelImplementation() {
		EList list = new BasicEList();
		for (Iterator it = getErrorModelClassifier().iterator(); it.hasNext();){
			Object obj = it.next();
			if (obj instanceof ErrorModelImplementation){
				list.add(obj);
			}
		}
		return list;
	}

} //ErrorAnnexLibraryImpl
