// $ANTLR : "eax.g" -> "EAXParser.java"$

package edu.cmu.sei.aadl.errorannex.parser;

import java.util.Iterator;
import java.util.Vector;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;
import org.osate.aadl2.parsesupport.AObject;

import edu.cmu.sei.aadl.errorannex.BooleanErrorExpression;
import edu.cmu.sei.aadl.errorannex.BooleanExpressionType;
import edu.cmu.sei.aadl.errorannex.ComponentErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.DerivedErrorStateMappingGuard;
import edu.cmu.sei.aadl.errorannex.DistributionName;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexLibrary;
import edu.cmu.sei.aadl.errorannex.ErrorAnnexSubClause;
import edu.cmu.sei.aadl.errorannex.ErrorEvent;
import edu.cmu.sei.aadl.errorannex.ErrorGuard;
import edu.cmu.sei.aadl.errorannex.ErrorModelFeature;
import edu.cmu.sei.aadl.errorannex.ErrorModelImplementation;
import edu.cmu.sei.aadl.errorannex.ErrorModelProperty;
import edu.cmu.sei.aadl.errorannex.ErrorModelType;
import edu.cmu.sei.aadl.errorannex.ErrorPropagation;
import edu.cmu.sei.aadl.errorannex.ErrorPropagationRule;
import edu.cmu.sei.aadl.errorannex.ErrorProperties;
import edu.cmu.sei.aadl.errorannex.ErrorSourceName;
import edu.cmu.sei.aadl.errorannex.ErrorState;
import edu.cmu.sei.aadl.errorannex.ErrorStateMappingRule;
import edu.cmu.sei.aadl.errorannex.ErrorTransition;
import edu.cmu.sei.aadl.errorannex.ErrorTransitions;
import edu.cmu.sei.aadl.errorannex.ErrorannexFactory;
import edu.cmu.sei.aadl.errorannex.InErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.ModeTransitionGuard;
import edu.cmu.sei.aadl.errorannex.ModelHierarchyProperty;
import edu.cmu.sei.aadl.errorannex.ModelSelectionType;
import edu.cmu.sei.aadl.errorannex.OccurrenceProperty;
import edu.cmu.sei.aadl.errorannex.OutErrorPropagationGuard;
import edu.cmu.sei.aadl.errorannex.PortEventGuard;
import edu.cmu.sei.aadl.errorannex.ReportErrorProperty;
import edu.cmu.sei.aadl.errorannex.TriggerType;

public class EAXParser extends antlr.LLkParser       implements EAXParserTokenTypes
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
	protected int startLine = 1;
	
	public void setStartLine(int line){
		startLine = line;
	}
	protected String fileName ;
	
	public void setTheFileName(String name){
		fileName = name;
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
//			o.addComment(t.getText());
		}	
	}

	/* Process comments attached to the end of a declaration */
	public void processPostComments(AObject o){
		if (filter == null ) return;
		Vector cmt = filter.getSplitTokens();
		for ( Iterator i = cmt.iterator(); i.hasNext();)
		{
			Token t = (Token) i.next();
//			o.addComment(t.getText());
		}
	}

	

protected EAXParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public EAXParser(TokenBuffer tokenBuf) {
  this(tokenBuf,4);
}

protected EAXParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public EAXParser(TokenStream lexer) {
  this(lexer,4);
}

