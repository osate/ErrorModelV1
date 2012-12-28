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
import PetriNet.PlaceToTransition;
import PetriNet.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Place To Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.PlaceToTransitionImpl#isInhibitor <em>Inhibitor</em>}</li>
 *   <li>{@link PetriNet.impl.PlaceToTransitionImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link PetriNet.impl.PlaceToTransitionImpl#getTransition <em>Transition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlaceToTransitionImpl extends ArcImpl implements PlaceToTransition {
	/**
	 * The default value of the '{@link #isInhibitor() <em>Inhibitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInhibitor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHIBITOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInhibitor() <em>Inhibitor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInhibitor()
	 * @generated
	 * @ordered
	 */
	protected boolean inhibitor = INHIBITOR_EDEFAULT;

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
	 * The cached value of the '{@link #getTransition() <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransition()
	 * @generated
	 * @ordered
	 */
	protected Transition transition = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlaceToTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.PLACE_TO_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInhibitor() {
		return inhibitor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhibitor(boolean newInhibitor) {
		boolean oldInhibitor = inhibitor;
		inhibitor = newInhibitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_TO_TRANSITION__INHIBITOR, oldInhibitor, inhibitor));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.PLACE_TO_TRANSITION__PLACE, oldPlace, place));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_TO_TRANSITION__PLACE, oldPlace, newPlace);
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
				msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__PLACE_TO_TRANSITION, Place.class, msgs);
			if (newPlace != null)
				msgs = ((InternalEObject)newPlace).eInverseAdd(this, PetriNetPackage.PLACE__PLACE_TO_TRANSITION, Place.class, msgs);
			msgs = basicSetPlace(newPlace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_TO_TRANSITION__PLACE, newPlace, newPlace));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION, oldTransition, transition));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION, oldTransition, newTransition);
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
				msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION, Transition.class, msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				if (place != null)
					msgs = ((InternalEObject)place).eInverseRemove(this, PetriNetPackage.PLACE__PLACE_TO_TRANSITION, Place.class, msgs);
				return basicSetPlace((Place)otherEnd, msgs);
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				if (transition != null)
					msgs = ((InternalEObject)transition).eInverseRemove(this, PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION, Transition.class, msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
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
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				return basicSetPlace(null, msgs);
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				return basicSetTransition(null, msgs);
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
			case PetriNetPackage.PLACE_TO_TRANSITION__INHIBITOR:
				return isInhibitor() ? Boolean.TRUE : Boolean.FALSE;
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				if (resolve) return getPlace();
				return basicGetPlace();
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				if (resolve) return getTransition();
				return basicGetTransition();
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
			case PetriNetPackage.PLACE_TO_TRANSITION__INHIBITOR:
				setInhibitor(((Boolean)newValue).booleanValue());
				return;
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				setPlace((Place)newValue);
				return;
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				setTransition((Transition)newValue);
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
			case PetriNetPackage.PLACE_TO_TRANSITION__INHIBITOR:
				setInhibitor(INHIBITOR_EDEFAULT);
				return;
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				setPlace((Place)null);
				return;
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				setTransition((Transition)null);
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
			case PetriNetPackage.PLACE_TO_TRANSITION__INHIBITOR:
				return inhibitor != INHIBITOR_EDEFAULT;
			case PetriNetPackage.PLACE_TO_TRANSITION__PLACE:
				return place != null;
			case PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION:
				return transition != null;
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
		result.append(" (Inhibitor: ");
		result.append(inhibitor);
		result.append(')');
		return result.toString();
	}

} //PlaceToTransitionImpl
