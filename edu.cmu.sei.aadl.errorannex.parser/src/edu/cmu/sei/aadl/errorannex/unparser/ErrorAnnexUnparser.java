/*
 * Created on Jun 14, 2006
 *
 * <copyright>
 * Copyright  2006 by Carnegie Mellon University, all rights reserved.
 *
 * Use of the Open Source AADL Tool Environment (OSATE) is subject to the terms of the license set forth
 * at http://www.eclipse.org/legal/cpl-v10.html.
 *
 * NO WARRANTY
 *
 * ANY INFORMATION, MATERIALS, SERVICES, INTELLECTUAL PROPERTY OR OTHER PROPERTY OR RIGHTS GRANTED OR PROVIDED BY
 * CARNEGIE MELLON UNIVERSITY PURSUANT TO THIS LICENSE (HEREINAFTER THE "DELIVERABLES") ARE ON AN "AS-IS" BASIS.
 * CARNEGIE MELLON UNIVERSITY MAKES NO WARRANTIES OF ANY KIND, EITHER EXPRESS OR IMPLIED AS TO ANY MATTER INCLUDING,
 * BUT NOT LIMITED TO, WARRANTY OF FITNESS FOR A PARTICULAR PURPOSE, MERCHANTABILITY, INFORMATIONAL CONTENT,
 * NONINFRINGEMENT, OR ERROR-FREE OPERATION. CARNEGIE MELLON UNIVERSITY SHALL NOT BE LIABLE FOR INDIRECT, SPECIAL OR
 * CONSEQUENTIAL DAMAGES, SUCH AS LOSS OF PROFITS OR INABILITY TO USE SAID INTELLECTUAL PROPERTY, UNDER THIS LICENSE,
 * REGARDLESS OF WHETHER SUCH PARTY WAS AWARE OF THE POSSIBILITY OF SUCH DAMAGES. LICENSEE AGREES THAT IT WILL NOT
 * MAKE ANY WARRANTY ON BEHALF OF CARNEGIE MELLON UNIVERSITY, EXPRESS OR IMPLIED, TO ANY PERSON CONCERNING THE
 * APPLICATION OF OR THE RESULTS TO BE OBTAINED WITH THE DELIVERABLES UNDER THIS LICENSE.
 *
 * Licensee hereby agrees to defend, indemnify, and hold harmless Carnegie Mellon University, its trustees, officers,
 * employees, and agents from all claims or demands made against them (and any related losses, expenses, or
 * attorney's fees) arising out of, or relating to Licensee's and/or its sub licensees' negligent use or willful
 * misuse of or negligent conduct or willful misconduct regarding the Software, facilities, or other rights or
 * assistance granted by Carnegie Mellon University under this License, including, but not limited to, any claims of
 * product liability, personal injury, death, damage to property, or violation of any laws or regulations.
 *
 * Carnegie Mellon University Software Engineering Institute authored documents are sponsored by the U.S. Department
 * of Defense under Contract F19628-00-C-0003. Carnegie Mellon University retains copyrights in all material produced
 * under this contract. The U.S. Government retains a non-exclusive, royalty-free license to publish or reproduce these
 * documents, or allow others to do so, for U.S. Government purposes only pursuant to the copyright license
 * under the contract clause at 252.227.7013.
 *
 * </copyright>
 *
 *
 * @version $Id: ErrorAnnexUnparser.java,v 1.4 2007-05-28 06:17:56 relief Exp $
 */
package edu.cmu.sei.aadl.errorannex.unparser;

import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.osate.aadl2.Element;
import org.osate.aadl2.ModeTransition;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.modelsupport.AadlConstants;
import org.osate.aadl2.modelsupport.UnparseText;
import org.osate.aadl2.parsesupport.AObject;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorModelClassifier;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorProperties;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;
import edu.cmu.sei.aadl.errorannex.TriggerType;
import edu.cmu.sei.aadl.errorannex.util.ErrorannexSwitch;

/**
 * This class implements the error model converter from an AADL object model to textual
 * AADL. The generated text is made available as a string buffer.
 * 
 * @author phf
 */
