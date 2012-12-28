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
 * @version $Id: ErrorModelFeature.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.osate.aadl2.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorModelFeature#getOccurrenceProperty <em>Occurrence Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelFeature()
 * @model abstract="true"
 *        annotation="http:///aadl/OSATE isProxy='true'"
 * @generated
 */
public interface ErrorModelFeature extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence Property</em>' containment reference.
	 * @see #setOccurrenceProperty(OccurrenceProperty)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelFeature_OccurrenceProperty()
	 * @model containment="true"
	 * @generated
	 */
	OccurrenceProperty getOccurrenceProperty();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorModelFeature#getOccurrenceProperty <em>Occurrence Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence Property</em>' containment reference.
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	void setOccurrenceProperty(OccurrenceProperty value);

} // ErrorModelFeature
