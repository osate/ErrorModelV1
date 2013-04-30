header{
package edu.cmu.sei.aadl.errorannex.parser;

import edu.cmu.sei.aadl.errorannex.*;

import java.util.Vector;
	import java.util.Iterator;
	import edu.cmu.sei.aadl.model.core.*;

import antlr.TokenStreamRecognitionException;
import edu.cmu.sei.aadl.model.pluginsupport.ParseErrorReporter;
import org.eclipse.emf.common.util.BasicEList;
}

// **********************************************************
/* THE PARSER */
// **********************************************************
//modifying eax.g 10/13/05 khary
class EAXParser extends Parser;

options {
	buildAST=false;
	k=4;
	defaultErrorHandler=false;
} 

{
	/* The factory used to create metamodel entities. */ 
	protected ErrorannexFactory eaxF = ErrorannexFactory.eINSTANCE;	
	private EPACloner cloner = new EPACloner(eaxF);
	//if a get form a hash map returns null should put an error (not exception)

protected ParseErrorReporter errReporter = null;
	
	
	/**
	 * sets the resource being parsed. This is the resoruce error markers are attached to
	 * @param res  Iresource being parsed
	 */
		
	public void setParseErrorReporter(final ParseErrorReporter reporter) {
		  errReporter = reporter;
	}
	
	/** This method overrides the default method provided by ANTLR
	 * Report parser error
	 * @param msg  error message
	 * @param e  antlr error exception 
	 */
	public  void reportError(RecognitionException e)  {
		errReporter.error(e.getFilename(), e.getLine(), e.getMessage());
	}


	/**
	 * the current resource being parsed
	 */
	protected SplitStreamFilter filter = null;
	
	/**
	 * sets the filter for pulling comment tokens.
	 * @param filter  filter with comment tokens
	 */
	public void setFilter(SplitStreamFilter filter){
		this.filter = filter;
	}

	/**
	 * the current resource being parsed
	 */
	protected int startLine = 1;
	
	public void setStartLine(int line){
		startLine = line;
	}
	
	/* Process comments attached to the beginning of a declaration */
	public void processComments(AObject o){
		attachComments(o, getComments());
	}

	/* Get comments at the start of a declaration */
	public Vector getComments() {
		if (filter == null ) return null;
		return filter.getSplitTokens();
	}

	/* Attach comments to an object. */
	public void attachComments(AObject o, Vector cmt) {
		if (cmt == null) return;
		for ( Iterator i = cmt.iterator(); i.hasNext();)
		{
			Token t = (Token) i.next();
			o.addComment(t.getText());
		}	
	}

	/* Process comments attached to the end of a declaration */
	public void processPostComments(AObject o){
		if (filter == null ) return;
		Vector cmt = filter.getSplitTokens();
		for ( Iterator i = cmt.iterator(); i.hasNext();)
		{
			Token t = (Token) i.next();
			o.addComment(t.getText());
		}
	}

	
} 
//	Note: ensure that each ANTLR method returns a valid object 
//	even in an error state in order to prevent exceptions
// 	Whenever errors are detected they should be reported on detection 
//	but the erroneus method should return an object in spite of the error
// 	to prevent exceptions

// **********************************************************
// Error Annex Library
// **********************************************************
annex_specific_language_construct returns [ErrorAnnexLibrary eal = null] // Reference: AR1
options {defaultErrorHandler=true;} 
:   
	(eal = error_annex_classifier) EOF //+?
;

error_annex_classifier returns [ErrorAnnexLibrary eal = null] // Reference AR2
options {defaultErrorHandler=true;} 
:	{
		eal = eaxF.createErrorAnnexLibrary();
		ErrorModelType emt = null;
		ErrorModelImplementation emi = null;
		
	}
	(
		(
			emt = error_model_type{ eal.addErrorModelClassifier(emt);}
			|emi = error_model_implementation{eal.addErrorModelClassifier(emi);}
		) 
	)+
	{
		processComments(eal);
		boolean errorFound = false;
	}
;

   


// **********************************************************
// Types 
// **********************************************************

error_model_type returns [ErrorModelType emt = null]// Reference: AR3 //checked
options {defaultErrorHandler=true;}
	:error_model id:IDENT   
    {	emt = eaxF.createErrorModelType(); 
    	processComments(emt);
    	String identifier = id.getText();
    	int line = id.getLine();
    	emt.setName(identifier);
    	emt.setLocationReference(this.getFilename(),line);
    }
	FEATURES 
		(
			error_model_feature[emt] 
		)+
    END eid:IDENT SEMI 
    {
    	processComments(emt);
    	//block checks for mismatch in identifiers
    	if (!id.getText().equalsIgnoreCase(eid.getText())) 
    	throw new SemanticException("identifier "+eid.getText()+
    	" does not match defining identifier "+id.getText(),
    	this.getFilename(),eid.getLine(),eid.getColumn());
    }