public class ErrorAnnexUnparser extends ErrorannexSwitch {


	protected UnparseText aadlText;
	
	protected String modelName = "";
	protected static final String DONE = AadlConstants.emptyString;

	protected static final String NONESTMT = "none ;";

	public ErrorAnnexUnparser(String tab) {
		super();
		aadlText = new UnparseText(tab);
	}


	public Object caseErrorModelType(ErrorModelType object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("error model "+object.getName());
		aadlText.addOutputNewline("features");
		aadlText.incrementIndent();
		processEList(object.getFeatures());
		aadlText.decrementIndent();
		aadlText.addOutputNewline("end " + object.getName() + ";");
		return DONE;
	}

	public Object caseErrorEvent(ErrorEvent object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput(object.getName()+": error event");
		if (object.getOccurrenceProperty() != null){
			aadlText.addOutput(" {");
			process(object.getOccurrenceProperty());
			aadlText.addOutput("}");
		}
		aadlText.addOutputNewline(";");
		return DONE;
	}

	public Object caseErrorState(ErrorState object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput(object.getName()+":");
		if (object.isInitial()){
			aadlText.addOutput(" initial");
		}
		if (object.isInactive()){
			aadlText.addOutput(" inactive");
		}
		aadlText.addOutputNewline(" error state;");
		return DONE;
	}

	public Object caseErrorPropagation(ErrorPropagation object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput(object.getName()+":");
		if (object.isIn()){
			aadlText.addOutput(" in");
		}
		if (object.isOut()){
			aadlText.addOutput(" out");
		}
		aadlText.addOutput(" error propagation");
		if (object.getOccurrenceProperty() != null){
			aadlText.addOutput(" {");
			process(object.getOccurrenceProperty());
			aadlText.addOutput("}");
		}
		aadlText.addOutputNewline(";");
		return DONE;
	}

	public Object caseErrorModelImplementation(ErrorModelImplementation object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("error model implementation "+ object.getName());
		
		process(object.getErrorTransitions());
		process(object.getErrorProperties());
		aadlText.addOutputNewline("end " + object.getName() + ";");

		return DONE;
	}

	public Object caseErrorTransition(ErrorTransition object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		EList srclist = object.getOrigin();
		if (srclist.isEmpty()){
			srclist = object.getOriginName();
		}
		processNamelist(srclist,", ");
		aadlText.addOutput(" -[ ");
		/* we don't process the trigger name lists as they do not indicate which item is a event or propagation */
		EList l = object.getTransitionTrigger();
		boolean first = true;
		for (Iterator it = l.iterator(); it.hasNext();){
			if (!first){
				aadlText.addOutput(", ");
			}
			first = false;
			NamedElement obj = (NamedElement)it.next();
			aadlText.addOutput((obj instanceof ErrorPropagation?"in ":"")+obj.getName());
		}
		l = object.getTransitionAction();
		for (Iterator it = l.iterator(); it.hasNext();){
			if (!first){
				aadlText.addOutput(", ");
			}
			first = false;
			NamedElement obj = (NamedElement)it.next();
			aadlText.addOutput("out "+obj.getName());
		}
		EList atl = object.getActivationTrigger();
		for (Iterator it = atl.iterator(); it.hasNext();){
			if (!first){
				aadlText.addOutput(", ");
			}
			first = false;
			TriggerType obj = (TriggerType)it.next();
			aadlText.addOutput(obj.getName());
		}
		String s = (object.getDestination() == null) ? object.getDestinationName()
				: object.getDestination().getName();
		aadlText.addOutputNewline(" ]-> " + s + ";");
		return DONE;
	}

