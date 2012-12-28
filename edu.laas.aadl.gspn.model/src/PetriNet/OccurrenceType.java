/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.AbstractEnumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Occurrence Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage#getOccurrenceType()
 * @model
 * @generated
 */
public final class OccurrenceType extends AbstractEnumerator {
	/**
	 * The '<em><b>Poisson</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poisson</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of '<em><b>Fixed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	 * <p>
	 * If the meaning of '<em><b>Nonstandard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
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
	public static final OccurrenceType POISSON_LITERAL = new OccurrenceType(POISSON, "poisson", "poisson");

	/**
	 * The '<em><b>Fixed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIXED
	 * @generated
	 * @ordered
	 */
	public static final OccurrenceType FIXED_LITERAL = new OccurrenceType(FIXED, "fixed", "fixed");

	/**
	 * The '<em><b>Nonstandard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONSTANDARD
	 * @generated
	 * @ordered
	 */
	public static final OccurrenceType NONSTANDARD_LITERAL = new OccurrenceType(NONSTANDARD, "nonstandard", "nonstandard");

	/**
	 * An array of all the '<em><b>Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OccurrenceType[] VALUES_ARRAY =
		new OccurrenceType[] {
			POISSON_LITERAL,
			FIXED_LITERAL,
			NONSTANDARD_LITERAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Occurrence Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OccurrenceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccurrenceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OccurrenceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OccurrenceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Occurrence Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OccurrenceType get(int value) {
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
	private OccurrenceType(int value, String name, String literal) {
		super(value, name, literal);
	}

} //OccurrenceType
