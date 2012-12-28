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
 * @version $Id: OccurrenceProperty.java,v 1.1.4.1 2011-05-04 21:23:04 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Occurrence Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getNonStandardId <em>Non Standard Id</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getParameterList <em>Parameter List</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getEventOrPropagationName <em>Event Or Propagation Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getAppliesToErrorEventOrPropagation <em>Applies To Error Event Or Propagation</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty()
 * @model
 * @generated
 */
public interface OccurrenceProperty extends ErrorModelProperty, Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.cmu.sei.aadl.errorannex.DistributionName}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.DistributionName
	 * @see #setType(DistributionName)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty_Type()
	 * @model
	 * @generated
	 */
	DistributionName getType();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.cmu.sei.aadl.errorannex.DistributionName
	 * @see #getType()
	 * @generated
	 */
	void setType(DistributionName value);

	/**
	 * Returns the value of the '<em><b>Non Standard Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Non Standard Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Non Standard Id</em>' attribute.
	 * @see #setNonStandardId(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty_NonStandardId()
	 * @model
	 * @generated
	 */
	String getNonStandardId();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getNonStandardId <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Standard Id</em>' attribute.
	 * @see #getNonStandardId()
	 * @generated
	 */
	void setNonStandardId(String value);

	/**
	 * Returns the value of the '<em><b>Parameter List</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter List</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter List</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty_ParameterList()
	 * @model
	 * @generated
	 */
	EList getParameterList();

	/**
	 * Returns the value of the '<em><b>Event Or Propagation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Or Propagation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Or Propagation Name</em>' attribute.
	 * @see #setEventOrPropagationName(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty_EventOrPropagationName()
	 * @model transient="true"
	 * @generated
	 */
	String getEventOrPropagationName();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getEventOrPropagationName <em>Event Or Propagation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Or Propagation Name</em>' attribute.
	 * @see #getEventOrPropagationName()
	 * @generated
	 */
	void setEventOrPropagationName(String value);

	/**
	 * Returns the value of the '<em><b>Applies To Error Event Or Propagation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applies To Error Event Or Propagation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applies To Error Event Or Propagation</em>' reference.
	 * @see #setAppliesToErrorEventOrPropagation(ErrorEventOrPropagation)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getOccurrenceProperty_AppliesToErrorEventOrPropagation()
	 * @model
	 * @generated
	 */
	ErrorEventOrPropagation getAppliesToErrorEventOrPropagation();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getAppliesToErrorEventOrPropagation <em>Applies To Error Event Or Propagation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applies To Error Event Or Propagation</em>' reference.
	 * @see #getAppliesToErrorEventOrPropagation()
	 * @generated
	 */
	void setAppliesToErrorEventOrPropagation(ErrorEventOrPropagation value);

} // OccurrenceProperty
