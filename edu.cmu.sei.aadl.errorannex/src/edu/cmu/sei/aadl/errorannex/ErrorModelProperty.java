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
 * @version $Id: ErrorModelProperty.java,v 1.1.4.1 2011-05-04 21:23:00 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesTo <em>Applies To</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesToName <em>Applies To Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelProperty()
 * @model abstract="true"
 *        annotation="http:///aadl/OSATE isProxy='true'"
 * @generated
 */
public interface ErrorModelProperty extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Applies To</b></em>' reference list.
	 * The list contents are of type {@link org.osate.aadl2.NamedElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelProperty_AppliesTo()
	 * @model type="org.osate.aadl2.NamedElement"
	 * @generated
	 */
	EList getAppliesTo();

	/**
	 * Returns the value of the '<em><b>Applies To Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelProperty_AppliesToName()
	 * @model transient="true"
	 * @generated
	 */
	EList getAppliesToName();

} // ErrorModelProperty