;

 
error_model_feature [ErrorModelType emt]// Reference: AR4
options {defaultErrorHandler=true;}
    :   {//init block
    		Vector [] fInfo = new Vector[2];
        }
       fInfo = feature_identifier_list ln:COLON // must check feature_identifier_list
       (//must check spec lists  	
       		error_event_spec[emt,fInfo]
        	|  error_propagation_spec[emt,fInfo] 
        	|  error_state_spec[emt,fInfo]
       	)
        SEMI 
;

  
error_event_spec[ErrorModelType emt, Vector[] listInfo] // Reference: AR5
options {defaultErrorHandler=true;}
    :{
    	Vector fList = listInfo[0];
    	Vector fLoc = listInfo[1];
    	OccurrenceProperty epa = null;
    } 
    ee:ERROR EVENT    
        (LCURLY
			id1:OCCURRENCE ASSIGN  epa = occurrence_error_property_expression {epa.setLocationReference(this.getFilename(),id1.getLine());}
      	(SEMI)? RCURLY )? 
      {// block assumes fList does not contain null references
	      	for (int i=0; i<fList.size(); i++ ){	          
	          	ErrorEvent ev = eaxF.createErrorEvent();
	          	String identifier = (String) fList.elementAt(i);
	          	ev.setName((String) fList.elementAt(i));
	          	if (epa != null){
	        			OccurrenceProperty epaTemp = (OccurrenceProperty)cloner.cloneEpa(epa);
	        			ev.setOccurrenceProperty(epaTemp);
	          	}
	          	ev.setLocationReference(this.getFilename(),((Integer)fLoc.get(i)).intValue());
	          	emt.addFeatures(ev);
	          	processComments(ev);
	        } 
      }
	;
  
error_propagation_spec[ErrorModelType emt, Vector[] listInfo]// Reference: AR6
options {defaultErrorHandler=true;}    
    : 	{
        	Vector fList = listInfo[0];
	    	Vector fLoc = listInfo[1];
	    	boolean in = false;
	       	boolean out = false;
	       	OccurrenceProperty epa = null;
       	}
      (IN {in = true;}| OUT {out = true;} | IN OUT {in=true; out=true;}) ep:ERROR PROPAGATION
        (LCURLY
			id1:OCCURRENCE ASSIGN  epa = occurrence_error_property_expression {epa.setLocationReference(this.getFilename(),id1.getLine());}
      (SEMI)? RCURLY )? 
      {// block assumes fList does not contain null references
      	for (int i=0; i<fList.size(); i++ ){
          ErrorPropagation prop = eaxF.createErrorPropagation();
          String identifier = (String) fList.elementAt(i);
          prop.setName(identifier);
          prop.setIn(in);
          prop.setOut(out); 
	      if (epa != null){
	      		OccurrenceProperty epaTemp = (OccurrenceProperty)cloner.cloneEpa(epa);
	      		prop.setOccurrenceProperty(epaTemp);
	      }
          prop.setLocationReference(this.getFilename(),((Integer)fLoc.get(i)).intValue());
	      emt.addFeatures(prop);
	      processComments(prop);
       }
      } 
	;
   
error_state_spec[ErrorModelType emt, Vector[] listInfo]// Reference: AR7
options {defaultErrorHandler=true;}
    : {
    	boolean initial = false;
       	boolean inactive = false;
       	Vector fList = listInfo[0];
    	Vector fLoc = listInfo[1];       	
       }
      (INITIAL {initial = true;}(INACTIVE {inactive = true;})?)? err:ERROR STATE 
      {// block assumes fList does not contain null references
      	for (int i=0; i<fList.size(); i++ ){
          ErrorState state = eaxF.createErrorState();
          String identifier = (String) fList.elementAt(i);
          state.setName(identifier);
          state.setInitial(initial);
          state.setInactive(inactive);   
	      emt.addFeatures(state);
	      processComments(state);
          state.setLocationReference(this.getFilename(),((Integer)fLoc.get(i)).intValue());
       	}
      }
	;


 
 
// ********************************************************** 
// Implemetnation section
//***********************************************************
 
error_model_implementation returns [ErrorModelImplementation emi = null]//Reference: AR13
options {defaultErrorHandler=true;}
	:{
		emi = eaxF.createErrorModelImplementation();
		processComments(emi);
	}
	(
		em:ERROR MODEL IMPL typeid:IDENT DOT defid:IDENT
	)
	{	
		String identifier = typeid.getText()+"."+defid.getText();
		emi.setOkName(identifier);
		ErrorTransition errorTrans = null;
		OccurrenceProperty imp_err_asst = null;
		emi.setLocationReference(this.getFilename(),em.getLine());
		}
	 TRANSITIONS 	( { ErrorTransitions emts = eaxF.createErrorTransitions();
	 					emi.setErrorTransitions(emts); }
		 				(
		 					errorTrans = error_transition
			 				{
			 					emts.addErrorTransition(errorTrans);
			 				}
		 				)+
		 				| (NONE SEMI)
	 				) 
	 (
	 	PROPERTIES 
	 	(   { ErrorProperties emps = eaxF.createErrorProperties();
	 					emi.setErrorProperties(emps); }
	 		(
	 			imp_err_asst = implementation_error_property_association
	 			{
	 				emps.addOccurrenceProperty((OccurrenceProperty)imp_err_asst);
	 			}
	 		)+ 
	 		|NONE SEMI
	 	)
	 )? 
	END id:IDENT DOT id2:IDENT SEMI
    { 
    	processComments(emi);
    	if (!((id.getText().equalsIgnoreCase(typeid.getText()) && id2.getText().equalsIgnoreCase(defid.getText()) ))){
	    	throw new SemanticException("identifier "+typeid.getText()+"." 
	    	+defid.getText()+" does not match defining identifier "+
	    	id.getText()+"."+id2.getText(),this.getFilename(),id.getLine(),id.getColumn());
    	}
    }
