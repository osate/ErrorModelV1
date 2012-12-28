/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.ecore.EFactory;
import PetriNet.impl.PetriNetFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage
 * @generated
 */
public interface PetriNetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetFactory eINSTANCE = PetriNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Petri Net</em>'.
	 * @generated
	 */
	PetriNet createPetriNet();

	/**
	 * Returns a new object of class '<em>Tool Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tool Info</em>'.
	 * @generated
	 */
	ToolInfo createToolInfo();

	/**
	 * Returns a new object of class '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place</em>'.
	 * @generated
	 */
	Place createPlace();

	/**
	 * Returns a new object of class '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Place To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Place To Transition</em>'.
	 * @generated
	 */
	PlaceToTransition createPlaceToTransition();

	/**
	 * Returns a new object of class '<em>Transition To Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transition To Place</em>'.
	 * @generated
	 */
	TransitionToPlace createTransitionToPlace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PetriNetPackage getPetriNetPackage();

} //PetriNetFactory
