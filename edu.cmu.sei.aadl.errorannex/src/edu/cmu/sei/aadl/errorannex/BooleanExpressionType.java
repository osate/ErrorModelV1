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
 * @version $Id: BooleanExpressionType.java,v 1.1.4.1 2011-05-04 21:23:03 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Boolean Expression Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getBooleanExpressionType()
 * @model
 * @generated
 */
public final class BooleanExpressionType extends AbstractEnumerator
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The '<em><b>Not</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_LITERAL
	 * @model name="not"
	 * @generated
	 * @ordered
	 */
	public static final int NOT = 0;

	/**
	 * The '<em><b>And</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND_LITERAL
	 * @model name="and"
	 * @generated
	 * @ordered
	 */
	public static final int AND = 1;

	/**
	 * The '<em><b>Or</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR_LITERAL
	 * @model name="or"
	 * @generated
	 * @ordered
	 */
	public static final int OR = 2;

	/**
	 * The '<em><b>Ormore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORMORE_LITERAL
	 * @model name="ormore"
	 * @generated
	 * @ordered
	 */
	public static final int ORMORE = 3;

	/**
	 * The '<em><b>Orless</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORLESS_LITERAL
	 * @model name="orless"
	 * @generated
	 * @ordered
	 */
	public static final int ORLESS = 4;

	/**
	 * The '<em><b>Others</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS_LITERAL
	 * @model name="others"
	 * @generated
	 * @ordered
	 */
	public static final int OTHERS = 5;

	/**
	 * The '<em><b>Errorsourcename</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERRORSOURCENAME_LITERAL
	 * @model name="errorsourcename"
	 * @generated
	 * @ordered
	 */
	public static final int ERRORSOURCENAME = 6;

	/**
	 * The '<em><b>Not</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType NOT_LITERAL = new BooleanExpressionType(NOT, "not", "not");

	/**
	 * The '<em><b>And</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AND
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType AND_LITERAL = new BooleanExpressionType(AND, "and", "and");

	/**
	 * The '<em><b>Or</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OR
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType OR_LITERAL = new BooleanExpressionType(OR, "or", "or");

	/**
	 * The '<em><b>Ormore</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORMORE
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType ORMORE_LITERAL = new BooleanExpressionType(ORMORE, "ormore", "ormore");

	/**
	 * The '<em><b>Orless</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORLESS
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType ORLESS_LITERAL = new BooleanExpressionType(ORLESS, "orless", "orless");

	/**
	 * The '<em><b>Others</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHERS
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType OTHERS_LITERAL = new BooleanExpressionType(OTHERS, "others", "others");

	/**
	 * The '<em><b>Errorsourcename</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERRORSOURCENAME
	 * @generated
	 * @ordered
	 */
	public static final BooleanExpressionType ERRORSOURCENAME_LITERAL = new BooleanExpressionType(ERRORSOURCENAME, "errorsourcename", "errorsourcename");

	/**
	 * An array of all the '<em><b>Boolean Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BooleanExpressionType[] VALUES_ARRAY =
		new BooleanExpressionType[] {
			NOT_LITERAL,
			AND_LITERAL,
			OR_LITERAL,
			ORMORE_LITERAL,
			ORLESS_LITERAL,
			OTHERS_LITERAL,
			ERRORSOURCENAME_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Boolean Expression Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Boolean Expression Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanExpressionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanExpressionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Expression Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanExpressionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BooleanExpressionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Boolean Expression Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BooleanExpressionType get(int value) {
		switch (value) {
			case NOT: return NOT_LITERAL;
			case AND: return AND_LITERAL;
			case OR: return OR_LITERAL;
			case ORMORE: return ORMORE_LITERAL;
			case ORLESS: return ORLESS_LITERAL;
			case OTHERS: return OTHERS_LITERAL;
			case ERRORSOURCENAME: return ERRORSOURCENAME_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private BooleanExpressionType(int value, String name, String literal) {
		super(value, name, literal);
	}
}