;




error_transition  returns[ErrorTransition transition = null]//Reference: AR14
options {defaultErrorHandler=true;}
	: 
		{
			String origin="";
			String destination = "";
			Vector events = new Vector();
			Vector propagations = new Vector();
			int line = 1;
			transition = eaxF.createErrorTransition();
			processComments(transition);
		}
		id:IDENT
		{
			origin = id.getText();
			transition.addOriginName(origin);
		} 
		(
			COMMA id2:IDENT
			{
			origin = id2.getText();
			transition.addOriginName(origin);
				}
		)* 
		LTRANS 
			//label = error_transition_label 
			(
				(	
					event_or_propagation[transition]
					|transition_label[transition] 
					
				)
				(
					COMMA (
							event_or_propagation[transition]
							|transition_label[transition]
							)
				)*
				
			)
		loc:RTRANS 
		destination = error_state_identifier SEMI
		  {
			transition.setLocationReference(this.getFilename(),id.getLine());
			transition.setDestinationName(destination);

		}
; 

event_or_propagation [ErrorTransition transition]// Reference: AR15
options {defaultErrorHandler=true;}
	:{
		String propagation_id = "";
		
	 }
	(
		(
			id:IDENT
			{
					String event_id = id.getText();
					transition.addTransitionTriggerName( event_id);
			}
		)|
		(
			(IN id1: IDENT 
			{propagation_id = id1.getText();
			 transition.addTransitionTriggerName( propagation_id);
			}	
			|OUT id2: IDENT 
			{propagation_id = id2.getText();
			 transition.addTransitionActionName( propagation_id);
				})
		)
	)		
;

transition_label [ErrorTransition transition]// Reference: AR15
options {defaultErrorHandler=true;}
	:
	 (
		id1:ACTIVATE
			{
				transition.addActivationTrigger(TriggerType.ACTIVATE_LITERAL);	
			}
		| id2:DEACTIVATE 
			{
				transition.addActivationTrigger(TriggerType.DEACTIVATE_LITERAL);
			}
		)
;

distribution_name [OccurrenceProperty op]// Reference: AR10
options {defaultErrorHandler=true;}  
	: lineRef1:FIXED {
			op.setType(DistributionName.get("fixed"));
			op.setLocationReference(this.getFilename(),lineRef1.getLine());}
	| lineRef2:POISSON {
			op.setType(DistributionName.get("poisson"));
			op.setLocationReference(this.getFilename(),lineRef2.getLine());}
	| NONSTANDARD DOUBLECOLON id:IDENT{
			op.setType(DistributionName.get("nonstandard"));
			op.setNonStandardId(id.getText());
			op.setLocationReference(this.getFilename(),id.getLine());}
; 
      
       
distribution_parameters [OccurrenceProperty op]//Reference: AR11
options {defaultErrorHandler=true;}
	: distribution_expression[op]
	(
		COMMA distribution_expression[op]
	)*
    ;
    
    distribution_expression [OccurrenceProperty op]
options {defaultErrorHandler=true;}
: num1:NUMERIC_LIT
		{ op.addParameterList(num1.getText()); } 
		|
		id1: IDENT
		{ op.addParameterList(id1.getText()); } 
		|
		num2:NUMERIC_LIT PLUS id2: IDENT
		{ op.addParameterList(num2.getText()+"+"+id2.getText()); } 
		|
		num3:NUMERIC_LIT MINUS id3: IDENT
		{ op.addParameterList(num3.getText()+"-"+id3.getText()); } 
		|
		num4:NUMERIC_LIT STAR id4: IDENT
		{ op.addParameterList(num4.getText()+"*"+id4.getText()); } 
;

// **********************************************************
/* Error Annex Subclause */
// **********************************************************/
error_annex_subclause_classifier returns [ErrorAnnexSubClause easc = null] // Reference: AR18
options {defaultErrorHandler=true;}
:	{
		easc = eaxF.createErrorAnnexSubClause();
		processComments(easc);
		easc.setLocationReference(this.getFilename(),startLine);//needs to be redone fixed, "1" is not right
	}
	(
		(
			error_annex_subclause_error_property_association[easc] loc:SEMI
		)
		{ processComments(easc);}
	)+ EOF
;

