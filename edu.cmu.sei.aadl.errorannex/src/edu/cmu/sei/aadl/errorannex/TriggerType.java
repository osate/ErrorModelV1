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
 * @version $Id: TriggerType.java,v 1.1.4.1 2011-05-04 21:23:05 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Trigger Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getTriggerType()
 * @model
 * @generated
 */
public final class TriggerType extends AbstractEnumerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The '<em><b>Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_LITERAL
	 * @model name="Activate"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE = 0;

	/**
	 * The '<em><b>Deactivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATE_LITERAL
	 * @model name="Deactivate"
	 * @generated
	 * @ordered
	 */
	public static final int DEACTIVATE = 1;

	/**
	 * The '<em><b>Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE
	 * @generated
	 * @ordered
	 */
	public static final TriggerType ACTIVATE_LITERAL = new TriggerType(ACTIVATE, "Activate", "Activate");

	/**
	 * The '<em><b>Deactivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATE
	 * @generated
	 * @ordered
	 */
	public static final TriggerType DEACTIVATE_LITERAL = new TriggerType(DEACTIVATE, "Deactivate", "Deactivate");

	/**
	 * An array of all the '<em><b>Trigger Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TriggerType[] VALUES_ARRAY =
		new TriggerType[] {
			ACTIVATE_LITERAL,
			DEACTIVATE_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Trigger Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Trigger Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TriggerType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Trigger Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TriggerType get(int value) {
		switch (value) {
			case ACTIVATE: return ACTIVATE_LITERAL;
			case DEACTIVATE: return DEACTIVATE_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private TriggerType(int value, String name, String literal) {
		super(value, name, literal);
	}
}
