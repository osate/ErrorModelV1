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
 * @version $Id: ModeTransitionGuard.java,v 1.2.2.1 2011-05-04 21:23:01 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;


import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.ModeTransition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mode Transition Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getErrorExpression <em>Error Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToFeatureContextName <em>Applies To Feature Context Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToModeTransition <em>Applies To Mode Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModeTransitionGuard()
 * @model
 * @generated
 */
public interface ModeTransitionGuard extends ErrorGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Expression</em>' containment reference.
	 * @see #setErrorExpression(BooleanErrorExpression)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModeTransitionGuard_ErrorExpression()
	 * @model containment="true"
	 * @generated
	 */
	BooleanErrorExpression getErrorExpression();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getErrorExpression <em>Error Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Expression</em>' containment reference.
	 * @see #getErrorExpression()
	 * @generated
	 */
	void setErrorExpression(BooleanErrorExpression value);

	/**
	 * Returns the value of the '<em><b>Applies To Feature Context Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Feature Context Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Feature Context Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModeTransitionGuard_AppliesToFeatureContextName()
	 * @model transient="true"
	 * @generated
	 */
	EList getAppliesToFeatureContextName();

	/**
	 * Returns the value of the '<em><b>Applies To Mode Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Mode Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Mode Transition</em>' reference.
	 * @see #setAppliesToModeTransition(ModeTransition)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModeTransitionGuard_AppliesToModeTransition()
	 * @model
	 * @generated
	 */
	ModeTransition getAppliesToModeTransition();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToModeTransition <em>Applies To Mode Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Mode Transition</em>' reference.
	 * @see #getAppliesToModeTransition()
	 * @generated
	 */
	void setAppliesToModeTransition(ModeTransition value);

} // ModeTransitionGuard
