/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Transition#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link PetriNet.Transition#getNonStandardId <em>Non Standard Id</em>}</li>
 *   <li>{@link PetriNet.Transition#getTransitionToPlace <em>Transition To Place</em>}</li>
 *   <li>{@link PetriNet.Transition#getPlaceToTransition <em>Place To Transition</em>}</li>
 *   <li>{@link PetriNet.Transition#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends PlaceorTransition {
	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' attribute.
	 * The literals are from the enumeration {@link PetriNet.OccurrenceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' attribute.
	 * @see PetriNet.OccurrenceType
	 * @see #setOccurrence(OccurrenceType)
	 * @see PetriNet.PetriNetPackage#getTransition_Occurrence()
	 * @model required="true"
	 * @generated
	 */
	OccurrenceType getOccurrence();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getOccurrence <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' attribute.
	 * @see PetriNet.OccurrenceType
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(OccurrenceType value);

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
	 * @see PetriNet.PetriNetPackage#getTransition_NonStandardId()
	 * @model
	 * @generated
	 */
	String getNonStandardId();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getNonStandardId <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Non Standard Id</em>' attribute.
	 * @see #getNonStandardId()
	 * @generated
	 */
	void setNonStandardId(String value);

	/**
	 * Returns the value of the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Param</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param</em>' attribute.
	 * @see #setParam(String)
	 * @see PetriNet.PetriNetPackage#getTransition_Param()
	 * @model
	 * @generated
	 */
	String getParam();

	/**
	 * Sets the value of the '{@link PetriNet.Transition#getParam <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param</em>' attribute.
	 * @see #getParam()
	 * @generated
	 */
	void setParam(String value);

	/**
	 * Returns the value of the '<em><b>Transition To Place</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.TransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link PetriNet.TransitionToPlace#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition To Place</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition To Place</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getTransition_TransitionToPlace()
	 * @see PetriNet.TransitionToPlace#getTransition
	 * @model type="PetriNet.TransitionToPlace" opposite="transition"
	 * @generated
	 */
	EList getTransitionToPlace();

	/**
	 * Returns the value of the '<em><b>Place To Transition</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.PlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link PetriNet.PlaceToTransition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place To Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place To Transition</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getTransition_PlaceToTransition()
	 * @see PetriNet.PlaceToTransition#getTransition
	 * @model type="PetriNet.PlaceToTransition" opposite="transition"
	 * @generated
	 */
	EList getPlaceToTransition();

} // Transition