error_annex_subclause_error_property_association [ErrorAnnexSubClause easc]  // Reference: AR:19
options {defaultErrorHandler=true;}
:	{
		ErrorModelProperty epa = null;
		ErrorModelProperty epaTemp = null;
		ErrorGuard guard = null;
		ModeTransitionGuard mtguard = null;
		OccurrenceProperty occ = null;
		String ContextName = "";
	}
   (//block assumes expressions are not null
	( (id:MODEL ASSIGN  epa = model_error_property_expression {epa.setLocationReference(this.getFilename(),id.getLine());}
	   |id2:REPORT ASSIGN  epa = report_error_property_expression {epa.setLocationReference(this.getFilename(),id2.getLine());}
	   |id7:MODEL_HIERARCHY ASSIGN  epa = model_hierarchy_expression { epa.setLocationReference(this.getFilename(),id7.getLine());}
	   |id8:DERIVED_STATE_MAPPING ASSIGN  epa = error_state_mapping_expression {epa.setLocationReference(this.getFilename(),id8.getLine());}
	  )
			(
				APPLIES TO 
					fId1:IDENT{epa.addAppliesToName(fId1.getText());}
				(DOT
					fId2:IDENT {epa.addAppliesToName(fId2.getText());}
				)*
			)?
				{ easc.addErrorModelProperty(epa); processComments(epa);}
	) |
	(
	   id1:OCCURRENCE ASSIGN  occ = occurrence_error_property_expression {occ.setLocationReference(this.getFilename(),id1.getLine());}
			(
				APPLIES TO ERROR
				( fIdx1:IDENT{occ.addAppliesToName(fIdx1.getText());}
				DOT )*
					fIdx2:IDENT {occ.setEventOrPropagationName(fIdx2.getText());}
			)
				{ easc.addErrorModelProperty(occ); processComments(occ); }
	) |
	(
	  (id3:GUARD_IN ASSIGN  guard = guard_in_error_property_expression { guard.setLocationReference(this.getFilename(),id3.getLine());}
	   |id4:GUARD_OUT ASSIGN  guard = guard_out_error_property_expression { guard.setLocationReference(this.getFilename(),id4.getLine());}
	   |id5:GUARD_EVENT ASSIGN  guard = guard_event_error_property_expression { guard.setLocationReference(this.getFilename(),id5.getLine());}
	  )
			(
				APPLIES TO 
				( fIdx4:IDENT{guard.addAppliesToName(fIdx4.getText());}
				DOT )*
					fId4:IDENT{guard.addAppliesToFeatureName(fId4.getText());}
				(COMMA 
				( fIdx3:IDENT{guard.addAppliesToName(fIdx3.getText());}
				DOT )*
					fId3:IDENT{guard.addAppliesToFeatureName(fId3.getText());}
				)*
			)
				{ easc.addErrorModelProperty(guard); processComments(guard); }
	) |
	( (id6:GUARD_TRANSITION ASSIGN  mtguard = guard_transition_error_property_expression { mtguard.setLocationReference(this.getFilename(),id6.getLine());}
	  )
			(	{ ContextName = ""; }
				APPLIES TO 
				( fId11:IDENT{ ContextName = fId11.getText();}
				DOT )?
					fId22:IDENT {mtguard.addAppliesToFeatureName(fId22.getText());mtguard.addAppliesToFeatureContextName(ContextName);}
				(COMMA { ContextName = ""; }
				 ( fId33:IDENT{ContextName = fId33.getText();}
				  DOT )?
					fId44:IDENT {mtguard.addAppliesToFeatureName(fId44.getText());mtguard.addAppliesToFeatureContextName(ContextName);}
				)*
			)
				{ easc.addErrorModelProperty(mtguard);
				processComments(mtguard); }
	)
   )
;  

     
  

implementation_error_property_association returns [OccurrenceProperty epa = null]// Reference: AR17
options {defaultErrorHandler=true;} 
:   {
	    
	     String name;
	     String id; 
	     String featureId ="";
	     ErrorModelFeature ef = null;
     }
			id1:OCCURRENCE ASSIGN  epa = occurrence_error_property_expression {epa.setLocationReference(this.getFilename(),id1.getLine());}
     loc:APPLIES TO featureId = feature_identifier SEMI 
     {
			 epa.setEventOrPropagationName(featureId);	
			 processComments(epa);	
     }    
;
 
report_error_property_expression returns [ReportErrorProperty repe = null] // Reference: AR31
options {defaultErrorHandler=true;} 
:   {
		repe = eaxF.createReportErrorProperty();
		String identifier = "";
    }
    (
    	id:IDENT {identifier = id.getText();repe.addStateAndPropagationList(identifier);}
    	(COMMA identifier = feature_identifier{repe.addStateAndPropagationList(identifier);})*
    )
    {
    	repe.setLocationReference(this.getFilename(),id.getLine());
    }
;  

