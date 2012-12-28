package edu.cmu.sei.aadl.errorannex.parser;

import org.eclipse.emf.common.util.EList;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorannexFactory;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;

public class EPACloner {
	private ErrorannexFactory eaxf;
	public EPACloner(ErrorannexFactory eaxf){
		this.eaxf = eaxf;
	}
	
	public ErrorModelProperty cloneEpa(ErrorModelProperty epa){
		if(epa==null) return null;
		
		ErrorModelProperty epaclone = null;
		if(epa instanceof DerivedErrorStateMappingGuard){
			epaclone = cloneESME((DerivedErrorStateMappingGuard)epa);
		}
		if(epa instanceof InErrorPropagationGuard){
			epaclone = cloneInGuard((InErrorPropagationGuard)epa);
		}
		if(epa instanceof OutErrorPropagationGuard){
			epaclone = cloneOutGuard((OutErrorPropagationGuard)epa);
		}
		if(epa instanceof PortEventGuard){
			epaclone = cloneEventGuard((PortEventGuard)epa);
		}
		if(epa instanceof ModeTransitionGuard){
			epaclone = cloneTransitionGuard((ModeTransitionGuard)epa);
		}
		if(epa instanceof ComponentErrorModelProperty){
			epaclone = cloneMepe((ComponentErrorModelProperty)epa);
		}
		if(epa instanceof OccurrenceProperty){
			epaclone = cloneOcc((OccurrenceProperty)epa);
		}
		if(epa instanceof ModelHierarchyProperty){
			epaclone = cloneMhepe((ModelHierarchyProperty)epa);
		}
		if(epa instanceof ReportErrorProperty){
			epaclone = cloneRepe((ReportErrorProperty)epa);
		}		
		epaclone.setLocationReference(epa.getLocationReference());
		return epaclone;
	}

	private ReportErrorProperty cloneRepe(ReportErrorProperty expression) {
		if(expression==null) return null;
		ReportErrorProperty repeclone = eaxf.createReportErrorProperty();
		EList features = expression.getStateAndPropagationList();
		for(int i=0;i<features.size();i++){
			repeclone.getStateAndPropagationList().add((String)features.get(i));			
		}		
		repeclone.setLocationReference(expression.getLocationReference());
		return repeclone;
	}

	private ModelHierarchyProperty cloneMhepe(ModelHierarchyProperty expression) {
		if(expression==null) return null;
		ModelHierarchyProperty mhepeclone = eaxf.createModelHierarchyProperty();
		mhepeclone.setErrorModelSelection(expression.getErrorModelSelection());
		mhepeclone.setLocationReference(expression.getLocationReference());		
		return mhepeclone;
	}

	private OccurrenceProperty cloneOcc(OccurrenceProperty expression) {
		if(expression==null) return null;
		OccurrenceProperty oepeclone = eaxf.createOccurrenceProperty();
		oepeclone.setType(expression.getType());
		oepeclone.setNonStandardId(expression.getNonStandardId());
		EList plist = expression.getParameterList();
		if(plist!=null){
			for(int i=0;i<plist.size();i++){
				oepeclone.getParameterList().add((String)plist.get(i));
			}
		}
		
		oepeclone.setLocationReference(expression.getLocationReference());
		return oepeclone;
	}

	private ComponentErrorModelProperty cloneMepe(ComponentErrorModelProperty expression) {
		if(expression==null) return null;
		ComponentErrorModelProperty mepeclone = eaxf.createComponentErrorModelProperty();
		mepeclone.setPackageIdentifier(expression.getPackageIdentifier());
		mepeclone.setErrorModelTypeIdentifier(expression.getErrorModelTypeIdentifier());
		mepeclone.setErrorModelImplementationIdentifier(expression.getErrorModelImplementationIdentifier());
		mepeclone.setLocationReference(expression.getLocationReference());		
		return mepeclone;
	}

	private ErrorModelFeature clonefeature(ErrorModelFeature feature) {
		if(feature==null) return null;
		ErrorModelFeature clonef = null;
		if(feature instanceof ErrorEvent){
			clonef = cloneEvent((ErrorEvent) feature);
		}
		else
		if(feature instanceof ErrorPropagation){
			clonef = cloneProp((ErrorPropagation) feature);
		}
		else
		if(feature instanceof ErrorState){
			clonef = cloneState((ErrorState) feature);
		}
		clonef.setName(feature.getName());
		
		OccurrenceProperty op = feature.getOccurrenceProperty();
			clonef.setOccurrenceProperty(cloneOcc(op));
		clonef.setLocationReference(feature.getLocationReference());
		return clonef;
	}

	private ErrorModelFeature cloneState(ErrorState state) {
		if(state==null) return null;
		ErrorState stateclone = eaxf.createErrorState();
		stateclone.setInactive(state.isInactive());
		stateclone.setInitial(state.isInitial());		
		return stateclone;
	}

	private ErrorModelFeature cloneProp(ErrorPropagation prop) {
		if(prop==null) return null;
		ErrorPropagation cloneprop =eaxf.createErrorPropagation();
		cloneprop.setIn(prop.isIn());
		cloneprop.setOut(prop.isOut());
		return cloneprop;
	}

