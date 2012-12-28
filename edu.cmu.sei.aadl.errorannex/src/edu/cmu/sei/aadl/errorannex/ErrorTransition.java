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
 * @version $Id: ErrorTransition.java,v 1.1.4.1 2011-05-04 21:23:05 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getOrigin <em>Origin</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestination <em>Destination</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionAction <em>Transition Action</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getActivationTrigger <em>Activation Trigger</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTrigger <em>Transition Trigger</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getOriginName <em>Origin Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestinationName <em>Destination Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionActionName <em>Transition Action Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTriggerName <em>Transition Trigger Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition()
 * @model
 * @generated
 */
public interface ErrorTransition extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_Origin()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorState" required="true"
	 * @generated
	 */
	EList getOrigin();

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(ErrorState)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_Destination()
	 * @model required="true"
	 * @generated
	 */
	ErrorState getDestination();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(ErrorState value);

	/**
	 * Returns the value of the '<em><b>Transition Action</b></em>' reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Action</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Action</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_TransitionAction()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorPropagation"
	 * @generated
	 */
	EList getTransitionAction();

	/**
	 * Returns the value of the '<em><b>Activation Trigger</b></em>' attribute list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.TriggerType}.
	 * The literals are from the enumeration {@link edu.cmu.sei.aadl.errorannex.TriggerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Trigger</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Trigger</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.TriggerType
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_ActivationTrigger()
	 * @model dataType="edu.cmu.sei.aadl.errorannex.TriggerType" upper="2"
	 * @generated
	 */
	EList getActivationTrigger();

	/**
	 * Returns the value of the '<em><b>Transition Trigger</b></em>' reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Trigger</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Trigger</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_TransitionTrigger()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation"
	 * @generated
	 */
	EList getTransitionTrigger();

	/**
	 * Returns the value of the '<em><b>Origin Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_OriginName()
	 * @model transient="true"
	 * @generated
	 */
	EList getOriginName();

	/**
	 * Returns the value of the '<em><b>Destination Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination Name</em>' attribute.
	 * @see #setDestinationName(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_DestinationName()
	 * @model transient="true"
	 * @generated
	 */
	String getDestinationName();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestinationName <em>Destination Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination Name</em>' attribute.
	 * @see #getDestinationName()
	 * @generated
	 */
	void setDestinationName(String value);

	/**
	 * Returns the value of the '<em><b>Transition Action Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Action Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Action Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_TransitionActionName()
	 * @model transient="true"
	 * @generated
	 */
	EList getTransitionActionName();

	/**
	 * Returns the value of the '<em><b>Transition Trigger Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Trigger Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Trigger Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorTransition_TransitionTriggerName()
	 * @model transient="true"
	 * @generated
	 */
	EList getTransitionTriggerName();

} // ErrorTransition
