/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import java.util.Enumeration;
import java.util.Hashtable;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import PetriNet.Place;
import PetriNet.Transition;

/**
 * 
 * This is a support class, it is used to store all the informations relative to the 
 * intermediaryPlace created in the NameMatchingPropagation transformation
 * 
 * @author Marilena Bruffa
 *
 */

public class Structure{
	protected ErrorPropagation ep;	//error propagation that's sent out
	protected Place p;	//propagation place
	protected Transition t;	//out transition 
	
	/**
	 * Create a new instance of object Structure
	 *  
	 * @param ep ErrorPropagation
	 * @param p Place
	 * @param t Transition
	 */
	
	public Structure( ErrorPropagation ep, Place p, Transition t){
		this.ep = ep;
		this.p = p;
		this.t = t;
	}
	
	
	
	
	/**
	 * 
	 * @return the ErrorPropagation field
	 */
	
	protected ErrorPropagation getErrorPropagation(){
		return ep;
	}
	
	/**
	 * 
	 * @return the Place field
	 */
	
	public Place getPlace(){
		return p;
	}
	
	/**
	 * 
	 * @return the Transition field
	 */
	
	protected Transition getTransition(){
		return t;
	}
	
	

	/**
	 * 
	 * Puts all elements of type EList from the hashtable in an EList
	 *  
	 * @param table_dest Hashtable
	 * @param table Hashtable
	 * @return result Hashtable containing both the elements of table_dest and table
	 */
	public static EList putHashtableElementsInList(Hashtable source){
		EList result = new BasicEList();
		for(Enumeration e = source.elements(); e.hasMoreElements();){
			EList currentElement = (EList)e.nextElement();
			result.addAll(currentElement);
		}
		return result;
	}
}

