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
 * A representation of the model object '<em><b>Tool Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link PetriNet.ToolInfo#getPetriNet <em>Petri Net</em>}</li>
 * </ul>
 * </p>
 *
 * @see PetriNet.PetriNetPackage#getToolInfo()
 * @model
 * @generated
 */
public interface ToolInfo extends EObject {
	/**
	 * Returns the value of the '<em><b>Petri Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link PetriNet.PetriNet#getToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Petri Net</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Petri Net</em>' container reference.
	 * @see #setPetriNet(PetriNet)
	 * @see PetriNet.PetriNetPackage#getToolInfo_PetriNet()
	 * @see PetriNet.PetriNet#getToolInfo
	 * @model opposite="toolInfo" required="true"
	 * @generated
	 */
	PetriNet getPetriNet();

	/**
	 * Sets the value of the '{@link PetriNet.ToolInfo#getPetriNet <em>Petri Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Petri Net</em>' container reference.
	 * @see #getPetriNet()
	 * @generated
	 */
	void setPetriNet(PetriNet value);

} // ToolInfo