model_error_property_expression returns [ComponentErrorModelProperty mepe = null] // Reference: AR20
options {defaultErrorHandler=true;} 
:   {
		String packageIdentifier = "";
		String modelTypeIdentifier = "";
		String errorModelImplimentationIdentifier = "";
		ErrorModelType emt = null;
		int line = 0;
		mepe = eaxF.createComponentErrorModelProperty();
    }
    (
    	(
			(packageIdentifier = package_identifier DOUBLECOLON)? 
			id:IDENT 	{modelTypeIdentifier = id.getText();line = id.getLine();}
			(DOT errorModelImplimentationIdentifier = error_model_implementation_identifier)?
		)
	)
	{
		
			
			mepe.setErrorModelTypeIdentifier(modelTypeIdentifier);
			mepe.setErrorModelImplementationIdentifier(errorModelImplimentationIdentifier);
			mepe.setPackageIdentifier(packageIdentifier);
			mepe.setLocationReference(this.getFilename(),line);
	}
	|{ErrorModelType emt = null; } emt = error_model_type
	{
		mepe = eaxF.createComponentErrorModelProperty();
		mepe.setInplaceErrorModelType(emt);
		mepe.setLocationReference(emt.getLocationReference());
	}

;  
 
occurrence_error_property_expression returns [OccurrenceProperty oepe = null] // Reference: AR9
options {defaultErrorHandler=true;} //need to take care of or, and
:   {
     	oepe = eaxF.createOccurrenceProperty();
    }
    (
    	distribution_name[oepe] (distribution_parameters[oepe])?//must check distribution_parameters
    )    
;

guard_event_error_property_expression returns [PortEventGuard vetepe = null] //Reference: AR30
options {defaultErrorHandler=true;} 
:   {
		vetepe = eaxF.createPortEventGuard();
		BooleanErrorExpression bee = null;
    }
    (
    	bee = boolean_error_expression
    )
    {
		vetepe.setErrorExpression(bee);
		vetepe.setLocationReference(bee.getLocationReference());
    }
; 

guard_transition_error_property_expression returns [ModeTransitionGuard vetepe = null] //Reference: AR30
options {defaultErrorHandler=true;} 
:   {
		vetepe = eaxF.createModeTransitionGuard();
		BooleanErrorExpression bee = null;
    }
    (
    	bee = boolean_error_expression
    )
    {
		vetepe.setErrorExpression(bee);
		vetepe.setLocationReference(bee.getLocationReference());
    }
; 

guard_in_error_property_expression returns [InErrorPropagationGuard vioepe = null] //Reference: AR28
options {defaultErrorHandler=true;} 
:   {
		vioepe = eaxF.createInErrorPropagationGuard();
		ErrorPropagationRule epr = null;
    }
    (
    	epr = 	error_propagation_rule{vioepe.addErrorPropagationRule(epr); 
    		vioepe.setLocationReference(epr.getLocationReference());}//must check error_propagation_rule
    			(COMMA epr = error_propagation_rule{vioepe.addErrorPropagationRule(epr);})*
    )
; 

guard_out_error_property_expression returns [OutErrorPropagationGuard vioepe = null] //Reference: AR28
options {defaultErrorHandler=true;} 
:   {
		vioepe = eaxF.createOutErrorPropagationGuard();
		ErrorPropagationRule epr = null;
    }
    (
    	epr = 	error_propagation_rule{vioepe.addErrorPropagationRule(epr); 
    		vioepe.setLocationReference(epr.getLocationReference());}//must check error_propagation_rule
    			(COMMA epr = error_propagation_rule{vioepe.addErrorPropagationRule(epr);})*
    )
; 

error_propagation_rule returns [ErrorPropagationRule epr = null] // Refernece: AR29
options {defaultErrorHandler=true;}
    : 	{
    		epr = eaxF.createErrorPropagationRule();
    		processComments(epr);
    		String errorPropagationIdentifier = "";
    		boolean mask = false;
    		BooleanErrorExpression bee = null;
    		int line = 1;
    	}
    	(
    		(id:IDENT {errorPropagationIdentifier = id.getText();line = id.getLine();}
    		|MASK{mask = true;}
    		) WHEN bee = boolean_error_expression
    	)
    	{
			epr.setErrorPropagationIdentifier(errorPropagationIdentifier);
    		epr.setMask(mask);
    		epr.setErrorExpression(bee);
    		epr.setLocationReference(this.getFilename(),line);
    	}
	;
	
boolean_error_expression returns [BooleanErrorExpression bee = null]// Reference: AR26-1
options {defaultErrorHandler=true;}
    : 	{
    		BooleanErrorExpression bee1 = null;    		
    		BooleanErrorExpression bee2 = null;
			String type = "";
    		bee = eaxF.createBooleanErrorExpression();// to ensure null is not returned
    	}
    
		(
    		
			locN:NOT bee1 = boolean_error_expression
			{
				bee.setType(BooleanExpressionType.get("not"));
				bee.addContainedExpressions(bee1);
    			bee.setLocationReference(this.getFilename(),locN.getLine());
			}
			|
			(
				bee = semi_atomic_boolean_expression
				|LPAREN bee = boolean_error_expression RPAREN				
			)
			(
				(AND{type = "and";}|OR{type = "or";})
			 	bee2 = boolean_error_expression
			 	{	int line = bee.getLocationReference().getLine();
			 		bee1 = bee;
			 		bee = eaxF.createBooleanErrorExpression();//point to new bee
					bee.setType(BooleanExpressionType.get(type));
			 		bee.addContainedExpressions(bee1);// add first bee
			 		bee.addContainedExpressions(bee2);//add second
	    			bee.setLocationReference(this.getFilename(),line);
				}
			 )?    		
		)

	;


semi_atomic_boolean_expression returns [BooleanErrorExpression bee = null]// Reference: AR26-2
options {defaultErrorHandler=true;}
    : 	{
    		ErrorSourceName esn = null;
    		bee = eaxF.createBooleanErrorExpression();// to ensure null is not returned
    		BooleanErrorExpression beeTemp = null;// to ensure null is not returned
    		String type = "";
    	}
    	(
    		esn = error_source_name
    			{
    				bee.setType(BooleanExpressionType.get("errorsourcename"));
	    			bee.setErrorSourceName(esn);
	    			bee.setLocationReference(esn.getLocationReference()); 
    			}    			
    		|numeric:NUMERIC_LIT (ORMORE{type = "ormore";}|ORLESS{type = "orless";})
    			LPAREN beeTemp = boolean_error_expression {bee.addContainedExpressions(beeTemp);}
    			(COMMA beeTemp = boolean_error_expression {bee.addContainedExpressions(beeTemp);})* RPAREN
    			{	
    				int number;
    				try{
    					number = (int) Double.parseDouble(numeric.getText());
    				}
    				catch(Exception e){
    						throw new SemanticException("Invalid number - '"+numeric.getText()+"'",this.getFilename(),numeric.getLine(),numeric.getColumn());// check !!!
    				}
    				bee.setType(BooleanExpressionType.get(type));
    				bee.setNumericLiteral(number);
    				bee.setLocationReference(this.getFilename(),numeric.getLine());
    				
    			}
    			
    		|oth:OTHERS
    			{
    				type = "others";
    				bee.setType(BooleanExpressionType.get(type));
    				bee.setLocationReference(this.getFilename(),oth.getLine());
    			}

    	)
;

error_source_name returns [ErrorSourceName errorSourceName = null]// Reference: AR27
options {defaultErrorHandler=true;}
:  	{
		boolean self = false;
		String identifier = "";
		Vector [] idInfo = new Vector[2];
		Vector identifiers = new Vector();
		errorSourceName = eaxF.createErrorSourceName();
		int line = 1;
		
	}
	(
	    ( subid: IDENT DOT { errorSourceName.setSubcomponentName(subid.getText()); } )?
		(id2:SELF{self =true; line = id2.getLine();}
		|id1: ERROR { identifier = "error"; line = id1.getLine();}
		|id:IDENT{identifier = id.getText(); line = id.getLine();}) 
		(
			LSQUARE idInfo = feature_identifier_list RSQUARE 
			{
				identifiers = idInfo[0];
			}
		)?
	)
	{
		errorSourceName.setComponentNameOrFeatureName(identifier);

    	for(int i=0;i<identifiers.size();i++){
    		String identifierTemp = (String)identifiers.get(i);
    		errorSourceName.addErrorStateOrPropagationName(identifierTemp);
    	}    	
    	errorSourceName.setLocationReference(this.getFilename(),line);
	}
;   

model_hierarchy_expression returns [ModelHierarchyProperty mhe = null] //Reference: AR21
options {defaultErrorHandler=true;} 
:   {
		mhe = eaxF.createModelHierarchyProperty();
		boolean derived = false;
		boolean abstract_ = false;
		int line;
    }
    (
		ln:DERIVED{mhe.setErrorModelSelection(ModelSelectionType.DERIVED_LITERAL); line = ln.getLine();}
		|ln1:ABSTRACT{mhe.setErrorModelSelection(ModelSelectionType.ABSTRACT_LITERAL);line = ln1.getLine();}
	)
		{
			mhe.setLocationReference(this.getFilename(),line);
		}
; 

error_state_mapping_expression returns [DerivedErrorStateMappingGuard esme = null] //Reference: AR22
options {defaultErrorHandler=true;} 
:   {
		esme = eaxF.createDerivedErrorStateMappingGuard();
		ErrorStateMappingRule esmr = null;
    }
	esmr = error_state_mapping_rule 
		{
			if(esmr.getLocationReference()!=null){
				int line = esmr.getLocationReference().getLine();
				esme.setLocationReference(this.getFilename(),line);
				esme.addErrorStateMappingRule(esmr);	
			}
		}
	(
		COMMA esmr = error_state_mapping_rule 
		{
			esme.addErrorStateMappingRule(esmr);
		}
	)*
; 

error_state_mapping_rule returns [ErrorStateMappingRule esmr = null] //Reference: AR23
options {defaultErrorHandler=true;} 
:   {
		esmr = eaxF.createErrorStateMappingRule();
		processComments(esmr);
		BooleanErrorExpression bee = null;
		
    }
    (
    	id:IDENT WHEN bee = boolean_error_expression
    )
    {
    	esmr.setLocationReference(this.getFilename(),id.getLine());
		esmr.setComponentErrorStateIdentifier(id.getText());
		esmr.setErrorExpression(bee);
    }
; 

// 
error_model
options {defaultErrorHandler=true;} 
:ERROR MODEL
;

// **********************************************************
// Identifiers
// **********************************************************

package_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;

error_model_type_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;

