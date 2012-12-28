package edu.cmu.sei.aadl.errorannex.parser;

import java.io.StringReader;

import org.osate.aadl2.AnnexLibrary;
import org.osate.aadl2.AnnexSubclause;
import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;

import antlr.RecognitionException;

import edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexLibraryImpl;
import edu.cmu.sei.aadl.errorannex.impl.ErrorAnnexSubClauseImpl;

public class ErrorAnnexParseAction implements org.osate.annexsupport.AnnexParser { 
	// Need to get aadl resources for resolving components
	// For resolving package names etc
	
	
	public AnnexLibrary parseAnnexLibrary
			(
				String annexName, String source,
				String filename, int line, int column, ParseErrorReporter errReporter
			) {
		 ParseErrorReporter reporter = errReporter;		 
		 ErrorAnnexLibraryImpl eal = null;	
		 try{			 
			 StringReader spec = new StringReader(source);
			 
			 EAXLexer lexer = new EAXLexer(spec);
			 lexer.setLine(line);
			 lexer.setColumn(column);
			 lexer.setParseErrorReporter(reporter);
			 lexer.setFilename(filename);
			 
				final SplitStreamFilter filter = new SplitStreamFilter(lexer);
				filter.splitOut(EAXParser.SL_COMMENT);

			 EAXParser parser = new EAXParser(filter);
			 parser.setStartLine(line);
			 parser.setTheFileName(filename);
			 parser.setParseErrorReporter(reporter);
			 parser.setFilter(filter);
			 
			 eal = (ErrorAnnexLibraryImpl)parser.annex_specific_language_construct();			 
		 }
		 catch(Exception e){
			 System.err.println("Error in  "+this.getClass()+"\n");
			 e.printStackTrace();
		 }            
		 return eal;

	 }

	public AnnexSubclause parseAnnexSubclause
			(
				String annexName, String source, String filename, 
				int line, int column, ParseErrorReporter errReporter
			) {

		 ParseErrorReporter reporter = errReporter;
		 
		 ErrorAnnexSubClauseImpl eas = null;
		 try{
			 StringReader spec = new StringReader(source);			 
			 EAXLexer lexer = new EAXLexer(spec);
			 lexer.setLine(line);
			 lexer.setColumn(column);
			 lexer.setParseErrorReporter(reporter);
			 lexer.setFilename(filename);
			 
				final SplitStreamFilter filter = new SplitStreamFilter(lexer);
				filter.splitOut(EAXParser.SL_COMMENT);

			 EAXParser parser = new EAXParser(filter);
			 lexer.setLine(line);
			 lexer.setColumn(column);			 
			 parser.setStartLine(line);
			 parser.setTheFileName(filename);
			 parser.setParseErrorReporter(reporter);
			 parser.setFilter(filter);
			 
			 eas = (ErrorAnnexSubClauseImpl)parser.error_annex_subclause_classifier();
			 /*if(eas != null){
				 eas.setName(annexName);
				 eas.setLocationReference(filename,line);
			 }
			 else{
				 ErrorannexFactory eaxF = ErrorannexFactory.eINSTANCE;				 
				 eas = (ErrorAnnexSubClauseImpl)eaxF.createErrorAnnexSubClause();				 
				 eas.setName("Error Encountered Parsing File");
			 }*/
		 }
		 catch(Exception e){
			 System.err.println("Error in  "+this.getClass()+"\n");
			 e.printStackTrace();
		 }            
		 return eas;
	 }
}