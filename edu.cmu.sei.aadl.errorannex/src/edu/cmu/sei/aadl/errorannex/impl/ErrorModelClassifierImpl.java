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
 * @version $Id: ErrorModelClassifierImpl.java,v 1.1.4.1 2011-05-04 21:23:09 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.osate.aadl2.AadlPackage;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.PackageSection;
import org.osate.aadl2.impl.NamedElementImpl;
import org.osate.aadl2.modelsupport.AadlConstants;
import org.osate.aadl2.modelsupport.util.AadlUtil;

import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorEventOrPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class ErrorModelClassifierImpl extends NamedElementImpl implements ErrorModelClassifier {
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
	protected ErrorModelClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_MODEL_CLASSIFIER;
	}

	/**
	 * find ErrorState in the error model. This method works on error model types and implementations
	 * @param esname ErrorState name
	 * @return ErrorState
	 */
	public ErrorState findErrorState(String esname){
		ErrorModelType emt;
		if (this instanceof ErrorModelType){
			emt = (ErrorModelType)this;
		} else {
			emt = ((ErrorModelImplementation)this).getErrorModelType();
		}
		if (emt != null){
			NamedElement ne = AadlUtil.findNamedElementInList(emt.getFeatures(),esname);
			if (ne instanceof ErrorState){
				return (ErrorState)ne;
			}
		}
		return null;
	}
	
	/**
	 * find ErrorEvent in the error model. This method works on error model types and implementations
	 * @param eename ErrorEvent name
	 * @return ErrorEvent
	 */
	public ErrorEvent findErrorEvent(String eename){
		ErrorModelType emt;
		if (this instanceof ErrorModelType){
			emt = (ErrorModelType)this;
		} else {
			emt = ((ErrorModelImplementation)this).getErrorModelType();
		}
		if (emt != null){
			NamedElement ne = AadlUtil.findNamedElementInList(emt.getFeatures(),eename);
			if (ne instanceof ErrorEvent){
				return (ErrorEvent)ne;
			}
		}
		return null;
	}
	
	/**
	 * find ErrorPropagation in the error model. This method works on error model types and implementations
	 * @param epname ErrorPropagation name
	 * @return ErrorPropagation
	 */
	public ErrorPropagation findErrorPropagation(String epname){
		ErrorModelType emt;
		if (this instanceof ErrorModelType){
			emt = (ErrorModelType)this;
		} else {
			emt = ((ErrorModelImplementation)this).getErrorModelType();
		}
		if (emt != null){
			NamedElement ne = AadlUtil.findNamedElementInList(emt.getFeatures(),epname);
			if (ne instanceof ErrorPropagation){
				return (ErrorPropagation)ne;
			}
		}
		return null;
	}

	/**
	 * returns a package name if the error model classifier is contained in a package It
	 * retrieves the name from the containing AadlPackage object
	 *
	 * @return String package name or empty string
	 */
	public String getPackageName() {
		EObject parent = this.eContainer().eContainer();
		if (parent instanceof PackageSection)
			parent = parent.eContainer();
		if (parent instanceof AadlPackage) {
			return ((AadlPackage) parent).getName();
		} else {
			return AadlConstants.emptyString;
		}
	}

	/**
	 * get qualified component classifier name.
	 * Always a String
	 */
	public String getQualifiedName() {
		if ( this instanceof ErrorModelType)
			return ((ErrorModelType)this).getQualifiedName();
		else if ( this instanceof ErrorModelImplementation)
			return ((ErrorModelImplementation)this).getQualifiedName();
		return "";
	}
	
	/**
	 * retrieve the Occurrence property if declared in teh error model type or error model implementation for the specified error mdoel feature
	 * @param feature  Error event or Error Proapgation
	 * @return OccurrenceProperty
	 */
	public OccurrenceProperty getOccurrenceProperty(ErrorEventOrPropagation feature){
		OccurrenceProperty occ = null;
		if (feature instanceof ErrorEvent || feature instanceof ErrorPropagation){
			OccurrenceProperty res = ((ErrorModelFeature)feature).getOccurrenceProperty();
			if (res != null ){
				occ = res;
			}
			if ( this instanceof ErrorModelImplementation){
				ErrorModelImplementation emi = (ErrorModelImplementation)this;
				if (emi.getErrorProperties() != null){
					EList olist = emi.getErrorProperties().getOccurrenceProperty();
					for (Iterator it = olist.iterator();it.hasNext();){
						OccurrenceProperty op = (OccurrenceProperty)it.next();
						if (op.getAppliesToErrorEventOrPropagation() == feature){
							occ = op;
						}
					}
				}
			}
		} else {
			return null;
		}
		return occ;
	}

} //ErrorModelClassifierImpl
