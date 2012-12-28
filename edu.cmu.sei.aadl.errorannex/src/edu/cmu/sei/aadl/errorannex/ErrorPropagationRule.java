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
 * @version $Id: ErrorPropagationRule.java,v 1.1.4.1 2011-05-04 21:23:04 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Propagation Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#isMask <em>Mask</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorExpression <em>Error Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagationIdentifier <em>Error Propagation Identifier</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagation <em>Error Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagationRule()
 * @model
 * @generated
 */
public interface ErrorPropagationRule extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' attribute.
	 * @see #setMask(boolean)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagationRule_Mask()
	 * @model
	 * @generated
	 */
	boolean isMask();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#isMask <em>Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' attribute.
	 * @see #isMask()
	 * @generated
	 */
	void setMask(boolean value);

	/**
	 * Returns the value of the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Expression</em>' containment reference.
	 * @see #setErrorExpression(BooleanErrorExpression)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagationRule_ErrorExpression()
	 * @model containment="true"
	 * @generated
	 */
	BooleanErrorExpression getErrorExpression();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorExpression <em>Error Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Expression</em>' containment reference.
	 * @see #getErrorExpression()
	 * @generated
	 */
	void setErrorExpression(BooleanErrorExpression value);

	/**
	 * Returns the value of the '<em><b>Error Propagation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Propagation Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Propagation Identifier</em>' attribute.
	 * @see #setErrorPropagationIdentifier(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagationRule_ErrorPropagationIdentifier()
	 * @model transient="true"
	 * @generated
	 */
	String getErrorPropagationIdentifier();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagationIdentifier <em>Error Propagation Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Propagation Identifier</em>' attribute.
	 * @see #getErrorPropagationIdentifier()
	 * @generated
	 */
	void setErrorPropagationIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Error Propagation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Propagation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Propagation</em>' reference.
	 * @see #setErrorPropagation(ErrorPropagation)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagationRule_ErrorPropagation()
	 * @model
	 * @generated
	 */
	ErrorPropagation getErrorPropagation();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagation <em>Error Propagation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Propagation</em>' reference.
	 * @see #getErrorPropagation()
	 * @generated
	 */
	void setErrorPropagation(ErrorPropagation value);

} // ErrorPropagationRule
