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
 * @version $Id: DerivedErrorStateMappingGuard.java,v 1.1.4.1 2011-05-04 21:23:02 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Error State Mapping Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard#getErrorStateMappingRule <em>Error State Mapping Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getDerivedErrorStateMappingGuard()
 * @model
 * @generated
 */
public interface DerivedErrorStateMappingGuard extends ErrorModelProperty {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error State Mapping Rule</b></em>' containment reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State Mapping Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State Mapping Rule</em>' containment reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getDerivedErrorStateMappingGuard_ErrorStateMappingRule()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule" containment="true" required="true"
	 * @generated
	 */
	EList getErrorStateMappingRule();

	/**
	 * returns the mapping rule for the specified error state
	 * @param state ErrorState
	 * @return ErrorStateMappingRule
	 */
	ErrorStateMappingRule getErrorStateMappingRule( ErrorState state);

} // DerivedErrorStateMappingGuard
