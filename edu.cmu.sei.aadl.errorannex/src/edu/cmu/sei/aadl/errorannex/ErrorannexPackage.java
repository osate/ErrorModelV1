/**
 * <copyright>
 * Copyright (c) 2004-2005 Carnegie Mellon University and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 *
 * Contributors:
 *   SEI - AADL Meta Model and EMF generated editor
 *
 * </copyright>
 *
 * @version $Id: ErrorannexPackage.java,v 1.3.2.1 2011-05-04 21:23:01 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.osate.aadl2.Aadl2Package;

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
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexFactory
 * @model kind="package"
 * @generated
 */
public interface ErrorannexPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "errorannex";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://AADL/errorannex";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "errorannex";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ErrorannexPackage eINSTANCE = edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelClassifierImpl <em>Error Model Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelClassifierImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelClassifier()
	 * @generated
	 */
	int ERROR_MODEL_CLASSIFIER = 25;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The number of structural features of the '<em>Error Model Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_CLASSIFIER_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelTypeImpl <em>Error Model Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelTypeImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelType()
	 * @generated
	 */
	int ERROR_MODEL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__OWNED_ELEMENT = ERROR_MODEL_CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__OWNED_COMMENT = ERROR_MODEL_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__NAME = ERROR_MODEL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__QUALIFIED_NAME = ERROR_MODEL_CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_CLASSIFIER__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE__FEATURES = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Model Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_TYPE_FEATURE_COUNT = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelFeatureImpl <em>Error Model Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelFeatureImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelFeature()
	 * @generated
	 */
	int ERROR_MODEL_FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Model Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_FEATURE_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorEventImpl <em>Error Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorEventImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorEvent()
	 * @generated
	 */
	int ERROR_EVENT = 2;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__OWNED_ELEMENT = ERROR_MODEL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__OWNED_COMMENT = ERROR_MODEL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__NAME = ERROR_MODEL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__QUALIFIED_NAME = ERROR_MODEL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT__OCCURRENCE_PROPERTY = ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY;

	/**
	 * The number of structural features of the '<em>Error Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_FEATURE_COUNT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateImpl <em>Error State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorState()
	 * @generated
	 */
	int ERROR_STATE = 3;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__OWNED_ELEMENT = ERROR_MODEL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__OWNED_COMMENT = ERROR_MODEL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__NAME = ERROR_MODEL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__QUALIFIED_NAME = ERROR_MODEL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__OCCURRENCE_PROPERTY = ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__INITIAL = ERROR_MODEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inactive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE__INACTIVE = ERROR_MODEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_FEATURE_COUNT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorPropagation()
	 * @generated
	 */
	int ERROR_PROPAGATION = 4;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OWNED_ELEMENT = ERROR_MODEL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OWNED_COMMENT = ERROR_MODEL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__NAME = ERROR_MODEL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__QUALIFIED_NAME = ERROR_MODEL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OCCURRENCE_PROPERTY = ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY;

	/**
	 * The feature id for the '<em><b>In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__IN = ERROR_MODEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION__OUT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_FEATURE_COUNT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl <em>Error Model Implementation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelImplementation()
	 * @generated
	 */
	int ERROR_MODEL_IMPLEMENTATION = 5;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__OWNED_ELEMENT = ERROR_MODEL_CLASSIFIER__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__OWNED_COMMENT = ERROR_MODEL_CLASSIFIER__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__NAME = ERROR_MODEL_CLASSIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__QUALIFIED_NAME = ERROR_MODEL_CLASSIFIER__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_CLASSIFIER__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Error Model Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Transitions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error Model Implementation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_IMPLEMENTATION_FEATURE_COUNT = ERROR_MODEL_CLASSIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorTransition()
	 * @generated
	 */
	int ERROR_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ORIGIN = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DESTINATION = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transition Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TRANSITION_ACTION = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Activation Trigger</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ACTIVATION_TRIGGER = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transition Trigger</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TRANSITION_TRIGGER = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Origin Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__ORIGIN_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Destination Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__DESTINATION_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Transition Action Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TRANSITION_ACTION_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Transition Trigger Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION__TRANSITION_TRIGGER_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Error Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl <em>Boolean Error Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getBooleanErrorExpression()
	 * @generated
	 */
	int BOOLEAN_ERROR_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Contained Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__TYPE = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Source Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numeric Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Boolean Error Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ERROR_EXPRESSION_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl <em>Error Annex Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorAnnexLibrary()
	 * @generated
	 */
	int ERROR_ANNEX_LIBRARY = 8;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__OWNED_ELEMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__OWNED_COMMENT = Aadl2Package.ANNEX_LIBRARY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__NAME = Aadl2Package.ANNEX_LIBRARY__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__QUALIFIED_NAME = Aadl2Package.ANNEX_LIBRARY__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_LIBRARY__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Error Model Classifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Annex Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_LIBRARY_FEATURE_COUNT = Aadl2Package.ANNEX_LIBRARY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl <em>Error Annex Sub Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorAnnexSubClause()
	 * @generated
	 */
	int ERROR_ANNEX_SUB_CLAUSE = 9;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__OWNED_ELEMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__OWNED_COMMENT = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__NAME = Aadl2Package.ANNEX_SUBCLAUSE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__QUALIFIED_NAME = Aadl2Package.ANNEX_SUBCLAUSE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.ANNEX_SUBCLAUSE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>In Mode</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__IN_MODE = Aadl2Package.ANNEX_SUBCLAUSE__IN_MODE;

	/**
	 * The feature id for the '<em><b>Error Model Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Annex Sub Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_ANNEX_SUB_CLAUSE_FEATURE_COUNT = Aadl2Package.ANNEX_SUBCLAUSE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl <em>Error Propagation Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorPropagationRule()
	 * @generated
	 */
	int ERROR_PROPAGATION_RULE = 10;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__MASK = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__ERROR_EXPRESSION = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Propagation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Propagation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE__ERROR_PROPAGATION = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Error Propagation Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPAGATION_RULE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl <em>Error Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelProperty()
	 * @generated
	 */
	int ERROR_MODEL_PROPERTY = 23;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROPERTY__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROPERTY__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROPERTY__APPLIES_TO = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROPERTY__APPLIES_TO_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_MODEL_PROPERTY_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl <em>Occurrence Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getOccurrenceProperty()
	 * @generated
	 */
	int OCCURRENCE_PROPERTY = 11;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__TYPE = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Non Standard Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__NON_STANDARD_ID = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameter List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__PARAMETER_LIST = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Event Or Propagation Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Applies To Error Event Or Propagation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Occurrence Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_PROPERTY_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl <em>Component Error Model Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getComponentErrorModelProperty()
	 * @generated
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY = 12;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Package Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Model Type Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error Model Implementation Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Error Model Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Inplace Error Model Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Component Error Model Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_ERROR_MODEL_PROPERTY_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl <em>Report Error Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getReportErrorProperty()
	 * @generated
	 */
	int REPORT_ERROR_PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>State And Propagation List</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error State Or Propagation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Report Error Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPORT_ERROR_PROPERTY_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl <em>Error Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorGuard()
	 * @generated
	 */
	int ERROR_GUARD = 28;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__APPLIES_TO_FEATURE_NAME = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD__APPLIES_TO_FEATURE = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Error Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_GUARD_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.InErrorPropagationGuardImpl <em>In Error Propagation Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.InErrorPropagationGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getInErrorPropagationGuard()
	 * @generated
	 */
	int IN_ERROR_PROPAGATION_GUARD = 14;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__OWNED_ELEMENT = ERROR_GUARD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__OWNED_COMMENT = ERROR_GUARD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__APPLIES_TO = ERROR_GUARD__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__APPLIES_TO_NAME = ERROR_GUARD__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__APPLIES_TO_FEATURE_NAME = ERROR_GUARD__APPLIES_TO_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__APPLIES_TO_FEATURE = ERROR_GUARD__APPLIES_TO_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Propagation Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE = ERROR_GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Error Propagation Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_ERROR_PROPAGATION_GUARD_FEATURE_COUNT = ERROR_GUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.PortEventGuardImpl <em>Port Event Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.PortEventGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getPortEventGuard()
	 * @generated
	 */
	int PORT_EVENT_GUARD = 15;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__OWNED_ELEMENT = ERROR_GUARD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__OWNED_COMMENT = ERROR_GUARD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__APPLIES_TO = ERROR_GUARD__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__APPLIES_TO_NAME = ERROR_GUARD__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__APPLIES_TO_FEATURE_NAME = ERROR_GUARD__APPLIES_TO_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__APPLIES_TO_FEATURE = ERROR_GUARD__APPLIES_TO_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD__ERROR_EXPRESSION = ERROR_GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Port Event Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_EVENT_GUARD_FEATURE_COUNT = ERROR_GUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl <em>Error Source Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorSourceName()
	 * @generated
	 */
	int ERROR_SOURCE_NAME = 16;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Component Name Or Feature Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error State Or Propagation Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error State Or Propagation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subcomponent Or Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Subcomponent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__SUBCOMPONENT_NAME = Aadl2Package.ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Context Subcomponent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT = Aadl2Package.ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Error Source Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_SOURCE_NAME_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.DerivedErrorStateMappingGuardImpl <em>Derived Error State Mapping Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.DerivedErrorStateMappingGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getDerivedErrorStateMappingGuard()
	 * @generated
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD = 17;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Error State Mapping Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Derived Error State Mapping Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_ERROR_STATE_MAPPING_GUARD_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl <em>Error State Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorStateMappingRule()
	 * @generated
	 */
	int ERROR_STATE_MAPPING_RULE = 18;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Component Error State Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Error State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE__ERROR_STATE = Aadl2Package.ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Error State Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_MAPPING_RULE_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateOrPropagationImpl <em>Error State Or Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateOrPropagationImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorStateOrPropagation()
	 * @generated
	 */
	int ERROR_STATE_OR_PROPAGATION = 19;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__OWNED_ELEMENT = ERROR_MODEL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__OWNED_COMMENT = ERROR_MODEL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__NAME = ERROR_MODEL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__QUALIFIED_NAME = ERROR_MODEL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION__OCCURRENCE_PROPERTY = ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY;

	/**
	 * The number of structural features of the '<em>Error State Or Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_STATE_OR_PROPAGATION_FEATURE_COUNT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionsImpl <em>Error Transitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionsImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorTransitions()
	 * @generated
	 */
	int ERROR_TRANSITIONS = 20;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITIONS__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITIONS__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Error Transition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITIONS__ERROR_TRANSITION = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Transitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_TRANSITIONS_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropertiesImpl <em>Error Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropertiesImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorProperties()
	 * @generated
	 */
	int ERROR_PROPERTIES = 21;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPERTIES__OWNED_ELEMENT = Aadl2Package.ELEMENT__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPERTIES__OWNED_COMMENT = Aadl2Package.ELEMENT__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPERTIES__OCCURRENCE_PROPERTY = Aadl2Package.ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Error Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_PROPERTIES_FEATURE_COUNT = Aadl2Package.ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ModelHierarchyPropertyImpl <em>Model Hierarchy Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ModelHierarchyPropertyImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModelHierarchyProperty()
	 * @generated
	 */
	int MODEL_HIERARCHY_PROPERTY = 22;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY__OWNED_ELEMENT = ERROR_MODEL_PROPERTY__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY__OWNED_COMMENT = ERROR_MODEL_PROPERTY__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY__APPLIES_TO = ERROR_MODEL_PROPERTY__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY__APPLIES_TO_NAME = ERROR_MODEL_PROPERTY__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Error Model Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Hierarchy Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_HIERARCHY_PROPERTY_FEATURE_COUNT = ERROR_MODEL_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl <em>Mode Transition Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModeTransitionGuard()
	 * @generated
	 */
	int MODE_TRANSITION_GUARD = 24;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__OWNED_ELEMENT = ERROR_GUARD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__OWNED_COMMENT = ERROR_GUARD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO = ERROR_GUARD__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO_NAME = ERROR_GUARD__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_NAME = ERROR_GUARD__APPLIES_TO_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE = ERROR_GUARD__APPLIES_TO_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__ERROR_EXPRESSION = ERROR_GUARD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Applies To Feature Context Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME = ERROR_GUARD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Applies To Mode Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION = ERROR_GUARD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mode Transition Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODE_TRANSITION_GUARD_FEATURE_COUNT = ERROR_GUARD_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.OutErrorPropagationGuardImpl <em>Out Error Propagation Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.OutErrorPropagationGuardImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getOutErrorPropagationGuard()
	 * @generated
	 */
	int OUT_ERROR_PROPAGATION_GUARD = 26;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__OWNED_ELEMENT = ERROR_GUARD__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__OWNED_COMMENT = ERROR_GUARD__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__APPLIES_TO = ERROR_GUARD__APPLIES_TO;

	/**
	 * The feature id for the '<em><b>Applies To Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__APPLIES_TO_NAME = ERROR_GUARD__APPLIES_TO_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__APPLIES_TO_FEATURE_NAME = ERROR_GUARD__APPLIES_TO_FEATURE_NAME;

	/**
	 * The feature id for the '<em><b>Applies To Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__APPLIES_TO_FEATURE = ERROR_GUARD__APPLIES_TO_FEATURE;

	/**
	 * The feature id for the '<em><b>Error Propagation Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE = ERROR_GUARD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Error Propagation Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_ERROR_PROPAGATION_GUARD_FEATURE_COUNT = ERROR_GUARD_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorEventOrPropagationImpl <em>Error Event Or Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorEventOrPropagationImpl
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorEventOrPropagation()
	 * @generated
	 */
	int ERROR_EVENT_OR_PROPAGATION = 27;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__OWNED_ELEMENT = ERROR_MODEL_FEATURE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__OWNED_COMMENT = ERROR_MODEL_FEATURE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__NAME = ERROR_MODEL_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__QUALIFIED_NAME = ERROR_MODEL_FEATURE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__OWNED_PROPERTY_ASSOCIATION = ERROR_MODEL_FEATURE__OWNED_PROPERTY_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Occurrence Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION__OCCURRENCE_PROPERTY = ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY;

	/**
	 * The number of structural features of the '<em>Error Event Or Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERROR_EVENT_OR_PROPAGATION_FEATURE_COUNT = ERROR_MODEL_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.DistributionName <em>Distribution Name</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.DistributionName
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getDistributionName()
	 * @generated
	 */
	int DISTRIBUTION_NAME = 29;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.BooleanExpressionType <em>Boolean Expression Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.BooleanExpressionType
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getBooleanExpressionType()
	 * @generated
	 */
	int BOOLEAN_EXPRESSION_TYPE = 30;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.TriggerType <em>Trigger Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.TriggerType
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getTriggerType()
	 * @generated
	 */
	int TRIGGER_TYPE = 31;

	/**
	 * The meta object id for the '{@link edu.cmu.sei.aadl.errorannex.ModelSelectionType <em>Model Selection Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.cmu.sei.aadl.errorannex.ModelSelectionType
	 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModelSelectionType()
	 * @generated
	 */
	int MODEL_SELECTION_TYPE = 32;


	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelType <em>Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelType
	 * @generated
	 */
	EClass getErrorModelType();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorModelType#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelType#getFeatures()
	 * @see #getErrorModelType()
	 * @generated
	 */
	EReference getErrorModelType_Features();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelFeature <em>Error Model Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Feature</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelFeature
	 * @generated
	 */
	EClass getErrorModelFeature();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ErrorModelFeature#getOccurrenceProperty <em>Occurrence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Occurrence Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelFeature#getOccurrenceProperty()
	 * @see #getErrorModelFeature()
	 * @generated
	 */
	EReference getErrorModelFeature_OccurrenceProperty();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorEvent
	 * @generated
	 */
	EClass getErrorEvent();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error State</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorState
	 * @generated
	 */
	EClass getErrorState();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorState#isInitial <em>Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorState#isInitial()
	 * @see #getErrorState()
	 * @generated
	 */
	EAttribute getErrorState_Initial();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorState#isInactive <em>Inactive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inactive</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorState#isInactive()
	 * @see #getErrorState()
	 * @generated
	 */
	EAttribute getErrorState_Inactive();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagation
	 * @generated
	 */
	EClass getErrorPropagation();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagation#isIn()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EAttribute getErrorPropagation_In();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation#isOut <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Out</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagation#isOut()
	 * @see #getErrorPropagation()
	 * @generated
	 */
	EAttribute getErrorPropagation_Out();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation <em>Error Model Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Implementation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelImplementation
	 * @generated
	 */
	EClass getErrorModelImplementation();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorModelType <em>Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Model Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorModelType()
	 * @see #getErrorModelImplementation()
	 * @generated
	 */
	EReference getErrorModelImplementation_ErrorModelType();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorTransitions <em>Error Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Transitions</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorTransitions()
	 * @see #getErrorModelImplementation()
	 * @generated
	 */
	EReference getErrorModelImplementation_ErrorTransitions();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorProperties <em>Error Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Properties</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelImplementation#getErrorProperties()
	 * @see #getErrorModelImplementation()
	 * @generated
	 */
	EReference getErrorModelImplementation_ErrorProperties();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Transition</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition
	 * @generated
	 */
	EClass getErrorTransition();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Origin</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getOrigin()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_Origin();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestination()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_Destination();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionAction <em>Transition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition Action</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionAction()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_TransitionAction();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getActivationTrigger <em>Activation Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Activation Trigger</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getActivationTrigger()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_ActivationTrigger();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTrigger <em>Transition Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transition Trigger</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTrigger()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EReference getErrorTransition_TransitionTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getOriginName <em>Origin Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Origin Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getOriginName()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_OriginName();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestinationName <em>Destination Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getDestinationName()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_DestinationName();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionActionName <em>Transition Action Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition Action Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionActionName()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_TransitionActionName();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTriggerName <em>Transition Trigger Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transition Trigger Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition#getTransitionTriggerName()
	 * @see #getErrorTransition()
	 * @generated
	 */
	EAttribute getErrorTransition_TransitionTriggerName();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression <em>Boolean Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Error Expression</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression
	 * @generated
	 */
	EClass getBooleanErrorExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getContainedExpressions <em>Contained Expressions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained Expressions</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getContainedExpressions()
	 * @see #getBooleanErrorExpression()
	 * @generated
	 */
	EReference getBooleanErrorExpression_ContainedExpressions();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getType()
	 * @see #getBooleanErrorExpression()
	 * @generated
	 */
	EAttribute getBooleanErrorExpression_Type();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getErrorSourceName <em>Error Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Source Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getErrorSourceName()
	 * @see #getBooleanErrorExpression()
	 * @generated
	 */
	EReference getBooleanErrorExpression_ErrorSourceName();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getNumericLiteral <em>Numeric Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric Literal</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression#getNumericLiteral()
	 * @see #getBooleanErrorExpression()
	 * @generated
	 */
	EAttribute getBooleanErrorExpression_NumericLiteral();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary <em>Error Annex Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Annex Library</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary
	 * @generated
	 */
	EClass getErrorAnnexLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary#getErrorModelClassifier <em>Error Model Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Model Classifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary#getErrorModelClassifier()
	 * @see #getErrorAnnexLibrary()
	 * @generated
	 */
	EReference getErrorAnnexLibrary_ErrorModelClassifier();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause <em>Error Annex Sub Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Annex Sub Clause</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause
	 * @generated
	 */
	EClass getErrorAnnexSubClause();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause#getErrorModelProperty <em>Error Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Model Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause#getErrorModelProperty()
	 * @see #getErrorAnnexSubClause()
	 * @generated
	 */
	EReference getErrorAnnexSubClause_ErrorModelProperty();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule <em>Error Propagation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Propagation Rule</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule
	 * @generated
	 */
	EClass getErrorPropagationRule();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#isMask <em>Mask</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mask</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#isMask()
	 * @see #getErrorPropagationRule()
	 * @generated
	 */
	EAttribute getErrorPropagationRule_Mask();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorExpression <em>Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Expression</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorExpression()
	 * @see #getErrorPropagationRule()
	 * @generated
	 */
	EReference getErrorPropagationRule_ErrorExpression();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagationIdentifier <em>Error Propagation Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Propagation Identifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagationIdentifier()
	 * @see #getErrorPropagationRule()
	 * @generated
	 */
	EAttribute getErrorPropagationRule_ErrorPropagationIdentifier();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule#getErrorPropagation()
	 * @see #getErrorPropagationRule()
	 * @generated
	 */
	EReference getErrorPropagationRule_ErrorPropagation();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty <em>Occurrence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty
	 * @generated
	 */
	EClass getOccurrenceProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getType()
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	EAttribute getOccurrenceProperty_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getNonStandardId <em>Non Standard Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Non Standard Id</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getNonStandardId()
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	EAttribute getOccurrenceProperty_NonStandardId();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Parameter List</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getParameterList()
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	EAttribute getOccurrenceProperty_ParameterList();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getEventOrPropagationName <em>Event Or Propagation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Or Propagation Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getEventOrPropagationName()
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	EAttribute getOccurrenceProperty_EventOrPropagationName();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getAppliesToErrorEventOrPropagation <em>Applies To Error Event Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Error Event Or Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty#getAppliesToErrorEventOrPropagation()
	 * @see #getOccurrenceProperty()
	 * @generated
	 */
	EReference getOccurrenceProperty_AppliesToErrorEventOrPropagation();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty <em>Component Error Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Error Model Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty
	 * @generated
	 */
	EClass getComponentErrorModelProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getPackageIdentifier <em>Package Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Identifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getPackageIdentifier()
	 * @see #getComponentErrorModelProperty()
	 * @generated
	 */
	EAttribute getComponentErrorModelProperty_PackageIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelTypeIdentifier <em>Error Model Type Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Model Type Identifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelTypeIdentifier()
	 * @see #getComponentErrorModelProperty()
	 * @generated
	 */
	EAttribute getComponentErrorModelProperty_ErrorModelTypeIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelImplementationIdentifier <em>Error Model Implementation Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Model Implementation Identifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelImplementationIdentifier()
	 * @see #getComponentErrorModelProperty()
	 * @generated
	 */
	EAttribute getComponentErrorModelProperty_ErrorModelImplementationIdentifier();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelClassifier <em>Error Model Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Model Classifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getErrorModelClassifier()
	 * @see #getComponentErrorModelProperty()
	 * @generated
	 */
	EReference getComponentErrorModelProperty_ErrorModelClassifier();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getInplaceErrorModelType <em>Inplace Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inplace Error Model Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty#getInplaceErrorModelType()
	 * @see #getComponentErrorModelProperty()
	 * @generated
	 */
	EReference getComponentErrorModelProperty_InplaceErrorModelType();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty <em>Report Error Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Report Error Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ReportErrorProperty
	 * @generated
	 */
	EClass getReportErrorProperty();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getStateAndPropagationList <em>State And Propagation List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>State And Propagation List</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getStateAndPropagationList()
	 * @see #getReportErrorProperty()
	 * @generated
	 */
	EAttribute getReportErrorProperty_StateAndPropagationList();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getErrorStateOrPropagation <em>Error State Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error State Or Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ReportErrorProperty#getErrorStateOrPropagation()
	 * @see #getReportErrorProperty()
	 * @generated
	 */
	EReference getReportErrorProperty_ErrorStateOrPropagation();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard <em>In Error Propagation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Error Propagation Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard
	 * @generated
	 */
	EClass getInErrorPropagationGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard#getErrorPropagationRule <em>Error Propagation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Propagation Rule</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard#getErrorPropagationRule()
	 * @see #getInErrorPropagationGuard()
	 * @generated
	 */
	EReference getInErrorPropagationGuard_ErrorPropagationRule();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.PortEventGuard <em>Port Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Event Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.PortEventGuard
	 * @generated
	 */
	EClass getPortEventGuard();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.PortEventGuard#getErrorExpression <em>Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Expression</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.PortEventGuard#getErrorExpression()
	 * @see #getPortEventGuard()
	 * @generated
	 */
	EReference getPortEventGuard_ErrorExpression();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName <em>Error Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Source Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName
	 * @generated
	 */
	EClass getErrorSourceName();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getComponentNameOrFeatureName <em>Component Name Or Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Name Or Feature Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getComponentNameOrFeatureName()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EAttribute getErrorSourceName_ComponentNameOrFeatureName();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagationName <em>Error State Or Propagation Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Error State Or Propagation Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagationName()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EAttribute getErrorSourceName_ErrorStateOrPropagationName();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagation <em>Error State Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Error State Or Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getErrorStateOrPropagation()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EReference getErrorSourceName_ErrorStateOrPropagation();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentOrFeature <em>Subcomponent Or Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Subcomponent Or Feature</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentOrFeature()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EReference getErrorSourceName_SubcomponentOrFeature();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentName <em>Subcomponent Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subcomponent Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getSubcomponentName()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EAttribute getErrorSourceName_SubcomponentName();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName#getContextSubcomponent <em>Context Subcomponent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Context Subcomponent</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName#getContextSubcomponent()
	 * @see #getErrorSourceName()
	 * @generated
	 */
	EReference getErrorSourceName_ContextSubcomponent();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard <em>Derived Error State Mapping Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Error State Mapping Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard
	 * @generated
	 */
	EClass getDerivedErrorStateMappingGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard#getErrorStateMappingRule <em>Error State Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error State Mapping Rule</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard#getErrorStateMappingRule()
	 * @see #getDerivedErrorStateMappingGuard()
	 * @generated
	 */
	EReference getDerivedErrorStateMappingGuard_ErrorStateMappingRule();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule <em>Error State Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error State Mapping Rule</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule
	 * @generated
	 */
	EClass getErrorStateMappingRule();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getComponentErrorStateIdentifier <em>Component Error State Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Component Error State Identifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getComponentErrorStateIdentifier()
	 * @see #getErrorStateMappingRule()
	 * @generated
	 */
	EAttribute getErrorStateMappingRule_ComponentErrorStateIdentifier();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getErrorExpression <em>Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Expression</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getErrorExpression()
	 * @see #getErrorStateMappingRule()
	 * @generated
	 */
	EReference getErrorStateMappingRule_ErrorExpression();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error State</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule#getErrorState()
	 * @see #getErrorStateMappingRule()
	 * @generated
	 */
	EReference getErrorStateMappingRule_ErrorState();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation <em>Error State Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error State Or Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation
	 * @generated
	 */
	EClass getErrorStateOrPropagation();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorTransitions <em>Error Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Transitions</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransitions
	 * @generated
	 */
	EClass getErrorTransitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorTransitions#getErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Transition</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransitions#getErrorTransition()
	 * @see #getErrorTransitions()
	 * @generated
	 */
	EReference getErrorTransitions_ErrorTransition();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorProperties <em>Error Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Properties</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorProperties
	 * @generated
	 */
	EClass getErrorProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorProperties#getOccurrenceProperty <em>Occurrence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrence Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorProperties#getOccurrenceProperty()
	 * @see #getErrorProperties()
	 * @generated
	 */
	EReference getErrorProperties_OccurrenceProperty();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty <em>Model Hierarchy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Hierarchy Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty
	 * @generated
	 */
	EClass getModelHierarchyProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty#getErrorModelSelection <em>Error Model Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Model Selection</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty#getErrorModelSelection()
	 * @see #getModelHierarchyProperty()
	 * @generated
	 */
	EAttribute getModelHierarchyProperty_ErrorModelSelection();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty <em>Error Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Property</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelProperty
	 * @generated
	 */
	EClass getErrorModelProperty();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesTo()
	 * @see #getErrorModelProperty()
	 * @generated
	 */
	EReference getErrorModelProperty_AppliesTo();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesToName <em>Applies To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applies To Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelProperty#getAppliesToName()
	 * @see #getErrorModelProperty()
	 * @generated
	 */
	EAttribute getErrorModelProperty_AppliesToName();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard <em>Mode Transition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mode Transition Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModeTransitionGuard
	 * @generated
	 */
	EClass getModeTransitionGuard();

	/**
	 * Returns the meta object for the containment reference '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getErrorExpression <em>Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Expression</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getErrorExpression()
	 * @see #getModeTransitionGuard()
	 * @generated
	 */
	EReference getModeTransitionGuard_ErrorExpression();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToFeatureContextName <em>Applies To Feature Context Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applies To Feature Context Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToFeatureContextName()
	 * @see #getModeTransitionGuard()
	 * @generated
	 */
	EAttribute getModeTransitionGuard_AppliesToFeatureContextName();

	/**
	 * Returns the meta object for the reference '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToModeTransition <em>Applies To Mode Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Applies To Mode Transition</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModeTransitionGuard#getAppliesToModeTransition()
	 * @see #getModeTransitionGuard()
	 * @generated
	 */
	EReference getModeTransitionGuard_AppliesToModeTransition();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelClassifier <em>Error Model Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Model Classifier</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelClassifier
	 * @generated
	 */
	EClass getErrorModelClassifier();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard <em>Out Error Propagation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Error Propagation Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard
	 * @generated
	 */
	EClass getOutErrorPropagationGuard();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard#getErrorPropagationRule <em>Error Propagation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Propagation Rule</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard#getErrorPropagationRule()
	 * @see #getOutErrorPropagationGuard()
	 * @generated
	 */
	EReference getOutErrorPropagationGuard_ErrorPropagationRule();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation <em>Error Event Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Event Or Propagation</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation
	 * @generated
	 */
	EClass getErrorEventOrPropagation();

	/**
	 * Returns the meta object for class '{@link edu.cmu.sei.aadl.errorannex.ErrorGuard <em>Error Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Error Guard</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorGuard
	 * @generated
	 */
	EClass getErrorGuard();

	/**
	 * Returns the meta object for the attribute list '{@link edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeatureName <em>Applies To Feature Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Applies To Feature Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeatureName()
	 * @see #getErrorGuard()
	 * @generated
	 */
	EAttribute getErrorGuard_AppliesToFeatureName();

	/**
	 * Returns the meta object for the reference list '{@link edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeature <em>Applies To Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To Feature</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorGuard#getAppliesToFeature()
	 * @see #getErrorGuard()
	 * @generated
	 */
	EReference getErrorGuard_AppliesToFeature();

	/**
	 * Returns the meta object for enum '{@link edu.cmu.sei.aadl.errorannex.DistributionName <em>Distribution Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Distribution Name</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.DistributionName
	 * @generated
	 */
	EEnum getDistributionName();

	/**
	 * Returns the meta object for enum '{@link edu.cmu.sei.aadl.errorannex.BooleanExpressionType <em>Boolean Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Expression Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanExpressionType
	 * @generated
	 */
	EEnum getBooleanExpressionType();

	/**
	 * Returns the meta object for enum '{@link edu.cmu.sei.aadl.errorannex.TriggerType <em>Trigger Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trigger Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.TriggerType
	 * @generated
	 */
	EEnum getTriggerType();

	/**
	 * Returns the meta object for enum '{@link edu.cmu.sei.aadl.errorannex.ModelSelectionType <em>Model Selection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Model Selection Type</em>'.
	 * @see edu.cmu.sei.aadl.errorannex.ModelSelectionType
	 * @generated
	 */
	EEnum getModelSelectionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ErrorannexFactory getErrorannexFactory();

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
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelTypeImpl <em>Error Model Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelTypeImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelType()
		 * @generated
		 */
		EClass ERROR_MODEL_TYPE = eINSTANCE.getErrorModelType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_TYPE__FEATURES = eINSTANCE.getErrorModelType_Features();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelFeatureImpl <em>Error Model Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelFeatureImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelFeature()
		 * @generated
		 */
		EClass ERROR_MODEL_FEATURE = eINSTANCE.getErrorModelFeature();

		/**
		 * The meta object literal for the '<em><b>Occurrence Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY = eINSTANCE.getErrorModelFeature_OccurrenceProperty();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorEventImpl <em>Error Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorEventImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorEvent()
		 * @generated
		 */
		EClass ERROR_EVENT = eINSTANCE.getErrorEvent();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateImpl <em>Error State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorState()
		 * @generated
		 */
		EClass ERROR_STATE = eINSTANCE.getErrorState();

		/**
		 * The meta object literal for the '<em><b>Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_STATE__INITIAL = eINSTANCE.getErrorState_Initial();

		/**
		 * The meta object literal for the '<em><b>Inactive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_STATE__INACTIVE = eINSTANCE.getErrorState_Inactive();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationImpl <em>Error Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorPropagation()
		 * @generated
		 */
		EClass ERROR_PROPAGATION = eINSTANCE.getErrorPropagation();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION__IN = eINSTANCE.getErrorPropagation_In();

		/**
		 * The meta object literal for the '<em><b>Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION__OUT = eINSTANCE.getErrorPropagation_Out();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl <em>Error Model Implementation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelImplementation()
		 * @generated
		 */
		EClass ERROR_MODEL_IMPLEMENTATION = eINSTANCE.getErrorModelImplementation();

		/**
		 * The meta object literal for the '<em><b>Error Model Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE = eINSTANCE.getErrorModelImplementation_ErrorModelType();

		/**
		 * The meta object literal for the '<em><b>Error Transitions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS = eINSTANCE.getErrorModelImplementation_ErrorTransitions();

		/**
		 * The meta object literal for the '<em><b>Error Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES = eINSTANCE.getErrorModelImplementation_ErrorProperties();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl <em>Error Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorTransition()
		 * @generated
		 */
		EClass ERROR_TRANSITION = eINSTANCE.getErrorTransition();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__ORIGIN = eINSTANCE.getErrorTransition_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__DESTINATION = eINSTANCE.getErrorTransition_Destination();

		/**
		 * The meta object literal for the '<em><b>Transition Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__TRANSITION_ACTION = eINSTANCE.getErrorTransition_TransitionAction();

		/**
		 * The meta object literal for the '<em><b>Activation Trigger</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__ACTIVATION_TRIGGER = eINSTANCE.getErrorTransition_ActivationTrigger();

		/**
		 * The meta object literal for the '<em><b>Transition Trigger</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITION__TRANSITION_TRIGGER = eINSTANCE.getErrorTransition_TransitionTrigger();

		/**
		 * The meta object literal for the '<em><b>Origin Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__ORIGIN_NAME = eINSTANCE.getErrorTransition_OriginName();

		/**
		 * The meta object literal for the '<em><b>Destination Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__DESTINATION_NAME = eINSTANCE.getErrorTransition_DestinationName();

		/**
		 * The meta object literal for the '<em><b>Transition Action Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__TRANSITION_ACTION_NAME = eINSTANCE.getErrorTransition_TransitionActionName();

		/**
		 * The meta object literal for the '<em><b>Transition Trigger Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_TRANSITION__TRANSITION_TRIGGER_NAME = eINSTANCE.getErrorTransition_TransitionTriggerName();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl <em>Boolean Error Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.BooleanErrorExpressionImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getBooleanErrorExpression()
		 * @generated
		 */
		EClass BOOLEAN_ERROR_EXPRESSION = eINSTANCE.getBooleanErrorExpression();

		/**
		 * The meta object literal for the '<em><b>Contained Expressions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS = eINSTANCE.getBooleanErrorExpression_ContainedExpressions();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ERROR_EXPRESSION__TYPE = eINSTANCE.getBooleanErrorExpression_Type();

		/**
		 * The meta object literal for the '<em><b>Error Source Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME = eINSTANCE.getBooleanErrorExpression_ErrorSourceName();

		/**
		 * The meta object literal for the '<em><b>Numeric Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL = eINSTANCE.getBooleanErrorExpression_NumericLiteral();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl <em>Error Annex Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorAnnexLibrary()
		 * @generated
		 */
		EClass ERROR_ANNEX_LIBRARY = eINSTANCE.getErrorAnnexLibrary();

		/**
		 * The meta object literal for the '<em><b>Error Model Classifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER = eINSTANCE.getErrorAnnexLibrary_ErrorModelClassifier();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl <em>Error Annex Sub Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorAnnexSubClause()
		 * @generated
		 */
		EClass ERROR_ANNEX_SUB_CLAUSE = eINSTANCE.getErrorAnnexSubClause();

		/**
		 * The meta object literal for the '<em><b>Error Model Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY = eINSTANCE.getErrorAnnexSubClause_ErrorModelProperty();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl <em>Error Propagation Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropagationRuleImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorPropagationRule()
		 * @generated
		 */
		EClass ERROR_PROPAGATION_RULE = eINSTANCE.getErrorPropagationRule();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION_RULE__MASK = eINSTANCE.getErrorPropagationRule_Mask();

		/**
		 * The meta object literal for the '<em><b>Error Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION_RULE__ERROR_EXPRESSION = eINSTANCE.getErrorPropagationRule_ErrorExpression();

		/**
		 * The meta object literal for the '<em><b>Error Propagation Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER = eINSTANCE.getErrorPropagationRule_ErrorPropagationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Propagation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPAGATION_RULE__ERROR_PROPAGATION = eINSTANCE.getErrorPropagationRule_ErrorPropagation();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl <em>Occurrence Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.OccurrencePropertyImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getOccurrenceProperty()
		 * @generated
		 */
		EClass OCCURRENCE_PROPERTY = eINSTANCE.getOccurrenceProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PROPERTY__TYPE = eINSTANCE.getOccurrenceProperty_Type();

		/**
		 * The meta object literal for the '<em><b>Non Standard Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PROPERTY__NON_STANDARD_ID = eINSTANCE.getOccurrenceProperty_NonStandardId();

		/**
		 * The meta object literal for the '<em><b>Parameter List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PROPERTY__PARAMETER_LIST = eINSTANCE.getOccurrenceProperty_ParameterList();

		/**
		 * The meta object literal for the '<em><b>Event Or Propagation Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME = eINSTANCE.getOccurrenceProperty_EventOrPropagationName();

		/**
		 * The meta object literal for the '<em><b>Applies To Error Event Or Propagation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION = eINSTANCE.getOccurrenceProperty_AppliesToErrorEventOrPropagation();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl <em>Component Error Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ComponentErrorModelPropertyImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getComponentErrorModelProperty()
		 * @generated
		 */
		EClass COMPONENT_ERROR_MODEL_PROPERTY = eINSTANCE.getComponentErrorModelProperty();

		/**
		 * The meta object literal for the '<em><b>Package Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER = eINSTANCE.getComponentErrorModelProperty_PackageIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Model Type Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER = eINSTANCE.getComponentErrorModelProperty_ErrorModelTypeIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Model Implementation Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER = eINSTANCE.getComponentErrorModelProperty_ErrorModelImplementationIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Model Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER = eINSTANCE.getComponentErrorModelProperty_ErrorModelClassifier();

		/**
		 * The meta object literal for the '<em><b>Inplace Error Model Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE = eINSTANCE.getComponentErrorModelProperty_InplaceErrorModelType();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl <em>Report Error Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ReportErrorPropertyImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getReportErrorProperty()
		 * @generated
		 */
		EClass REPORT_ERROR_PROPERTY = eINSTANCE.getReportErrorProperty();

		/**
		 * The meta object literal for the '<em><b>State And Propagation List</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST = eINSTANCE.getReportErrorProperty_StateAndPropagationList();

		/**
		 * The meta object literal for the '<em><b>Error State Or Propagation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION = eINSTANCE.getReportErrorProperty_ErrorStateOrPropagation();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.InErrorPropagationGuardImpl <em>In Error Propagation Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.InErrorPropagationGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getInErrorPropagationGuard()
		 * @generated
		 */
		EClass IN_ERROR_PROPAGATION_GUARD = eINSTANCE.getInErrorPropagationGuard();

		/**
		 * The meta object literal for the '<em><b>Error Propagation Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE = eINSTANCE.getInErrorPropagationGuard_ErrorPropagationRule();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.PortEventGuardImpl <em>Port Event Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.PortEventGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getPortEventGuard()
		 * @generated
		 */
		EClass PORT_EVENT_GUARD = eINSTANCE.getPortEventGuard();

		/**
		 * The meta object literal for the '<em><b>Error Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_EVENT_GUARD__ERROR_EXPRESSION = eINSTANCE.getPortEventGuard_ErrorExpression();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl <em>Error Source Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorSourceNameImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorSourceName()
		 * @generated
		 */
		EClass ERROR_SOURCE_NAME = eINSTANCE.getErrorSourceName();

		/**
		 * The meta object literal for the '<em><b>Component Name Or Feature Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME = eINSTANCE.getErrorSourceName_ComponentNameOrFeatureName();

		/**
		 * The meta object literal for the '<em><b>Error State Or Propagation Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME = eINSTANCE.getErrorSourceName_ErrorStateOrPropagationName();

		/**
		 * The meta object literal for the '<em><b>Error State Or Propagation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION = eINSTANCE.getErrorSourceName_ErrorStateOrPropagation();

		/**
		 * The meta object literal for the '<em><b>Subcomponent Or Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE = eINSTANCE.getErrorSourceName_SubcomponentOrFeature();

		/**
		 * The meta object literal for the '<em><b>Subcomponent Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_SOURCE_NAME__SUBCOMPONENT_NAME = eINSTANCE.getErrorSourceName_SubcomponentName();

		/**
		 * The meta object literal for the '<em><b>Context Subcomponent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT = eINSTANCE.getErrorSourceName_ContextSubcomponent();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.DerivedErrorStateMappingGuardImpl <em>Derived Error State Mapping Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.DerivedErrorStateMappingGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getDerivedErrorStateMappingGuard()
		 * @generated
		 */
		EClass DERIVED_ERROR_STATE_MAPPING_GUARD = eINSTANCE.getDerivedErrorStateMappingGuard();

		/**
		 * The meta object literal for the '<em><b>Error State Mapping Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE = eINSTANCE.getDerivedErrorStateMappingGuard_ErrorStateMappingRule();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl <em>Error State Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateMappingRuleImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorStateMappingRule()
		 * @generated
		 */
		EClass ERROR_STATE_MAPPING_RULE = eINSTANCE.getErrorStateMappingRule();

		/**
		 * The meta object literal for the '<em><b>Component Error State Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER = eINSTANCE.getErrorStateMappingRule_ComponentErrorStateIdentifier();

		/**
		 * The meta object literal for the '<em><b>Error Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION = eINSTANCE.getErrorStateMappingRule_ErrorExpression();

		/**
		 * The meta object literal for the '<em><b>Error State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_STATE_MAPPING_RULE__ERROR_STATE = eINSTANCE.getErrorStateMappingRule_ErrorState();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorStateOrPropagationImpl <em>Error State Or Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorStateOrPropagationImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorStateOrPropagation()
		 * @generated
		 */
		EClass ERROR_STATE_OR_PROPAGATION = eINSTANCE.getErrorStateOrPropagation();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionsImpl <em>Error Transitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorTransitionsImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorTransitions()
		 * @generated
		 */
		EClass ERROR_TRANSITIONS = eINSTANCE.getErrorTransitions();

		/**
		 * The meta object literal for the '<em><b>Error Transition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_TRANSITIONS__ERROR_TRANSITION = eINSTANCE.getErrorTransitions_ErrorTransition();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorPropertiesImpl <em>Error Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorPropertiesImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorProperties()
		 * @generated
		 */
		EClass ERROR_PROPERTIES = eINSTANCE.getErrorProperties();

		/**
		 * The meta object literal for the '<em><b>Occurrence Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_PROPERTIES__OCCURRENCE_PROPERTY = eINSTANCE.getErrorProperties_OccurrenceProperty();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ModelHierarchyPropertyImpl <em>Model Hierarchy Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ModelHierarchyPropertyImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModelHierarchyProperty()
		 * @generated
		 */
		EClass MODEL_HIERARCHY_PROPERTY = eINSTANCE.getModelHierarchyProperty();

		/**
		 * The meta object literal for the '<em><b>Error Model Selection</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION = eINSTANCE.getModelHierarchyProperty_ErrorModelSelection();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl <em>Error Model Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelPropertyImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelProperty()
		 * @generated
		 */
		EClass ERROR_MODEL_PROPERTY = eINSTANCE.getErrorModelProperty();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_MODEL_PROPERTY__APPLIES_TO = eINSTANCE.getErrorModelProperty_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Applies To Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_MODEL_PROPERTY__APPLIES_TO_NAME = eINSTANCE.getErrorModelProperty_AppliesToName();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl <em>Mode Transition Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ModeTransitionGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModeTransitionGuard()
		 * @generated
		 */
		EClass MODE_TRANSITION_GUARD = eINSTANCE.getModeTransitionGuard();

		/**
		 * The meta object literal for the '<em><b>Error Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_GUARD__ERROR_EXPRESSION = eINSTANCE.getModeTransitionGuard_ErrorExpression();

		/**
		 * The meta object literal for the '<em><b>Applies To Feature Context Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME = eINSTANCE.getModeTransitionGuard_AppliesToFeatureContextName();

		/**
		 * The meta object literal for the '<em><b>Applies To Mode Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION = eINSTANCE.getModeTransitionGuard_AppliesToModeTransition();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelClassifierImpl <em>Error Model Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorModelClassifierImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorModelClassifier()
		 * @generated
		 */
		EClass ERROR_MODEL_CLASSIFIER = eINSTANCE.getErrorModelClassifier();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.OutErrorPropagationGuardImpl <em>Out Error Propagation Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.OutErrorPropagationGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getOutErrorPropagationGuard()
		 * @generated
		 */
		EClass OUT_ERROR_PROPAGATION_GUARD = eINSTANCE.getOutErrorPropagationGuard();

		/**
		 * The meta object literal for the '<em><b>Error Propagation Rule</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE = eINSTANCE.getOutErrorPropagationGuard_ErrorPropagationRule();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorEventOrPropagationImpl <em>Error Event Or Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorEventOrPropagationImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorEventOrPropagation()
		 * @generated
		 */
		EClass ERROR_EVENT_OR_PROPAGATION = eINSTANCE.getErrorEventOrPropagation();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl <em>Error Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorGuardImpl
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getErrorGuard()
		 * @generated
		 */
		EClass ERROR_GUARD = eINSTANCE.getErrorGuard();

		/**
		 * The meta object literal for the '<em><b>Applies To Feature Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERROR_GUARD__APPLIES_TO_FEATURE_NAME = eINSTANCE.getErrorGuard_AppliesToFeatureName();

		/**
		 * The meta object literal for the '<em><b>Applies To Feature</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ERROR_GUARD__APPLIES_TO_FEATURE = eINSTANCE.getErrorGuard_AppliesToFeature();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.DistributionName <em>Distribution Name</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.DistributionName
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getDistributionName()
		 * @generated
		 */
		EEnum DISTRIBUTION_NAME = eINSTANCE.getDistributionName();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.BooleanExpressionType <em>Boolean Expression Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.BooleanExpressionType
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getBooleanExpressionType()
		 * @generated
		 */
		EEnum BOOLEAN_EXPRESSION_TYPE = eINSTANCE.getBooleanExpressionType();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.TriggerType <em>Trigger Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.TriggerType
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getTriggerType()
		 * @generated
		 */
		EEnum TRIGGER_TYPE = eINSTANCE.getTriggerType();

		/**
		 * The meta object literal for the '{@link edu.cmu.sei.aadl.errorannex.ModelSelectionType <em>Model Selection Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.cmu.sei.aadl.errorannex.ModelSelectionType
		 * @see edu.cmu.sei.aadl.errorannex.impl.ErrorannexPackageImpl#getModelSelectionType()
		 * @generated
		 */
		EEnum MODEL_SELECTION_TYPE = eINSTANCE.getModelSelectionType();

	}

} //ErrorannexPackage
