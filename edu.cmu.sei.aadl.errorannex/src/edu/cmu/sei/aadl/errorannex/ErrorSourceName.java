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
 * @version $Id: ErrorSourceName.java,v 1.2.2.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Source Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getComponentNameOrFeatureName <em>Component Name Or Feature Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagationName <em>Error State Or Propagation Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagation <em>Error State Or Propagation</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentOrFeature <em>Subcomponent Or Feature</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentName <em>Subcomponent Name</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getContextSubcomponent <em>Context Subcomponent</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName()
 * @model
 * @generated
 */
public interface ErrorSourceName extends Element {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Returns the value of the '<em><b>Component Name Or Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Name Or Feature Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Name Or Feature Name</em>' attribute.
	 * @see #setComponentNameOrFeatureName(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_ComponentNameOrFeatureName()
	 * @model unique="false" transient="true"
	 * @generated
	 */
	String getComponentNameOrFeatureName();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getComponentNameOrFeatureName <em>Component Name Or Feature Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Name Or Feature Name</em>' attribute.
	 * @see #getComponentNameOrFeatureName()
	 * @generated
	 */
	void setComponentNameOrFeatureName(String value);

	/**
	 * Returns the value of the '<em><b>Error State Or Propagation Name</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State Or Propagation Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State Or Propagation Name</em>' attribute list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_ErrorStateOrPropagationName()
	 * @model
	 * @generated
	 */
	EList getErrorStateOrPropagationName();

	/**
	 * Returns the value of the '<em><b>Error State Or Propagation</b></em>' reference list.
	 * The list contents are of type {@link edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error State Or Propagation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error State Or Propagation</em>' reference list.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_ErrorStateOrPropagation()
	 * @model type="edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation"
	 * @generated
	 */
	EList getErrorStateOrPropagation();

	/**
	 * Returns the value of the '<em><b>Subcomponent Or Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent Or Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent Or Feature</em>' reference.
	 * @see #setSubcomponentOrFeature(NamedElement)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_SubcomponentOrFeature()
	 * @model
	 * @generated
	 */
	NamedElement getSubcomponentOrFeature();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentOrFeature <em>Subcomponent Or Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent Or Feature</em>' reference.
	 * @see #getSubcomponentOrFeature()
	 * @generated
	 */
	void setSubcomponentOrFeature(NamedElement value);

	/**
	 * Returns the value of the '<em><b>Subcomponent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subcomponent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subcomponent Name</em>' attribute.
	 * @see #setSubcomponentName(String)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_SubcomponentName()
	 * @model transient="true"
	 * @generated
	 */
	String getSubcomponentName();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentName <em>Subcomponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subcomponent Name</em>' attribute.
	 * @see #getSubcomponentName()
	 * @generated
	 */
	void setSubcomponentName(String value);

	/**
	 * Returns the value of the '<em><b>Context Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context Subcomponent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context Subcomponent</em>' reference.
	 * @see #setContextSubcomponent(NamedElement)
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorSourceName_ContextSubcomponent()
	 * @model
	 * @generated
	 */
	NamedElement getContextSubcomponent();

	/**
	 * Sets the value of the '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getContextSubcomponent <em>Context Subcomponent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context Subcomponent</em>' reference.
	 * @see #getContextSubcomponent()
	 * @generated
	 */
	void setContextSubcomponent(NamedElement value);

} // ErrorSourceName
