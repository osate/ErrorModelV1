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
 * @version $Id: ErrorannexFactoryImpl.java,v 1.2.2.1 2011-05-04 21:23:07 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import edu.cmu.sei.aadl.errorannex.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.DistributionName;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorProperties;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.cmu.sei.aadl.errorannex.ErrorannexFactory;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.ModelSelectionType;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;
import edu.cmu.sei.aadl.errorannex.TriggerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorannexFactoryImpl extends EFactoryImpl implements ErrorannexFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ErrorannexFactory init() {
		try {
			ErrorannexFactory theErrorannexFactory = (ErrorannexFactory)EPackage.Registry.INSTANCE.getEFactory("http://AADL/errorannex"); 
			if (theErrorannexFactory != null) {
				return theErrorannexFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ErrorannexFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ErrorannexPackage.ERROR_MODEL_TYPE: return (EObject)createErrorModelType();
			case ErrorannexPackage.ERROR_EVENT: return (EObject)createErrorEvent();
			case ErrorannexPackage.ERROR_STATE: return (EObject)createErrorState();
			case ErrorannexPackage.ERROR_PROPAGATION: return (EObject)createErrorPropagation();
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION: return (EObject)createErrorModelImplementation();
			case ErrorannexPackage.ERROR_TRANSITION: return (EObject)createErrorTransition();
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION: return (EObject)createBooleanErrorExpression();
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY: return (EObject)createErrorAnnexLibrary();
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE: return (EObject)createErrorAnnexSubClause();
			case ErrorannexPackage.ERROR_PROPAGATION_RULE: return (EObject)createErrorPropagationRule();
			case ErrorannexPackage.OCCURRENCE_PROPERTY: return (EObject)createOccurrenceProperty();
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY: return (EObject)createComponentErrorModelProperty();
			case ErrorannexPackage.REPORT_ERROR_PROPERTY: return (EObject)createReportErrorProperty();
			case ErrorannexPackage.IN_ERROR_PROPAGATION_GUARD: return (EObject)createInErrorPropagationGuard();
			case ErrorannexPackage.PORT_EVENT_GUARD: return (EObject)createPortEventGuard();
			case ErrorannexPackage.ERROR_SOURCE_NAME: return (EObject)createErrorSourceName();
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD: return (EObject)createDerivedErrorStateMappingGuard();
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE: return (EObject)createErrorStateMappingRule();
			case ErrorannexPackage.ERROR_TRANSITIONS: return (EObject)createErrorTransitions();
			case ErrorannexPackage.ERROR_PROPERTIES: return (EObject)createErrorProperties();
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY: return (EObject)createModelHierarchyProperty();
			case ErrorannexPackage.MODE_TRANSITION_GUARD: return (EObject)createModeTransitionGuard();
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD: return (EObject)createOutErrorPropagationGuard();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ErrorannexPackage.DISTRIBUTION_NAME:
				return createDistributionNameFromString(eDataType, initialValue);
			case ErrorannexPackage.BOOLEAN_EXPRESSION_TYPE:
				return createBooleanExpressionTypeFromString(eDataType, initialValue);
			case ErrorannexPackage.TRIGGER_TYPE:
				return createTriggerTypeFromString(eDataType, initialValue);
			case ErrorannexPackage.MODEL_SELECTION_TYPE:
				return createModelSelectionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ErrorannexPackage.DISTRIBUTION_NAME:
				return convertDistributionNameToString(eDataType, instanceValue);
			case ErrorannexPackage.BOOLEAN_EXPRESSION_TYPE:
				return convertBooleanExpressionTypeToString(eDataType, instanceValue);
			case ErrorannexPackage.TRIGGER_TYPE:
				return convertTriggerTypeToString(eDataType, instanceValue);
			case ErrorannexPackage.MODEL_SELECTION_TYPE:
				return convertModelSelectionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType createErrorModelType() {
		ErrorModelTypeImpl errorModelType = new ErrorModelTypeImpl();
		return errorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEvent createErrorEvent() {
		ErrorEventImpl errorEvent = new ErrorEventImpl();
		return errorEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorState createErrorState() {
		ErrorStateImpl errorState = new ErrorStateImpl();
		return errorState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagation createErrorPropagation() {
		ErrorPropagationImpl errorPropagation = new ErrorPropagationImpl();
		return errorPropagation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelImplementation createErrorModelImplementation() {
		ErrorModelImplementationImpl errorModelImplementation = new ErrorModelImplementationImpl();
		return errorModelImplementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransition createErrorTransition() {
		ErrorTransitionImpl errorTransition = new ErrorTransitionImpl();
		return errorTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanErrorExpression createBooleanErrorExpression() {
		BooleanErrorExpressionImpl booleanErrorExpression = new BooleanErrorExpressionImpl();
		return booleanErrorExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorAnnexLibrary createErrorAnnexLibrary() {
		ErrorAnnexLibraryImpl errorAnnexLibrary = new ErrorAnnexLibraryImpl();
		return errorAnnexLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorAnnexSubClause createErrorAnnexSubClause() {
		ErrorAnnexSubClauseImpl errorAnnexSubClause = new ErrorAnnexSubClauseImpl();
		return errorAnnexSubClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorPropagationRule createErrorPropagationRule() {
		ErrorPropagationRuleImpl errorPropagationRule = new ErrorPropagationRuleImpl();
		return errorPropagationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceProperty createOccurrenceProperty() {
		OccurrencePropertyImpl occurrenceProperty = new OccurrencePropertyImpl();
		return occurrenceProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentErrorModelProperty createComponentErrorModelProperty() {
		ComponentErrorModelPropertyImpl componentErrorModelProperty = new ComponentErrorModelPropertyImpl();
		return componentErrorModelProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportErrorProperty createReportErrorProperty() {
		ReportErrorPropertyImpl reportErrorProperty = new ReportErrorPropertyImpl();
		return reportErrorProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InErrorPropagationGuard createInErrorPropagationGuard() {
		InErrorPropagationGuardImpl inErrorPropagationGuard = new InErrorPropagationGuardImpl();
		return inErrorPropagationGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortEventGuard createPortEventGuard() {
		PortEventGuardImpl portEventGuard = new PortEventGuardImpl();
		return portEventGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorSourceName createErrorSourceName() {
		ErrorSourceNameImpl errorSourceName = new ErrorSourceNameImpl();
		return errorSourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedErrorStateMappingGuard createDerivedErrorStateMappingGuard() {
		DerivedErrorStateMappingGuardImpl derivedErrorStateMappingGuard = new DerivedErrorStateMappingGuardImpl();
		return derivedErrorStateMappingGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorStateMappingRule createErrorStateMappingRule() {
		ErrorStateMappingRuleImpl errorStateMappingRule = new ErrorStateMappingRuleImpl();
		return errorStateMappingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransitions createErrorTransitions() {
		ErrorTransitionsImpl errorTransitions = new ErrorTransitionsImpl();
		return errorTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorProperties createErrorProperties() {
		ErrorPropertiesImpl errorProperties = new ErrorPropertiesImpl();
		return errorProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelHierarchyProperty createModelHierarchyProperty() {
		ModelHierarchyPropertyImpl modelHierarchyProperty = new ModelHierarchyPropertyImpl();
		return modelHierarchyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeTransitionGuard createModeTransitionGuard() {
		ModeTransitionGuardImpl modeTransitionGuard = new ModeTransitionGuardImpl();
		return modeTransitionGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutErrorPropagationGuard createOutErrorPropagationGuard() {
		OutErrorPropagationGuardImpl outErrorPropagationGuard = new OutErrorPropagationGuardImpl();
		return outErrorPropagationGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionName createDistributionNameFromString(EDataType eDataType, String initialValue) {
		DistributionName result = DistributionName.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDistributionNameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanExpressionType createBooleanExpressionTypeFromString(EDataType eDataType, String initialValue) {
		BooleanExpressionType result = BooleanExpressionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanExpressionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriggerType createTriggerTypeFromString(EDataType eDataType, String initialValue) {
		TriggerType result = TriggerType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTriggerTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSelectionType createModelSelectionTypeFromString(EDataType eDataType, String initialValue) {
		ModelSelectionType result = ModelSelectionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModelSelectionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexPackage getErrorannexPackage() {
		return (ErrorannexPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ErrorannexPackage getPackage() {
		return ErrorannexPackage.eINSTANCE;
	}

} //ErrorannexFactoryImpl
