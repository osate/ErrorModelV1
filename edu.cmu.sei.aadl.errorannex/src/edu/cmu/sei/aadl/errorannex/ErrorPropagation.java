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
 * @version $Id: ErrorPropagation.java,v 1.1.4.1 2011-05-04 21:23:04 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Propagation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isIn <em>In</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isOut <em>Out</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagation()
 * @model
 * @generated
 */
public interface ErrorPropagation extends ErrorModelFeature, ErrorStateOrPropagation, ErrorEventOrPropagation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In</em>' attribute.
	 * @see #setIn(boolean)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagation_In()
	 * @model
	 * @generated
	 */
	boolean isIn();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isIn <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In</em>' attribute.
	 * @see #isIn()
	 * @generated
	 */
	void setIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out</em>' attribute.
	 * @see #setOut(boolean)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorPropagation_Out()
	 * @model
	 * @generated
	 */
	boolean isOut();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isOut <em>Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out</em>' attribute.
	 * @see #isOut()
	 * @generated
	 */
	void setOut(boolean value);

} // ErrorPropagation
