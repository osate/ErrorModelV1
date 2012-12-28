package edu.cmu.sei.aadl.errorannex.unparser;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.annexsupport.AnnexUnparser;

public class ErrorAnnexUnparseAction implements AnnexUnparser { 
	// Need to get aadl resources for resolving components
	// For resolving package names etc
	
	

	/**
	 * Unparse an annex library element found in an AADL model.
	 * 
	 * @param library
	 *                the annex library to unparse.
	 * @param indent
	 *                initial indentation for each line.  
	 * @return The source text for the annex library.
	 */
	public String unparseAnnexLibrary(AnnexLibrary library, String indent){
		ErrorAnnexUnparser eaup = new ErrorAnnexUnparser(indent);
		// unparse
		eaup.unparse( library);
		return eaup.getText();
	}

	/**
	 * Unarse an annex subclause element found in an AADL model.
	 * 
	 * @param subclause
	 *                the source text string in the annex library.
	 * @param indent
	 *                initial indentation for each line.  
	 * @return The source text for the annex subclause.
	 */
	public String unparseAnnexSubclause(AnnexSubclause subclause, String indent){
		ErrorAnnexUnparser eaup = new ErrorAnnexUnparser(indent);
		// unparse
		eaup.unparse(subclause);
		return eaup.getText();
	}
}