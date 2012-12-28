/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package PetriNet;

import org.eclipse.emf.ecore.EAttribute;
import PetriNet.impl.PetriNetPackageImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PetriNet.PetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PetriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://PetriNet";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PetriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PetriNetPackage eINSTANCE = PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link PetriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PetriNetImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPetriNet()
	 * @generated
	 */
	int PETRI_NET = 0;

	/**
	 * The feature id for the '<em><b>Tool Info</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__TOOL_INFO = 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__ARCS = 1;

	/**
	 * The feature id for the '<em><b>Named Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET__NAMED_ELEMENT = 2;

	/**
	 * The number of structural features of the '<em>Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PETRI_NET_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link PetriNet.impl.ToolInfoImpl <em>Tool Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.ToolInfoImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getToolInfo()
	 * @generated
	 */
	int TOOL_INFO = 1;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO__PETRI_NET = 0;

	/**
	 * The number of structural features of the '<em>Tool Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOL_INFO_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link PetriNet.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.NamedElementImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__PETRI_NET = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PlaceorTransitionImpl <em>Placeor Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PlaceorTransitionImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceorTransition()
	 * @generated
	 */
	int PLACEOR_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEOR_TRANSITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEOR_TRANSITION__PETRI_NET = NAMED_ELEMENT__PETRI_NET;

	/**
	 * The number of structural features of the '<em>Placeor Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACEOR_TRANSITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PlaceImpl <em>Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PlaceImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPlace()
	 * @generated
	 */
	int PLACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__NAME = PLACEOR_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PETRI_NET = PLACEOR_TRANSITION__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Initial Marking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__INITIAL_MARKING = PLACEOR_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transition To Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__TRANSITION_TO_PLACE = PLACEOR_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Place To Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE__PLACE_TO_TRANSITION = PLACEOR_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_FEATURE_COUNT = PLACEOR_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TransitionImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = PLACEOR_TRANSITION__NAME;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PETRI_NET = PLACEOR_TRANSITION__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__OCCURRENCE = PLACEOR_TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Standard Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NON_STANDARD_ID = PLACEOR_TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition To Place</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRANSITION_TO_PLACE = PLACEOR_TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Place To Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PLACE_TO_TRANSITION = PLACEOR_TRANSITION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARAM = PLACEOR_TRANSITION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = PLACEOR_TRANSITION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link PetriNet.impl.ArcImpl <em>Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.ArcImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getArc()
	 * @generated
	 */
	int ARC = 4;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__WEIGHT = 0;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC__PETRI_NET = 1;

	/**
	 * The number of structural features of the '<em>Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARC_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link PetriNet.impl.PlaceToTransitionImpl <em>Place To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.PlaceToTransitionImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceToTransition()
	 * @generated
	 */
	int PLACE_TO_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION__WEIGHT = ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION__PETRI_NET = ARC__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Inhibitor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION__INHIBITOR = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION__PLACE = ARC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION__TRANSITION = ARC_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Place To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLACE_TO_TRANSITION_FEATURE_COUNT = ARC_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link PetriNet.impl.TransitionToPlaceImpl <em>Transition To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.impl.TransitionToPlaceImpl
	 * @see PetriNet.impl.PetriNetPackageImpl#getTransitionToPlace()
	 * @generated
	 */
	int TRANSITION_TO_PLACE = 6;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE__WEIGHT = ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Petri Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE__PETRI_NET = ARC__PETRI_NET;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE__TRANSITION = ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE__PLACE = ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transition To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_TO_PLACE_FEATURE_COUNT = ARC_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link PetriNet.OccurrenceType <em>Occurrence Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PetriNet.OccurrenceType
	 * @see PetriNet.impl.PetriNetPackageImpl#getOccurrenceType()
	 * @generated
	 */
	int OCCURRENCE_TYPE = 9;


	/**
	 * Returns the meta object for class '{@link PetriNet.PetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Petri Net</em>'.
	 * @see PetriNet.PetriNet
	 * @generated
	 */
	EClass getPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link PetriNet.PetriNet#getToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tool Info</em>'.
	 * @see PetriNet.PetriNet#getToolInfo()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_ToolInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link PetriNet.PetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see PetriNet.PetriNet#getArcs()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_Arcs();

	/**
	 * Returns the meta object for the containment reference list '{@link PetriNet.PetriNet#getNamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Named Element</em>'.
	 * @see PetriNet.PetriNet#getNamedElement()
	 * @see #getPetriNet()
	 * @generated
	 */
	EReference getPetriNet_NamedElement();

	/**
	 * Returns the meta object for class '{@link PetriNet.ToolInfo <em>Tool Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tool Info</em>'.
	 * @see PetriNet.ToolInfo
	 * @generated
	 */
	EClass getToolInfo();

	/**
	 * Returns the meta object for the container reference '{@link PetriNet.ToolInfo#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see PetriNet.ToolInfo#getPetriNet()
	 * @see #getToolInfo()
	 * @generated
	 */
	EReference getToolInfo_PetriNet();

	/**
	 * Returns the meta object for class '{@link PetriNet.Place <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place</em>'.
	 * @see PetriNet.Place
	 * @generated
	 */
	EClass getPlace();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.Place#getInitialMarking <em>Initial Marking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Marking</em>'.
	 * @see PetriNet.Place#getInitialMarking()
	 * @see #getPlace()
	 * @generated
	 */
	EAttribute getPlace_InitialMarking();

	/**
	 * Returns the meta object for the reference list '{@link PetriNet.Place#getTransitionToPlace <em>Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition To Place</em>'.
	 * @see PetriNet.Place#getTransitionToPlace()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_TransitionToPlace();

	/**
	 * Returns the meta object for the reference list '{@link PetriNet.Place#getPlaceToTransition <em>Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place To Transition</em>'.
	 * @see PetriNet.Place#getPlaceToTransition()
	 * @see #getPlace()
	 * @generated
	 */
	EReference getPlace_PlaceToTransition();

	/**
	 * Returns the meta object for class '{@link PetriNet.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see PetriNet.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.Transition#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurrence</em>'.
	 * @see PetriNet.Transition#getOccurrence()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Occurrence();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.Transition#getNonStandardId <em>Non Standard Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Standard Id</em>'.
	 * @see PetriNet.Transition#getNonStandardId()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_NonStandardId();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.Transition#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param</em>'.
	 * @see PetriNet.Transition#getParam()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Param();

	/**
	 * Returns the meta object for the reference list '{@link PetriNet.Transition#getTransitionToPlace <em>Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition To Place</em>'.
	 * @see PetriNet.Transition#getTransitionToPlace()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TransitionToPlace();

	/**
	 * Returns the meta object for the reference list '{@link PetriNet.Transition#getPlaceToTransition <em>Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Place To Transition</em>'.
	 * @see PetriNet.Transition#getPlaceToTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_PlaceToTransition();

	/**
	 * Returns the meta object for class '{@link PetriNet.Arc <em>Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arc</em>'.
	 * @see PetriNet.Arc
	 * @generated
	 */
	EClass getArc();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.Arc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see PetriNet.Arc#getWeight()
	 * @see #getArc()
	 * @generated
	 */
	EAttribute getArc_Weight();

	/**
	 * Returns the meta object for the container reference '{@link PetriNet.Arc#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see PetriNet.Arc#getPetriNet()
	 * @see #getArc()
	 * @generated
	 */
	EReference getArc_PetriNet();

	/**
	 * Returns the meta object for class '{@link PetriNet.PlaceToTransition <em>Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Place To Transition</em>'.
	 * @see PetriNet.PlaceToTransition
	 * @generated
	 */
	EClass getPlaceToTransition();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.PlaceToTransition#isInhibitor <em>Inhibitor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inhibitor</em>'.
	 * @see PetriNet.PlaceToTransition#isInhibitor()
	 * @see #getPlaceToTransition()
	 * @generated
	 */
	EAttribute getPlaceToTransition_Inhibitor();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.PlaceToTransition#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see PetriNet.PlaceToTransition#getPlace()
	 * @see #getPlaceToTransition()
	 * @generated
	 */
	EReference getPlaceToTransition_Place();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.PlaceToTransition#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see PetriNet.PlaceToTransition#getTransition()
	 * @see #getPlaceToTransition()
	 * @generated
	 */
	EReference getPlaceToTransition_Transition();

	/**
	 * Returns the meta object for class '{@link PetriNet.TransitionToPlace <em>Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition To Place</em>'.
	 * @see PetriNet.TransitionToPlace
	 * @generated
	 */
	EClass getTransitionToPlace();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.TransitionToPlace#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see PetriNet.TransitionToPlace#getTransition()
	 * @see #getTransitionToPlace()
	 * @generated
	 */
	EReference getTransitionToPlace_Transition();

	/**
	 * Returns the meta object for the reference '{@link PetriNet.TransitionToPlace#getPlace <em>Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Place</em>'.
	 * @see PetriNet.TransitionToPlace#getPlace()
	 * @see #getTransitionToPlace()
	 * @generated
	 */
	EReference getTransitionToPlace_Place();

	/**
	 * Returns the meta object for class '{@link PetriNet.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see PetriNet.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link PetriNet.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see PetriNet.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for the container reference '{@link PetriNet.NamedElement#getPetriNet <em>Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Petri Net</em>'.
	 * @see PetriNet.NamedElement#getPetriNet()
	 * @see #getNamedElement()
	 * @generated
	 */
	EReference getNamedElement_PetriNet();

	/**
	 * Returns the meta object for class '{@link PetriNet.PlaceorTransition <em>Placeor Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Placeor Transition</em>'.
	 * @see PetriNet.PlaceorTransition
	 * @generated
	 */
	EClass getPlaceorTransition();

	/**
	 * Returns the meta object for enum '{@link PetriNet.OccurrenceType <em>Occurrence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Occurrence Type</em>'.
	 * @see PetriNet.OccurrenceType
	 * @generated
	 */
	EEnum getOccurrenceType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PetriNetFactory getPetriNetFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals  {
		/**
		 * The meta object literal for the '{@link PetriNet.impl.PetriNetImpl <em>Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PetriNetImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPetriNet()
		 * @generated
		 */
		EClass PETRI_NET = eINSTANCE.getPetriNet();

		/**
		 * The meta object literal for the '<em><b>Tool Info</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__TOOL_INFO = eINSTANCE.getPetriNet_ToolInfo();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__ARCS = eINSTANCE.getPetriNet_Arcs();

		/**
		 * The meta object literal for the '<em><b>Named Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PETRI_NET__NAMED_ELEMENT = eINSTANCE.getPetriNet_NamedElement();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.ToolInfoImpl <em>Tool Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.ToolInfoImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getToolInfo()
		 * @generated
		 */
		EClass TOOL_INFO = eINSTANCE.getToolInfo();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOL_INFO__PETRI_NET = eINSTANCE.getToolInfo_PetriNet();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PlaceImpl <em>Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PlaceImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPlace()
		 * @generated
		 */
		EClass PLACE = eINSTANCE.getPlace();

		/**
		 * The meta object literal for the '<em><b>Initial Marking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE__INITIAL_MARKING = eINSTANCE.getPlace_InitialMarking();

		/**
		 * The meta object literal for the '<em><b>Transition To Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__TRANSITION_TO_PLACE = eINSTANCE.getPlace_TransitionToPlace();

		/**
		 * The meta object literal for the '<em><b>Place To Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE__PLACE_TO_TRANSITION = eINSTANCE.getPlace_PlaceToTransition();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TransitionImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__OCCURRENCE = eINSTANCE.getTransition_Occurrence();

		/**
		 * The meta object literal for the '<em><b>Non Standard Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__NON_STANDARD_ID = eINSTANCE.getTransition_NonStandardId();

		/**
		 * The meta object literal for the '<em><b>Transition To Place</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRANSITION_TO_PLACE = eINSTANCE.getTransition_TransitionToPlace();

		/**
		 * The meta object literal for the '<em><b>Place To Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__PLACE_TO_TRANSITION = eINSTANCE.getTransition_PlaceToTransition();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__PARAM = eINSTANCE.getTransition_Param();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.ArcImpl <em>Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.ArcImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getArc()
		 * @generated
		 */
		EClass ARC = eINSTANCE.getArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARC__WEIGHT = eINSTANCE.getArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARC__PETRI_NET = eINSTANCE.getArc_PetriNet();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PlaceToTransitionImpl <em>Place To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PlaceToTransitionImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceToTransition()
		 * @generated
		 */
		EClass PLACE_TO_TRANSITION = eINSTANCE.getPlaceToTransition();

		/**
		 * The meta object literal for the '<em><b>Inhibitor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLACE_TO_TRANSITION__INHIBITOR = eINSTANCE.getPlaceToTransition_Inhibitor();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TO_TRANSITION__PLACE = eINSTANCE.getPlaceToTransition_Place();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLACE_TO_TRANSITION__TRANSITION = eINSTANCE.getPlaceToTransition_Transition();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.TransitionToPlaceImpl <em>Transition To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.TransitionToPlaceImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getTransitionToPlace()
		 * @generated
		 */
		EClass TRANSITION_TO_PLACE = eINSTANCE.getTransitionToPlace();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_PLACE__TRANSITION = eINSTANCE.getTransitionToPlace_Transition();

		/**
		 * The meta object literal for the '<em><b>Place</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_TO_PLACE__PLACE = eINSTANCE.getTransitionToPlace_Place();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.NamedElementImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '<em><b>Petri Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_ELEMENT__PETRI_NET = eINSTANCE.getNamedElement_PetriNet();

		/**
		 * The meta object literal for the '{@link PetriNet.impl.PlaceorTransitionImpl <em>Placeor Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.impl.PlaceorTransitionImpl
		 * @see PetriNet.impl.PetriNetPackageImpl#getPlaceorTransition()
		 * @generated
		 */
		EClass PLACEOR_TRANSITION = eINSTANCE.getPlaceorTransition();

		/**
		 * The meta object literal for the '{@link PetriNet.OccurrenceType <em>Occurrence Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PetriNet.OccurrenceType
		 * @see PetriNet.impl.PetriNetPackageImpl#getOccurrenceType()
		 * @generated
		 */
		EEnum OCCURRENCE_TYPE = eINSTANCE.getOccurrenceType();

	}

} //PetriNetPackage
