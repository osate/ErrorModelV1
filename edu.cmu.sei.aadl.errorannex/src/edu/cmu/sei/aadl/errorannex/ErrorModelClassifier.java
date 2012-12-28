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
 * @version $Id: ErrorModelClassifier.java,v 1.1.4.1 2011-05-04 21:23:05 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex;

import org.osate.aadl2.NamedElement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Error Model Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see edu.cmu.sei.aadl.errorannex.ErrorannexPackage#getErrorModelClassifier()
 * @model abstract="true"
 *        annotation="http:///aadl/OSATE isProxy='true'"
 * @generated
 */
public interface ErrorModelClassifier extends NamedElement {
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";
	/**
	 * find ErrorState in the error model. This method works on error model types and implementations
	 * @param esname ErrorState name
	 * @return ErrorState
	 */
	ErrorState findErrorState(String esname);

	
	/**
	 * find ErrorEvent in the error model. This method works on error model types and implementations
	 * @param eename ErrorEvent name
	 * @return ErrorEvent
	 */
	ErrorEvent findErrorEvent(String eename);

	
	/**
	 * find ErrorPropagation in the error model. This method works on error model types and implementations
	 * @param epname ErrorPropagation name
	 * @return ErrorPropagation
	 */
	ErrorPropagation findErrorPropagation(String epname);


	/**
	 * returns a package name if the error model classifier is contained in a package It
	 * retrieves the name from the containing AadlPackage object
	 *
	 * @return String package name or empty string
	 */
	String getPackageName();


	/**
	 * get qualified component classifier name.
	 * Always a String
	 */
	String getQualifiedName();
	/**
	 * retrieve the Occurrence property if declared in teh error model type or error model implementation for the specified error mdoel feature
	 * @param feature  Error event or Error Proapgation
	 * @return OccurrenceProperty
	 */
	OccurrenceProperty getOccurrenceProperty(ErrorEventOrPropagation feature);

} // ErrorModelClassifier
