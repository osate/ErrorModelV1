/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.NamedElement#getName <em>Name</em>}</li>
 *   <li>{@link PetriNet.NamedElement#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see PetriNet.PetriNetPackage#getNamedElement_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link PetriNet.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.PetriNet#getNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' container reference.
	 * @see #setPetriNet(PetriNet)
	 * @see PetriNet.PetriNetPackage#getNamedElement_PetriNet()
	 * @see PetriNet.PetriNet#getNamedElement
	 * @model opposite="namedElement" required="true"
	 * @generated
	 */
	PetriNet getPetriNet();

	/**
	 * Sets the value of the '{@link PetriNet.NamedElement#getPetriNet <em>Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' container reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNet value);

} // NamedElement
