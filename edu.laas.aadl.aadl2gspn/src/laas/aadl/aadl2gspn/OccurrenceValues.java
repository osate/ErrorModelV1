/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import java.util.Vector;

/**
 * This class is used to manage the Occurrence properties in aadl in all the cases, 
 * The syntax is the following: distribution_parameter::= real_literal [(+ | * | - ) symbolic_parameter_identifier] | symbolic_parameter_identifier 
 * @author   Marilena Bruffa
 * @uml.dependency   supplier="laas.aadl.aadl2gspn.OccurrenceValue" stereotypes="Omondo::Access"
 */

public class OccurrenceValues {
	
	Vector values = null;
	boolean flag = false;
	
	public OccurrenceValues(){
		values = new Vector();
	}

	public OccurrenceValue getOccurrenceValueByName(String symbolicParamId){	
		for(int i = 0; i < values.size(); i++){
			OccurrenceValue ov = (OccurrenceValue)values.elementAt(i); 
			if(ov.getParam().equals(symbolicParamId))
				return ov;
		}
		return null;	
	}
	
	@SuppressWarnings("unchecked")
	public void setOccurrenceValue(String symbolicParamId, double incrementOffset){
		OccurrenceValue ov = getOccurrenceValueByName(symbolicParamId); 
		
		if(ov != null)
			ov.setOccurrence(incrementOffset);
		else {
			ov = new OccurrenceValue(symbolicParamId,incrementOffset);
			values.addElement(ov);
		}
	}
	
	public String inverseOccurrenceValue(){
		String invOccValue = "";
		
		for(int i= 0; i < values.size(); i++){
			OccurrenceValue ov = (OccurrenceValue)values.elementAt(i);
			double invOcc = ov.getOccurrence() * -1;
			if(invOcc > 0)
				invOccValue = invOccValue.concat("+" + Double.toString(invOcc) + "*" + ov.getParam());
			else 
				if(invOcc < 0){
				invOccValue = invOccValue.concat(Double.toString(invOcc) + "*" + ov.getParam());
				flag = true;
			}
		}
		return invOccValue;
	}
	
	public boolean inverseOccIsNegative(){
		return flag == true;
	}
}

class OccurrenceValue {
	
	String symbolicParamId;
	double occurrence;
	
	public OccurrenceValue(String symbolicParamId, double occurrence){
		this.symbolicParamId = symbolicParamId;
		this.occurrence = occurrence;
	}
	
	public String getParam(){
		return symbolicParamId;
	}
	
	public double getOccurrence(){
		return occurrence;
	}
	
	public void setOccurrence(double incrementOffset){
		occurrence = occurrence + incrementOffset;
	}
}
