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
 * @version $Id: DistributionName.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Distribution Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getDistributionName()
 * @model
 * @generated
 */
public final class DistributionName extends AbstractEnumerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The '<em><b>Poisson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSON_LITERAL
	 * @model name="poisson"
	 * @generated
	 * @ordered
	 */
	public static final int POISSON = 0;

	/**
	 * The '<em><b>Fixed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED_LITERAL
	 * @model name="fixed"
	 * @generated
	 * @ordered
	 */
	public static final int FIXED = 1;

	/**
	 * The '<em><b>Nonstandard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSTANDARD_LITERAL
	 * @model name="nonstandard"
	 * @generated
	 * @ordered
	 */
	public static final int NONSTANDARD = 2;

	/**
	 * The '<em><b>Poisson</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POISSON
	 * @generated
	 * @ordered
	 */
	public static final DistributionName POISSON_LITERAL = new DistributionName(POISSON, "poisson", "poisson");

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @generated
	 * @ordered
	 */
	public static final DistributionName FIXED_LITERAL = new DistributionName(FIXED, "fixed", "fixed");

	/**
	 * The '<em><b>Nonstandard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSTANDARD
	 * @generated
	 * @ordered
	 */
	public static final DistributionName NONSTANDARD_LITERAL = new DistributionName(NONSTANDARD, "nonstandard", "nonstandard");

	/**
	 * An array of all the '<em><b>Distribution Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DistributionName[] VALUES_ARRAY =
		new DistributionName[] {
			POISSON_LITERAL,
			FIXED_LITERAL,
			NONSTANDARD_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Distribution Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Distribution Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistributionName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistributionName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distribution Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistributionName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistributionName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distribution Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DistributionName get(int value) {
		switch (value) {
			case POISSON: return POISSON_LITERAL;
			case FIXED: return FIXED_LITERAL;
			case NONSTANDARD: return NONSTANDARD_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DistributionName(int value, String name, String literal) {
		super(value, name, literal);
	}
}
