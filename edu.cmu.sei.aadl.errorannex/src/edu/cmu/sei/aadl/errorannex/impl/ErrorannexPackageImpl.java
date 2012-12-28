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
 * @version $Id: ErrorannexPackageImpl.java,v 1.2.2.1 2011-05-04 21:23:06 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.osate.aadl2.Aadl2Package;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.DistributionName;
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
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ErrorannexPackageImpl extends EPackageImpl implements ErrorannexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelImplementationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanErrorExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorAnnexLibraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorAnnexSubClauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPropagationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrencePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentErrorModelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportErrorPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inErrorPropagationGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEventGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorSourceNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedErrorStateMappingGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStateMappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorStateOrPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorTransitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelHierarchyPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modeTransitionGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorModelClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outErrorPropagationGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventOrPropagationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorGuardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum distributionNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanExpressionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelSelectionTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ErrorannexPackageImpl() {
		super(eNS_URI, ErrorannexFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ErrorannexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ErrorannexPackage init() {
		if (isInited) return (ErrorannexPackage)EPackage.Registry.INSTANCE.getEPackage(ErrorannexPackage.eNS_URI);

		// Obtain or create and register package
		ErrorannexPackageImpl theErrorannexPackage = (ErrorannexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ErrorannexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ErrorannexPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		Aadl2Package.eINSTANCE.eClass();

		// Create package meta-data objects
		theErrorannexPackage.createPackageContents();

		// Initialize created meta-data
		theErrorannexPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theErrorannexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ErrorannexPackage.eNS_URI, theErrorannexPackage);
		return theErrorannexPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelType() {
		return errorModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelType_Features() {
		return (EReference)errorModelTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelFeature() {
		return errorModelFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelFeature_OccurrenceProperty() {
		return (EReference)errorModelFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorEvent() {
		return errorEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorState() {
		return errorStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorState_Initial() {
		return (EAttribute)errorStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorState_Inactive() {
		return (EAttribute)errorStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPropagation() {
		return errorPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPropagation_In() {
		return (EAttribute)errorPropagationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPropagation_Out() {
		return (EAttribute)errorPropagationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelImplementation() {
		return errorModelImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelImplementation_ErrorModelType() {
		return (EReference)errorModelImplementationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelImplementation_ErrorTransitions() {
		return (EReference)errorModelImplementationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelImplementation_ErrorProperties() {
		return (EReference)errorModelImplementationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTransition() {
		return errorTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_Origin() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_Destination() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_TransitionAction() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_ActivationTrigger() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransition_TransitionTrigger() {
		return (EReference)errorTransitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_OriginName() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_DestinationName() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_TransitionActionName() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorTransition_TransitionTriggerName() {
		return (EAttribute)errorTransitionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanErrorExpression() {
		return booleanErrorExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanErrorExpression_ContainedExpressions() {
		return (EReference)booleanErrorExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanErrorExpression_Type() {
		return (EAttribute)booleanErrorExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooleanErrorExpression_ErrorSourceName() {
		return (EReference)booleanErrorExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanErrorExpression_NumericLiteral() {
		return (EAttribute)booleanErrorExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorAnnexLibrary() {
		return errorAnnexLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorAnnexLibrary_ErrorModelClassifier() {
		return (EReference)errorAnnexLibraryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorAnnexSubClause() {
		return errorAnnexSubClauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorAnnexSubClause_ErrorModelProperty() {
		return (EReference)errorAnnexSubClauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorPropagationRule() {
		return errorPropagationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPropagationRule_Mask() {
		return (EAttribute)errorPropagationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPropagationRule_ErrorExpression() {
		return (EReference)errorPropagationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorPropagationRule_ErrorPropagationIdentifier() {
		return (EAttribute)errorPropagationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorPropagationRule_ErrorPropagation() {
		return (EReference)errorPropagationRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceProperty() {
		return occurrencePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceProperty_Type() {
		return (EAttribute)occurrencePropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceProperty_NonStandardId() {
		return (EAttribute)occurrencePropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceProperty_ParameterList() {
		return (EAttribute)occurrencePropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrenceProperty_EventOrPropagationName() {
		return (EAttribute)occurrencePropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceProperty_AppliesToErrorEventOrPropagation() {
		return (EReference)occurrencePropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentErrorModelProperty() {
		return componentErrorModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentErrorModelProperty_PackageIdentifier() {
		return (EAttribute)componentErrorModelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentErrorModelProperty_ErrorModelTypeIdentifier() {
		return (EAttribute)componentErrorModelPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponentErrorModelProperty_ErrorModelImplementationIdentifier() {
		return (EAttribute)componentErrorModelPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentErrorModelProperty_ErrorModelClassifier() {
		return (EReference)componentErrorModelPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentErrorModelProperty_InplaceErrorModelType() {
		return (EReference)componentErrorModelPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportErrorProperty() {
		return reportErrorPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportErrorProperty_StateAndPropagationList() {
		return (EAttribute)reportErrorPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReportErrorProperty_ErrorStateOrPropagation() {
		return (EReference)reportErrorPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInErrorPropagationGuard() {
		return inErrorPropagationGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInErrorPropagationGuard_ErrorPropagationRule() {
		return (EReference)inErrorPropagationGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortEventGuard() {
		return portEventGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPortEventGuard_ErrorExpression() {
		return (EReference)portEventGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorSourceName() {
		return errorSourceNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorSourceName_ComponentNameOrFeatureName() {
		return (EAttribute)errorSourceNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorSourceName_ErrorStateOrPropagationName() {
		return (EAttribute)errorSourceNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorSourceName_ErrorStateOrPropagation() {
		return (EReference)errorSourceNameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorSourceName_SubcomponentOrFeature() {
		return (EReference)errorSourceNameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorSourceName_SubcomponentName() {
		return (EAttribute)errorSourceNameEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorSourceName_ContextSubcomponent() {
		return (EReference)errorSourceNameEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedErrorStateMappingGuard() {
		return derivedErrorStateMappingGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDerivedErrorStateMappingGuard_ErrorStateMappingRule() {
		return (EReference)derivedErrorStateMappingGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorStateMappingRule() {
		return errorStateMappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorStateMappingRule_ComponentErrorStateIdentifier() {
		return (EAttribute)errorStateMappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorStateMappingRule_ErrorExpression() {
		return (EReference)errorStateMappingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorStateMappingRule_ErrorState() {
		return (EReference)errorStateMappingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorStateOrPropagation() {
		return errorStateOrPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorTransitions() {
		return errorTransitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorTransitions_ErrorTransition() {
		return (EReference)errorTransitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorProperties() {
		return errorPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorProperties_OccurrenceProperty() {
		return (EReference)errorPropertiesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelHierarchyProperty() {
		return modelHierarchyPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelHierarchyProperty_ErrorModelSelection() {
		return (EAttribute)modelHierarchyPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelProperty() {
		return errorModelPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorModelProperty_AppliesTo() {
		return (EReference)errorModelPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorModelProperty_AppliesToName() {
		return (EAttribute)errorModelPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModeTransitionGuard() {
		return modeTransitionGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransitionGuard_ErrorExpression() {
		return (EReference)modeTransitionGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModeTransitionGuard_AppliesToFeatureContextName() {
		return (EAttribute)modeTransitionGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModeTransitionGuard_AppliesToModeTransition() {
		return (EReference)modeTransitionGuardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorModelClassifier() {
		return errorModelClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutErrorPropagationGuard() {
		return outErrorPropagationGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutErrorPropagationGuard_ErrorPropagationRule() {
		return (EReference)outErrorPropagationGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorEventOrPropagation() {
		return errorEventOrPropagationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorGuard() {
		return errorGuardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getErrorGuard_AppliesToFeatureName() {
		return (EAttribute)errorGuardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorGuard_AppliesToFeature() {
		return (EReference)errorGuardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDistributionName() {
		return distributionNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanExpressionType() {
		return booleanExpressionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTriggerType() {
		return triggerTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModelSelectionType() {
		return modelSelectionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexFactory getErrorannexFactory() {
		return (ErrorannexFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		errorModelTypeEClass = createEClass(ERROR_MODEL_TYPE);
		createEReference(errorModelTypeEClass, ERROR_MODEL_TYPE__FEATURES);

		errorModelFeatureEClass = createEClass(ERROR_MODEL_FEATURE);
		createEReference(errorModelFeatureEClass, ERROR_MODEL_FEATURE__OCCURRENCE_PROPERTY);

		errorEventEClass = createEClass(ERROR_EVENT);

		errorStateEClass = createEClass(ERROR_STATE);
		createEAttribute(errorStateEClass, ERROR_STATE__INITIAL);
		createEAttribute(errorStateEClass, ERROR_STATE__INACTIVE);

		errorPropagationEClass = createEClass(ERROR_PROPAGATION);
		createEAttribute(errorPropagationEClass, ERROR_PROPAGATION__IN);
		createEAttribute(errorPropagationEClass, ERROR_PROPAGATION__OUT);

		errorModelImplementationEClass = createEClass(ERROR_MODEL_IMPLEMENTATION);
		createEReference(errorModelImplementationEClass, ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE);
		createEReference(errorModelImplementationEClass, ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS);
		createEReference(errorModelImplementationEClass, ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES);

		errorTransitionEClass = createEClass(ERROR_TRANSITION);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__ORIGIN);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__DESTINATION);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__TRANSITION_ACTION);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__ACTIVATION_TRIGGER);
		createEReference(errorTransitionEClass, ERROR_TRANSITION__TRANSITION_TRIGGER);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__ORIGIN_NAME);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__DESTINATION_NAME);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__TRANSITION_ACTION_NAME);
		createEAttribute(errorTransitionEClass, ERROR_TRANSITION__TRANSITION_TRIGGER_NAME);

		booleanErrorExpressionEClass = createEClass(BOOLEAN_ERROR_EXPRESSION);
		createEReference(booleanErrorExpressionEClass, BOOLEAN_ERROR_EXPRESSION__CONTAINED_EXPRESSIONS);
		createEAttribute(booleanErrorExpressionEClass, BOOLEAN_ERROR_EXPRESSION__TYPE);
		createEReference(booleanErrorExpressionEClass, BOOLEAN_ERROR_EXPRESSION__ERROR_SOURCE_NAME);
		createEAttribute(booleanErrorExpressionEClass, BOOLEAN_ERROR_EXPRESSION__NUMERIC_LITERAL);

		errorAnnexLibraryEClass = createEClass(ERROR_ANNEX_LIBRARY);
		createEReference(errorAnnexLibraryEClass, ERROR_ANNEX_LIBRARY__ERROR_MODEL_CLASSIFIER);

		errorAnnexSubClauseEClass = createEClass(ERROR_ANNEX_SUB_CLAUSE);
		createEReference(errorAnnexSubClauseEClass, ERROR_ANNEX_SUB_CLAUSE__ERROR_MODEL_PROPERTY);

		errorPropagationRuleEClass = createEClass(ERROR_PROPAGATION_RULE);
		createEAttribute(errorPropagationRuleEClass, ERROR_PROPAGATION_RULE__MASK);
		createEReference(errorPropagationRuleEClass, ERROR_PROPAGATION_RULE__ERROR_EXPRESSION);
		createEAttribute(errorPropagationRuleEClass, ERROR_PROPAGATION_RULE__ERROR_PROPAGATION_IDENTIFIER);
		createEReference(errorPropagationRuleEClass, ERROR_PROPAGATION_RULE__ERROR_PROPAGATION);

		occurrencePropertyEClass = createEClass(OCCURRENCE_PROPERTY);
		createEAttribute(occurrencePropertyEClass, OCCURRENCE_PROPERTY__TYPE);
		createEAttribute(occurrencePropertyEClass, OCCURRENCE_PROPERTY__NON_STANDARD_ID);
		createEAttribute(occurrencePropertyEClass, OCCURRENCE_PROPERTY__PARAMETER_LIST);
		createEAttribute(occurrencePropertyEClass, OCCURRENCE_PROPERTY__EVENT_OR_PROPAGATION_NAME);
		createEReference(occurrencePropertyEClass, OCCURRENCE_PROPERTY__APPLIES_TO_ERROR_EVENT_OR_PROPAGATION);

		componentErrorModelPropertyEClass = createEClass(COMPONENT_ERROR_MODEL_PROPERTY);
		createEAttribute(componentErrorModelPropertyEClass, COMPONENT_ERROR_MODEL_PROPERTY__PACKAGE_IDENTIFIER);
		createEAttribute(componentErrorModelPropertyEClass, COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_TYPE_IDENTIFIER);
		createEAttribute(componentErrorModelPropertyEClass, COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_IMPLEMENTATION_IDENTIFIER);
		createEReference(componentErrorModelPropertyEClass, COMPONENT_ERROR_MODEL_PROPERTY__ERROR_MODEL_CLASSIFIER);
		createEReference(componentErrorModelPropertyEClass, COMPONENT_ERROR_MODEL_PROPERTY__INPLACE_ERROR_MODEL_TYPE);

		reportErrorPropertyEClass = createEClass(REPORT_ERROR_PROPERTY);
		createEAttribute(reportErrorPropertyEClass, REPORT_ERROR_PROPERTY__STATE_AND_PROPAGATION_LIST);
		createEReference(reportErrorPropertyEClass, REPORT_ERROR_PROPERTY__ERROR_STATE_OR_PROPAGATION);

		inErrorPropagationGuardEClass = createEClass(IN_ERROR_PROPAGATION_GUARD);
		createEReference(inErrorPropagationGuardEClass, IN_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE);

		portEventGuardEClass = createEClass(PORT_EVENT_GUARD);
		createEReference(portEventGuardEClass, PORT_EVENT_GUARD__ERROR_EXPRESSION);

		errorSourceNameEClass = createEClass(ERROR_SOURCE_NAME);
		createEAttribute(errorSourceNameEClass, ERROR_SOURCE_NAME__COMPONENT_NAME_OR_FEATURE_NAME);
		createEAttribute(errorSourceNameEClass, ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION_NAME);
		createEReference(errorSourceNameEClass, ERROR_SOURCE_NAME__ERROR_STATE_OR_PROPAGATION);
		createEReference(errorSourceNameEClass, ERROR_SOURCE_NAME__SUBCOMPONENT_OR_FEATURE);
		createEAttribute(errorSourceNameEClass, ERROR_SOURCE_NAME__SUBCOMPONENT_NAME);
		createEReference(errorSourceNameEClass, ERROR_SOURCE_NAME__CONTEXT_SUBCOMPONENT);

		derivedErrorStateMappingGuardEClass = createEClass(DERIVED_ERROR_STATE_MAPPING_GUARD);
		createEReference(derivedErrorStateMappingGuardEClass, DERIVED_ERROR_STATE_MAPPING_GUARD__ERROR_STATE_MAPPING_RULE);

		errorStateMappingRuleEClass = createEClass(ERROR_STATE_MAPPING_RULE);
		createEAttribute(errorStateMappingRuleEClass, ERROR_STATE_MAPPING_RULE__COMPONENT_ERROR_STATE_IDENTIFIER);
		createEReference(errorStateMappingRuleEClass, ERROR_STATE_MAPPING_RULE__ERROR_EXPRESSION);
		createEReference(errorStateMappingRuleEClass, ERROR_STATE_MAPPING_RULE__ERROR_STATE);

		errorStateOrPropagationEClass = createEClass(ERROR_STATE_OR_PROPAGATION);

		errorTransitionsEClass = createEClass(ERROR_TRANSITIONS);
		createEReference(errorTransitionsEClass, ERROR_TRANSITIONS__ERROR_TRANSITION);

		errorPropertiesEClass = createEClass(ERROR_PROPERTIES);
		createEReference(errorPropertiesEClass, ERROR_PROPERTIES__OCCURRENCE_PROPERTY);

		modelHierarchyPropertyEClass = createEClass(MODEL_HIERARCHY_PROPERTY);
		createEAttribute(modelHierarchyPropertyEClass, MODEL_HIERARCHY_PROPERTY__ERROR_MODEL_SELECTION);

		errorModelPropertyEClass = createEClass(ERROR_MODEL_PROPERTY);
		createEReference(errorModelPropertyEClass, ERROR_MODEL_PROPERTY__APPLIES_TO);
		createEAttribute(errorModelPropertyEClass, ERROR_MODEL_PROPERTY__APPLIES_TO_NAME);

		modeTransitionGuardEClass = createEClass(MODE_TRANSITION_GUARD);
		createEReference(modeTransitionGuardEClass, MODE_TRANSITION_GUARD__ERROR_EXPRESSION);
		createEAttribute(modeTransitionGuardEClass, MODE_TRANSITION_GUARD__APPLIES_TO_FEATURE_CONTEXT_NAME);
		createEReference(modeTransitionGuardEClass, MODE_TRANSITION_GUARD__APPLIES_TO_MODE_TRANSITION);

		errorModelClassifierEClass = createEClass(ERROR_MODEL_CLASSIFIER);

		outErrorPropagationGuardEClass = createEClass(OUT_ERROR_PROPAGATION_GUARD);
		createEReference(outErrorPropagationGuardEClass, OUT_ERROR_PROPAGATION_GUARD__ERROR_PROPAGATION_RULE);

		errorEventOrPropagationEClass = createEClass(ERROR_EVENT_OR_PROPAGATION);

		errorGuardEClass = createEClass(ERROR_GUARD);
		createEAttribute(errorGuardEClass, ERROR_GUARD__APPLIES_TO_FEATURE_NAME);
		createEReference(errorGuardEClass, ERROR_GUARD__APPLIES_TO_FEATURE);

		// Create enums
		distributionNameEEnum = createEEnum(DISTRIBUTION_NAME);
		booleanExpressionTypeEEnum = createEEnum(BOOLEAN_EXPRESSION_TYPE);
		triggerTypeEEnum = createEEnum(TRIGGER_TYPE);
		modelSelectionTypeEEnum = createEEnum(MODEL_SELECTION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);

		// Add supertypes to classes
		errorModelTypeEClass.getESuperTypes().add(this.getErrorModelClassifier());
		errorModelFeatureEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
		errorEventEClass.getESuperTypes().add(this.getErrorModelFeature());
		errorEventEClass.getESuperTypes().add(this.getErrorEventOrPropagation());
		errorStateEClass.getESuperTypes().add(this.getErrorModelFeature());
		errorStateEClass.getESuperTypes().add(this.getErrorStateOrPropagation());
		errorPropagationEClass.getESuperTypes().add(this.getErrorModelFeature());
		errorPropagationEClass.getESuperTypes().add(this.getErrorStateOrPropagation());
		errorPropagationEClass.getESuperTypes().add(this.getErrorEventOrPropagation());
		errorModelImplementationEClass.getESuperTypes().add(this.getErrorModelClassifier());
		errorTransitionEClass.getESuperTypes().add(theAadl2Package.getElement());
		booleanErrorExpressionEClass.getESuperTypes().add(theAadl2Package.getElement());
		errorAnnexLibraryEClass.getESuperTypes().add(theAadl2Package.getAnnexLibrary());
		errorAnnexSubClauseEClass.getESuperTypes().add(theAadl2Package.getAnnexSubclause());
		errorPropagationRuleEClass.getESuperTypes().add(theAadl2Package.getElement());
		occurrencePropertyEClass.getESuperTypes().add(this.getErrorModelProperty());
		occurrencePropertyEClass.getESuperTypes().add(theAadl2Package.getElement());
		componentErrorModelPropertyEClass.getESuperTypes().add(this.getErrorModelProperty());
		reportErrorPropertyEClass.getESuperTypes().add(this.getErrorModelProperty());
		inErrorPropagationGuardEClass.getESuperTypes().add(this.getErrorGuard());
		portEventGuardEClass.getESuperTypes().add(this.getErrorGuard());
		errorSourceNameEClass.getESuperTypes().add(theAadl2Package.getElement());
		derivedErrorStateMappingGuardEClass.getESuperTypes().add(this.getErrorModelProperty());
		errorStateMappingRuleEClass.getESuperTypes().add(theAadl2Package.getElement());
		errorStateOrPropagationEClass.getESuperTypes().add(this.getErrorModelFeature());
		errorTransitionsEClass.getESuperTypes().add(theAadl2Package.getElement());
		errorPropertiesEClass.getESuperTypes().add(theAadl2Package.getElement());
		modelHierarchyPropertyEClass.getESuperTypes().add(this.getErrorModelProperty());
		errorModelPropertyEClass.getESuperTypes().add(theAadl2Package.getElement());
		modeTransitionGuardEClass.getESuperTypes().add(this.getErrorGuard());
		errorModelClassifierEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
		outErrorPropagationGuardEClass.getESuperTypes().add(this.getErrorGuard());
		errorEventOrPropagationEClass.getESuperTypes().add(this.getErrorModelFeature());
		errorGuardEClass.getESuperTypes().add(this.getErrorModelProperty());
		errorGuardEClass.getESuperTypes().add(theAadl2Package.getElement());

		// Initialize classes and features; add operations and parameters
		initEClass(errorModelTypeEClass, ErrorModelType.class, "ErrorModelType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelType_Features(), this.getErrorModelFeature(), null, "features", null, 1, -1, ErrorModelType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorModelFeatureEClass, ErrorModelFeature.class, "ErrorModelFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelFeature_OccurrenceProperty(), this.getOccurrenceProperty(), null, "occurrenceProperty", null, 0, 1, ErrorModelFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorEventEClass, ErrorEvent.class, "ErrorEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorStateEClass, ErrorState.class, "ErrorState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorState_Initial(), ecorePackage.getEBoolean(), "initial", null, 0, 1, ErrorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorState_Inactive(), ecorePackage.getEBoolean(), "inactive", null, 0, 1, ErrorState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorPropagationEClass, ErrorPropagation.class, "ErrorPropagation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorPropagation_In(), ecorePackage.getEBoolean(), "in", null, 0, 1, ErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorPropagation_Out(), ecorePackage.getEBoolean(), "out", null, 0, 1, ErrorPropagation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorModelImplementationEClass, ErrorModelImplementation.class, "ErrorModelImplementation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelImplementation_ErrorModelType(), this.getErrorModelType(), null, "errorModelType", null, 1, 1, ErrorModelImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorModelImplementation_ErrorTransitions(), this.getErrorTransitions(), null, "errorTransitions", null, 0, 1, ErrorModelImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorModelImplementation_ErrorProperties(), this.getErrorProperties(), null, "errorProperties", null, 0, 1, ErrorModelImplementation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorTransitionEClass, ErrorTransition.class, "ErrorTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorTransition_Origin(), this.getErrorState(), null, "origin", null, 1, -1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorTransition_Destination(), this.getErrorState(), null, "destination", null, 1, 1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorTransition_TransitionAction(), this.getErrorPropagation(), null, "transitionAction", null, 0, -1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorTransition_ActivationTrigger(), this.getTriggerType(), "activationTrigger", null, 0, 2, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorTransition_TransitionTrigger(), this.getErrorEventOrPropagation(), null, "transitionTrigger", null, 0, -1, ErrorTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorTransition_OriginName(), ecorePackage.getEString(), "originName", null, 0, -1, ErrorTransition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorTransition_DestinationName(), ecorePackage.getEString(), "destinationName", null, 0, 1, ErrorTransition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorTransition_TransitionActionName(), ecorePackage.getEString(), "transitionActionName", null, 0, -1, ErrorTransition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorTransition_TransitionTriggerName(), ecorePackage.getEString(), "transitionTriggerName", null, 0, -1, ErrorTransition.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanErrorExpressionEClass, BooleanErrorExpression.class, "BooleanErrorExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBooleanErrorExpression_ContainedExpressions(), this.getBooleanErrorExpression(), null, "containedExpressions", null, 0, -1, BooleanErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanErrorExpression_Type(), this.getBooleanExpressionType(), "type", null, 0, 1, BooleanErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBooleanErrorExpression_ErrorSourceName(), this.getErrorSourceName(), null, "errorSourceName", null, 0, 1, BooleanErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBooleanErrorExpression_NumericLiteral(), ecorePackage.getEInt(), "numericLiteral", null, 0, 1, BooleanErrorExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorAnnexLibraryEClass, ErrorAnnexLibrary.class, "ErrorAnnexLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorAnnexLibrary_ErrorModelClassifier(), this.getErrorModelClassifier(), null, "errorModelClassifier", null, 0, -1, ErrorAnnexLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorAnnexSubClauseEClass, ErrorAnnexSubClause.class, "ErrorAnnexSubClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorAnnexSubClause_ErrorModelProperty(), this.getErrorModelProperty(), null, "errorModelProperty", null, 0, -1, ErrorAnnexSubClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorPropagationRuleEClass, ErrorPropagationRule.class, "ErrorPropagationRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorPropagationRule_Mask(), ecorePackage.getEBoolean(), "mask", null, 0, 1, ErrorPropagationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorPropagationRule_ErrorExpression(), this.getBooleanErrorExpression(), null, "errorExpression", null, 0, 1, ErrorPropagationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorPropagationRule_ErrorPropagationIdentifier(), ecorePackage.getEString(), "errorPropagationIdentifier", null, 0, 1, ErrorPropagationRule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorPropagationRule_ErrorPropagation(), this.getErrorPropagation(), null, "errorPropagation", null, 0, 1, ErrorPropagationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occurrencePropertyEClass, OccurrenceProperty.class, "OccurrenceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccurrenceProperty_Type(), this.getDistributionName(), "type", null, 0, 1, OccurrenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccurrenceProperty_NonStandardId(), ecorePackage.getEString(), "nonStandardId", null, 0, 1, OccurrenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccurrenceProperty_ParameterList(), ecorePackage.getEString(), "parameterList", null, 0, -1, OccurrenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccurrenceProperty_EventOrPropagationName(), ecorePackage.getEString(), "eventOrPropagationName", null, 0, 1, OccurrenceProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOccurrenceProperty_AppliesToErrorEventOrPropagation(), this.getErrorEventOrPropagation(), null, "appliesToErrorEventOrPropagation", null, 0, 1, OccurrenceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentErrorModelPropertyEClass, ComponentErrorModelProperty.class, "ComponentErrorModelProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentErrorModelProperty_PackageIdentifier(), ecorePackage.getEString(), "packageIdentifier", null, 0, 1, ComponentErrorModelProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentErrorModelProperty_ErrorModelTypeIdentifier(), ecorePackage.getEString(), "errorModelTypeIdentifier", null, 0, 1, ComponentErrorModelProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentErrorModelProperty_ErrorModelImplementationIdentifier(), ecorePackage.getEString(), "errorModelImplementationIdentifier", null, 0, 1, ComponentErrorModelProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentErrorModelProperty_ErrorModelClassifier(), this.getErrorModelClassifier(), null, "errorModelClassifier", null, 0, 1, ComponentErrorModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponentErrorModelProperty_InplaceErrorModelType(), this.getErrorModelType(), null, "inplaceErrorModelType", null, 0, 1, ComponentErrorModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(reportErrorPropertyEClass, ReportErrorProperty.class, "ReportErrorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReportErrorProperty_StateAndPropagationList(), ecorePackage.getEString(), "stateAndPropagationList", null, 0, -1, ReportErrorProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReportErrorProperty_ErrorStateOrPropagation(), this.getErrorStateOrPropagation(), null, "errorStateOrPropagation", null, 0, -1, ReportErrorProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inErrorPropagationGuardEClass, InErrorPropagationGuard.class, "InErrorPropagationGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInErrorPropagationGuard_ErrorPropagationRule(), this.getErrorPropagationRule(), null, "errorPropagationRule", null, 1, -1, InErrorPropagationGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEventGuardEClass, PortEventGuard.class, "PortEventGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPortEventGuard_ErrorExpression(), this.getBooleanErrorExpression(), null, "errorExpression", null, 0, 1, PortEventGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorSourceNameEClass, ErrorSourceName.class, "ErrorSourceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorSourceName_ComponentNameOrFeatureName(), ecorePackage.getEString(), "componentNameOrFeatureName", null, 0, 1, ErrorSourceName.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorSourceName_ErrorStateOrPropagationName(), ecorePackage.getEString(), "errorStateOrPropagationName", null, 0, -1, ErrorSourceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorSourceName_ErrorStateOrPropagation(), this.getErrorStateOrPropagation(), null, "errorStateOrPropagation", null, 0, -1, ErrorSourceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorSourceName_SubcomponentOrFeature(), theAadl2Package.getNamedElement(), null, "subcomponentOrFeature", null, 0, 1, ErrorSourceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorSourceName_SubcomponentName(), ecorePackage.getEString(), "subcomponentName", null, 0, 1, ErrorSourceName.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorSourceName_ContextSubcomponent(), theAadl2Package.getNamedElement(), null, "contextSubcomponent", null, 0, 1, ErrorSourceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedErrorStateMappingGuardEClass, DerivedErrorStateMappingGuard.class, "DerivedErrorStateMappingGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedErrorStateMappingGuard_ErrorStateMappingRule(), this.getErrorStateMappingRule(), null, "errorStateMappingRule", null, 1, -1, DerivedErrorStateMappingGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorStateMappingRuleEClass, ErrorStateMappingRule.class, "ErrorStateMappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorStateMappingRule_ComponentErrorStateIdentifier(), ecorePackage.getEString(), "componentErrorStateIdentifier", null, 1, 1, ErrorStateMappingRule.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorStateMappingRule_ErrorExpression(), this.getBooleanErrorExpression(), null, "errorExpression", null, 0, 1, ErrorStateMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorStateMappingRule_ErrorState(), this.getErrorState(), null, "errorState", null, 0, 1, ErrorStateMappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorStateOrPropagationEClass, ErrorStateOrPropagation.class, "ErrorStateOrPropagation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorTransitionsEClass, ErrorTransitions.class, "ErrorTransitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorTransitions_ErrorTransition(), this.getErrorTransition(), null, "errorTransition", null, 0, -1, ErrorTransitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorPropertiesEClass, ErrorProperties.class, "ErrorProperties", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorProperties_OccurrenceProperty(), this.getOccurrenceProperty(), null, "occurrenceProperty", null, 0, -1, ErrorProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelHierarchyPropertyEClass, ModelHierarchyProperty.class, "ModelHierarchyProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelHierarchyProperty_ErrorModelSelection(), this.getModelSelectionType(), "errorModelSelection", null, 0, 1, ModelHierarchyProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorModelPropertyEClass, ErrorModelProperty.class, "ErrorModelProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getErrorModelProperty_AppliesTo(), theAadl2Package.getNamedElement(), null, "appliesTo", null, 0, -1, ErrorModelProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getErrorModelProperty_AppliesToName(), ecorePackage.getEString(), "appliesToName", null, 0, -1, ErrorModelProperty.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modeTransitionGuardEClass, ModeTransitionGuard.class, "ModeTransitionGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModeTransitionGuard_ErrorExpression(), this.getBooleanErrorExpression(), null, "errorExpression", null, 0, 1, ModeTransitionGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModeTransitionGuard_AppliesToFeatureContextName(), ecorePackage.getEString(), "appliesToFeatureContextName", null, 0, -1, ModeTransitionGuard.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModeTransitionGuard_AppliesToModeTransition(), theAadl2Package.getModeTransition(), null, "appliesToModeTransition", null, 0, 1, ModeTransitionGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorModelClassifierEClass, ErrorModelClassifier.class, "ErrorModelClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(outErrorPropagationGuardEClass, OutErrorPropagationGuard.class, "OutErrorPropagationGuard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutErrorPropagationGuard_ErrorPropagationRule(), this.getErrorPropagationRule(), null, "errorPropagationRule", null, 0, -1, OutErrorPropagationGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(errorEventOrPropagationEClass, ErrorEventOrPropagation.class, "ErrorEventOrPropagation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(errorGuardEClass, ErrorGuard.class, "ErrorGuard", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErrorGuard_AppliesToFeatureName(), ecorePackage.getEString(), "appliesToFeatureName", null, 0, -1, ErrorGuard.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getErrorGuard_AppliesToFeature(), theAadl2Package.getFeature(), null, "appliesToFeature", null, 0, -1, ErrorGuard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(distributionNameEEnum, DistributionName.class, "DistributionName");
		addEEnumLiteral(distributionNameEEnum, DistributionName.POISSON_LITERAL);
		addEEnumLiteral(distributionNameEEnum, DistributionName.FIXED_LITERAL);
		addEEnumLiteral(distributionNameEEnum, DistributionName.NONSTANDARD_LITERAL);

		initEEnum(booleanExpressionTypeEEnum, BooleanExpressionType.class, "BooleanExpressionType");
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.NOT_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.AND_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.OR_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.ORMORE_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.ORLESS_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.OTHERS_LITERAL);
		addEEnumLiteral(booleanExpressionTypeEEnum, BooleanExpressionType.ERRORSOURCENAME_LITERAL);

		initEEnum(triggerTypeEEnum, TriggerType.class, "TriggerType");
		addEEnumLiteral(triggerTypeEEnum, TriggerType.ACTIVATE_LITERAL);
		addEEnumLiteral(triggerTypeEEnum, TriggerType.DEACTIVATE_LITERAL);

		initEEnum(modelSelectionTypeEEnum, ModelSelectionType.class, "ModelSelectionType");
		addEEnumLiteral(modelSelectionTypeEEnum, ModelSelectionType.ABSTRACT_LITERAL);
		addEEnumLiteral(modelSelectionTypeEEnum, ModelSelectionType.DERIVED_LITERAL);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///aadl/OSATE
		createOSATEAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///aadl/OSATE</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOSATEAnnotations() {
		String source = "http:///aadl/OSATE";		
		addAnnotation
		  (errorModelFeatureEClass, 
		   source, 
		   new String[] {
			 "isProxy", "true"
		   });		
		addAnnotation
		  (errorStateOrPropagationEClass, 
		   source, 
		   new String[] {
			 "isProxy", "true"
		   });		
		addAnnotation
		  (errorModelPropertyEClass, 
		   source, 
		   new String[] {
			 "isProxy", "true"
		   });		
		addAnnotation
		  (errorModelClassifierEClass, 
		   source, 
		   new String[] {
			 "isProxy", "true"
		   });		
		addAnnotation
		  (errorEventOrPropagationEClass, 
		   source, 
		   new String[] {
			 "isProxy", "true"
		   });
	}

} //ErrorannexPackageImpl
