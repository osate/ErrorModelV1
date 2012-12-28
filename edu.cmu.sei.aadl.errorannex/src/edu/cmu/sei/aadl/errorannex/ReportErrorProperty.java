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
 * @version $Id: ReportErrorProperty.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report Error Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getStateAndPropagationList <em>State And Propagation List</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getErrorStateOrPropagation <em>Error State Or Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getReportErrorProperty()
 * @model
 * @generated
 */
public interface ReportErrorProperty extends ErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>State And Propagation List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State And Propagation List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State And Propagation List</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getReportErrorProperty_StateAndPropagationList()
	 * @model transient="true"
	 * @generated
	 */
	EList getStateAndPropagationList();

	/**
	 * Returns the value of the '<em><b>Error State Or Propagation</b></em>' reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State Or Propagation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State Or Propagation</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getReportErrorProperty_ErrorStateOrPropagation()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation"
	 * @generated
	 */
	EList getErrorStateOrPropagation();

} // ReportErrorProperty
