/**
 * <copyright>
 * Copyright  2007 by LAAS-CNRS, all rights reserved.
 *
 * Use of ADAPT is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
*/

package laas.aadl.aadl2gspn;

import edu.cmu.sei.aadl.errorannex.ErrorSourceName;

/**
 * This class is used to store into the "and" EList: the literal and its negation
 * if needed.
 */	
public class ErrorSourceNameEnc {
	private ErrorSourceName esn;
	private boolean not;	//if true means that it's the negation
	
	
	public ErrorSourceNameEnc(ErrorSourceName esn, boolean not) {
		this.esn = esn;
		this.not = not;
	}
	
	public ErrorSourceName getEsn() {
		return esn;
	}
	
	public void setNot(boolean not) {
		this.not = not;
	}
	
	public boolean getNot() {
		return not;
	}
}
