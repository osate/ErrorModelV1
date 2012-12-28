/**
 * <copyright>
 * </copyright>
 *
 * $Id: DescriptorName.java,v 1.1.2.1 2011-05-04 21:23:02 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Descriptor Name</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getDescriptorName()
 * @model
 * @generated
 */
public final class DescriptorName extends AbstractEnumerator
{
	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_LITERAL
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE = 0;

	/**
	 * The '<em><b>Working</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING_LITERAL
	 * @model name="working"
	 * @generated
	 * @ordered
	 */
	public static final int WORKING = 1;

	/**
	 * The '<em><b>Down one</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_ONE_LITERAL
	 * @model name="down_one"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_ONE = 2;

	/**
	 * The '<em><b>Down two</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_TWO_LITERAL
	 * @model name="down_two"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_TWO = 3;

	/**
	 * The '<em><b>Down three</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_THREE_LITERAL
	 * @model name="down_three"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_THREE = 4;

	/**
	 * The '<em><b>Down four</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_FOUR_LITERAL
	 * @model name="down_four"
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_FOUR = 5;

	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName NONE_LITERAL = new DescriptorName(NONE, "none", "none");

	/**
	 * The '<em><b>Working</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKING
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName WORKING_LITERAL = new DescriptorName(WORKING, "working", "working");

	/**
	 * The '<em><b>Down one</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_ONE
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName DOWN_ONE_LITERAL = new DescriptorName(DOWN_ONE, "down_one", "down_one");

	/**
	 * The '<em><b>Down two</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_TWO
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName DOWN_TWO_LITERAL = new DescriptorName(DOWN_TWO, "down_two", "down_two");

	/**
	 * The '<em><b>Down three</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_THREE
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName DOWN_THREE_LITERAL = new DescriptorName(DOWN_THREE, "down_three", "down_three");

	/**
	 * The '<em><b>Down four</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_FOUR
	 * @generated
	 * @ordered
	 */
	public static final DescriptorName DOWN_FOUR_LITERAL = new DescriptorName(DOWN_FOUR, "down_four", "down_four");

	/**
	 * An array of all the '<em><b>Descriptor Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DescriptorName[] VALUES_ARRAY =
		new DescriptorName[] {
			NONE_LITERAL,
			WORKING_LITERAL,
			DOWN_ONE_LITERAL,
			DOWN_TWO_LITERAL,
			DOWN_THREE_LITERAL,
			DOWN_FOUR_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Descriptor Name</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Descriptor Name</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptorName get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescriptorName result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Descriptor Name</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptorName getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DescriptorName result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Descriptor Name</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DescriptorName get(int value) {
		switch (value) {
			case NONE: return NONE_LITERAL;
			case WORKING: return WORKING_LITERAL;
			case DOWN_ONE: return DOWN_ONE_LITERAL;
			case DOWN_TWO: return DOWN_TWO_LITERAL;
			case DOWN_THREE: return DOWN_THREE_LITERAL;
			case DOWN_FOUR: return DOWN_FOUR_LITERAL;
		}
		return null;
	}

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private DescriptorName(int value, String name, String literal) {
		super(value, name, literal);
	}
}
