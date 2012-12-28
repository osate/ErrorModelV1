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

import PetriNet.OccurrenceType;
import PetriNet.PetriNet;
import PetriNet.PetriNetPackage;
import PetriNet.PlaceToTransition;
import PetriNet.Transition;
import PetriNet.TransitionToPlace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link PetriNet.impl.TransitionImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link PetriNet.impl.TransitionImpl#getNonStandardId <em>Non Standard Id</em>}</li>
 *   <li>{@link PetriNet.impl.TransitionImpl#getTransitionToPlace <em>Transition To Place</em>}</li>
 *   <li>{@link PetriNet.impl.TransitionImpl#getPlaceToTransition <em>Place To Transition</em>}</li>
 *   <li>{@link PetriNet.impl.TransitionImpl#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends PlaceorTransitionImpl implements Transition {
	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final OccurrenceType OCCURRENCE_EDEFAULT = OccurrenceType.POISSON_LITERAL;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceType occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNonStandardId() <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardId()
	 * @generated
	 * @ordered
	 */
	protected static final String NON_STANDARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNonStandardId() <em>Non Standard Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonStandardId()
	 * @generated
	 * @ordered
	 */
	protected String nonStandardId = NON_STANDARD_ID_EDEFAULT;

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
	 * The default value of the '{@link #getParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected String param = PARAM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return PetriNetPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceType getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence(OccurrenceType newOccurrence) {
		OccurrenceType oldOccurrence = occurrence;
		occurrence = newOccurrence == null ? OCCURRENCE_EDEFAULT : newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNonStandardId() {
		return nonStandardId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNonStandardId(String newNonStandardId) {
		String oldNonStandardId = nonStandardId;
		nonStandardId = newNonStandardId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__NON_STANDARD_ID, oldNonStandardId, nonStandardId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParam() {
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParam(String newParam) {
		String oldParam = param;
		param = newParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PetriNetPackage.TRANSITION__PARAM, oldParam, param));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				return ((InternalEList)getTransitionToPlace()).basicAdd(otherEnd, msgs);
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
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
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				return ((InternalEList)getTransitionToPlace()).basicRemove(otherEnd, msgs);
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
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
			case PetriNetPackage.TRANSITION__OCCURRENCE:
				return getOccurrence();
			case PetriNetPackage.TRANSITION__NON_STANDARD_ID:
				return getNonStandardId();
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				return getTransitionToPlace();
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
				return getPlaceToTransition();
			case PetriNetPackage.TRANSITION__PARAM:
				return getParam();
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
			case PetriNetPackage.TRANSITION__OCCURRENCE:
				setOccurrence((OccurrenceType)newValue);
				return;
			case PetriNetPackage.TRANSITION__NON_STANDARD_ID:
				setNonStandardId((String)newValue);
				return;
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				getTransitionToPlace().clear();
				getTransitionToPlace().addAll((Collection)newValue);
				return;
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
				getPlaceToTransition().clear();
				getPlaceToTransition().addAll((Collection)newValue);
				return;
			case PetriNetPackage.TRANSITION__PARAM:
				setParam((String)newValue);
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
			case PetriNetPackage.TRANSITION__OCCURRENCE:
				setOccurrence(OCCURRENCE_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__NON_STANDARD_ID:
				setNonStandardId(NON_STANDARD_ID_EDEFAULT);
				return;
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				getTransitionToPlace().clear();
				return;
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
				getPlaceToTransition().clear();
				return;
			case PetriNetPackage.TRANSITION__PARAM:
				setParam(PARAM_EDEFAULT);
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
			case PetriNetPackage.TRANSITION__OCCURRENCE:
				return occurrence != OCCURRENCE_EDEFAULT;
			case PetriNetPackage.TRANSITION__NON_STANDARD_ID:
				return NON_STANDARD_ID_EDEFAULT == null ? nonStandardId != null : !NON_STANDARD_ID_EDEFAULT.equals(nonStandardId);
			case PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE:
				return transitionToPlace != null && !transitionToPlace.isEmpty();
			case PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION:
				return placeToTransition != null && !placeToTransition.isEmpty();
			case PetriNetPackage.TRANSITION__PARAM:
				return PARAM_EDEFAULT == null ? param != null : !PARAM_EDEFAULT.equals(param);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getTransitionToPlace() {
		if (transitionToPlace == null) {
			transitionToPlace = new EObjectWithInverseResolvingEList(TransitionToPlace.class, this, PetriNetPackage.TRANSITION__TRANSITION_TO_PLACE, PetriNetPackage.TRANSITION_TO_PLACE__TRANSITION);
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
			placeToTransition = new EObjectWithInverseResolvingEList(PlaceToTransition.class, this, PetriNetPackage.TRANSITION__PLACE_TO_TRANSITION, PetriNetPackage.PLACE_TO_TRANSITION__TRANSITION);
		}
		return placeToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (Occurrence: ");
		result.append(occurrence);
		result.append(", NonStandardId: ");
		result.append(nonStandardId);
		result.append(", Param: ");
		result.append(param);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
