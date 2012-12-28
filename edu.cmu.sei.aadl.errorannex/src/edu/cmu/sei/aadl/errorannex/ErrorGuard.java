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
 * @version $Id: ErrorGuard.java,v 1.1.4.1 2011-05-04 21:23:02 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeatureName <em>Applies To Feature Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeature <em>Applies To Feature</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorGuard()
 * @model abstract="true"
 * @generated
 */
public interface ErrorGuard extends ErrorModelProperty, Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Feature Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Feature Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorGuard_AppliesToFeatureName()
	 * @model transient="true"
	 * @generated
	 */
	EList getAppliesToFeatureName();

	/**
	 * Returns the value of the '<em><b>Applies To Feature</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadl2.Feature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Feature</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Feature</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorGuard_AppliesToFeature()
	 * @model type="org.osate.aadl2.Feature"
	 * @generated
	 */
	EList getAppliesToFeature();

	/**
	 * returns the error propagation rule for the specified error propagation
	 * @param prop ErrorPropagation
	 * @return ErrorPropagationRule
	 */
	ErrorPropagationRule getErrorPropagationRule( ErrorPropagation prop);

} // ErrorGuard
