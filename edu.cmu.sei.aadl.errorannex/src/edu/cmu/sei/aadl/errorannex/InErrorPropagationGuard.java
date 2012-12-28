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
 * @version $Id: InErrorPropagationGuard.java,v 1.1.4.1 2011-05-04 21:23:04 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Error Propagation Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard#getErrorPropagationRule <em>Error Propagation Rule</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getInErrorPropagationGuard()
 * @model
 * @generated
 */
public interface InErrorPropagationGuard extends ErrorGuard {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Propagation Rule</b></em>' containment reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Propagation Rule</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Propagation Rule</em>' containment reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getInErrorPropagationGuard_ErrorPropagationRule()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorPropagationRule" containment="true" required="true"
	 * @generated
	 */
	EList getErrorPropagationRule();

} // InErrorPropagationGuard
