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
 * @version $Id: ErrorAnnexSubClause.java,v 1.1.4.1 2011-05-04 21:23:00 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Annex Sub Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause#getErrorModelProperty <em>Error Model Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorAnnexSubClause()
 * @model
 * @generated
 */
public interface ErrorAnnexSubClause extends AnnexSubclause {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Error Model Property</b></em>' containment reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Model Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Model Property</em>' containment reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorAnnexSubClause_ErrorModelProperty()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorModelProperty" containment="true"
	 * @generated
	 */
	EList getErrorModelProperty();

	/**
	 * get the error model property for the error model feature from an error annex subclause 
	 * this method takes into account that guards may apply to certain features only
	 * this method takes into account applies to if target is non-null 
	 * @param feature Error Model Feature (event or propagation) or component feature (port)
	 * @param featureContext the context of a component feature for ModeTransition Guars
	 * @param target subcomponent or connection whose error model property we try to retrieve
	 * @return ErrorModelProperty
	 */
	ErrorModelProperty getErrorModelProperty( EClass eclass, NamedElement feature, NamedElement featureContext, EList target);

} // ErrorAnnexSubClause
