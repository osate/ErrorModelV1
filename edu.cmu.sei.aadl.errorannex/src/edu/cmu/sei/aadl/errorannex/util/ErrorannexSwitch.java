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
 * @version $Id: ErrorannexSwitch.java,v 1.1.4.1 2011-05-04 21:23:10 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.util;

import edu.cmu.sei.aadl.errorannex.*;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage
 * @generated
 */
public class ErrorannexSwitch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ErrorannexPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorannexSwitch() {
		if (modelPackage == null) {
			modelPackage = ErrorannexPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public Object doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch((EClass)eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected Object doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ErrorannexPackage.ERROR_MODEL_TYPE: {
				ErrorModelType errorModelType = (ErrorModelType)theEObject;
				Object result = caseErrorModelType(errorModelType);
				if (result == null) result = caseErrorModelClassifier(errorModelType);
				if (result == null) result = caseNamedElement(errorModelType);
				if (result == null) result = caseElement(errorModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_MODEL_FEATURE: {
				ErrorModelFeature errorModelFeature = (ErrorModelFeature)theEObject;
				Object result = caseErrorModelFeature(errorModelFeature);
				if (result == null) result = caseNamedElement(errorModelFeature);
				if (result == null) result = caseElement(errorModelFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_EVENT: {
				ErrorEvent errorEvent = (ErrorEvent)theEObject;
				Object result = caseErrorEvent(errorEvent);
				if (result == null) result = caseErrorEventOrPropagation(errorEvent);
				if (result == null) result = caseErrorModelFeature(errorEvent);
				if (result == null) result = caseNamedElement(errorEvent);
				if (result == null) result = caseElement(errorEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_STATE: {
				ErrorState errorState = (ErrorState)theEObject;
				Object result = caseErrorState(errorState);
				if (result == null) result = caseErrorStateOrPropagation(errorState);
				if (result == null) result = caseErrorModelFeature(errorState);
				if (result == null) result = caseNamedElement(errorState);
				if (result == null) result = caseElement(errorState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_PROPAGATION: {
				ErrorPropagation errorPropagation = (ErrorPropagation)theEObject;
				Object result = caseErrorPropagation(errorPropagation);
				if (result == null) result = caseErrorStateOrPropagation(errorPropagation);
				if (result == null) result = caseErrorEventOrPropagation(errorPropagation);
				if (result == null) result = caseErrorModelFeature(errorPropagation);
				if (result == null) result = caseNamedElement(errorPropagation);
				if (result == null) result = caseElement(errorPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION: {
				ErrorModelImplementation errorModelImplementation = (ErrorModelImplementation)theEObject;
				Object result = caseErrorModelImplementation(errorModelImplementation);
				if (result == null) result = caseErrorModelClassifier(errorModelImplementation);
				if (result == null) result = caseNamedElement(errorModelImplementation);
				if (result == null) result = caseElement(errorModelImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_TRANSITION: {
				ErrorTransition errorTransition = (ErrorTransition)theEObject;
				Object result = caseErrorTransition(errorTransition);
				if (result == null) result = caseElement(errorTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.BOOLEAN_ERROR_EXPRESSION: {
				BooleanErrorExpression booleanErrorExpression = (BooleanErrorExpression)theEObject;
				Object result = caseBooleanErrorExpression(booleanErrorExpression);
				if (result == null) result = caseElement(booleanErrorExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_ANNEX_LIBRARY: {
				ErrorAnnexLibrary errorAnnexLibrary = (ErrorAnnexLibrary)theEObject;
				Object result = caseErrorAnnexLibrary(errorAnnexLibrary);
				if (result == null) result = caseAnnexLibrary(errorAnnexLibrary);
				if (result == null) result = caseNamedElement(errorAnnexLibrary);
				if (result == null) result = caseElement(errorAnnexLibrary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_ANNEX_SUB_CLAUSE: {
				ErrorAnnexSubClause errorAnnexSubClause = (ErrorAnnexSubClause)theEObject;
				Object result = caseErrorAnnexSubClause(errorAnnexSubClause);
				if (result == null) result = caseAnnexSubclause(errorAnnexSubClause);
				if (result == null) result = caseModalElement(errorAnnexSubClause);
				if (result == null) result = caseNamedElement(errorAnnexSubClause);
				if (result == null) result = caseElement(errorAnnexSubClause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_PROPAGATION_RULE: {
				ErrorPropagationRule errorPropagationRule = (ErrorPropagationRule)theEObject;
				Object result = caseErrorPropagationRule(errorPropagationRule);
				if (result == null) result = caseElement(errorPropagationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.OCCURRENCE_PROPERTY: {
				OccurrenceProperty occurrenceProperty = (OccurrenceProperty)theEObject;
				Object result = caseOccurrenceProperty(occurrenceProperty);
				if (result == null) result = caseErrorModelProperty(occurrenceProperty);
				if (result == null) result = caseElement(occurrenceProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.COMPONENT_ERROR_MODEL_PROPERTY: {
				ComponentErrorModelProperty componentErrorModelProperty = (ComponentErrorModelProperty)theEObject;
				Object result = caseComponentErrorModelProperty(componentErrorModelProperty);
				if (result == null) result = caseErrorModelProperty(componentErrorModelProperty);
				if (result == null) result = caseElement(componentErrorModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.REPORT_ERROR_PROPERTY: {
				ReportErrorProperty reportErrorProperty = (ReportErrorProperty)theEObject;
				Object result = caseReportErrorProperty(reportErrorProperty);
				if (result == null) result = caseErrorModelProperty(reportErrorProperty);
				if (result == null) result = caseElement(reportErrorProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.IN_ERROR_PROPAGATION_GUARD: {
				InErrorPropagationGuard inErrorPropagationGuard = (InErrorPropagationGuard)theEObject;
				Object result = caseInErrorPropagationGuard(inErrorPropagationGuard);
				if (result == null) result = caseErrorGuard(inErrorPropagationGuard);
				if (result == null) result = caseErrorModelProperty(inErrorPropagationGuard);
				if (result == null) result = caseElement(inErrorPropagationGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.PORT_EVENT_GUARD: {
				PortEventGuard portEventGuard = (PortEventGuard)theEObject;
				Object result = casePortEventGuard(portEventGuard);
				if (result == null) result = caseErrorGuard(portEventGuard);
				if (result == null) result = caseErrorModelProperty(portEventGuard);
				if (result == null) result = caseElement(portEventGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_SOURCE_NAME: {
				ErrorSourceName errorSourceName = (ErrorSourceName)theEObject;
				Object result = caseErrorSourceName(errorSourceName);
				if (result == null) result = caseElement(errorSourceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.DERIVED_ERROR_STATE_MAPPING_GUARD: {
				DerivedErrorStateMappingGuard derivedErrorStateMappingGuard = (DerivedErrorStateMappingGuard)theEObject;
				Object result = caseDerivedErrorStateMappingGuard(derivedErrorStateMappingGuard);
				if (result == null) result = caseErrorModelProperty(derivedErrorStateMappingGuard);
				if (result == null) result = caseElement(derivedErrorStateMappingGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_STATE_MAPPING_RULE: {
				ErrorStateMappingRule errorStateMappingRule = (ErrorStateMappingRule)theEObject;
				Object result = caseErrorStateMappingRule(errorStateMappingRule);
				if (result == null) result = caseElement(errorStateMappingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_STATE_OR_PROPAGATION: {
				ErrorStateOrPropagation errorStateOrPropagation = (ErrorStateOrPropagation)theEObject;
				Object result = caseErrorStateOrPropagation(errorStateOrPropagation);
				if (result == null) result = caseErrorModelFeature(errorStateOrPropagation);
				if (result == null) result = caseNamedElement(errorStateOrPropagation);
				if (result == null) result = caseElement(errorStateOrPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_TRANSITIONS: {
				ErrorTransitions errorTransitions = (ErrorTransitions)theEObject;
				Object result = caseErrorTransitions(errorTransitions);
				if (result == null) result = caseElement(errorTransitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_PROPERTIES: {
				ErrorProperties errorProperties = (ErrorProperties)theEObject;
				Object result = caseErrorProperties(errorProperties);
				if (result == null) result = caseElement(errorProperties);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.MODEL_HIERARCHY_PROPERTY: {
				ModelHierarchyProperty modelHierarchyProperty = (ModelHierarchyProperty)theEObject;
				Object result = caseModelHierarchyProperty(modelHierarchyProperty);
				if (result == null) result = caseErrorModelProperty(modelHierarchyProperty);
				if (result == null) result = caseElement(modelHierarchyProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_MODEL_PROPERTY: {
				ErrorModelProperty errorModelProperty = (ErrorModelProperty)theEObject;
				Object result = caseErrorModelProperty(errorModelProperty);
				if (result == null) result = caseElement(errorModelProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.MODE_TRANSITION_GUARD: {
				ModeTransitionGuard modeTransitionGuard = (ModeTransitionGuard)theEObject;
				Object result = caseModeTransitionGuard(modeTransitionGuard);
				if (result == null) result = caseErrorGuard(modeTransitionGuard);
				if (result == null) result = caseErrorModelProperty(modeTransitionGuard);
				if (result == null) result = caseElement(modeTransitionGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_MODEL_CLASSIFIER: {
				ErrorModelClassifier errorModelClassifier = (ErrorModelClassifier)theEObject;
				Object result = caseErrorModelClassifier(errorModelClassifier);
				if (result == null) result = caseNamedElement(errorModelClassifier);
				if (result == null) result = caseElement(errorModelClassifier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.OUT_ERROR_PROPAGATION_GUARD: {
				OutErrorPropagationGuard outErrorPropagationGuard = (OutErrorPropagationGuard)theEObject;
				Object result = caseOutErrorPropagationGuard(outErrorPropagationGuard);
				if (result == null) result = caseErrorGuard(outErrorPropagationGuard);
				if (result == null) result = caseErrorModelProperty(outErrorPropagationGuard);
				if (result == null) result = caseElement(outErrorPropagationGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_EVENT_OR_PROPAGATION: {
				ErrorEventOrPropagation errorEventOrPropagation = (ErrorEventOrPropagation)theEObject;
				Object result = caseErrorEventOrPropagation(errorEventOrPropagation);
				if (result == null) result = caseErrorModelFeature(errorEventOrPropagation);
				if (result == null) result = caseNamedElement(errorEventOrPropagation);
				if (result == null) result = caseElement(errorEventOrPropagation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ErrorannexPackage.ERROR_GUARD: {
				ErrorGuard errorGuard = (ErrorGuard)theEObject;
				Object result = caseErrorGuard(errorGuard);
				if (result == null) result = caseErrorModelProperty(errorGuard);
				if (result == null) result = caseElement(errorGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorModelType(ErrorModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorModelFeature(ErrorModelFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorEvent(ErrorEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorState(ErrorState object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorPropagation(ErrorPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorModelImplementation(ErrorModelImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorTransition(ErrorTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Error Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Error Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseBooleanErrorExpression(BooleanErrorExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Annex Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorAnnexLibrary(ErrorAnnexLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Annex Sub Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Annex Sub Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorAnnexSubClause(ErrorAnnexSubClause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Propagation Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Propagation Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorPropagationRule(ErrorPropagationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOccurrenceProperty(OccurrenceProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Error Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Error Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseComponentErrorModelProperty(ComponentErrorModelProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Report Error Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Report Error Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseReportErrorProperty(ReportErrorProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Error Propagation Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Error Propagation Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseInErrorPropagationGuard(InErrorPropagationGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Event Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Event Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object casePortEventGuard(PortEventGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Source Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Source Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorSourceName(ErrorSourceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Derived Error State Mapping Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Derived Error State Mapping Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseDerivedErrorStateMappingGuard(DerivedErrorStateMappingGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error State Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error State Mapping Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorStateMappingRule(ErrorStateMappingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error State Or Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error State Or Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorStateOrPropagation(ErrorStateOrPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Transitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorTransitions(ErrorTransitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Properties</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Properties</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorProperties(ErrorProperties object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Hierarchy Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Hierarchy Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModelHierarchyProperty(ModelHierarchyProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorModelProperty(ErrorModelProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mode Transition Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mode Transition Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModeTransitionGuard(ModeTransitionGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Model Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Model Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorModelClassifier(ErrorModelClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Error Propagation Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Error Propagation Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseOutErrorPropagationGuard(OutErrorPropagationGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Event Or Propagation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Event Or Propagation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorEventOrPropagation(ErrorEventOrPropagation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Error Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Error Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseErrorGuard(ErrorGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnexLibrary(AnnexLibrary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modal Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modal Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseModalElement(ModalElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annex Subclause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public Object caseAnnexSubclause(AnnexSubclause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public Object defaultCase(EObject object) {
		return null;
	}

} //ErrorannexSwitch
