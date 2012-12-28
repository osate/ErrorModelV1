/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import PetriNet.PetriNet;
import PetriNet.PetriNetPackage;
import PetriNet.Place;
import PetriNet.Transition;
import PetriNet.TransitionToPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition To Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.TransitionToPlaceImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link PetriNet.impl.TransitionToPlaceImpl#getPlace <em>Place</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionToPlaceImpl extends ArcImpl implements TransitionToPlace {
	/**
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition = null;

	/**
	 * The cached value of the '{@link #getPlace() <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlace()
	 * @generated
	 * @ordered
	 */
	protected Place place = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionToPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.TRANSITION_TO_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (transition != null && transition.eIsProxy()) {
			InternalEObject oldTransition = (InternalEObject)transition;
			transition = (Transition)eResolveProxy(oldTransition);
			if (transition != oldTransition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION, oldTransition, transition));
			}
		}
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition basicGetTransition() {
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		Transition oldTransition = transition;
		transition = newTransition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION, oldTransition, newTransition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != transition) {
			NotificationChain msgs = null;
			if (transition != null)
				msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE, Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place getPlace() {
		if (place != null && place.eIsProxy()) {
			InternalEObject oldPlace = (InternalEObject)place;
			place = (Place)eResolveProxy(oldPlace);
			if (place != oldPlace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.TRANSITION_TO_PLACE__PLACE, oldPlace, place));
			}
		}
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Place basicGetPlace() {
		return place;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs) {
		Place oldPlace = place;
		place = newPlace;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION_TO_PLACE__PLACE, oldPlace, newPlace);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlace(Place newPlace) {
		if (newPlace != place) {
			NotificationChain msgs = null;
			if (place != null)
				msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__TRANSITION_TO_PLACE, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, PetriNetPackage.PLACE__TRANSITION_TO_PLACE, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION_TO_PLACE__PLACE, newPlace, newPlace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				if (transition != null)
					msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE, Transition.class, msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__TRANSITION_TO_PLACE, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
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
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				return basicSetTransition(null, msgs);
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				return basicSetPlace(null, msgs);
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
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
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
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				setPlace((Place)newValue);
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
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				setTransition((Transition)null);
				return;
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				setPlace((Place)null);
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
			case PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION:
				return transition != null;
			case PetriNetPackage.TRANSITION_TO_PLACE__PLACE:
				return place != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionToPlaceImpl
