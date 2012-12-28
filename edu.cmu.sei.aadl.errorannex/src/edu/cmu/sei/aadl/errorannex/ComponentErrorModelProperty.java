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
 * @version $Id: ComponentErrorModelProperty.java,v 1.1.4.1 2011-05-04 21:23:04 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Error Model Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getPackageIdentifier <em>Package Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelTypeIdentifier <em>Error Model Type Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelImplementationIdentifier <em>Error Model Implementation Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelClassifier <em>Error Model Classifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getInplaceErrorModelType <em>Inplace Error Model Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty()
 * @model
 * @generated
 */
public interface ComponentErrorModelProperty extends ErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Package Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Identifier</em>' attribute.
	 * @see #setPackageIdentifier(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty_PackageIdentifier()
	 * @model transient="true"
	 * @generated
	 */
	String getPackageIdentifier();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getPackageIdentifier <em>Package Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Identifier</em>' attribute.
	 * @see #getPackageIdentifier()
	 * @generated
	 */
	void setPackageIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Error Model Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Type Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Type Identifier</em>' attribute.
	 * @see #setErrorModelTypeIdentifier(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty_ErrorModelTypeIdentifier()
	 * @model transient="true"
	 * @generated
	 */
	String getErrorModelTypeIdentifier();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelTypeIdentifier <em>Error Model Type Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model Type Identifier</em>' attribute.
	 * @see #getErrorModelTypeIdentifier()
	 * @generated
	 */
	void setErrorModelTypeIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Error Model Implementation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Implementation Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Implementation Identifier</em>' attribute.
	 * @see #setErrorModelImplementationIdentifier(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty_ErrorModelImplementationIdentifier()
	 * @model transient="true"
	 * @generated
	 */
	String getErrorModelImplementationIdentifier();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelImplementationIdentifier <em>Error Model Implementation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model Implementation Identifier</em>' attribute.
	 * @see #getErrorModelImplementationIdentifier()
	 * @generated
	 */
	void setErrorModelImplementationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Error Model Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Classifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Classifier</em>' reference.
	 * @see #setErrorModelClassifier(ErrorModelClassifier)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty_ErrorModelClassifier()
	 * @model
	 * @generated
	 */
	ErrorModelClassifier getErrorModelClassifier();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelClassifier <em>Error Model Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model Classifier</em>' reference.
	 * @see #getErrorModelClassifier()
	 * @generated
	 */
	void setErrorModelClassifier(ErrorModelClassifier value);

	/**
	 * Returns the value of the '<em><b>Inplace Error Model Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inplace Error Model Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inplace Error Model Type</em>' containment reference.
	 * @see #setInplaceErrorModelType(ErrorModelType)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getComponentErrorModelProperty_InplaceErrorModelType()
	 * @model containment="true"
	 * @generated
	 */
	ErrorModelType getInplaceErrorModelType();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getInplaceErrorModelType <em>Inplace Error Model Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inplace Error Model Type</em>' containment reference.
	 * @see #getInplaceErrorModelType()
	 * @generated
	 */
	void setInplaceErrorModelType(ErrorModelType value);

} // ComponentErrorModelProperty
