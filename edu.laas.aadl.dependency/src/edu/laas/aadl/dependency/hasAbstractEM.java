/** 
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of this library is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package edu.laas.aadl.dependency;

import org.osate.aadl2.instance.ComponentInstance;
import org.osate.aadl2.instance.ConnectionInstance;
import org.osate.aadl2.instance.InstanceObject;

import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.ModelSelectionType;
import edu.cmu.sei.aadl.errorannex.util.EAXUtil;

/**
 * @author Ana Elena Rugina aerugina@laas.fr
 *
 */

public class hasAbstractEM {
	protected static EAXUtil utilEMA = new edu.cmu.sei.aadl.errorannex.util.EAXUtil();
	/**
	 * Returns true if the component has ModelHierarchy=abstract and has an Error Model Implementation
	 * or doesn't have a ModelHierarchy property but it has an Error Model Implementation
	 * If no ModelHierarchy defined and both an abstract and a derived Error Model are declared
	 * the abtract one is considered by default
	 * @param ci ComponentInstance
	 * @return boolean
	 */
	public static boolean hasCompAbstractEM(ComponentInstance ci){
		ModelHierarchyProperty mhp =utilEMA.getModelHierarchyProperty(ci);
		if (mhp != null){
			if (mhp.getErrorModelSelection().equals(ModelSelectionType.ABSTRACT_LITERAL)){
				ErrorModelClassifier emc = utilEMA.getComponentErrorModelPropertyValue(ci);
				if ( (emc != null) && (emc instanceof ErrorModelImplementation))
					return true;
			}
		}
		else {// mhp == null 
			if (utilEMA.getComponentErrorModelProperty(ci) != null){
				ErrorModelClassifier emc = utilEMA.getComponentErrorModelPropertyValue(ci);
				if ( (emc != null) && (emc instanceof ErrorModelImplementation))
					return true;
			}
		}
	return false;	
	}// end method
	
	/**
	 * This method gets the Error Model Impl of an InstanceObject
	 * (ComponentInstance or ConnectionInstance)
	 * 
	 * @param InstanceObject iobj
	 * @return ErrorModelImplementation emc
	 */
	public static ErrorModelImplementation getErrorModelImplementation(InstanceObject iobj) {
		EAXUtil utilEMA = new EAXUtil();
		ErrorModelClassifier emc = null;
		if (iobj instanceof ComponentInstance) {
			emc = utilEMA.getComponentErrorModelPropertyValue((ComponentInstance) iobj);
		} else if (iobj instanceof ConnectionInstance) {
			emc = utilEMA.getComponentErrorModelPropertyValue((ConnectionInstance) iobj);
		}
		if (emc != null && emc instanceof ErrorModelImplementation) {
			return (ErrorModelImplementation) emc;
		}
		return null;
	}

	/**
	 * Returns true if the connection has ModelHierarchy=abstract and has an Error Model Implementation
	 * or doesn't have a ModelHierarchy property but it has an Error Model Implementation
	 * If no ModelHierarchy defined and both an abstract and a derived Error Model are declared
	 * the abstract one is considered by default
	 * @param ci ConnectiontInstance
	 * @return boolean
	 */
	public static boolean hasConnAbstractEM(ConnectionInstance ci){
		ModelHierarchyProperty mhp =utilEMA.getModelHierarchyProperty(ci);
		if (mhp != null){
			if (mhp.getErrorModelSelection().equals(ModelSelectionType.ABSTRACT_LITERAL)){
				if (utilEMA.getComponentErrorModelProperty(ci) != null)
					return true;
			}
		}
		else {// mhp == null
			if (utilEMA.getComponentErrorModelProperty(ci) != null){
				ErrorModelClassifier emc = utilEMA.getComponentErrorModelPropertyValue(ci);
				if ( (emc != null) && (emc instanceof ErrorModelImplementation))
					return true;
			}
		}
	return false;	
	}// end method

}
