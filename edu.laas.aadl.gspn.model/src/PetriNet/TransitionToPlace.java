/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition To Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.TransitionToPlace#getTransition <em>Transition</em>}</li>
 *   <li>{@link PetriNet.TransitionToPlace#getPlace <em>Place</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getTransitionToPlace()
 * @model
 * @generated
 */
public interface TransitionToPlace extends Arc {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Transition#getTransitionToPlace <em>Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see PetriNet.PetriNetPackage#getTransitionToPlace_Transition()
	 * @see PetriNet.Transition#getTransitionToPlace
	 * @model opposite="transitionToPlace" required="true"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link PetriNet.TransitionToPlace#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.Place#getTransitionToPlace <em>Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see PetriNet.PetriNetPackage#getTransitionToPlace_Place()
	 * @see PetriNet.Place#getTransitionToPlace
	 * @model opposite="transitionToPlace" required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link PetriNet.TransitionToPlace#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

} // TransitionToPlace
