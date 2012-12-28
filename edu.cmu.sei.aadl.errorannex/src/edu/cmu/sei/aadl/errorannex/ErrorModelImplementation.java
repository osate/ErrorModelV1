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
 * @version $Id: ErrorModelImplementation.java,v 1.1.4.1 2011-05-04 21:23:02 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorModelType <em>Error Model Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorTransitions <em>Error Transitions</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorProperties <em>Error Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelImplementation()
 * @model
 * @generated
 */
public interface ErrorModelImplementation extends ErrorModelClassifier {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Model Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Type</em>' reference.
	 * @see #setErrorModelType(ErrorModelType)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelImplementation_ErrorModelType()
	 * @model required="true"
	 * @generated
	 */
	ErrorModelType getErrorModelType();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorModelType <em>Error Model Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Model Type</em>' reference.
	 * @see #getErrorModelType()
	 * @generated
	 */
	void setErrorModelType(ErrorModelType value);

	/**
	 * Returns the value of the '<em><b>Error Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Transitions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Transitions</em>' containment reference.
	 * @see #setErrorTransitions(ErrorTransitions)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelImplementation_ErrorTransitions()
	 * @model containment="true"
	 * @generated
	 */
	ErrorTransitions getErrorTransitions();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorTransitions <em>Error Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Transitions</em>' containment reference.
	 * @see #getErrorTransitions()
	 * @generated
	 */
	void setErrorTransitions(ErrorTransitions value);

	/**
	 * Returns the value of the '<em><b>Error Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Properties</em>' containment reference.
	 * @see #setErrorProperties(ErrorProperties)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelImplementation_ErrorProperties()
	 * @model containment="true"
	 * @generated
	 */
	ErrorProperties getErrorProperties();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorProperties <em>Error Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Properties</em>' containment reference.
	 * @see #getErrorProperties()
	 * @generated
	 */
	void setErrorProperties(ErrorProperties value);

    /**
     * get qualified component impl name. Always a String
     */
    String getQualifiedName();

    /**
     * get type name from link or parsed name
     */
    String getTypeName();

    /**
     * get qualified type name from link or parsed name
     */
     String getQualifiedTypeName() ;

    /**
     * get implementation name without type name
     */
    String getImplName();
    
    /**
     * set the name.  Add the type name if the name only contains a name
     * Strip any additional dot names and add old name as comment
     * @param name implementation name
     */
    void setName(String name);

} // ErrorModelImplementation
