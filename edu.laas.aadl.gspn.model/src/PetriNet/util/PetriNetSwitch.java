/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.util;

import PetriNet.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetPackage
 * @generated
 */
public class PetriNetSwitch {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PetriNetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PetriNetSwitch() {
		if (modelPackage == null) {
			modelPackage = PetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PetriNetPackage.PETRI_NET: {
				PetriNet petriNet = (PetriNet)theEObject;
				Object result = casePetriNet(petriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.TOOL_INFO: {
				ToolInfo toolInfo = (ToolInfo)theEObject;
				Object result = caseToolInfo(toolInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PLACE: {
				Place place = (Place)theEObject;
				Object result = casePlace(place);
				if (result == null) result = casePlaceorTransition(place);
				if (result == null) result = caseNamedElement(place);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				Object result = caseTransition(transition);
				if (result == null) result = casePlaceorTransition(transition);
				if (result == null) result = caseNamedElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.ARC: {
				Arc arc = (Arc)theEObject;
				Object result = caseArc(arc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PLACE_TO_TRANSITION: {
				PlaceToTransition placeToTransition = (PlaceToTransition)theEObject;
				Object result = casePlaceToTransition(placeToTransition);
				if (result == null) result = caseArc(placeToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.TRANSITION_TO_PLACE: {
				TransitionToPlace transitionToPlace = (TransitionToPlace)theEObject;
				Object result = caseTransitionToPlace(transitionToPlace);
				if (result == null) result = caseArc(transitionToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				Object result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PetriNetPackage.PLACEOR_TRANSITION: {
				PlaceorTransition placeorTransition = (PlaceorTransition)theEObject;
				Object result = casePlaceorTransition(placeorTransition);
				if (result == null) result = caseNamedElement(placeorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePetriNet(PetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Tool Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Tool Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseToolInfo(ToolInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePlace(Place object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseArc(Arc object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Place To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Place To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePlaceToTransition(PlaceToTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Transition To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Transition To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseTransitionToPlace(TransitionToPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>Placeor Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>Placeor Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePlaceorTransition(PlaceorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpretting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //PetriNetSwitch
