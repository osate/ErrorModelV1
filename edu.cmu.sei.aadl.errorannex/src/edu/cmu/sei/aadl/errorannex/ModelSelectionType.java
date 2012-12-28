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
 * @version $Id: ModelSelectionType.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Model Selection Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getModelSelectionType()
 * @model
 * @generated
 */
public final class ModelSelectionType extends AbstractEnumerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The '<em><b>Abstract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT_LITERAL
	 * @model name="Abstract"
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT = 0;

	/**
	 * The '<em><b>Derived</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED_LITERAL
	 * @model name="Derived"
	 * @generated
	 * @ordered
	 */
	public static final int DERIVED = 1;

	/**
	 * The '<em><b>Abstract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABSTRACT
	 * @generated
	 * @ordered
	 */
	public static final ModelSelectionType ABSTRACT_LITERAL = new ModelSelectionType(ABSTRACT, "Abstract", "Abstract");

	/**
	 * The '<em><b>Derived</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DERIVED
	 * @generated
	 * @ordered
	 */
	public static final ModelSelectionType DERIVED_LITERAL = new ModelSelectionType(DERIVED, "Derived", "Derived");

	/**
	 * An array of all the '<em><b>Model Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ModelSelectionType[] VALUES_ARRAY =
		new ModelSelectionType[] {
			ABSTRACT_LITERAL,
			DERIVED_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Model Selection Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Model Selection Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelSelectionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelSelectionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Selection Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelSelectionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ModelSelectionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Model Selection Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelSelectionType get(int value) {
		switch (value) {
			case ABSTRACT: return ABSTRACT_LITERAL;
			case DERIVED: return DERIVED_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ModelSelectionType(int value, String name, String literal) {
		super(value, name, literal);
	}
}
