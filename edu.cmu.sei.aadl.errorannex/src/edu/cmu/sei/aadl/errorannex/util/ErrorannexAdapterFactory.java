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
 * @version $Id: ErrorannexAdapterFactory.java,v 1.1.4.1 2011-05-04 21:23:10 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.util;

import edu.cmu.sei.aadl.errorannex.*;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModalElement;
import org.osate.aadl2.NamedElement;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorGuard;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorProperties;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage
 * @generated
 */
public class ErrorannexAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErrorannexPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ErrorannexPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorannexSwitch modelSwitch =
		new ErrorannexSwitch() {
			public Object caseErrorModelType(ErrorModelType object) {
				return createErrorModelTypeAdapter();
			}
			public Object caseErrorModelFeature(ErrorModelFeature object) {
				return createErrorModelFeatureAdapter();
			}
			public Object caseErrorEvent(ErrorEvent object) {
				return createErrorEventAdapter();
			}
			public Object caseErrorState(ErrorState object) {
				return createErrorStateAdapter();
			}
			public Object caseErrorPropagation(ErrorPropagation object) {
				return createErrorPropagationAdapter();
			}
			public Object caseErrorModelImplementation(ErrorModelImplementation object) {
				return createErrorModelImplementationAdapter();
			}
			public Object caseErrorTransition(ErrorTransition object) {
				return createErrorTransitionAdapter();
			}
			public Object caseBooleanErrorExpression(BooleanErrorExpression object) {
				return createBooleanErrorExpressionAdapter();
			}
			public Object caseErrorAnnexLibrary(ErrorAnnexLibrary object) {
				return createErrorAnnexLibraryAdapter();
			}
			public Object caseErrorAnnexSubClause(ErrorAnnexSubClause object) {
				return createErrorAnnexSubClauseAdapter();
			}
			public Object caseErrorPropagationRule(ErrorPropagationRule object) {
				return createErrorPropagationRuleAdapter();
			}
			public Object caseOccurrenceProperty(OccurrenceProperty object) {
				return createOccurrencePropertyAdapter();
			}
			public Object caseComponentErrorModelProperty(ComponentErrorModelProperty object) {
				return createComponentErrorModelPropertyAdapter();
			}
			public Object caseReportErrorProperty(ReportErrorProperty object) {
				return createReportErrorPropertyAdapter();
			}
			public Object caseInErrorPropagationGuard(InErrorPropagationGuard object) {
				return createInErrorPropagationGuardAdapter();
			}
			public Object casePortEventGuard(PortEventGuard object) {
				return createPortEventGuardAdapter();
			}
			public Object caseErrorSourceName(ErrorSourceName object) {
				return createErrorSourceNameAdapter();
			}
			public Object caseDerivedErrorStateMappingGuard(DerivedErrorStateMappingGuard object) {
				return createDerivedErrorStateMappingGuardAdapter();
			}
			public Object caseErrorStateMappingRule(ErrorStateMappingRule object) {
				return createErrorStateMappingRuleAdapter();
			}
			public Object caseErrorStateOrPropagation(ErrorStateOrPropagation object) {
				return createErrorStateOrPropagationAdapter();
			}
			public Object caseErrorTransitions(ErrorTransitions object) {
				return createErrorTransitionsAdapter();
			}
			public Object caseErrorProperties(ErrorProperties object) {
				return createErrorPropertiesAdapter();
			}
			public Object caseModelHierarchyProperty(ModelHierarchyProperty object) {
				return createModelHierarchyPropertyAdapter();
			}
			public Object caseErrorModelProperty(ErrorModelProperty object) {
				return createErrorModelPropertyAdapter();
			}
			public Object caseModeTransitionGuard(ModeTransitionGuard object) {
				return createModeTransitionGuardAdapter();
			}
			public Object caseErrorModelClassifier(ErrorModelClassifier object) {
				return createErrorModelClassifierAdapter();
			}
			public Object caseOutErrorPropagationGuard(OutErrorPropagationGuard object) {
				return createOutErrorPropagationGuardAdapter();
			}
			public Object caseErrorEventOrPropagation(ErrorEventOrPropagation object) {
				return createErrorEventOrPropagationAdapter();
			}
			public Object caseErrorGuard(ErrorGuard object) {
				return createErrorGuardAdapter();
			}
			public Object caseElement(Element object) {
				return createElementAdapter();
			}
			public Object caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			public Object caseAnnexLibrary(AnnexLibrary object) {
				return createAnnexLibraryAdapter();
			}
			public Object caseModalElement(ModalElement object) {
				return createModalElementAdapter();
			}
			public Object caseAnnexSubclause(AnnexSubclause object) {
				return createAnnexSubclauseAdapter();
			}
			public Object defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelType <em>Error Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelType
	 * @generated
	 */
	public Adapter createErrorModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelFeature <em>Error Model Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelFeature
	 * @generated
	 */
	public Adapter createErrorModelFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorEvent <em>Error Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorEvent
	 * @generated
	 */
	public Adapter createErrorEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorState <em>Error State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorState
	 * @generated
	 */
	public Adapter createErrorStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagation <em>Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagation
	 * @generated
	 */
	public Adapter createErrorPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelImplementation <em>Error Model Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelImplementation
	 * @generated
	 */
	public Adapter createErrorModelImplementationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorTransition <em>Error Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransition
	 * @generated
	 */
	public Adapter createErrorTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.BooleanErrorExpression <em>Boolean Error Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.BooleanErrorExpression
	 * @generated
	 */
	public Adapter createBooleanErrorExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary <em>Error Annex Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary
	 * @generated
	 */
	public Adapter createErrorAnnexLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause <em>Error Annex Sub Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause
	 * @generated
	 */
	public Adapter createErrorAnnexSubClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorPropagationRule <em>Error Propagation Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorPropagationRule
	 * @generated
	 */
	public Adapter createErrorPropagationRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.OccurrenceProperty <em>Occurrence Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.OccurrenceProperty
	 * @generated
	 */
	public Adapter createOccurrencePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty <em>Component Error Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty
	 * @generated
	 */
	public Adapter createComponentErrorModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ReportErrorProperty <em>Report Error Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ReportErrorProperty
	 * @generated
	 */
	public Adapter createReportErrorPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard <em>In Error Propagation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard
	 * @generated
	 */
	public Adapter createInErrorPropagationGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.PortEventGuard <em>Port Event Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.PortEventGuard
	 * @generated
	 */
	public Adapter createPortEventGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorSourceName <em>Error Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorSourceName
	 * @generated
	 */
	public Adapter createErrorSourceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard <em>Derived Error State Mapping Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard
	 * @generated
	 */
	public Adapter createDerivedErrorStateMappingGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule <em>Error State Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule
	 * @generated
	 */
	public Adapter createErrorStateMappingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation <em>Error State Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorStateOrPropagation
	 * @generated
	 */
	public Adapter createErrorStateOrPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorTransitions <em>Error Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorTransitions
	 * @generated
	 */
	public Adapter createErrorTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorProperties <em>Error Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorProperties
	 * @generated
	 */
	public Adapter createErrorPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty <em>Model Hierarchy Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty
	 * @generated
	 */
	public Adapter createModelHierarchyPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelProperty <em>Error Model Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelProperty
	 * @generated
	 */
	public Adapter createErrorModelPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ModeTransitionGuard <em>Mode Transition Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ModeTransitionGuard
	 * @generated
	 */
	public Adapter createModeTransitionGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorModelClassifier <em>Error Model Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorModelClassifier
	 * @generated
	 */
	public Adapter createErrorModelClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard <em>Out Error Propagation Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard
	 * @generated
	 */
	public Adapter createOutErrorPropagationGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation <em>Error Event Or Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation
	 * @generated
	 */
	public Adapter createErrorEventOrPropagationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.cmu.sei.aadl.errorannex.ErrorGuard <em>Error Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.cmu.sei.aadl.errorannex.ErrorGuard
	 * @generated
	 */
	public Adapter createErrorGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadl2.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadl2.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadl2.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadl2.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexLibrary <em>Annex Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadl2.AnnexLibrary
	 * @generated
	 */
	public Adapter createAnnexLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadl2.ModalElement <em>Modal Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadl2.ModalElement
	 * @generated
	 */
	public Adapter createModalElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.osate.aadl2.AnnexSubclause <em>Annex Subclause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.osate.aadl2.AnnexSubclause
	 * @generated
	 */
	public Adapter createAnnexSubclauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ErrorannexAdapterFactory
