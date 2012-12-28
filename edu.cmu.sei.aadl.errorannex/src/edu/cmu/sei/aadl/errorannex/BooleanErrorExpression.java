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
 * @version $Id: BooleanErrorExpression.java,v 1.1.4.1 2011-05-04 21:23:02 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Error Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getContainedExpressions <em>Contained Expressions</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getErrorSourceName <em>Error Source Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getNumericLiteral <em>Numeric Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanErrorExpression()
 * @model
 * @generated
 */
public interface BooleanErrorExpression extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Contained Expressions</b></em>' containment reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained Expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained Expressions</em>' containment reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanErrorExpression_ContainedExpressions()
	 * @model type="edu.cmu.sei.aadl.errorannex.BooleanErrorExpression" containment="true"
	 * @generated
	 */
	EList getContainedExpressions();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.cmu.sei.aadl.errorannex.BooleanExpressionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanExpressionType
	 * @see #setType(BooleanExpressionType)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanErrorExpression_Type()
	 * @model
	 * @generated
	 */
	BooleanExpressionType getType();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanExpressionType
	 * @see #getType()
	 * @generated
	 */
	void setType(BooleanExpressionType value);

	/**
	 * Returns the value of the '<em><b>Error Source Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Source Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Source Name</em>' containment reference.
	 * @see #setErrorSourceName(ErrorSourceName)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanErrorExpression_ErrorSourceName()
	 * @model containment="true"
	 * @generated
	 */
	ErrorSourceName getErrorSourceName();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getErrorSourceName <em>Error Source Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Source Name</em>' containment reference.
	 * @see #getErrorSourceName()
	 * @generated
	 */
	void setErrorSourceName(ErrorSourceName value);

	/**
	 * Returns the value of the '<em><b>Numeric Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Literal</em>' attribute.
	 * @see #setNumericLiteral(int)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanErrorExpression_NumericLiteral()
	 * @model
	 * @generated
	 */
	int getNumericLiteral();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getNumericLiteral <em>Numeric Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Literal</em>' attribute.
	 * @see #getNumericLiteral()
	 * @generated
	 */
	void setNumericLiteral(int value);

} // BooleanErrorExpression
