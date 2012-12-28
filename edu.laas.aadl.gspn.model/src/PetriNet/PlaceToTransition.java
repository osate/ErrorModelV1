/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place To Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PlaceToTransition#isInhibitor <em>Inhibitor</em>}</li>
 *   <li>{@link PetriNet.PlaceToTransition#getPlace <em>Place</em>}</li>
 *   <li>{@link PetriNet.PlaceToTransition#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPlaceToTransition()
 * @model
 * @generated
 */
public interface PlaceToTransition extends Arc {
	/**
	 * Returns the value of the '<em><b>Inhibitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inhibitor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inhibitor</em>' attribute.
	 * @see #setInhibitor(boolean)
	 * @see PetriNet.PetriNetPackage#getPlaceToTransition_Inhibitor()
	 * @model required="true"
	 * @generated
	 */
	boolean isInhibitor();

	/**
	 * Sets the value of the '{@link PetriNet.PlaceToTransition#isInhibitor <em>Inhibitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inhibitor</em>' attribute.
	 * @see #isInhibitor()
	 * @generated
	 */
	void setInhibitor(boolean value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Place#getPlaceToTransition <em>Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see PetriNet.PetriNetPackage#getPlaceToTransition_Place()
	 * @see PetriNet.Place#getPlaceToTransition
	 * @model opposite="placeToTransition" required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link PetriNet.PlaceToTransition#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Transition#getPlaceToTransition <em>Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see PetriNet.PetriNetPackage#getPlaceToTransition_Transition()
	 * @see PetriNet.Transition#getPlaceToTransition
	 * @model opposite="placeToTransition" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link PetriNet.PlaceToTransition#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

} // PlaceToTransition