	public Object caseBooleanErrorExpression(BooleanErrorExpression object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		
		BooleanExpressionType pet = object.getType();
		if (pet == BooleanExpressionType.ERRORSOURCENAME_LITERAL){
			process(object.getErrorSourceName());
		} else if ( pet == BooleanExpressionType.OTHERS_LITERAL){
			aadlText.addOutput("others");
		} else if (pet == BooleanExpressionType.NOT_LITERAL){
			aadlText.addOutput("not ");
			if (doParens(object)) aadlText.addOutput("(");
			process((AObject)object.getContainedExpressions().get(0));
			if (doParens(object)) aadlText.addOutput(")");
		} else if (pet == BooleanExpressionType.AND_LITERAL){
			if (doParens(object)) aadlText.addOutput("(");
			process((AObject)object.getContainedExpressions().get(0));
			aadlText.addOutput(" and ");
			process((AObject)object.getContainedExpressions().get(1));
			if (doParens(object)) aadlText.addOutput(")");
		} else if (pet == BooleanExpressionType.OR_LITERAL){
			if (doParens(object)) aadlText.addOutput("(");
			process((AObject)object.getContainedExpressions().get(0));
			aadlText.addOutput(" or ");
			process((AObject)object.getContainedExpressions().get(1));
			if (doParens(object)) aadlText.addOutput(")");
		} else if (pet == BooleanExpressionType.ORLESS_LITERAL){
			if (doParens(object)) aadlText.addOutput("(");
			aadlText.addOutput(new Integer(object.getNumericLiteral()).toString());
			aadlText.addOutput(" orless (");
			processEList(object.getContainedExpressions(),", ");
			aadlText.addOutput(")");
			if (doParens(object)) aadlText.addOutput(")");
		} else if (pet == BooleanExpressionType.ORMORE_LITERAL){
			if (doParens(object)) aadlText.addOutput("(");
			aadlText.addOutput(new Integer(object.getNumericLiteral()).toString());
			aadlText.addOutput(" ormore (");
			processEList(object.getContainedExpressions(),", ");
			aadlText.addOutput(")");
			if (doParens(object)) aadlText.addOutput(")");
		}
		return DONE;
	}
	
	protected boolean doParens(BooleanErrorExpression object){
		BooleanExpressionType pet = object.getType();
		AObject parent = (AObject)object.eContainer();
		if (!(parent instanceof BooleanErrorExpression)){
			return false;
		}
		BooleanExpressionType parentpet = ((BooleanErrorExpression)parent).getType();
		if (pet == BooleanExpressionType.ERRORSOURCENAME_LITERAL){
			return false;
		} else if ( pet == BooleanExpressionType.OTHERS_LITERAL){
			return false;
		} else if (pet == BooleanExpressionType.NOT_LITERAL){
			return false;
		} else if (pet == BooleanExpressionType.AND_LITERAL){
			return parentpet == BooleanExpressionType.NOT_LITERAL;
		} else if (pet == BooleanExpressionType.OR_LITERAL){
			return (parentpet == BooleanExpressionType.NOT_LITERAL) || (parentpet == BooleanExpressionType.AND_LITERAL);
		} else if (pet == BooleanExpressionType.ORLESS_LITERAL){
			return (parentpet == BooleanExpressionType.NOT_LITERAL) || (parentpet == BooleanExpressionType.AND_LITERAL);
		} else if (pet == BooleanExpressionType.ORMORE_LITERAL){
			return (parentpet == BooleanExpressionType.NOT_LITERAL) || (parentpet == BooleanExpressionType.AND_LITERAL);
		} 
		return false;
	}

	public Object caseErrorAnnexLibrary(ErrorAnnexLibrary object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		processEListSeparatorNewline(object.getErrorModelClassifier(),"");
		return DONE;
	}

	public Object caseErrorAnnexSubClause(ErrorAnnexSubClause object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		processEListSeparatorNewline(object.getErrorModelProperty(),";");
		aadlText.addOutputNewline(";");
		return DONE;
	}
	
	public Object caseErrorPropagationRule(ErrorPropagationRule object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput((object.isMask()?"mask":
			(object.getErrorPropagation()!=null?object.getErrorPropagation().getName():object.getErrorPropagationIdentifier()))+" when ");
		process(object.getErrorExpression());
		return DONE;
	}

	public Object caseOccurrenceProperty(OccurrenceProperty object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput("occurrence => ");
		if (object.getType() != null){
			aadlText.addOutput(object.getType().getName());
		} else
		if (object.getNonStandardId() != null && object.getNonStandardId().length()>0){
			aadlText.addOutput("nonstandard::"+object.getNonStandardId());
		}
		aadlText.addOutput(" ");
		processEList(object.getParameterList(), ", ");
		boolean DidAppliesTo = false;
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutput(" applies to error ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutput(" applies to error ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesToName(), ".");
		}
		
