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
 * @version $Id: ErrorannexFactory.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage
 * @generated
 */
public interface ErrorannexFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErrorannexFactory eINSTANCE = edu.cmu.sei.aadl.errorannex.impl.ErrorannexFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Error Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Type</em>'.
	 * @generated
	 */
	ErrorModelType createErrorModelType();

	/**
	 * Returns a new object of class '<em>Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Event</em>'.
	 * @generated
	 */
	ErrorEvent createErrorEvent();

	/**
	 * Returns a new object of class '<em>Error State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error State</em>'.
	 * @generated
	 */
	ErrorState createErrorState();

	/**
	 * Returns a new object of class '<em>Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Propagation</em>'.
	 * @generated
	 */
	ErrorPropagation createErrorPropagation();

	/**
	 * Returns a new object of class '<em>Error Model Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Model Implementation</em>'.
	 * @generated
	 */
	ErrorModelImplementation createErrorModelImplementation();

	/**
	 * Returns a new object of class '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Transition</em>'.
	 * @generated
	 */
	ErrorTransition createErrorTransition();

	/**
	 * Returns a new object of class '<em>Boolean Error Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Error Expression</em>'.
	 * @generated
	 */
	BooleanErrorExpression createBooleanErrorExpression();

	/**
	 * Returns a new object of class '<em>Error Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Annex Library</em>'.
	 * @generated
	 */
	ErrorAnnexLibrary createErrorAnnexLibrary();

	/**
	 * Returns a new object of class '<em>Error Annex Sub Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Annex Sub Clause</em>'.
	 * @generated
	 */
	ErrorAnnexSubClause createErrorAnnexSubClause();

	/**
	 * Returns a new object of class '<em>Error Propagation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Propagation Rule</em>'.
	 * @generated
	 */
	ErrorPropagationRule createErrorPropagationRule();

	/**
	 * Returns a new object of class '<em>Occurrence Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence Property</em>'.
	 * @generated
	 */
	OccurrenceProperty createOccurrenceProperty();

	/**
	 * Returns a new object of class '<em>Component Error Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Component Error Model Property</em>'.
	 * @generated
	 */
	ComponentErrorModelProperty createComponentErrorModelProperty();

	/**
	 * Returns a new object of class '<em>Report Error Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Error Property</em>'.
	 * @generated
	 */
	ReportErrorProperty createReportErrorProperty();

	/**
	 * Returns a new object of class '<em>In Error Propagation Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In Error Propagation Guard</em>'.
	 * @generated
	 */
	InErrorPropagationGuard createInErrorPropagationGuard();

	/**
	 * Returns a new object of class '<em>Port Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Port Event Guard</em>'.
	 * @generated
	 */
	PortEventGuard createPortEventGuard();

	/**
	 * Returns a new object of class '<em>Error Source Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Source Name</em>'.
	 * @generated
	 */
	ErrorSourceName createErrorSourceName();

	/**
	 * Returns a new object of class '<em>Derived Error State Mapping Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Derived Error State Mapping Guard</em>'.
	 * @generated
	 */
	DerivedErrorStateMappingGuard createDerivedErrorStateMappingGuard();

	/**
	 * Returns a new object of class '<em>Error State Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error State Mapping Rule</em>'.
	 * @generated
	 */
	ErrorStateMappingRule createErrorStateMappingRule();

	/**
	 * Returns a new object of class '<em>Error Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Transitions</em>'.
	 * @generated
	 */
	ErrorTransitions createErrorTransitions();

	/**
	 * Returns a new object of class '<em>Error Properties</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Error Properties</em>'.
	 * @generated
	 */
	ErrorProperties createErrorProperties();

	/**
	 * Returns a new object of class '<em>Model Hierarchy Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Hierarchy Property</em>'.
	 * @generated
	 */
	ModelHierarchyProperty createModelHierarchyProperty();

	/**
	 * Returns a new object of class '<em>Mode Transition Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mode Transition Guard</em>'.
	 * @generated
	 */
	ModeTransitionGuard createModeTransitionGuard();

	/**
	 * Returns a new object of class '<em>Out Error Propagation Guard</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out Error Propagation Guard</em>'.
	 * @generated
	 */
	OutErrorPropagationGuard createOutErrorPropagationGuard();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ErrorannexPackage getErrorannexPackage();

} //ErrorannexFactory
