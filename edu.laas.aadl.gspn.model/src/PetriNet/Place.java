/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Place</b></em>'. <!-- end-user-doc --> <p> The following features are supported: <ul> <li> {@link PetriNet.Place#getInitialMarking  <em>Initial Marking</em>} </li> <li> {@link PetriNet.Place#getTransitionToPlace  <em>Transition To Place</em>} </li> <li> {@link PetriNet.Place#getPlaceToTransition  <em>Place To Transition</em>} </li> </ul> </p>
 * @see PetriNet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends PlaceorTransition {
	/**
	 * Returns the value of the '<em><b>Initial Marking</b></em>' attribute. <!-- begin-user-doc --> <p> If the meaning of the '<em>Initial Marking</em>' attribute isn't clear, there really should be more of a description here... </p> <!-- end-user-doc -->
	 * @return  the value of the '<em>Initial Marking</em>' attribute.
	 * @see #setInitialMarking(int)
	 * @see PetriNet.PetriNetPackage#getPlace_InitialMarking()
	 * @model  required="true"
	 * @generated
	 * @uml.property  name="initialMarking"
	 */
	int getInitialMarking();

	/**
	 * Sets the value of the ' {@link PetriNet.Place#getInitialMarking  <em>Initial Marking</em>} ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value  the new value of the '<em>Initial Marking</em>' attribute.
	 * @see #getInitialMarking()
	 * @generated
	 * @uml.property  name="initialMarking"
	 */
	void setInitialMarking(int value);

	/**
	 * Returns the value of the '<em><b>Transition To Place</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.TransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link PetriNet.TransitionToPlace#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition To Place</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition To Place</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getPlace_TransitionToPlace()
	 * @see PetriNet.TransitionToPlace#getPlace
	 * @model type="PetriNet.TransitionToPlace" opposite="place"
	 * @generated
	 */
	EList getTransitionToPlace();

	/**
	 * Returns the value of the '<em><b>Place To Transition</b></em>' reference list.
	 * The list contents are of type {@link PetriNet.PlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link PetriNet.PlaceToTransition#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place To Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place To Transition</em>' reference list.
	 * @see PetriNet.PetriNetPackage#getPlace_PlaceToTransition()
	 * @see PetriNet.PlaceToTransition#getPlace
	 * @model type="PetriNet.PlaceToTransition" opposite="place"
	 * @generated
	 */
	EList getPlaceToTransition();

} // Place
