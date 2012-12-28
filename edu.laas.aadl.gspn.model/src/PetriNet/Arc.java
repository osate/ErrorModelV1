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
 * A representation of the model object '<em><b>Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.Arc#getWeight <em>Weight</em>}</li>
 *   <li>{@link PetriNet.Arc#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getArc()
 * @model abstract="true"
 * @generated
 */
public interface Arc extends EObject {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see PetriNet.PetriNetPackage#getArc_Weight()
	 * @model required="true"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' container reference.
	 * @see #setPetriNet(PetriNet)
	 * @see PetriNet.PetriNetPackage#getArc_PetriNet()
	 * @see PetriNet.PetriNet#getArcs
	 * @model opposite="arcs" required="true"
	 * @generated
	 */
	PetriNet getPetriNet();

	/**
	 * Sets the value of the '{@link PetriNet.Arc#getPetriNet <em>Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' container reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNet value);

} // Arc
