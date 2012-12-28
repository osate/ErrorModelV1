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
 * @version $Id: ModelHierarchyProperty.java,v 1.1.4.1 2011-05-04 21:23:05 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Hierarchy Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty#getErrorModelSelection <em>Error Model Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModelHierarchyProperty()
 * @model
 * @generated
 */
public interface ModelHierarchyProperty extends ErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Model Selection</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.cmu.sei.aadl.errorannex.ModelSelectionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Selection</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.ModelSelectionType
	 * @see #setErrorModelSelection(ModelSelectionType)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModelHierarchyProperty_ErrorModelSelection()
	 * @model
	 * @generated
	 */
	ModelSelectionType getErrorModelSelection();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty#getErrorModelSelection <em>Error Model Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model Selection</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.ModelSelectionType
	 * @see #getErrorModelSelection()
	 * @generated
	 */
	void setErrorModelSelection(ModelSelectionType value);

} // ModelHierarchyProperty