feature_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;

error_model_implementation_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;   

error_event_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;

error_propagation_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT {id = new String(fId.getText());}
;

error_state_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:	fId:IDENT {id = new String(fId.getText());}
;

component_name_or_unique_port_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT{id = new String(fId.getText());}
;

component_error_state_identifier returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId:IDENT{id = new String(fId.getText());}
;

contained_unit_identifier_combined returns [String id = null]
options {defaultErrorHandler=true;} 
:
	fId1:IDENT{id = fId1.getText();}
	
	(DOT
		fId2:IDENT {id = id+"."+fId2.getText();}
	)*
;

feature_identifier_list returns [Vector [] featureInfo = new Vector[2]]
options {defaultErrorHandler=true;}
	:  {
			Vector featureIdentifierList = new Vector();
			Vector featureLocation = new Vector();
			featureInfo[0] = featureIdentifierList;
			featureInfo[1] = featureLocation;
		
		}id:IDENT 
			{
				String f = id.getText();
				int loc = id.getLine();
				if(f == null){
					f="";
					throw new SemanticException("Error in feature identifier list",this.getFilename(),id.getLine(),id.getColumn());	
				}
				else{
					featureIdentifierList.add(f);
					featureLocation.add(new Integer(loc));
				}
			} 
	   (
	   	COMMA id2:IDENT 
	   		{
	   			f = id2.getText();
	   			loc = id.getLine();
				if(f == null){
					f="";
					throw new SemanticException("Error in feature identifier list",this.getFilename(),id2.getLine(),id2.getColumn());	
				}
				else{
					featureIdentifierList.add(f);
					featureLocation.add(new Integer(loc));
				}
	   		}
	   )*
    ;   
/* THE LEXER */  

class EAXLexer extends Lexer;

options {
    k=3; // needed for newline
    charVocabulary='\u0000'..'\u007F'; // allow ascii
    caseSensitive = false;
    caseSensitiveLiterals = false;
	defaultErrorHandler=true;
}

tokens {
	ABSTRACT="abstract";
	ABSTRACTION="abstraction";
	ACCESS="access";
	ACTIVATE="activate";
	DEACTIVATE="deactivate";
	ALL="all";
	AND="and";
	ANNEX="annex";
	APPLIES="applies";
	BINDING="binding";
	BOOLEAN="aadlboolean";
	BUS="bus";
	CALLS="calls";
	CLASSIFIER="classifier";
	CONNECTIONS="connections";
	CONSTANT="constant";
	DATA="data";
	DELTA="delta";
	DERIVED="derived";
	DERIVED_STATE_MAPPING="derived_state_mapping";
	DEVICE="device";
	END="end";
	ENUMERATION="enumeration";
	ERROR = "error";
	EVENT="event";
	EXTENDS="extends";
	FALSE="false";
	FEATURES="features";
	FIXED="fixed";
	FLOW="flow";
	FLOWS="flows";
	GROUP="group";
	IMPL="implementation";
	IN="in";
	INACTIVE = "inactive"; 
	INHERIT="inherit";
	INITIAL="initial";
	INTEGER="aadlinteger";
	INVERSE="inverse";
	IS="is";
	LIST="list";
	MASK="mask";
	MEMORY="memory";
	MODE="mode";
	MODEL="model";
	MODEL_HIERARCHY="model_hierarchy";
	MODES="modes";
	NONE="none";
	NONSTANDARD="nonstandard";
	NOT="not";
	OCCURRENCE="occurrence";
	OF="of";
	OR="or";
	ORLESS="orless";
	ORMORE="ormore";
	OTHERS="others";
	OUT="out";
	PACKAGE="package";
	PARAMETER="parameter";
	PATH="path";
	POISSON="poisson";
	PORT="port";
	PRIVATE="private";
	PROCESS="process";
	PROCESSOR="processor";
	PROPAGATION="propagation";
	PROPERTIES="properties";
	PROPERTY="property";
	PROVIDES="provides";
	PUBLIC="public";
	RANGE="range";
	REAL="aadlreal";
	REFERENCE="reference";
	REFINED="refined";
	REFINES="refines";
	REPORT="report";
	REQUIRES = "requires";
	SELF="self";
	SERVER="server";
	SET = "set";
	SINK="sink";
	SOURCE="source";
	STATE="state";
	STRING="aadlstring";
	SUBCOMPONENTS="subcomponents";
	SUBPROGRAM="subprogram";
	SYSTEM="system";
	THREAD="thread";
	TO="to";
	TRANSITIONS="transitions";
	TRUE="true";
	TYPE="type";
	UNITS="units";
	VALUE="value";
	GUARD_EVENT="guard_event";
	GUARD_IN="guard_in";
	GUARD_OUT="guard_out";
	GUARD_TRANSITION="guard_transition";
	WHEN="when";
	
}

