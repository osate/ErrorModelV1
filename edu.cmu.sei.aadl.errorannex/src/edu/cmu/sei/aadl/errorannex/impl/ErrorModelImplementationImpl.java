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
 * @version $Id: ErrorModelImplementationImpl.java,v 1.1.4.2 2011-06-28 13:29:41 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.osate.aadl2.modelsupport.AadlConstants;
import org.osate.aadl2.modelsupport.util.AadlUtil;

import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorProperties;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.cmu.sei.aadl.errorannex.ErrorannexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Error Model Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl#getErrorModelType <em>Error Model Type</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl#getErrorTransitions <em>Error Transitions</em>}</li>
 *   <li>{@link edu.cmu.sei.aadl.errorannex.impl.ErrorModelImplementationImpl#getErrorProperties <em>Error Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ErrorModelImplementationImpl extends ErrorModelClassifierImpl implements ErrorModelImplementation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright 2006 by Carnegie Mellon University, all rights reserved";

	/**
	 * The cached value of the '{@link #getErrorModelType() <em>Error Model Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorModelType()
	 * @generated
	 * @ordered
	 */
	protected ErrorModelType errorModelType;

	/**
	 * The cached value of the '{@link #getErrorTransitions() <em>Error Transitions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorTransitions()
	 * @generated
	 * @ordered
	 */
	protected ErrorTransitions errorTransitions;

	/**
	 * The cached value of the '{@link #getErrorProperties() <em>Error Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorProperties()
	 * @generated
	 * @ordered
	 */
	protected ErrorProperties errorProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ErrorModelImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ErrorannexPackage.Literals.ERROR_MODEL_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType getErrorModelType() {
		if (errorModelType != null && ((EObject)errorModelType).eIsProxy()) {
			InternalEObject oldErrorModelType = (InternalEObject)errorModelType;
			errorModelType = (ErrorModelType)eResolveProxy(oldErrorModelType);
			if (errorModelType != oldErrorModelType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE, oldErrorModelType, errorModelType));
			}
		}
		return errorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorModelType basicGetErrorModelType() {
		return errorModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorModelType(ErrorModelType newErrorModelType) {
		ErrorModelType oldErrorModelType = errorModelType;
		errorModelType = newErrorModelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE, oldErrorModelType, errorModelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorTransitions getErrorTransitions() {
		return errorTransitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorTransitions(ErrorTransitions newErrorTransitions, NotificationChain msgs) {
		ErrorTransitions oldErrorTransitions = errorTransitions;
		errorTransitions = newErrorTransitions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS, oldErrorTransitions, newErrorTransitions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorTransitions(ErrorTransitions newErrorTransitions) {
		if (newErrorTransitions != errorTransitions) {
			NotificationChain msgs = null;
			if (errorTransitions != null)
				msgs = ((InternalEObject)errorTransitions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS, null, msgs);
			if (newErrorTransitions != null)
				msgs = ((InternalEObject)newErrorTransitions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS, null, msgs);
			msgs = basicSetErrorTransitions(newErrorTransitions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS, newErrorTransitions, newErrorTransitions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorProperties getErrorProperties() {
		return errorProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorProperties(ErrorProperties newErrorProperties, NotificationChain msgs) {
		ErrorProperties oldErrorProperties = errorProperties;
		errorProperties = newErrorProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES, oldErrorProperties, newErrorProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorProperties(ErrorProperties newErrorProperties) {
		if (newErrorProperties != errorProperties) {
			NotificationChain msgs = null;
			if (errorProperties != null)
				msgs = ((InternalEObject)errorProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES, null, msgs);
			if (newErrorProperties != null)
				msgs = ((InternalEObject)newErrorProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES, null, msgs);
			msgs = basicSetErrorProperties(newErrorProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES, newErrorProperties, newErrorProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS:
				return basicSetErrorTransitions(null, msgs);
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES:
				return basicSetErrorProperties(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE:
				if (resolve) return getErrorModelType();
				return basicGetErrorModelType();
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS:
				return getErrorTransitions();
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES:
				return getErrorProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE:
				setErrorModelType((ErrorModelType)newValue);
				return;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS:
				setErrorTransitions((ErrorTransitions)newValue);
				return;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES:
				setErrorProperties((ErrorProperties)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE:
				setErrorModelType((ErrorModelType)null);
				return;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS:
				setErrorTransitions((ErrorTransitions)null);
				return;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES:
				setErrorProperties((ErrorProperties)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_MODEL_TYPE:
				return errorModelType != null;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_TRANSITIONS:
				return errorTransitions != null;
			case ErrorannexPackage.ERROR_MODEL_IMPLEMENTATION__ERROR_PROPERTIES:
				return errorProperties != null;
		}
		return super.eIsSet(featureID);
	}

    /**
     * get qualified component impl name. Always a String
     */
    public String getQualifiedName() {
        String pname = this.getPackageName();
        String iname = this.getName();
        if (iname == null) iname = AadlConstants.NULL;
        return ((pname == null || pname.length() == 0) ? iname : pname + "::"
                + iname);
    }
    /**
     * get type name from link or parsed name
     */
    public String getTypeName() {
    	 String n = this.getName();
    	 int idx = n.indexOf('.');
    	 if ( idx < 0) 
    	 	return n;
    	 else
    	 	return n.substring(0,n.indexOf('.'));
    }

    /**
     * get qualified type name 
     */
    public String getQualifiedTypeName() {
    	String p = this.getPackageName();
    	return (p.length()>0? p+"::"+this.getTypeName():this.getTypeName());
    }

    /**
     * get implementation name without type name
     */
    public String getImplName() {
   	 String n = this.getName();
	 int idx = n.indexOf('.');
	 if ( idx < 0) 
	 	return n;
	 else
	 	return n.substring(n.indexOf('.')+1);
    }
    
    /**
     * set the name.  Add the type name if the name only contains a name
     * Strip any additional dot names and add old name as comment
     * @param name implementation name
     */
    public void setName(String name){
    	int idx = name.indexOf('.');
    	if ( idx < 0) {
    		// missing type name
    		ErrorModelType t = this.getErrorModelType();
    		if (t != null){
    			String Tname = t.getName();
    			super.setName(Tname+"."+name);
    		}
    		super.setName(name);
    		return;
    	} 
    	if (name.endsWith(".")){
    		name = name + "impl";
    		super.setName(name);
    	} else {
			String typename = name.substring(0, idx);
			String implname = name.substring(idx + 1);
			name=typename + "." + implname;
	    	int secondDot = implname.lastIndexOf('.');
	    	if (secondDot != -1 ){
	    		String nameFragment = implname.substring(0,secondDot);
	    		if (nameFragment.indexOf('.') != -1){
	    			nameFragment = nameFragment.substring(nameFragment.lastIndexOf('.')+1,nameFragment.length());
	    		}
	    		super.setName(nameFragment+"."+implname.substring(secondDot+1,implname.length()));
	    	} else {
	    		super.setName(name);
	    	}
		}
    }

} //ErrorModelImplementationImpl