		if (object.getAppliesToErrorEventOrPropagation()!= null){
			aadlText.addOutput((DidAppliesTo?".":" applies to error ")+object.getAppliesToErrorEventOrPropagation().getName());
		} else if (object.getEventOrPropagationName()!= null){
			aadlText.addOutput((DidAppliesTo?".":" applies to error ")+object.getEventOrPropagationName());
		}
		return DONE;
	}

	public Object caseComponentErrorModelProperty(ComponentErrorModelProperty object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput("model => ");
		if (object.getInplaceErrorModelType() != null){
			process(object.getInplaceErrorModelType());
		} else {
			ErrorModelClassifier emc = object.getErrorModelClassifier();
			if (emc != null){
				aadlText.addOutput(emc.getQualifiedName());
			} else {
				String pname = object.getPackageIdentifier();
				String tname = object.getErrorModelTypeIdentifier();
				String iname = object.getErrorModelImplementationIdentifier();
				aadlText.addOutput(((pname==null)?"":pname+"::")+tname+((iname==null)?"":"."+iname));
			}
		}
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesToName(), ".");
		}
		return DONE;
	}

	public Object caseReportErrorProperty(ReportErrorProperty object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput("report => ");
		EList fl = object.getErrorStateOrPropagation();
		if (fl == null){
			fl = object.getStateAndPropagationList();
		}
		processNamelist(fl,", ");
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesToName(), ".");
		}
		return DONE;
	}

	public Object caseInErrorPropagationGuard(InErrorPropagationGuard object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("guard_in => ");
		aadlText.incrementIndent();
		EList fl = object.getErrorPropagationRule();
			processEListSeparatorNewline(fl,",");
		aadlText.decrementIndent();
		boolean DidAppliesTo = false;
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo=true;
			processNamelist(object.getAppliesToName(), ".");
		}
		if (object.getAppliesToFeature()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeature(),", ");
		} else if (object.getAppliesToFeatureName()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeatureName(),", ");
		}
		return DONE;
	}

	public Object casePortEventGuard(PortEventGuard object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("guard_event => ");
		aadlText.incrementIndent();
		process(object.getErrorExpression());
		aadlText.decrementIndent();
		boolean DidAppliesTo = false;
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesToName(), ".");
		}
		if (object.getAppliesToFeature()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeature(),", ");
		} else if (object.getAppliesToFeatureName()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeatureName(),", ");
		}
		return DONE;
	}

	public Object caseErrorSourceName(ErrorSourceName object) {
		if (object.getSubcomponentOrFeature()!=null){
			aadlText.addOutput(object.getSubcomponentOrFeature().getName());
		} else if (object.getComponentNameOrFeatureName()==null||object.getComponentNameOrFeatureName().length()==0){
			aadlText.addOutput("self");
		} else {			
			aadlText.addOutput(object.getComponentNameOrFeatureName());
		}
		EList reflist = object.getErrorStateOrPropagation();
		if (reflist.isEmpty()){
			reflist = object.getErrorStateOrPropagationName();
		}
		if (!reflist.isEmpty()){
			aadlText.addOutput("[");
			processNamelist(reflist, ", ");
			aadlText.addOutput("]");
		}
		return DONE;
	}

	public Object caseDerivedErrorStateMappingGuard(DerivedErrorStateMappingGuard object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("derived_state_mapping => ");
		aadlText.incrementIndent();
		EList fl = object.getErrorStateMappingRule();
		if (fl != null){
			processEListSeparatorNewline(fl,",");
		}
		aadlText.decrementIndent();
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			processNamelist(object.getAppliesToName(), ".");
		}
		return DONE;
	}

	public Object caseErrorStateMappingRule(ErrorStateMappingRule object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput(
		(object.getErrorState()!=null?object.getErrorState().getName():object.getComponentErrorStateIdentifier())+" when ");
		process(object.getErrorExpression());
		return DONE;
	}

	public Object caseErrorTransitions(ErrorTransitions object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		EList ftl = object.getOwnedElements(); //eContents();
		// do as transitions
		processOptionalSection(ftl, "transitions", NONESTMT);
		return DONE;
	}

	public Object caseErrorProperties(ErrorProperties object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		EList ftl = object.getOwnedElements(); //eContents();
		// do as transitions
		processOptionalSectionTerminator(ftl, "properties", NONESTMT);
		return DONE;
	}

	public Object caseModelHierarchyProperty(ModelHierarchyProperty object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutput("model_hierarchy => "+object.getErrorModelSelection().getName());
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutput(" applies to ");
			processNamelist(object.getAppliesToName(), ".");
		}
		return DONE;
	}

	public Object caseModeTransitionGuard(ModeTransitionGuard object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("guard_transition => ");
		process(object.getErrorExpression());
		boolean DidAppliesTo = false;
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesToName(), ".");
		}
		ModeTransition mt = object.getAppliesToModeTransition();
		if (mt !=null &&  mt instanceof NamedElement){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			aadlText.addOutput(((NamedElement)mt).getName());
			return DONE;
		}
		EList cxtlist = ECollections.EMPTY_ELIST;//object.getAppliesToFeatureContext();
		if (cxtlist.isEmpty()){
			cxtlist = object.getAppliesToFeatureContextName();
		} else {
			cxtlist = getNameList(cxtlist);
		}
		EList featurelist = object.getAppliesToFeature();
		if (featurelist.isEmpty()){
			featurelist = object.getAppliesToFeatureName();
		} else {
			featurelist = getNameList(featurelist);
		}
		if (!featurelist.isEmpty()){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processDoublelist(cxtlist,featurelist,", ");
		}
		return DONE;
	}


	public Object caseOutErrorPropagationGuard(OutErrorPropagationGuard object) {
		processComments(object);
		// add location counter
		object.setLocationReference(modelName, aadlText.getLineCount());
		aadlText.addOutputNewline("guard_out => ");
		EList fl = object.getErrorPropagationRule();
		processEListSeparatorNewline(fl,",");
		boolean DidAppliesTo = false;
		if (!object.getAppliesTo().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesTo(), ".");
		} else if (!object.getAppliesToName().isEmpty()){
			aadlText.addOutputNewline("");
			aadlText.addOutput("applies to ");
			DidAppliesTo = true;
			processNamelist(object.getAppliesToName(), ".");
		}
		if (object.getAppliesToFeature()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeature(),", ");
		} else if (object.getAppliesToFeatureName()!= null){
			if (!DidAppliesTo) aadlText.addOutputNewline("");
			aadlText.addOutput(DidAppliesTo?".":"applies to ");
			processNamelist(object.getAppliesToFeatureName(),", ");
		}
		return DONE;
	}


	
	protected final void process(AObject o){
		if (o != null)
			doSwitch( o);
	}
	
	public final void unparse(Element o){
		AObject obj = o.getElementRoot();
		if (obj instanceof NamedElement) {
			modelName = ((NamedElement) obj).getName();
		}
		process(o);
	}
	
	/**
	 * get text that has been unparsed sofar
	 * @return String
	 */
	public String getText(){
		return aadlText.getParseOutput();
	}

	protected void processComments(final AObject obj) {
		if (obj != null) {
//			EList el = obj.getComment();
//			for (Iterator it = el.iterator(); it.hasNext();) {
//				String comment = (String) it.next();
//				if (!comment.startsWith("--")) {
//					comment = "-- " + comment;
//				}
//				aadlText.addOutputNewline(comment);
//			}
		}
	}

	protected final void processEList(final EList list) {
		for (Iterator it = list.iterator(); it.hasNext();) {
			AObject obj = (AObject) it.next();
			this.process(obj);
		}
	}

	protected final void processEList(final EList list, String separator) {
		if (list.isEmpty())return;
		Iterator it = list.iterator();
		Object obj = it.next();
		if (obj instanceof String){
			aadlText.addOutput((String)obj);
		} else {
			this.process((AObject)obj);
		}
		while (it.hasNext()) {
			aadlText.addOutput(separator);
			obj = it.next();
			if (obj instanceof String){
				aadlText.addOutput((String)obj);
			} else {
				this.process((AObject)obj);
			}
		}
	}

	/**
	 * process list of strings or list of NamedElements by outputting their name String
	 * otherwise process it by switch.
	 * @param list
	 * @param separator
	 */
	protected final void processNamelist(final EList list, String separator) {
		if (list.isEmpty()) return;
		Iterator it = list.iterator();
		Object obj = it.next();
		if (obj instanceof String){
			aadlText.addOutput((String)obj);
		} else if (obj instanceof NamedElement){
				aadlText.addOutput(((NamedElement)obj).getName());
		} else {
			this.process((AObject)obj);
		}
		while (it.hasNext()) {
			aadlText.addOutput(separator);
			obj = it.next();
			if (obj instanceof String){
				aadlText.addOutput((String)obj);
			} else if (obj instanceof NamedElement){
				aadlText.addOutput(((NamedElement)obj).getName());
			} else {
				this.process((AObject)obj);
			}
		}
	}

	/**
	 * process list of strings or list of NamedElements by outputting their name String
	 * otherwise process it by switch.
	 * @param list
	 * @param separator
	 */
	protected final void processDoublelist(final EList list, final EList list2, String separator) {
		if (list.isEmpty()) return;
		Iterator it = list.iterator();
		Iterator it2 = list2.iterator();
			aadlText.addOutput((String)it.next()+"."+it2.next());
		while (it.hasNext()) {
			aadlText.addOutput(separator);
			aadlText.addOutput((String)it.next()+"."+it2.next());
		}
	}


	protected final void processEListSeparatorNewline(final EList list, String separator) {
		if (list.isEmpty())return;
		Iterator it = list.iterator();
		Object obj = it.next();
		if (obj instanceof String){
			aadlText.addOutput((String)obj);
		} else {
			this.process((AObject)obj);
		}
		while (it.hasNext()) {
			aadlText.addOutputNewline(separator);
			obj = it.next();
			if (obj instanceof String){
				aadlText.addOutput((String)obj);
			} else {
				this.process((AObject)obj);
			}
		}
	}

	/**
	 * Does processing of list as optional section without separators
	 * 
	 * @param list
	 *            to be processed
	 * @param sectionName
	 *            section
	 * @param emptyOption
	 *            shown with section name if empty list
	 */
	public void processOptionalSection(EList list, String sectionName,
			String emptyOption) {
		if (list == null)
			return;
		if (!list.isEmpty()) {
			aadlText.addOutputNewline(sectionName);
			aadlText.incrementIndent();
			processEList(list);
			// final semi-colon. in this situation semi-colon is a terminator
			aadlText.decrementIndent();
		} else if (emptyOption != null && emptyOption.length() > 0) {
			aadlText.addOutputNewline(sectionName + " " + emptyOption);
		}
	}

	/**
	 * Does processing of list as optional section without separators
	 * 
	 * @param list
	 *            to be processed
	 * @param sectionName
	 *            section
	 * @param emptyOption
	 *            shown with section name if empty list
	 */
	public void processOptionalSectionTerminator(EList list, String sectionName,
			String emptyOption) {
		if (list == null)
			return;
		if (!list.isEmpty()) {
			aadlText.addOutputNewline(sectionName);
			aadlText.incrementIndent();
			processEListSeparatorNewline(list,";");
			// final semi-colon. in this situation semi-colon is a terminator
			aadlText.addOutputNewline(";");
			aadlText.decrementIndent();
		} else if (emptyOption != null && emptyOption.length() > 0) {
			aadlText.addOutputNewline(sectionName + " " + emptyOption);
		}
	}
	
	/**
	 * given a list of references to NameElements return a list of their names as strings
	 * @param reflist NamedElements
	 * @return EList string
	 */
	protected EList getNameList(EList reflist){
		EList namelist = new BasicEList();
		for (Iterator it = reflist.iterator(); it.hasNext();){
			namelist.add(((NamedElement)it.next()).getName());
		}
		return namelist;
	}

}
