/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import PetriNet.Arc;
import PetriNet.NamedElement;
import PetriNet.PetriNet;
import PetriNet.PetriNetPackage;
import PetriNet.ToolInfo;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.PetriNetImpl#getToolInfo <em>Tool Info</em>}</li>
 *   <li>{@link PetriNet.impl.PetriNetImpl#getArcs <em>Arcs</em>}</li>
 *   <li>{@link PetriNet.impl.PetriNetImpl#getNamedElement <em>Named Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PetriNetImpl extends EObjectImpl implements PetriNet {
	/**
	 * The cached value of the '{@link #getToolInfo() <em>Tool Info</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolInfo()
	 * @generated
	 * @ordered
	 */
	protected EList toolInfo = null;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList arcs = null;

	/**
	 * The cached value of the '{@link #getNamedElement() <em>Named Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedElement()
	 * @generated
	 * @ordered
	 */
	protected EList namedElement = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getToolInfo() {
		if (toolInfo == null) {
			toolInfo = new EObjectContainmentWithInverseEList(ToolInfo.class, this, PetriNetPackage.PETRI_NET__TOOL_INFO, PetriNetPackage.TOOL_INFO__PETRI_NET);
		}
		return toolInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentWithInverseEList(Arc.class, this, PetriNetPackage.PETRI_NET__ARCS, PetriNetPackage.ARC__PETRI_NET);
		}
		return arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getNamedElement() {
		if (namedElement == null) {
			namedElement = new EObjectContainmentWithInverseEList(NamedElement.class, this, PetriNetPackage.PETRI_NET__NAMED_ELEMENT, PetriNetPackage.NAMED_ELEMENT__PETRI_NET);
		}
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				return ((InternalEList)getToolInfo()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.PETRI_NET__ARCS:
				return ((InternalEList)getArcs()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				return ((InternalEList)getNamedElement()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				return ((InternalEList)getToolInfo()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.PETRI_NET__ARCS:
				return ((InternalEList)getArcs()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				return ((InternalEList)getNamedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				return getToolInfo();
			case PetriNetPackage.PETRI_NET__ARCS:
				return getArcs();
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				return getNamedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				getToolInfo().clear();
				getToolInfo().addAll((Collection)newValue);
				return;
			case PetriNetPackage.PETRI_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection)newValue);
				return;
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				getNamedElement().clear();
				getNamedElement().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				getToolInfo().clear();
				return;
			case PetriNetPackage.PETRI_NET__ARCS:
				getArcs().clear();
				return;
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				getNamedElement().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PetriNetPackage.PETRI_NET__TOOL_INFO:
				return toolInfo != null && !toolInfo.isEmpty();
			case PetriNetPackage.PETRI_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
			case PetriNetPackage.PETRI_NET__NAMED_ELEMENT:
				return namedElement != null && !namedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PetriNetImpl
