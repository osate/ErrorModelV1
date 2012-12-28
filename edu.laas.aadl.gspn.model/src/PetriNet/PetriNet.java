/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.PetriNet#getToolInfo <em>Tool Info</em>}</li>
 *   <li>{@link PetriNet.PetriNet#getArcs <em>Arcs</em>}</li>
 *   <li>{@link PetriNet.PetriNet#getNamedElement <em>Named Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Tool Info</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.ToolInfo}.
	 * It is bidirectional and its opposite is '{@link PetriNet.ToolInfo#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Info</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNet_ToolInfo()
	 * @see PetriNet.ToolInfo#getPetriNet
	 * @model type="PetriNet.ToolInfo" opposite="petriNet" containment="true"
	 * @generated
	 */
	EList getToolInfo();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.Arc}.
	 * It is bidirectional and its opposite is '{@link PetriNet.Arc#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNet_Arcs()
	 * @see PetriNet.Arc#getPetriNet
	 * @model type="PetriNet.Arc" opposite="petriNet" containment="true"
	 * @generated
	 */
	EList getArcs();

	/**
	 * Returns the value of the '<em><b>Named Element</b></em>' containment reference list.
	 * The list contents are of type {@link PetriNet.NamedElement}.
	 * It is bidirectional and its opposite is '{@link PetriNet.NamedElement#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Element</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Element</em>' containment reference list.
	 * @see PetriNet.PetriNetPackage#getPetriNet_NamedElement()
	 * @see PetriNet.NamedElement#getPetriNet
	 * @model type="PetriNet.NamedElement" opposite="petriNet" containment="true"
	 * @generated
	 */
	EList getNamedElement();

} // PetriNet