	private ErrorModelFeature cloneEvent(ErrorEvent event) {
		if(event==null) return null;
		ErrorEvent cloneev = eaxf.createErrorEvent();		
		return cloneev;
	}

	private PortEventGuard cloneEventGuard(PortEventGuard expression) {
		if(expression==null) return null;
		PortEventGuard cloneexp = eaxf.createPortEventGuard();
		cloneexp.setErrorExpression(cloneBee(expression.getErrorExpression()));
		cloneexp.setLocationReference(expression.getLocationReference());	
		return cloneexp;
	}

	private ModeTransitionGuard cloneTransitionGuard(ModeTransitionGuard expression) {
		if(expression==null) return null;
		ModeTransitionGuard cloneexp = eaxf.createModeTransitionGuard();
		cloneexp.setErrorExpression(cloneBee(expression.getErrorExpression()));
		cloneexp.setLocationReference(expression.getLocationReference());	
		return cloneexp;
	}

	private InErrorPropagationGuard cloneInGuard(InErrorPropagationGuard expression) {
		if(expression==null) return null;
		InErrorPropagationGuard expclone = eaxf.createInErrorPropagationGuard();
		EList eprs = expression.getErrorPropagationRule();
		for(int i=0;i<eprs.size();i++){
			expclone.getErrorPropagationRule().add(cloneEpr((ErrorPropagationRule)eprs.get(i)));			
		}
		expclone.setLocationReference(expression.getLocationReference());
		return expclone;
	}

	private OutErrorPropagationGuard cloneOutGuard(OutErrorPropagationGuard expression) {
		if(expression==null) return null;
		OutErrorPropagationGuard expclone = eaxf.createOutErrorPropagationGuard();
		EList eprs = expression.getErrorPropagationRule();
		for(int i=0;i<eprs.size();i++){
			expclone.getErrorPropagationRule().add(cloneEpr((ErrorPropagationRule)eprs.get(i)));			
		}
		expclone.setLocationReference(expression.getLocationReference());
		return expclone;
	}

	private ErrorPropagationRule cloneEpr(ErrorPropagationRule rule) {
		if(rule==null) return null;
		ErrorPropagationRule ruleclone = eaxf.createErrorPropagationRule();
		ruleclone.setMask(rule.isMask());
		ruleclone.setErrorPropagationIdentifier(rule.getErrorPropagationIdentifier());
		ruleclone.setErrorExpression(cloneBee(rule.getErrorExpression()));
		ruleclone.setLocationReference(rule.getLocationReference());	
		return ruleclone;
	}

	private DerivedErrorStateMappingGuard cloneESME(DerivedErrorStateMappingGuard expr) {
		if(expr==null) return null;
		DerivedErrorStateMappingGuard esmeclone = eaxf.createDerivedErrorStateMappingGuard();
		EList esmrs = expr.getErrorStateMappingRule();
		for(int i=0;i<esmrs.size();i++){
			esmeclone.getErrorStateMappingRule().add(cloneESMR((ErrorStateMappingRule)esmrs.get(i)));
		}
		esmeclone.setLocationReference(expr.getLocationReference());
		return esmeclone;
	}

	private ErrorStateMappingRule cloneESMR(ErrorStateMappingRule rule) {
		if(rule==null) return null;
		ErrorStateMappingRule ruleclone = eaxf.createErrorStateMappingRule();
		ruleclone.setComponentErrorStateIdentifier(rule.getComponentErrorStateIdentifier());
		ruleclone.setErrorExpression(cloneBee(rule.getErrorExpression()));	
		ruleclone.setLocationReference(rule.getLocationReference());
		return ruleclone;
	}

	private BooleanErrorExpression cloneBee(BooleanErrorExpression bee) {
		if(bee==null) return null;
		BooleanErrorExpression beeclone = eaxf.createBooleanErrorExpression();
		beeclone.setType(bee.getType());
		beeclone.setNumericLiteral(bee.getNumericLiteral());
		EList containedbees = bee.getContainedExpressions();
		for(int i=0;i<containedbees.size();i++){
			beeclone.getContainedExpressions().add(cloneBee((BooleanErrorExpression)containedbees.get(i)));			
		}
		beeclone.setErrorSourceName(cloneEsn(bee.getErrorSourceName()));
		beeclone.setLocationReference(bee.getLocationReference());
		return beeclone;
	}

	private ErrorSourceName cloneEsn(ErrorSourceName esn) {
		if(esn==null) return null;
		ErrorSourceName esnclone = eaxf.createErrorSourceName();
		EList sorp = esn.getErrorStateOrPropagationName();

		for(int i=0;i<sorp.size();i++){	
			esnclone.getErrorStateOrPropagationName().add((String)sorp.get(i));
		}
		
		esnclone.setComponentNameOrFeatureName(esn.getComponentNameOrFeatureName());
		esnclone.setLocationReference(esn.getLocationReference());
		return esnclone;
	}

}
