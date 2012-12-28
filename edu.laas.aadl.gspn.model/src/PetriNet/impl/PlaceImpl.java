/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import PetriNet.PetriNet;
import PetriNet.PetriNetPackage;
import PetriNet.Place;
import PetriNet.PlaceToTransition;
import PetriNet.TransitionToPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.PlaceImpl#getInitialMarking <em>Initial Marking</em>}</li>
 *   <li>{@link PetriNet.impl.PlaceImpl#getTransitionToPlace <em>Transition To Place</em>}</li>
 *   <li>{@link PetriNet.impl.PlaceImpl#getPlaceToTransition <em>Place To Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceImpl extends PlaceorTransitionImpl implements Place {
	/**
	 * The default value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected static final int INITIAL_MARKING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInitialMarking() <em>Initial Marking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialMarking()
	 * @generated
	 * @ordered
	 */
	protected int initialMarking = INITIAL_MARKING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitionToPlace() <em>Transition To Place</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionToPlace()
	 * @generated
	 * @ordered
	 */
	protected EList transitionToPlace = null;

	/**
	 * The cached value of the '{@link #getPlaceToTransition() <em>Place To Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceToTransition()
	 * @generated
	 * @ordered
	 */
	protected EList placeToTransition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInitialMarking() {
		return initialMarking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialMarking(int newInitialMarking) {
		int oldInitialMarking = initialMarking;
		initialMarking = newInitialMarking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE__INITIAL_MARKING, oldInitialMarking, initialMarking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionToPlace() {
		if (transitionToPlace == null) {
			transitionToPlace = new EObjectWithInverseResolvingEList(TransitionToPlace.class, this, PetriNetPackage.PLACE__TRANSITION_TO_PLACE, PetriNetPackage.TRANSITION_TO_PLACE__PLACE);
		}
		return transitionToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPlaceToTransition() {
		if (placeToTransition == null) {
			placeToTransition = new EObjectWithInverseResolvingEList(PlaceToTransition.class, this, PetriNetPackage.PLACE__PLACE_TO_TRANSITION, PetriNetPackage.PLACE_TO_TRANSITION__PLACE);
		}
		return placeToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				return ((InternalEList)getTransitionToPlace()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				return ((InternalEList)getPlaceToTransition()).basicAdd(otherEnd, msgs);
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
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				return ((InternalEList)getTransitionToPlace()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				return ((InternalEList)getPlaceToTransition()).basicRemove(otherEnd, msgs);
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
			case PetriNetPackage.PLACE__INITIAL_MARKING:
				return new Integer(getInitialMarking());
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				return getTransitionToPlace();
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				return getPlaceToTransition();
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
			case PetriNetPackage.PLACE__INITIAL_MARKING:
				setInitialMarking(((Integer)newValue).intValue());
				return;
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				getTransitionToPlace().clear();
				getTransitionToPlace().addAll((Collection)newValue);
				return;
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				getPlaceToTransition().clear();
				getPlaceToTransition().addAll((Collection)newValue);
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
			case PetriNetPackage.PLACE__INITIAL_MARKING:
				setInitialMarking(INITIAL_MARKING_EDEFAULT);
				return;
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				getTransitionToPlace().clear();
				return;
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				getPlaceToTransition().clear();
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
			case PetriNetPackage.PLACE__INITIAL_MARKING:
				return initialMarking != INITIAL_MARKING_EDEFAULT;
			case PetriNetPackage.PLACE__TRANSITION_TO_PLACE:
				return transitionToPlace != null && !transitionToPlace.isEmpty();
			case PetriNetPackage.PLACE__PLACE_TO_TRANSITION:
				return placeToTransition != null && !placeToTransition.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (InitialMarking: ");
		result.append(initialMarking);
		result.append(')');
		return result.toString();
	}

} //PlaceImpl