public EAXParser(ParserSharedInputState state) {
  super(state,4);
  tokenNames = _tokenNames;
}

	public final ErrorAnnexLibrary  annex_specific_language_construct() throws RecognitionException, TokenStreamException {
		ErrorAnnexLibrary eal = null;
		
		
		try {      // for error handling
			{
			eal=error_annex_classifier();
			}
			match(Token.EOF_TYPE);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return eal;
	}
	
	public final ErrorAnnexLibrary  error_annex_classifier() throws RecognitionException, TokenStreamException {
		ErrorAnnexLibrary eal = null;
		
		
		try {      // for error handling
			
					eal = eaxF.createErrorAnnexLibrary();
					ErrorModelType emt = null;
					ErrorModelImplementation emi = null;
					
				
			{
			int _cnt852=0;
			_loop852:
			do {
				if ((LA(1)==ERROR)) {
					{
					if ((LA(1)==ERROR) && (LA(2)==MODEL) && (LA(3)==IDENT)) {
						emt=error_model_type();
						eal.getErrorModelClassifier().add(emt);
					}
					else if ((LA(1)==ERROR) && (LA(2)==MODEL) && (LA(3)==IMPL)) {
						emi=error_model_implementation();
						eal.getErrorModelClassifier().add(emi);
					}
					else {
						throw new NoViableAltException(LT(1), getFilename());
					}
					
					}
				}
				else {
					if ( _cnt852>=1 ) { break _loop852; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt852++;
			} while (true);
			}
			
					processComments(eal);
					boolean errorFound = false;
				
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return eal;
	}
	
	public final ErrorModelType  error_model_type() throws RecognitionException, TokenStreamException {
		ErrorModelType emt = null;
		
		Token  id = null;
		Token  eid = null;
		
		try {      // for error handling
			error_model();
			id = LT(1);
			match(IDENT);
				emt = eaxF.createErrorModelType(); 
				processComments(emt);
				String identifier = id.getText();
				int line = id.getLine();
				emt.setName(identifier);
				emt.setLocationReference(this.getFilename(),line);
			
			match(FEATURES);
			{
			int _cnt855=0;
			_loop855:
			do {
				if ((LA(1)==IDENT)) {
					error_model_feature(emt);
				}
				else {
					if ( _cnt855>=1 ) { break _loop855; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt855++;
			} while (true);
			}
			match(END);
			eid = LT(1);
			match(IDENT);
			match(SEMI);
			
				processComments(emt);
				//block checks for mismatch in identifiers
				if (!id.getText().equalsIgnoreCase(eid.getText())) 
				throw new SemanticException("identifier "+eid.getText()+
				" does not match defining identifier "+id.getText(),
				this.getFilename(),eid.getLine(),eid.getColumn());
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_1);
		}
		return emt;
	}
	
	public final ErrorModelImplementation  error_model_implementation() throws RecognitionException, TokenStreamException {
		ErrorModelImplementation emi = null;
		
		Token  em = null;
		Token  typeid = null;
		Token  defid = null;
		Token  id = null;
		Token  id2 = null;
		
		try {      // for error handling
			
					emi = eaxF.createErrorModelImplementation();
					processComments(emi);
				
			{
			em = LT(1);
			match(ERROR);
			match(MODEL);
			match(IMPL);
			typeid = LT(1);
			match(IDENT);
			match(DOT);
			defid = LT(1);
			match(IDENT);
			}
				
					String identifier = typeid.getText()+"."+defid.getText();
					emi.setName(identifier);
					ErrorTransition errorTrans = null;
					OccurrenceProperty imp_err_asst = null;
					emi.setLocationReference(this.getFilename(),em.getLine());
					
			match(TRANSITIONS);
			{
			switch ( LA(1)) {
			case IDENT:
			{
				ErrorTransitions emts = eaxF.createErrorTransitions();
					 					emi.setErrorTransitions(emts);
				{
				int _cnt871=0;
				_loop871:
				do {
					if ((LA(1)==IDENT)) {
						errorTrans=error_transition();
						
									 					emts.getErrorTransition().add(errorTrans);
									 				
					}
					else {
						if ( _cnt871>=1 ) { break _loop871; } else {throw new NoViableAltException(LT(1), getFilename());}
					}
					
					_cnt871++;
				} while (true);
				}
				break;
			}
			case NONE:
			{
				{
				match(NONE);
				match(SEMI);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case PROPERTIES:
			{
				match(PROPERTIES);
				{
				switch ( LA(1)) {
				case OCCURRENCE:
				{
					ErrorProperties emps = eaxF.createErrorProperties();
						 					emi.setErrorProperties(emps);
					{
					int _cnt876=0;
					_loop876:
					do {
						if ((LA(1)==OCCURRENCE)) {
							imp_err_asst=implementation_error_property_association();
							
								 				emps.getOccurrenceProperty().add((OccurrenceProperty)imp_err_asst);
								 			
						}
						else {
							if ( _cnt876>=1 ) { break _loop876; } else {throw new NoViableAltException(LT(1), getFilename());}
						}
						
						_cnt876++;
					} while (true);
					}
					break;
				}
				case NONE:
				{
					match(NONE);
					match(SEMI);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			case END:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(END);
			id = LT(1);
			match(IDENT);
			match(DOT);
			id2 = LT(1);
			match(IDENT);
			match(SEMI);
			
				processComments(emi);
				if (!((id.getText().equalsIgnoreCase(typeid.getText()) && id2.getText().equalsIgnoreCase(defid.getText()) ))){
				    	throw new SemanticException("identifier "+typeid.getText()+"." 
				    	+defid.getText()+" does not match defining identifier "+
				    	id.getText()+"."+id2.getText(),this.getFilename(),id.getLine(),id.getColumn());
				}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
		return emi;
	}
	
	public final void error_model() throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			match(ERROR);
			match(MODEL);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
	}
	
	public final void error_model_feature(
		ErrorModelType emt
	) throws RecognitionException, TokenStreamException {
		
		Token  ln = null;
		
		try {      // for error handling
			//init block
					Vector [] fInfo = new Vector[2];
			
			fInfo=feature_identifier_list();
			ln = LT(1);
			match(COLON);
			{
			if ((LA(1)==ERROR) && (LA(2)==EVENT)) {
				error_event_spec(emt,fInfo);
			}
			else if ((LA(1)==IN||LA(1)==OUT)) {
				error_propagation_spec(emt,fInfo);
			}
			else if ((LA(1)==ERROR||LA(1)==INITIAL) && (LA(2)==ERROR||LA(2)==INACTIVE||LA(2)==STATE)) {
				error_state_spec(emt,fInfo);
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			
			match(SEMI);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
	}
	
	public final Vector []  feature_identifier_list() throws RecognitionException, TokenStreamException {
		Vector [] featureInfo = new Vector[2];
		
		Token  id = null;
		Token  id2 = null;
		
		try {      // for error handling
			
						Vector featureIdentifierList = new Vector();
						Vector featureLocation = new Vector();
						featureInfo[0] = featureIdentifierList;
						featureInfo[1] = featureLocation;
					
					
			id = LT(1);
			match(IDENT);
			
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
						
			{
			_loop993:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					id2 = LT(1);
					match(IDENT);
					
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
				else {
					break _loop993;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		return featureInfo;
	}
	
	public final void error_event_spec(
		ErrorModelType emt, Vector[] listInfo
	) throws RecognitionException, TokenStreamException {
		
		Token  ee = null;
		Token  id1 = null;
		
		try {      // for error handling
			
				Vector fList = listInfo[0];
				Vector fLoc = listInfo[1];
				OccurrenceProperty epa = null;
			
			ee = LT(1);
			match(ERROR);
			match(EVENT);
			{
			switch ( LA(1)) {
			case LCURLY:
			{
				match(LCURLY);
				id1 = LT(1);
				match(OCCURRENCE);
				match(ASSIGN);
				epa=occurrence_error_property_expression();
				epa.setLocationReference(this.getFilename(),id1.getLine());
				{
				switch ( LA(1)) {
				case SEMI:
				{
					match(SEMI);
					break;
				}
				case RCURLY:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(RCURLY);
				break;
			}
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			// block assumes fList does not contain null references
				      	for (int i=0; i<fList.size(); i++ ){	          
				          	ErrorEvent ev = eaxF.createErrorEvent();
				          	String identifier = (String) fList.elementAt(i);
				          	ev.setName((String) fList.elementAt(i));
				          	if (epa != null){
				        			OccurrenceProperty epaTemp = (OccurrenceProperty)cloner.cloneEpa(epa);
				        			ev.setOccurrenceProperty(epaTemp);
				          	}
				          	ev.setLocationReference(this.getFilename(),((Integer)fLoc.get(i)).intValue());
				          	emt.getFeatures().add(ev);
				          	processComments(ev);
				        } 
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
	}
	
	public final void error_propagation_spec(
		ErrorModelType emt, Vector[] listInfo
	) throws RecognitionException, TokenStreamException {
		
		Token  ep = null;
		Token  id1 = null;
		
		try {      // for error handling
			
				Vector fList = listInfo[0];
				    	Vector fLoc = listInfo[1];
				    	boolean in = false;
				       	boolean out = false;
				       	OccurrenceProperty epa = null;
				
			{
			if ((LA(1)==IN) && (LA(2)==ERROR)) {
				match(IN);
				in = true;
			}
			else if ((LA(1)==OUT)) {
				match(OUT);
				out = true;
			}
			else if ((LA(1)==IN) && (LA(2)==OUT)) {
				match(IN);
				match(OUT);
				in=true; out=true;
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			ep = LT(1);
			match(ERROR);
			match(PROPAGATION);
			{
			switch ( LA(1)) {
			case LCURLY:
			{
				match(LCURLY);
				id1 = LT(1);
				match(OCCURRENCE);
				match(ASSIGN);
				epa=occurrence_error_property_expression();
				epa.setLocationReference(this.getFilename(),id1.getLine());
				match(SEMI);
				match(RCURLY);
				break;
			}
			
			case SEMI:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			// block assumes fList does not contain null references
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
				      emt.getFeatures().add(prop);
				      processComments(prop);
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
	}
	
	public final void error_state_spec(
		ErrorModelType emt, Vector[] listInfo
	) throws RecognitionException, TokenStreamException {
		
		Token  err = null;
		
		try {      // for error handling
			
				boolean initial = false;
				boolean inactive = false;
				Vector fList = listInfo[0];
				Vector fLoc = listInfo[1];       	
			
			{
			switch ( LA(1)) {
			case INITIAL:
			{
				match(INITIAL);
				initial = true;
				{
				switch ( LA(1)) {
				case INACTIVE:
				{
					match(INACTIVE);
					inactive = true;
					break;
				}
				case ERROR:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			case ERROR:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			err = LT(1);
			match(ERROR);
			match(STATE);
			// block assumes fList does not contain null references
				for (int i=0; i<fList.size(); i++ ){
			ErrorState state = eaxF.createErrorState();
			String identifier = (String) fList.elementAt(i);
			state.setName(identifier);
			state.setInitial(initial);
			state.setInactive(inactive);   
				      emt.getFeatures().add(state);
				      processComments(state);
			state.setLocationReference(this.getFilename(),((Integer)fLoc.get(i)).intValue());
				}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
	}
	
	public final OccurrenceProperty  occurrence_error_property_expression() throws RecognitionException, TokenStreamException {
		OccurrenceProperty oepe = null;
		
		
		try {      // for error handling
			
				oepe = eaxF.createOccurrenceProperty();
			
			{
			distribution_name(oepe);
			{
			switch ( LA(1)) {
			case IDENT:
			case NUMERIC_LIT:
			{
				distribution_parameters(oepe);
				break;
			}
			case SEMI:
			case RCURLY:
			case APPLIES:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		return oepe;
	}
	
	public final ErrorTransition  error_transition() throws RecognitionException, TokenStreamException {
		ErrorTransition transition = null;
		
		Token  id = null;
		Token  id2 = null;
		Token  loc = null;
		
		try {      // for error handling
			
						String origin="";
						String destination = "";
						Vector events = new Vector();
						Vector propagations = new Vector();
						int line = 1;
						transition = eaxF.createErrorTransition();
						processComments(transition);
					
			id = LT(1);
			match(IDENT);
			
						origin = id.getText();
						transition.getOriginName().add(origin);
					
			{
			_loop879:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					id2 = LT(1);
					match(IDENT);
					
								origin = id2.getText();
								transition.getOriginName().add(origin);
									
				}
				else {
					break _loop879;
				}
				
			} while (true);
			}
			match(LTRANS);
			{
			{
			switch ( LA(1)) {
			case IDENT:
			case IN:
			case OUT:
			{
				event_or_propagation(transition);
				break;
			}
			case ACTIVATE:
			case DEACTIVATE:
			{
				transition_label(transition);
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			_loop884:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					{
					switch ( LA(1)) {
					case IDENT:
					case IN:
					case OUT:
					{
						event_or_propagation(transition);
						break;
					}
					case ACTIVATE:
					case DEACTIVATE:
					{
						transition_label(transition);
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
				}
				else {
					break _loop884;
				}
				
			} while (true);
			}
			}
			loc = LT(1);
			match(RTRANS);
			destination=error_state_identifier();
			match(SEMI);
			
						transition.setLocationReference(this.getFilename(),id.getLine());
						transition.setDestinationName(destination);
			
					
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		return transition;
	}
	
	public final OccurrenceProperty  implementation_error_property_association() throws RecognitionException, TokenStreamException {
		OccurrenceProperty epa = null;
		
		Token  id1 = null;
		Token  loc = null;
		
		try {      // for error handling
			
				    
				     String name;
				     String id; 
				     String featureId ="";
				     ErrorModelFeature ef = null;
			
			id1 = LT(1);
			match(OCCURRENCE);
			match(ASSIGN);
			epa=occurrence_error_property_expression();
			epa.setLocationReference(this.getFilename(),id1.getLine());
			loc = LT(1);
			match(APPLIES);
			match(TO);
			featureId=feature_identifier();
			match(SEMI);
			
						 epa.setEventOrPropagationName(featureId);	
						 processComments(epa);	
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_9);
		}
		return epa;
	}
	
	public final void event_or_propagation(
		ErrorTransition transition
	) throws RecognitionException, TokenStreamException {
		
		Token  id = null;
		Token  id1 = null;
		Token  id2 = null;
		
		try {      // for error handling
			
					String propagation_id = "";
					
				
			{
			switch ( LA(1)) {
			case IDENT:
			{
				{
				id = LT(1);
				match(IDENT);
				
									String event_id = id.getText();
									transition.getTransitionTriggerName().add( event_id);
							
				}
				break;
			}
			case IN:
			case OUT:
			{
				{
				{
				switch ( LA(1)) {
				case IN:
				{
					match(IN);
					id1 = LT(1);
					match(IDENT);
					propagation_id = id1.getText();
								 transition.getTransitionTriggerName().add( propagation_id);
								
					break;
				}
				case OUT:
				{
					match(OUT);
					id2 = LT(1);
					match(IDENT);
					propagation_id = id2.getText();
								 transition.getTransitionActionName().add( propagation_id);
									
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
	}
	
	public final void transition_label(
		ErrorTransition transition
	) throws RecognitionException, TokenStreamException {
		
		Token  id1 = null;
		Token  id2 = null;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case ACTIVATE:
			{
				id1 = LT(1);
				match(ACTIVATE);
				
								transition.getActivationTrigger().add(TriggerType.ACTIVATE_LITERAL);	
							
				break;
			}
			case DEACTIVATE:
			{
				id2 = LT(1);
				match(DEACTIVATE);
				
								transition.getActivationTrigger().add(TriggerType.DEACTIVATE_LITERAL);
							
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_10);
		}
	}
	
	public final String  error_state_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
		return id;
	}
	
	public final void distribution_name(
		OccurrenceProperty op
	) throws RecognitionException, TokenStreamException {
		
		Token  lineRef1 = null;
		Token  lineRef2 = null;
		Token  id = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case FIXED:
			{
				lineRef1 = LT(1);
				match(FIXED);
				
							op.setType(DistributionName.get("fixed"));
							op.setLocationReference(this.getFilename(),lineRef1.getLine());
				break;
			}
			case POISSON:
			{
				lineRef2 = LT(1);
				match(POISSON);
				
							op.setType(DistributionName.get("poisson"));
							op.setLocationReference(this.getFilename(),lineRef2.getLine());
				break;
			}
			case NONSTANDARD:
			{
				match(NONSTANDARD);
				match(DOUBLECOLON);
				id = LT(1);
				match(IDENT);
				
							op.setType(DistributionName.get("nonstandard"));
							op.setNonStandardId(id.getText());
							op.setLocationReference(this.getFilename(),id.getLine());
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_11);
		}
	}
	
	public final void distribution_parameters(
		OccurrenceProperty op
	) throws RecognitionException, TokenStreamException {
		
		
		try {      // for error handling
			distribution_expression(op);
			{
			_loop895:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					distribution_expression(op);
				}
				else {
					break _loop895;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
	}
	
	public final void distribution_expression(
		OccurrenceProperty op
	) throws RecognitionException, TokenStreamException {
		
		Token  num1 = null;
		Token  id1 = null;
		Token  num2 = null;
		Token  id2 = null;
		Token  num3 = null;
		Token  id3 = null;
		Token  num4 = null;
		Token  id4 = null;
		
		try {      // for error handling
			if ((LA(1)==NUMERIC_LIT) && (_tokenSet_12.member(LA(2)))) {
				num1 = LT(1);
				match(NUMERIC_LIT);
				op.getParameterList().add(num1.getText());
			}
			else if ((LA(1)==IDENT)) {
				id1 = LT(1);
				match(IDENT);
				op.getParameterList().add(id1.getText());
			}
			else if ((LA(1)==NUMERIC_LIT) && (LA(2)==PLUS)) {
				num2 = LT(1);
				match(NUMERIC_LIT);
				match(PLUS);
				id2 = LT(1);
				match(IDENT);
				op.getParameterList().add(num2.getText()+"+"+id2.getText());
			}
			else if ((LA(1)==NUMERIC_LIT) && (LA(2)==MINUS)) {
				num3 = LT(1);
				match(NUMERIC_LIT);
				match(MINUS);
				id3 = LT(1);
				match(IDENT);
				op.getParameterList().add(num3.getText()+"-"+id3.getText());
			}
			else if ((LA(1)==NUMERIC_LIT) && (LA(2)==STAR)) {
				num4 = LT(1);
				match(NUMERIC_LIT);
				match(STAR);
				id4 = LT(1);
				match(IDENT);
				op.getParameterList().add(num4.getText()+"*"+id4.getText());
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_12);
		}
	}
	
	public final ErrorAnnexSubClause  error_annex_subclause_classifier() throws RecognitionException, TokenStreamException {
		ErrorAnnexSubClause easc = null;
		
		Token  loc = null;
		
		try {      // for error handling
			
					easc = eaxF.createErrorAnnexSubClause();
					processComments(easc);
					easc.setLocationReference(fileName,startLine);//needs to be redone fixed, "1" is not right
				
			{
			int _cnt900=0;
			_loop900:
			do {
				if ((_tokenSet_13.member(LA(1)))) {
					{
					error_annex_subclause_error_property_association(easc);
					loc = LT(1);
					match(SEMI);
					}
					processComments(easc);
				}
				else {
					if ( _cnt900>=1 ) { break _loop900; } else {throw new NoViableAltException(LT(1), getFilename());}
				}
				
				_cnt900++;
			} while (true);
			}
			match(Token.EOF_TYPE);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return easc;
	}
	
	public final void error_annex_subclause_error_property_association(
		ErrorAnnexSubClause easc
	) throws RecognitionException, TokenStreamException {
		
		Token  id = null;
		Token  id2 = null;
		Token  id7 = null;
		Token  id8 = null;
		Token  fId1 = null;
		Token  fId2 = null;
		Token  id1 = null;
		Token  fIdx1 = null;
		Token  fIdx2 = null;
		Token  id3 = null;
		Token  id4 = null;
		Token  id5 = null;
		Token  fIdx4 = null;
		Token  fId4 = null;
		Token  fIdx3 = null;
		Token  fId3 = null;
		Token  id6 = null;
		Token  fId11 = null;
		Token  fId22 = null;
		Token  fId33 = null;
		Token  fId44 = null;
		
		try {      // for error handling
			
					ErrorModelProperty epa = null;
					ErrorModelProperty epaTemp = null;
					ErrorGuard guard = null;
					ModeTransitionGuard mtguard = null;
					OccurrenceProperty occ = null;
					String ContextName = "";
				
			{
			switch ( LA(1)) {
			case MODEL:
			case REPORT:
			case MODEL_HIERARCHY:
			case DERIVED_STATE_MAPPING:
			{
				{
				{
				switch ( LA(1)) {
				case MODEL:
				{
					id = LT(1);
					match(MODEL);
					match(ASSIGN);
					epa=model_error_property_expression();
					epa.setLocationReference(this.getFilename(),id.getLine());
					break;
				}
				case REPORT:
				{
					id2 = LT(1);
					match(REPORT);
					match(ASSIGN);
					epa=report_error_property_expression();
					epa.setLocationReference(this.getFilename(),id2.getLine());
					break;
				}
				case MODEL_HIERARCHY:
				{
					id7 = LT(1);
					match(MODEL_HIERARCHY);
					match(ASSIGN);
					epa=model_hierarchy_expression();
					epa.setLocationReference(this.getFilename(),id7.getLine());
					break;
				}
				case DERIVED_STATE_MAPPING:
				{
					id8 = LT(1);
					match(DERIVED_STATE_MAPPING);
					match(ASSIGN);
					epa=error_state_mapping_expression();
					epa.setLocationReference(this.getFilename(),id8.getLine());
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				switch ( LA(1)) {
				case APPLIES:
				{
					match(APPLIES);
					match(TO);
					fId1 = LT(1);
					match(IDENT);
					epa.getAppliesToName().add(fId1.getText());
					{
					_loop907:
					do {
						if ((LA(1)==DOT)) {
							match(DOT);
							fId2 = LT(1);
							match(IDENT);
							epa.getAppliesToName().add(fId2.getText());
						}
						else {
							break _loop907;
						}
						
					} while (true);
					}
					break;
				}
				case SEMI:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				easc.getErrorModelProperty().add(epa); processComments(epa);
				}
				break;
			}
			case OCCURRENCE:
			{
				{
				id1 = LT(1);
				match(OCCURRENCE);
				match(ASSIGN);
				occ=occurrence_error_property_expression();
				occ.setLocationReference(this.getFilename(),id1.getLine());
				{
				match(APPLIES);
				match(TO);
				match(ERROR);
				{
				_loop911:
				do {
					if ((LA(1)==IDENT) && (LA(2)==DOT)) {
						fIdx1 = LT(1);
						match(IDENT);
						occ.getAppliesToName().add(fIdx1.getText());
						match(DOT);
					}
					else {
						break _loop911;
					}
					
				} while (true);
				}
				fIdx2 = LT(1);
				match(IDENT);
				occ.setEventOrPropagationName(fIdx2.getText());
				}
				easc.getErrorModelProperty().add(occ); processComments(occ);
				}
				break;
			}
			case GUARD_IN:
			case GUARD_OUT:
			case GUARD_EVENT:
			{
				{
				{
				switch ( LA(1)) {
				case GUARD_IN:
				{
					id3 = LT(1);
					match(GUARD_IN);
					match(ASSIGN);
					guard=guard_in_error_property_expression();
					guard.setLocationReference(this.getFilename(),id3.getLine());
					break;
				}
				case GUARD_OUT:
				{
					id4 = LT(1);
					match(GUARD_OUT);
					match(ASSIGN);
					guard=guard_out_error_property_expression();
					guard.setLocationReference(this.getFilename(),id4.getLine());
					break;
				}
				case GUARD_EVENT:
				{
					id5 = LT(1);
					match(GUARD_EVENT);
					match(ASSIGN);
					guard=guard_event_error_property_expression();
					guard.setLocationReference(this.getFilename(),id5.getLine());
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				match(APPLIES);
				match(TO);
				{
				_loop916:
				do {
					if ((LA(1)==IDENT) && (LA(2)==DOT)) {
						fIdx4 = LT(1);
						match(IDENT);
						guard.getAppliesToName().add(fIdx4.getText());
						match(DOT);
					}
					else {
						break _loop916;
					}
					
				} while (true);
				}
				fId4 = LT(1);
				match(IDENT);
				guard.getAppliesToFeatureName().add(fId4.getText());
				{
				_loop920:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						{
						_loop919:
						do {
							if ((LA(1)==IDENT) && (LA(2)==DOT)) {
								fIdx3 = LT(1);
								match(IDENT);
								guard.getAppliesToName().add(fIdx3.getText());
								match(DOT);
							}
							else {
								break _loop919;
							}
							
						} while (true);
						}
						fId3 = LT(1);
						match(IDENT);
						guard.getAppliesToFeatureName().add(fId3.getText());
					}
					else {
						break _loop920;
					}
					
				} while (true);
				}
				}
				easc.getErrorModelProperty().add(guard); processComments(guard);
				}
				break;
			}
			case GUARD_TRANSITION:
			{
				{
				{
				id6 = LT(1);
				match(GUARD_TRANSITION);
				match(ASSIGN);
				mtguard=guard_transition_error_property_expression();
				mtguard.setLocationReference(this.getFilename(),id6.getLine());
				}
				{
				ContextName = "";
				match(APPLIES);
				match(TO);
				{
				if ((LA(1)==IDENT) && (LA(2)==DOT)) {
					fId11 = LT(1);
					match(IDENT);
					ContextName = fId11.getText();
					match(DOT);
				}
				else if ((LA(1)==IDENT) && (LA(2)==SEMI||LA(2)==COMMA)) {
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				fId22 = LT(1);
				match(IDENT);
				mtguard.getAppliesToFeatureName().add(fId22.getText());mtguard.getAppliesToFeatureContextName().add(ContextName);
				{
				_loop927:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						ContextName = "";
						{
						if ((LA(1)==IDENT) && (LA(2)==DOT)) {
							fId33 = LT(1);
							match(IDENT);
							ContextName = fId33.getText();
							match(DOT);
						}
						else if ((LA(1)==IDENT) && (LA(2)==SEMI||LA(2)==COMMA)) {
						}
						else {
							throw new NoViableAltException(LT(1), getFilename());
						}
						
						}
						fId44 = LT(1);
						match(IDENT);
						mtguard.getAppliesToFeatureName().add(fId44.getText());mtguard.getAppliesToFeatureContextName().add(ContextName);
					}
					else {
						break _loop927;
					}
					
				} while (true);
				}
				}
				easc.getErrorModelProperty().add(mtguard);
								processComments(mtguard);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
	}
	
	public final ComponentErrorModelProperty  model_error_property_expression() throws RecognitionException, TokenStreamException {
		ComponentErrorModelProperty mepe = null;
		
		Token  id = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case IDENT:
			{
				
						String packageIdentifier = "";
						String modelTypeIdentifier = "";
						String errorModelImplimentationIdentifier = "";
						ErrorModelType emt = null;
						int line = 0;
						mepe = eaxF.createComponentErrorModelProperty();
				
				{
				{
				{
				if ((LA(1)==IDENT) && (LA(2)==DOUBLECOLON)) {
					packageIdentifier=package_identifier();
					match(DOUBLECOLON);
				}
				else if ((LA(1)==IDENT) && (LA(2)==SEMI||LA(2)==DOT||LA(2)==APPLIES)) {
				}
				else {
					throw new NoViableAltException(LT(1), getFilename());
				}
				
				}
				id = LT(1);
				match(IDENT);
				modelTypeIdentifier = id.getText();line = id.getLine();
				{
				switch ( LA(1)) {
				case DOT:
				{
					match(DOT);
					errorModelImplimentationIdentifier=error_model_implementation_identifier();
					break;
				}
				case SEMI:
				case APPLIES:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				}
				}
				
						
							
							mepe.setErrorModelTypeIdentifier(modelTypeIdentifier);
							mepe.setErrorModelImplementationIdentifier(errorModelImplimentationIdentifier);
							mepe.setPackageIdentifier(packageIdentifier);
							mepe.setLocationReference(this.getFilename(),line);
					
				break;
			}
			case ERROR:
			{
				ErrorModelType emt = null;
				emt=error_model_type();
				
						mepe = eaxF.createComponentErrorModelProperty();
						mepe.setInplaceErrorModelType(emt);
						mepe.setLocationReference(emt.getLocationReference());
					
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return mepe;
	}
	
	public final ReportErrorProperty  report_error_property_expression() throws RecognitionException, TokenStreamException {
		ReportErrorProperty repe = null;
		
		Token  id = null;
		
		try {      // for error handling
			
					repe = eaxF.createReportErrorProperty();
					String identifier = "";
			
			{
			id = LT(1);
			match(IDENT);
			identifier = id.getText();repe.getStateAndPropagationList().add(identifier);
			{
			_loop932:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					identifier=feature_identifier();
					repe.getStateAndPropagationList().add(identifier);
				}
				else {
					break _loop932;
				}
				
			} while (true);
			}
			}
			
				repe.setLocationReference(this.getFilename(),id.getLine());
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return repe;
	}
	
	public final ModelHierarchyProperty  model_hierarchy_expression() throws RecognitionException, TokenStreamException {
		ModelHierarchyProperty mhe = null;
		
		Token  ln = null;
		Token  ln1 = null;
		
		try {      // for error handling
			
					mhe = eaxF.createModelHierarchyProperty();
					boolean derived = false;
					boolean abstract_ = false;
					int line;
			
			{
			switch ( LA(1)) {
			case DERIVED:
			{
				ln = LT(1);
				match(DERIVED);
				mhe.setErrorModelSelection(ModelSelectionType.DERIVED_LITERAL); line = ln.getLine();
				break;
			}
			case ABSTRACT:
			{
				ln1 = LT(1);
				match(ABSTRACT);
				mhe.setErrorModelSelection(ModelSelectionType.ABSTRACT_LITERAL);line = ln1.getLine();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			
						mhe.setLocationReference(this.getFilename(),line);
					
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return mhe;
	}
	
	public final DerivedErrorStateMappingGuard  error_state_mapping_expression() throws RecognitionException, TokenStreamException {
		DerivedErrorStateMappingGuard esme = null;
		
		
		try {      // for error handling
			
					esme = eaxF.createDerivedErrorStateMappingGuard();
					ErrorStateMappingRule esmr = null;
			
			esmr=error_state_mapping_rule();
			
						if(esmr.getLocationReference()!=null){
							int line = esmr.getLocationReference().getLine();
							esme.setLocationReference(this.getFilename(),line);
							esme.getErrorStateMappingRule().add(esmr);	
						}
					
			{
			_loop975:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					esmr=error_state_mapping_rule();
					
								esme.getErrorStateMappingRule().add(esmr);
							
				}
				else {
					break _loop975;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return esme;
	}
	
	public final InErrorPropagationGuard  guard_in_error_property_expression() throws RecognitionException, TokenStreamException {
		InErrorPropagationGuard vioepe = null;
		
		
		try {      // for error handling
			
					vioepe = eaxF.createInErrorPropagationGuard();
					ErrorPropagationRule epr = null;
			
			{
			epr=error_propagation_rule();
			vioepe.getErrorPropagationRule().add(epr); 
					vioepe.setLocationReference(epr.getLocationReference());
			{
			_loop948:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					epr=error_propagation_rule();
					vioepe.getErrorPropagationRule().add(epr);
				}
				else {
					break _loop948;
				}
				
			} while (true);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return vioepe;
	}
	
	public final OutErrorPropagationGuard  guard_out_error_property_expression() throws RecognitionException, TokenStreamException {
		OutErrorPropagationGuard vioepe = null;
		
		
		try {      // for error handling
			
					vioepe = eaxF.createOutErrorPropagationGuard();
					ErrorPropagationRule epr = null;
			
			{
			epr=error_propagation_rule();
			vioepe.getErrorPropagationRule().add(epr); 
					vioepe.setLocationReference(epr.getLocationReference());
			{
			_loop952:
			do {
				if ((LA(1)==COMMA)) {
					match(COMMA);
					epr=error_propagation_rule();
					vioepe.getErrorPropagationRule().add(epr);
				}
				else {
					break _loop952;
				}
				
			} while (true);
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return vioepe;
	}
	
	public final PortEventGuard  guard_event_error_property_expression() throws RecognitionException, TokenStreamException {
		PortEventGuard vetepe = null;
		
		
		try {      // for error handling
			
					vetepe = eaxF.createPortEventGuard();
					BooleanErrorExpression bee = null;
			
			{
			bee=boolean_error_expression();
			}
			
					vetepe.setErrorExpression(bee);
					vetepe.setLocationReference(bee.getLocationReference());
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return vetepe;
	}
	
	public final ModeTransitionGuard  guard_transition_error_property_expression() throws RecognitionException, TokenStreamException {
		ModeTransitionGuard vetepe = null;
		
		
		try {      // for error handling
			
					vetepe = eaxF.createModeTransitionGuard();
					BooleanErrorExpression bee = null;
			
			{
			bee=boolean_error_expression();
			}
			
					vetepe.setErrorExpression(bee);
					vetepe.setLocationReference(bee.getLocationReference());
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_15);
		}
		return vetepe;
	}
	
	public final String  feature_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_16);
		}
		return id;
	}
	
	public final String  package_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_17);
		}
		return id;
	}
	
	public final String  error_model_implementation_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_14);
		}
		return id;
	}
	
	public final BooleanErrorExpression  boolean_error_expression() throws RecognitionException, TokenStreamException {
		BooleanErrorExpression bee = null;
		
		Token  locN = null;
		
		try {      // for error handling
			
					BooleanErrorExpression bee1 = null;    		
					BooleanErrorExpression bee2 = null;
						String type = "";
					bee = eaxF.createBooleanErrorExpression();// to ensure null is not returned
				
			{
			switch ( LA(1)) {
			case NOT:
			{
				locN = LT(1);
				match(NOT);
				bee1=boolean_error_expression();
				
								bee.setType(BooleanExpressionType.get("not"));
								bee.getContainedExpressions().add(bee1);
							bee.setLocationReference(this.getFilename(),locN.getLine());
							
				break;
			}
			case IDENT:
			case ERROR:
			case NUMERIC_LIT:
			case LPAREN:
			case OTHERS:
			case SELF:
			{
				{
				switch ( LA(1)) {
				case IDENT:
				case ERROR:
				case NUMERIC_LIT:
				case OTHERS:
				case SELF:
				{
					bee=semi_atomic_boolean_expression();
					break;
				}
				case LPAREN:
				{
					match(LPAREN);
					bee=boolean_error_expression();
					match(RPAREN);
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				{
				switch ( LA(1)) {
				case AND:
				case OR:
				{
					{
					switch ( LA(1)) {
					case AND:
					{
						match(AND);
						type = "and";
						break;
					}
					case OR:
					{
						match(OR);
						type = "or";
						break;
					}
					default:
					{
						throw new NoViableAltException(LT(1), getFilename());
					}
					}
					}
					bee2=boolean_error_expression();
						int line = bee.getLocationReference().getLine();
								 		bee1 = bee;
								 		bee = eaxF.createBooleanErrorExpression();//point to new bee
										bee.setType(BooleanExpressionType.get(type));
								 		bee.getContainedExpressions().add(bee1);// add first bee
								 		bee.getContainedExpressions().add(bee2);//add second
						    			bee.setLocationReference(this.getFilename(),line);
									
					break;
				}
				case SEMI:
				case COMMA:
				case APPLIES:
				case RPAREN:
				{
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_18);
		}
		return bee;
	}
	
	public final ErrorPropagationRule  error_propagation_rule() throws RecognitionException, TokenStreamException {
		ErrorPropagationRule epr = null;
		
		Token  id = null;
		
		try {      // for error handling
			
					epr = eaxF.createErrorPropagationRule();
					processComments(epr);
					String errorPropagationIdentifier = "";
					boolean mask = false;
					BooleanErrorExpression bee = null;
					int line = 1;
				
			{
			{
			switch ( LA(1)) {
			case IDENT:
			{
				id = LT(1);
				match(IDENT);
				errorPropagationIdentifier = id.getText();line = id.getLine();
				break;
			}
			case MASK:
			{
				match(MASK);
				mask = true;
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(WHEN);
			bee=boolean_error_expression();
			}
			
						epr.setErrorPropagationIdentifier(errorPropagationIdentifier);
					epr.setMask(mask);
					epr.setErrorExpression(bee);
					epr.setLocationReference(this.getFilename(),line);
				
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_19);
		}
		return epr;
	}
	
	public final BooleanErrorExpression  semi_atomic_boolean_expression() throws RecognitionException, TokenStreamException {
		BooleanErrorExpression bee = null;
		
		Token  numeric = null;
		Token  oth = null;
		
		try {      // for error handling
			
					ErrorSourceName esn = null;
					bee = eaxF.createBooleanErrorExpression();// to ensure null is not returned
					BooleanErrorExpression beeTemp = null;// to ensure null is not returned
					String type = "";
				
			{
			switch ( LA(1)) {
			case IDENT:
			case ERROR:
			case SELF:
			{
				esn=error_source_name();
				
								bee.setType(BooleanExpressionType.get("errorsourcename"));
					    			bee.setErrorSourceName(esn);
					    			bee.setLocationReference(esn.getLocationReference()); 
							
				break;
			}
			case NUMERIC_LIT:
			{
				numeric = LT(1);
				match(NUMERIC_LIT);
				{
				switch ( LA(1)) {
				case ORMORE:
				{
					match(ORMORE);
					type = "ormore";
					break;
				}
				case ORLESS:
				{
					match(ORLESS);
					type = "orless";
					break;
				}
				default:
				{
					throw new NoViableAltException(LT(1), getFilename());
				}
				}
				}
				match(LPAREN);
				beeTemp=boolean_error_expression();
				bee.getContainedExpressions().add(beeTemp);
				{
				_loop965:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						beeTemp=boolean_error_expression();
						bee.getContainedExpressions().add(beeTemp);
					}
					else {
						break _loop965;
					}
					
				} while (true);
				}
				match(RPAREN);
					
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
								
							
				break;
			}
			case OTHERS:
			{
				oth = LT(1);
				match(OTHERS);
				
								type = "others";
								bee.setType(BooleanExpressionType.get(type));
								bee.setLocationReference(this.getFilename(),oth.getLine());
							
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_20);
		}
		return bee;
	}
	
	public final ErrorSourceName  error_source_name() throws RecognitionException, TokenStreamException {
		ErrorSourceName errorSourceName = null;
		
		Token  subid = null;
		Token  id2 = null;
		Token  id1 = null;
		Token  id = null;
		
		try {      // for error handling
			
					boolean self = false;
					String identifier = "";
					Vector [] idInfo = new Vector[2];
					Vector identifiers = new Vector();
					errorSourceName = eaxF.createErrorSourceName();
					int line = 1;
					
				
			{
			{
			if ((LA(1)==IDENT) && (LA(2)==DOT)) {
				subid = LT(1);
				match(IDENT);
				match(DOT);
				errorSourceName.setSubcomponentName(subid.getText());
			}
			else if ((LA(1)==IDENT||LA(1)==ERROR||LA(1)==SELF) && (_tokenSet_21.member(LA(2)))) {
			}
			else {
				throw new NoViableAltException(LT(1), getFilename());
			}
			
			}
			{
			switch ( LA(1)) {
			case SELF:
			{
				id2 = LT(1);
				match(SELF);
				self =true; line = id2.getLine();
				break;
			}
			case ERROR:
			{
				id1 = LT(1);
				match(ERROR);
				identifier = "error"; line = id1.getLine();
				break;
			}
			case IDENT:
			{
				id = LT(1);
				match(IDENT);
				identifier = id.getText(); line = id.getLine();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			{
			switch ( LA(1)) {
			case LSQUARE:
			{
				match(LSQUARE);
				idInfo=feature_identifier_list();
				match(RSQUARE);
				
								identifiers = idInfo[0];
							
				break;
			}
			case SEMI:
			case COMMA:
			case APPLIES:
			case RPAREN:
			case AND:
			case OR:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			}
			
					errorSourceName.setComponentNameOrFeatureName(identifier);
			
				for(int i=0;i<identifiers.size();i++){
					String identifierTemp = (String)identifiers.get(i);
					errorSourceName.getErrorStateOrPropagationName().add(identifierTemp);
				}    	
				errorSourceName.setLocationReference(this.getFilename(),line);
				
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_20);
		}
		return errorSourceName;
	}
	
	public final ErrorStateMappingRule  error_state_mapping_rule() throws RecognitionException, TokenStreamException {
		ErrorStateMappingRule esmr = null;
		
		Token  id = null;
		
		try {      // for error handling
			
					esmr = eaxF.createErrorStateMappingRule();
					processComments(esmr);
					BooleanErrorExpression bee = null;
					
			
			{
			id = LT(1);
			match(IDENT);
			match(WHEN);
			bee=boolean_error_expression();
			}
			
				esmr.setLocationReference(this.getFilename(),id.getLine());
					esmr.setComponentErrorStateIdentifier(id.getText());
					esmr.setErrorExpression(bee);
			
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_16);
		}
		return esmr;
	}
	
	public final String  error_model_type_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	public final String  error_event_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	public final String  error_propagation_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	public final String  component_name_or_unique_port_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	public final String  component_error_state_identifier() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId = null;
		
		try {      // for error handling
			fId = LT(1);
			match(IDENT);
			id = new String(fId.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	public final String  contained_unit_identifier_combined() throws RecognitionException, TokenStreamException {
		String id = null;
		
		Token  fId1 = null;
		Token  fId2 = null;
		
		try {      // for error handling
			fId1 = LT(1);
			match(IDENT);
			id = fId1.getText();
			{
			_loop990:
			do {
				if ((LA(1)==DOT)) {
					match(DOT);
					fId2 = LT(1);
					match(IDENT);
					id = id+"."+fId2.getText();
				}
				else {
					break _loop990;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return id;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"IDENT",
		"\"features\"",
		"\"end\"",
		"SEMI",
		"COLON",
		"\"error\"",
		"\"event\"",
		"LCURLY",
		"\"occurrence\"",
		"ASSIGN",
		"RCURLY",
		"\"in\"",
		"\"out\"",
		"\"propagation\"",
		"\"initial\"",
		"\"inactive\"",
		"\"state\"",
		"\"model\"",
		"\"implementation\"",
		"DOT",
		"\"transitions\"",
		"\"none\"",
		"\"properties\"",
		"COMMA",
		"LTRANS",
		"RTRANS",
		"\"activate\"",
		"\"deactivate\"",
		"\"fixed\"",
		"\"poisson\"",
		"\"nonstandard\"",
		"DOUBLECOLON",
		"NUMERIC_LIT",
		"PLUS",
		"MINUS",
		"STAR",
		"\"report\"",
		"\"model_hierarchy\"",
		"\"derived_state_mapping\"",
		"\"applies\"",
		"\"to\"",
		"\"guard_in\"",
		"\"guard_out\"",
		"\"guard_event\"",
		"\"guard_transition\"",
		"\"mask\"",
		"\"when\"",
		"\"not\"",
		"LPAREN",
		"RPAREN",
		"\"and\"",
		"\"or\"",
		"\"ormore\"",
		"\"orless\"",
		"\"others\"",
		"\"self\"",
		"LSQUARE",
		"RSQUARE",
		"\"derived\"",
		"\"abstract\"",
		"\"abstraction\"",
		"\"access\"",
		"\"all\"",
		"\"annex\"",
		"\"binding\"",
		"\"aadlboolean\"",
		"\"bus\"",
		"\"calls\"",
		"\"classifier\"",
		"\"connections\"",
		"\"constant\"",
		"\"data\"",
		"\"delta\"",
		"\"device\"",
		"\"enumeration\"",
		"\"extends\"",
		"\"false\"",
		"\"flow\"",
		"\"flows\"",
		"\"group\"",
		"\"inherit\"",
		"\"aadlinteger\"",
		"\"inverse\"",
		"\"is\"",
		"\"list\"",
		"\"memory\"",
		"\"mode\"",
		"\"modes\"",
		"\"of\"",
		"\"package\"",
		"\"parameter\"",
		"\"path\"",
		"\"port\"",
		"\"private\"",
		"\"process\"",
		"\"processor\"",
		"\"property\"",
		"\"provides\"",
		"\"public\"",
		"\"range\"",
		"\"aadlreal\"",
		"\"reference\"",
		"\"refined\"",
		"\"refines\"",
		"\"requires\"",
		"\"server\"",
		"\"set\"",
		"\"sink\"",
		"\"source\"",
		"\"aadlstring\"",
		"\"subcomponents\"",
		"\"subprogram\"",
		"\"system\"",
		"\"thread\"",
		"\"true\"",
		"\"type\"",
		"\"units\"",
		"\"value\"",
		"DOTDOT",
		"ASSIGNPLUS",
		"ARROW",
		"DARROW",
		"HASH",
		"STRING_LITERAL",
		"DIGIT",
		"EXPONENT",
		"INT_EXPONENT",
		"EXTENDED_DIGIT",
		"BASED_INTEGER",
		"BASE",
		"ESC",
		"HEX_DIGIT",
		"WS",
		"ANNEX_TEXT",
		"SL_COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 8796093022850L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 514L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 16L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 80L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 2305843009213694208L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 128L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 8796093038720L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 67108944L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { 4160L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	private static final long[] mk_tokenSet_10() {
		long[] data = { 671088640L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_10 = new BitSet(mk_tokenSet_10());
	private static final long[] mk_tokenSet_11() {
		long[] data = { 8864812515472L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_11 = new BitSet(mk_tokenSet_11());
	private static final long[] mk_tokenSet_12() {
		long[] data = { 8796227256448L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_12 = new BitSet(mk_tokenSet_12());
	private static final long[] mk_tokenSet_13() {
		long[] data = { 535462164828160L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_13 = new BitSet(mk_tokenSet_13());
	private static final long[] mk_tokenSet_14() {
		long[] data = { 8796093022336L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_14 = new BitSet(mk_tokenSet_14());
	private static final long[] mk_tokenSet_15() {
		long[] data = { 8796093022208L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_15 = new BitSet(mk_tokenSet_15());
	private static final long[] mk_tokenSet_16() {
		long[] data = { 8796227240064L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_16 = new BitSet(mk_tokenSet_16());
	private static final long[] mk_tokenSet_17() {
		long[] data = { 34359738368L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_17 = new BitSet(mk_tokenSet_17());
	private static final long[] mk_tokenSet_18() {
		long[] data = { 9015995481981056L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_18 = new BitSet(mk_tokenSet_18());
	private static final long[] mk_tokenSet_19() {
		long[] data = { 8796227239936L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_19 = new BitSet(mk_tokenSet_19());
	private static final long[] mk_tokenSet_20() {
		long[] data = { 63059191010427008L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_20 = new BitSet(mk_tokenSet_20());
	private static final long[] mk_tokenSet_21() {
		long[] data = { 1215980695617273984L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_21 = new BitSet(mk_tokenSet_21());
	
	}
