package edu.cmu.sei.aadl.errorannex.parser;

import java.io.FileInputStream;
import java.io.InputStream;
 
public class FileParser {
	
    public static void parseFile(String filePath) {  
        try {
        	// The file path needs to be adjasted to the installation configuration 
        	//EAXLexer lexer = new EAXLexer(new FileInputStream("C:\\eclipse\\workspace\\edu.erau.aadl.errorannex.parser\\src\\test.eax"));

			EAXLexer lexer = new EAXLexer(new FileInputStream(filePath));
        	EAXParser parser = new EAXParser(lexer);

        	parser.annex_specific_language_construct();


        } catch(Exception e) { 
            System.err.println("exception: in FileParser");
            e.printStackTrace();
            
        }
    }
    public static void parseFile(InputStream file) {
        try {
        	// The file path needs to be adjasted to the installation configuration 
        	//EAXLexer lexer = new EAXLexer(new FileInputStream("C:\\eclipse\\workspace\\edu.erau.aadl.errorannex.parser\\src\\test.eax"));
        	
			EAXLexer lexer = new EAXLexer(file);
        	EAXParser parser = new EAXParser(lexer);
            parser.annex_specific_language_construct();

        } catch(Exception e) { 
            System.err.println("exception: in FileParser");
            e.printStackTrace();
        }
    }
 
}    
