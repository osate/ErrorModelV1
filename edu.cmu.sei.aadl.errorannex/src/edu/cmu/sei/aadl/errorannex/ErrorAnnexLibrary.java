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
 * @version $Id: ErrorAnnexLibrary.java,v 1.1.4.1 2011-05-04 21:23:05 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.AnnexLibrary;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Annex Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary#getErrorModelClassifier <em>Error Model Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorAnnexLibrary()
 * @model
 * @generated
 */
public interface ErrorAnnexLibrary extends AnnexLibrary {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Model Classifier</b></em>' containment reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorModelClassifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Classifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Classifier</em>' containment reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorAnnexLibrary_ErrorModelClassifier()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorModelClassifier" containment="true"
	 * @generated
	 */
	EList getErrorModelClassifier();

	/**
	 * find ErrorModelImplementation in the error model. 
	 * @param eminame ErrorModelImplementation name
	 * @return ErrorModelImplementation
	 */
	ErrorModelImplementation findErrorModelImplementation(String eminame);

	
	/**
	 * find ErrorModelType in the error model. 
	 * @param emtname ErrorModelType name
	 * @return ErrorModelType
	 */
	ErrorModelType findErrorModelType(String emtname);

	/**
	 * returns the subset of error model classifiers that are error model types
	 * @return EList error model type
	 */
	public EList getErrorModelType();

	/**
	 * returns the subset of error model classifiers that are error model implementations
	 * @return EList error model implementation
	 */
	public EList getErrorModelImplementation();

} // ErrorAnnexLibrary