{
	/**
	 * the current resource being parsed
	 */
	protected ParseErrorReporter errReporter = null;

	/**
	 * Set the Parse Error Reporter with which to produce error messages.
	 */
	public void setParseErrorReporter(final ParseErrorReporter reporter) {
		  errReporter = reporter;
	}
		
	/**
	 * Report lexer error
	 * @param e  antlr error exception 
	 */
	public  void reportError(RecognitionException e) {
		  errReporter.error(e.getFilename(), e.getLine(), e.getMessage());		  
	}

	/**
	 * Dummy method
	 * see http://www.antlr.org:8080/pipermail/antlr-interest/2005-August/013323.html and replies
	 */
	 void recover (RecognitionException e, BitSet b) {
	 }
} 
LPAREN: '(' ;
RPAREN: ')' ;
LCURLY: '{' ;
RCURLY: '}' ;
COLON:  ':' ;
PLUS  : '+' ;
MINUS : '-' ;
STAR  : '*' ;
SEMI  : ';' ;
COMMA : ',' ;
DOT	  : '.' ;
DOTDOT : ".." ;
ASSIGN : "=>";
ASSIGNPLUS : "+=>";
DOUBLECOLON: "::";
LTRANS : "-[";
RTRANS : "]->";
ARROW : "->" ;
DARROW: "->>";
HASH: '#';
RSQUARE: ']';
LSQUARE: '[';
  
// identificators in the form aaa or aaa_bbb
IDENT:	('a'..'z'
        //|'A'..'Z'
        ) ( ('_')? ('a'..'z'
        //|'A'..'Z'
        |'0'..'9'))*
			exception
          catch [RecognitionException ex] {
            reportError(ex);
			consume();
          }
	;

// string literals
STRING_LITERAL
	:	'"' (ESC|~('"'|'\\'))* '"'
	;


NUMERIC_LIT : //Reference: AR12,
		( DIGIT )+
		(( '#' BASED_INTEGER  '#' ( INT_EXPONENT )? )
		| ( '_' ( DIGIT )+ )*  // INTEGER
		  ( { LA(2)!='.' }?  //&& LA(3)!='.' }?
				// real
			( '.' ( DIGIT )+ ( '_' ( DIGIT )+ )* ( EXPONENT )?)
				// integer with exponent
			| (INT_EXPONENT)?
		  )
		)
			exception
          catch [RecognitionException ex] {
            reportError(ex);
			consume();
          }
  ;



// a couple protected methods to assist in matching the various numbers

protected
DIGIT   :  ( '0'..'9' ) ;

protected
EXPONENT           :   ('e') ('+'|'-')? NUMERIC_LIT;

protected
INT_EXPONENT           :  ('e') ('+'|'-')? ( DIGIT )+ 
			exception
          catch [RecognitionException ex] {
            reportError(ex);
			consume();
          }
;


protected
EXTENDED_DIGIT     :  ( DIGIT | 'a'..'f' ) ;

protected
BASED_INTEGER      :  ( EXTENDED_DIGIT ) ( ('_')? EXTENDED_DIGIT )* ;

protected
BASE				: DIGIT ( DIGIT )?
;

// escape sequence -- note that this is protected; it can only be called
//   from another lexer rule -- it will not ever directly return a token to
//   the parser
// There are various ambiguities hushed in this rule.  The optional
// '0'...'9' digit matches should be matched here rather than letting
// them go back to STRING_LITERAL to be matched.  ANTLR does the
// right thing by matching immediately; hence, it's ok to shut off
// the FOLLOW ambig warnings.
protected
ESC
	:	'\\'
		(	'n'
		|	'r'
		|	't'
		|	'b'
		|	'f'
		|	'"'
		|	'\''
		|	'\\'
		|	('u')+ HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
		|	'0'..'3'
			(
				options {
					warnWhenFollowAmbig = false;
				}
			:	'0'..'7'
				(
					options {
						warnWhenFollowAmbig = false;
					}
				:	'0'..'7'
				)?
			)?
		|	'4'..'7'
			(
				options {
					warnWhenFollowAmbig = false;
				}
			:	'0'..'7'
			)?
		)
	;


// hexadecimal digit (again, note it's protected)
protected
HEX_DIGIT
	:	('0'..'9'|
	//'A'..'F'|
	'a'..'f')
	;


WS    : ( ' '
        | '\r' '\n' {newline();}
        | '\n' {newline();}
        | '\t' {tab();}
        )
        {$setType(Token.SKIP);}
      ;    


// Annex text processing: derived from multiple-line comments
ANNEX_TEXT
	:	"{**"
		(	/*	'\r' '\n' can be matched in one alternative or by matching
				'\r' in one iteration and '\n' in another.  I am trying to
				handle any flavor of newline that comes in, but the language
				that allows both "\r\n" and "\r" and "\n" to all be valid
				newline is ambiguous.  Consequently, the resulting grammar
				must be ambiguous.  I'm shutting this warning off.
			 */
			options {
				generateAmbigWarnings=false;
			}
		:
			{ LA(2)!='*' || LA(3) != '}' }? '*'
		|	'\r' '\n'		{newline();}
		|	'\r'			{newline();}
		|	'\n'			{newline();}
		|	~('*'|'\n'|'\r')
		)*
		"**}"
	; 
 
     
// Single-line comments
SL_COMMENT
	:	"--"
		(~('\n'|'\r'))* 
	;