package edu.cmu.sei.aadl.errorannex.parser;

import java.util.List;

import org.osate.aadl2.modelsupport.errorreporting.AnalysisErrorReporterManager;
import org.osate.annexsupport.AnnexResolver;

import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;

public class ErrorAnnexResolverAction implements AnnexResolver{

	public void resolveAnnex(String annexName, List annexElements, AnalysisErrorReporterManager errManager) {
		ErrorAnnexResolver ear = new ErrorAnnexResolver(errManager);

		for(int i=0;i<annexElements.size();i++){
			Object obj = annexElements.get(i);
			if(obj instanceof ErrorAnnexLibrary){
				ear.nameResolveLibrary((ErrorAnnexLibrary)obj);
			}
		}
		for(int i=0;i<annexElements.size();i++){
			Object obj = annexElements.get(i);
			if(obj instanceof ErrorAnnexSubClause){
				ear.nameResolveSubclause((ErrorAnnexSubClause)obj);
			}
		}
				
	}
}
