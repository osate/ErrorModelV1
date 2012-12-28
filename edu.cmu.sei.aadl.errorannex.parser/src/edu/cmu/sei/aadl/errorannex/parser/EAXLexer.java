// $ANTLR : "eax.g" -> "EAXLexer.java"$

package edu.cmu.sei.aadl.errorannex.parser;

import java.io.InputStream;
import java.io.Reader;
import antlr.CharBuffer;
import java.util.Hashtable;
import antlr.collections.impl.BitSet;

import antlr.ANTLRHashString;
import antlr.ByteBuffer;
import antlr.CharStreamException;
import antlr.CharStreamIOException;
import antlr.InputBuffer;
import antlr.LexerSharedInputState;
import antlr.NoViableAltForCharException;
import antlr.RecognitionException;
import antlr.Token;
import antlr.TokenStream;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;

import org.osate.aadl2.modelsupport.errorreporting.ParseErrorReporter;

public class EAXLexer extends antlr.CharScanner implements EAXParserTokenTypes, TokenStream
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
public EAXLexer(InputStream in) {
	this(new ByteBuffer(in));
}
public EAXLexer(Reader in) {
	this(new CharBuffer(in));
}
public EAXLexer(InputBuffer ib) {
	this(new LexerSharedInputState(ib));
}
public EAXLexer(LexerSharedInputState state) {
	super(state);
	caseSensitiveLiterals = false;
	setCaseSensitive(false);
	literals = new Hashtable();
	literals.put(new ANTLRHashString("type", this), new Integer(119));
	literals.put(new ANTLRHashString("inverse", this), new Integer(86));
	literals.put(new ANTLRHashString("constant", this), new Integer(74));
	literals.put(new ANTLRHashString("connections", this), new Integer(73));
	literals.put(new ANTLRHashString("public", this), new Integer(102));
	literals.put(new ANTLRHashString("list", this), new Integer(88));
	literals.put(new ANTLRHashString("initial", this), new Integer(18));
	literals.put(new ANTLRHashString("ormore", this), new Integer(56));
	literals.put(new ANTLRHashString("applies", this), new Integer(43));
	literals.put(new ANTLRHashString("end", this), new Integer(6));
	literals.put(new ANTLRHashString("aadlboolean", this), new Integer(69));
	literals.put(new ANTLRHashString("flows", this), new Integer(82));
	literals.put(new ANTLRHashString("guard_event", this), new Integer(47));
	literals.put(new ANTLRHashString("memory", this), new Integer(89));
	literals.put(new ANTLRHashString("aadlstring", this), new Integer(113));
	literals.put(new ANTLRHashString("flow", this), new Integer(81));
	literals.put(new ANTLRHashString("system", this), new Integer(116));
	literals.put(new ANTLRHashString("implementation", this), new Integer(22));
	literals.put(new ANTLRHashString("to", this), new Integer(44));
	literals.put(new ANTLRHashString("and", this), new Integer(54));
	literals.put(new ANTLRHashString("not", this), new Integer(51));
	literals.put(new ANTLRHashString("package", this), new Integer(93));
	literals.put(new ANTLRHashString("inherit", this), new Integer(84));
	literals.put(new ANTLRHashString("guard_in", this), new Integer(45));
	literals.put(new ANTLRHashString("aadlreal", this), new Integer(104));
	literals.put(new ANTLRHashString("source", this), new Integer(112));
	literals.put(new ANTLRHashString("reference", this), new Integer(105));
	literals.put(new ANTLRHashString("fixed", this), new Integer(32));
	literals.put(new ANTLRHashString("provides", this), new Integer(101));
	literals.put(new ANTLRHashString("poisson", this), new Integer(33));
	literals.put(new ANTLRHashString("server", this), new Integer(109));
	literals.put(new ANTLRHashString("when", this), new Integer(50));
	literals.put(new ANTLRHashString("sink", this), new Integer(111));
	literals.put(new ANTLRHashString("event", this), new Integer(10));
	literals.put(new ANTLRHashString("range", this), new Integer(103));
	literals.put(new ANTLRHashString("enumeration", this), new Integer(78));
	literals.put(new ANTLRHashString("calls", this), new Integer(71));
	literals.put(new ANTLRHashString("out", this), new Integer(16));
	literals.put(new ANTLRHashString("set", this), new Integer(110));
	literals.put(new ANTLRHashString("model", this), new Integer(21));
	literals.put(new ANTLRHashString("deactivate", this), new Integer(31));
	literals.put(new ANTLRHashString("parameter", this), new Integer(94));
	literals.put(new ANTLRHashString("derived_state_mapping", this), new Integer(42));
	literals.put(new ANTLRHashString("of", this), new Integer(92));
	literals.put(new ANTLRHashString("is", this), new Integer(87));
	literals.put(new ANTLRHashString("aadlinteger", this), new Integer(85));
	literals.put(new ANTLRHashString("or", this), new Integer(55));
	literals.put(new ANTLRHashString("access", this), new Integer(65));
	literals.put(new ANTLRHashString("orless", this), new Integer(57));
	literals.put(new ANTLRHashString("propagation", this), new Integer(17));
	literals.put(new ANTLRHashString("guard_transition", this), new Integer(48));
	literals.put(new ANTLRHashString("none", this), new Integer(25));
	literals.put(new ANTLRHashString("features", this), new Integer(5));
	literals.put(new ANTLRHashString("guard_out", this), new Integer(46));
	literals.put(new ANTLRHashString("report", this), new Integer(40));
	literals.put(new ANTLRHashString("data", this), new Integer(75));
	literals.put(new ANTLRHashString("all", this), new Integer(66));
	literals.put(new ANTLRHashString("thread", this), new Integer(117));
	literals.put(new ANTLRHashString("derived", this), new Integer(62));
	literals.put(new ANTLRHashString("model_hierarchy", this), new Integer(41));
	literals.put(new ANTLRHashString("path", this), new Integer(95));
	literals.put(new ANTLRHashString("properties", this), new Integer(26));
	literals.put(new ANTLRHashString("nonstandard", this), new Integer(34));
	literals.put(new ANTLRHashString("activate", this), new Integer(30));
	literals.put(new ANTLRHashString("units", this), new Integer(120));
	literals.put(new ANTLRHashString("inactive", this), new Integer(19));
	literals.put(new ANTLRHashString("bus", this), new Integer(70));
	literals.put(new ANTLRHashString("binding", this), new Integer(68));
	literals.put(new ANTLRHashString("extends", this), new Integer(79));
	literals.put(new ANTLRHashString("others", this), new Integer(58));
	literals.put(new ANTLRHashString("private", this), new Integer(97));
	literals.put(new ANTLRHashString("port", this), new Integer(96));
	literals.put(new ANTLRHashString("abstraction", this), new Integer(64));
	literals.put(new ANTLRHashString("requires", this), new Integer(108));
	literals.put(new ANTLRHashString("refines", this), new Integer(107));
	literals.put(new ANTLRHashString("false", this), new Integer(80));
	literals.put(new ANTLRHashString("processor", this), new Integer(99));
	literals.put(new ANTLRHashString("mask", this), new Integer(49));
	literals.put(new ANTLRHashString("abstract", this), new Integer(63));
	literals.put(new ANTLRHashString("device", this), new Integer(77));
	literals.put(new ANTLRHashString("property", this), new Integer(100));
	literals.put(new ANTLRHashString("annex", this), new Integer(67));
	literals.put(new ANTLRHashString("classifier", this), new Integer(72));
	literals.put(new ANTLRHashString("occurrence", this), new Integer(12));
	literals.put(new ANTLRHashString("transitions", this), new Integer(24));
	literals.put(new ANTLRHashString("process", this), new Integer(98));
	literals.put(new ANTLRHashString("state", this), new Integer(20));
	literals.put(new ANTLRHashString("value", this), new Integer(121));
	literals.put(new ANTLRHashString("modes", this), new Integer(91));
	literals.put(new ANTLRHashString("self", this), new Integer(59));
	literals.put(new ANTLRHashString("in", this), new Integer(15));
	literals.put(new ANTLRHashString("delta", this), new Integer(76));
	literals.put(new ANTLRHashString("mode", this), new Integer(90));
	literals.put(new ANTLRHashString("true", this), new Integer(118));
	literals.put(new ANTLRHashString("group", this), new Integer(83));
	literals.put(new ANTLRHashString("refined", this), new Integer(106));
	literals.put(new ANTLRHashString("subprogram", this), new Integer(115));
	literals.put(new ANTLRHashString("error", this), new Integer(9));
	literals.put(new ANTLRHashString("subcomponents", this), new Integer(114));
}

public Token nextToken() throws TokenStreamException {
	Token theRetToken=null;
tryAgain:
	for (;;) {
		Token _token = null;
		int _ttype = Token.INVALID_TYPE;
		resetText();
		try {   // for char stream error handling
			try {   // for lexical error handling
				switch ( LA(1)) {
				case '(':
				{
					mLPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case ')':
				{
					mRPAREN(true);
					theRetToken=_returnToken;
					break;
				}
				case '}':
				{
					mRCURLY(true);
					theRetToken=_returnToken;
					break;
				}
				case '*':
				{
					mSTAR(true);
					theRetToken=_returnToken;
					break;
				}
				case ';':
				{
					mSEMI(true);
					theRetToken=_returnToken;
					break;
				}
				case ',':
				{
					mCOMMA(true);
					theRetToken=_returnToken;
					break;
				}
				case '=':
				{
					mASSIGN(true);
					theRetToken=_returnToken;
					break;
				}
				case '#':
				{
					mHASH(true);
					theRetToken=_returnToken;
					break;
				}
				case '[':
				{
					mLSQUARE(true);
					theRetToken=_returnToken;
					break;
				}
				case 'a':  case 'b':  case 'c':  case 'd':
				case 'e':  case 'f':  case 'g':  case 'h':
				case 'i':  case 'j':  case 'k':  case 'l':
				case 'm':  case 'n':  case 'o':  case 'p':
				case 'q':  case 'r':  case 's':  case 't':
				case 'u':  case 'v':  case 'w':  case 'x':
				case 'y':  case 'z':
				{
					mIDENT(true);
					theRetToken=_returnToken;
					break;
				}
				case '"':
				{
					mSTRING_LITERAL(true);
					theRetToken=_returnToken;
					break;
				}
				case '0':  case '1':  case '2':  case '3':
				case '4':  case '5':  case '6':  case '7':
				case '8':  case '9':
				{
					mNUMERIC_LIT(true);
					theRetToken=_returnToken;
					break;
				}
				case '\t':  case '\n':  case '\r':  case ' ':
				{
					mWS(true);
					theRetToken=_returnToken;
					break;
				}
				default:
					if ((LA(1)=='-') && (LA(2)=='>') && (LA(3)=='>')) {
						mDARROW(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='.') && (LA(2)=='.')) {
						mDOTDOT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='+') && (LA(2)=='=')) {
						mASSIGNPLUS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (LA(2)==':')) {
						mDOUBLECOLON(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='[')) {
						mLTRANS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==']') && (LA(2)=='-')) {
						mRTRANS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='>') && (true)) {
						mARROW(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='{') && (LA(2)=='*')) {
						mANNEX_TEXT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (LA(2)=='-')) {
						mSL_COMMENT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='{') && (true)) {
						mLCURLY(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==':') && (true)) {
						mCOLON(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='+') && (true)) {
						mPLUS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='-') && (true)) {
						mMINUS(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)=='.') && (true)) {
						mDOT(true);
						theRetToken=_returnToken;
					}
					else if ((LA(1)==']') && (true)) {
						mRSQUARE(true);
						theRetToken=_returnToken;
					}
				else {
					if (LA(1)==EOF_CHAR) {uponEOF(); _returnToken = makeToken(Token.EOF_TYPE);}
				else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				}
				if ( _returnToken==null ) continue tryAgain; // found SKIP token
				_ttype = _returnToken.getType();
				_ttype = testLiteralsTable(_ttype);
				_returnToken.setType(_ttype);
				return _returnToken;
			}
			catch (RecognitionException e) {
				reportError(e);
				consume();
			}
		}
		catch (CharStreamException cse) {
			if ( cse instanceof CharStreamIOException ) {
				throw new TokenStreamIOException(((CharStreamIOException)cse).io);
			}
			else {
				throw new TokenStreamException(cse.getMessage());
			}
		}
	}
}

	public final void mLPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LPAREN;
		int _saveIndex;
		
		try {      // for error handling
			match('(');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRPAREN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RPAREN;
		int _saveIndex;
		
		try {      // for error handling
			match(')');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LCURLY;
		int _saveIndex;
		
		try {      // for error handling
			match('{');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRCURLY(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RCURLY;
		int _saveIndex;
		
		try {      // for error handling
			match('}');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COLON;
		int _saveIndex;
		
		try {      // for error handling
			match(':');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = PLUS;
		int _saveIndex;
		
		try {      // for error handling
			match('+');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mMINUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = MINUS;
		int _saveIndex;
		
		try {      // for error handling
			match('-');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTAR(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STAR;
		int _saveIndex;
		
		try {      // for error handling
			match('*');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSEMI(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SEMI;
		int _saveIndex;
		
		try {      // for error handling
			match(';');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mCOMMA(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = COMMA;
		int _saveIndex;
		
		try {      // for error handling
			match(',');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOT;
		int _saveIndex;
		
		try {      // for error handling
			match('.');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOTDOT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOTDOT;
		int _saveIndex;
		
		try {      // for error handling
			match("..");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASSIGN(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASSIGN;
		int _saveIndex;
		
		try {      // for error handling
			match("=>");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mASSIGNPLUS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ASSIGNPLUS;
		int _saveIndex;
		
		try {      // for error handling
			match("+=>");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDOUBLECOLON(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DOUBLECOLON;
		int _saveIndex;
		
		try {      // for error handling
			match("::");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLTRANS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LTRANS;
		int _saveIndex;
		
		try {      // for error handling
			match("-[");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRTRANS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RTRANS;
		int _saveIndex;
		
		try {      // for error handling
			match("]->");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mARROW(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ARROW;
		int _saveIndex;
		
		try {      // for error handling
			match("->");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mDARROW(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DARROW;
		int _saveIndex;
		
		try {      // for error handling
			match("->>");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mHASH(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HASH;
		int _saveIndex;
		
		try {      // for error handling
			match('#');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mRSQUARE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = RSQUARE;
		int _saveIndex;
		
		try {      // for error handling
			match(']');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mLSQUARE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = LSQUARE;
		int _saveIndex;
		
		try {      // for error handling
			match('[');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mIDENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = IDENT;
		int _saveIndex;
		
		try {      // for error handling
			{
			matchRange('a','z');
			}
			{
			_loop1021:
			do {
				if ((_tokenSet_1.member(LA(1)))) {
					{
					switch ( LA(1)) {
					case '_':
					{
						match('_');
						break;
					}
					case '0':  case '1':  case '2':  case '3':
					case '4':  case '5':  case '6':  case '7':
					case '8':  case '9':  case 'a':  case 'b':
					case 'c':  case 'd':  case 'e':  case 'f':
					case 'g':  case 'h':  case 'i':  case 'j':
					case 'k':  case 'l':  case 'm':  case 'n':
					case 'o':  case 'p':  case 'q':  case 'r':
					case 's':  case 't':  case 'u':  case 'v':
					case 'w':  case 'x':  case 'y':  case 'z':
					{
						break;
					}
					default:
					{
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					}
					}
					{
					switch ( LA(1)) {
					case 'a':  case 'b':  case 'c':  case 'd':
					case 'e':  case 'f':  case 'g':  case 'h':
					case 'i':  case 'j':  case 'k':  case 'l':
					case 'm':  case 'n':  case 'o':  case 'p':
					case 'q':  case 'r':  case 's':  case 't':
					case 'u':  case 'v':  case 'w':  case 'x':
					case 'y':  case 'z':
					{
						matchRange('a','z');
						break;
					}
					case '0':  case '1':  case '2':  case '3':
					case '4':  case '5':  case '6':  case '7':
					case '8':  case '9':
					{
						matchRange('0','9');
						break;
					}
					default:
					{
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					}
					}
				}
				else {
					break _loop1021;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			
			reportError(ex);
						consume();
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSTRING_LITERAL(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = STRING_LITERAL;
		int _saveIndex;
		
		try {      // for error handling
			match('"');
			{
			_loop1025:
			do {
				switch ( LA(1)) {
				case '\\':
				{
					mESC(false);
					break;
				}
				case '\u0000':  case '\u0001':  case '\u0002':  case '\u0003':
				case '\u0004':  case '\u0005':  case '\u0006':  case '\u0007':
				case '\u0008':  case '\t':  case '\n':  case '\u000b':
				case '\u000c':  case '\r':  case '\u000e':  case '\u000f':
				case '\u0010':  case '\u0011':  case '\u0012':  case '\u0013':
				case '\u0014':  case '\u0015':  case '\u0016':  case '\u0017':
				case '\u0018':  case '\u0019':  case '\u001a':  case '\u001b':
				case '\u001c':  case '\u001d':  case '\u001e':  case '\u001f':
				case ' ':  case '!':  case '#':  case '$':
				case '%':  case '&':  case '\'':  case '(':
				case ')':  case '*':  case '+':  case ',':
				case '-':  case '.':  case '/':  case '0':
				case '1':  case '2':  case '3':  case '4':
				case '5':  case '6':  case '7':  case '8':
				case '9':  case ':':  case ';':  case '<':
				case '=':  case '>':  case '?':  case '@':
				case 'A':  case 'B':  case 'C':  case 'D':
				case 'E':  case 'F':  case 'G':  case 'H':
				case 'I':  case 'J':  case 'K':  case 'L':
				case 'M':  case 'N':  case 'O':  case 'P':
				case 'Q':  case 'R':  case 'S':  case 'T':
				case 'U':  case 'V':  case 'W':  case 'X':
				case 'Y':  case 'Z':  case '[':  case ']':
				case '^':  case '_':  case '`':  case 'a':
				case 'b':  case 'c':  case 'd':  case 'e':
				case 'f':  case 'g':  case 'h':  case 'i':
				case 'j':  case 'k':  case 'l':  case 'm':
				case 'n':  case 'o':  case 'p':  case 'q':
				case 'r':  case 's':  case 't':  case 'u':
				case 'v':  case 'w':  case 'x':  case 'y':
				case 'z':  case '{':  case '|':  case '}':
				case '~':  case '\u007f':
				{
					{
					match(_tokenSet_2);
					}
					break;
				}
				default:
				{
					break _loop1025;
				}
				}
			} while (true);
			}
			match('"');
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mESC(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ESC;
		int _saveIndex;
		
		try {      // for error handling
			match('\\');
			{
			switch ( LA(1)) {
			case 'n':
			{
				match('n');
				break;
			}
			case 'r':
			{
				match('r');
				break;
			}
			case 't':
			{
				match('t');
				break;
			}
			case 'b':
			{
				match('b');
				break;
			}
			case 'f':
			{
				match('f');
				break;
			}
			case '"':
			{
				match('"');
				break;
			}
			case '\'':
			{
				match('\'');
				break;
			}
			case '\\':
			{
				match('\\');
				break;
			}
			case 'u':
			{
				{
				int _cnt1068=0;
				_loop1068:
				do {
					if ((LA(1)=='u')) {
						match('u');
					}
					else {
						if ( _cnt1068>=1 ) { break _loop1068; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
					}
					
					_cnt1068++;
				} while (true);
				}
				mHEX_DIGIT(false);
				mHEX_DIGIT(false);
				mHEX_DIGIT(false);
				mHEX_DIGIT(false);
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			{
				matchRange('0','3');
				{
				if (((LA(1) >= '0' && LA(1) <= '7')) && ((LA(2) >= '\u0000' && LA(2) <= '\u007f')) && (true)) {
					matchRange('0','7');
					{
					if (((LA(1) >= '0' && LA(1) <= '7')) && ((LA(2) >= '\u0000' && LA(2) <= '\u007f')) && (true)) {
						matchRange('0','7');
					}
					else if (((LA(1) >= '\u0000' && LA(1) <= '\u007f')) && (true) && (true)) {
					}
					else {
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					
					}
				}
				else if (((LA(1) >= '\u0000' && LA(1) <= '\u007f')) && (true) && (true)) {
				}
				else {
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				
				}
				break;
			}
			case '4':  case '5':  case '6':  case '7':
			{
				matchRange('4','7');
				{
				if (((LA(1) >= '0' && LA(1) <= '7')) && ((LA(2) >= '\u0000' && LA(2) <= '\u007f')) && (true)) {
					matchRange('0','7');
				}
				else if (((LA(1) >= '\u0000' && LA(1) <= '\u007f')) && (true) && (true)) {
				}
				else {
					throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
				}
				
				}
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mNUMERIC_LIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = NUMERIC_LIT;
		int _saveIndex;
		
		try {      // for error handling
			{
			int _cnt1028=0;
			_loop1028:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDIGIT(false);
				}
				else {
					if ( _cnt1028>=1 ) { break _loop1028; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				
				_cnt1028++;
			} while (true);
			}
			{
			if ((LA(1)=='#')) {
				{
				match('#');
				mBASED_INTEGER(false);
				match('#');
				{
				if ((LA(1)=='e')) {
					mINT_EXPONENT(false);
				}
				else {
				}
				
				}
				}
			}
			else {
				{
				_loop1035:
				do {
					if ((LA(1)=='_')) {
						match('_');
						{
						int _cnt1034=0;
						_loop1034:
						do {
							if (((LA(1) >= '0' && LA(1) <= '9'))) {
								mDIGIT(false);
							}
							else {
								if ( _cnt1034>=1 ) { break _loop1034; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
							}
							
							_cnt1034++;
						} while (true);
						}
					}
					else {
						break _loop1035;
					}
					
				} while (true);
				}
				{
				if (((LA(1)=='.'))&&( LA(2)!='.' )) {
					{
					match('.');
					{
					int _cnt1039=0;
					_loop1039:
					do {
						if (((LA(1) >= '0' && LA(1) <= '9'))) {
							mDIGIT(false);
						}
						else {
							if ( _cnt1039>=1 ) { break _loop1039; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
						}
						
						_cnt1039++;
					} while (true);
					}
					{
					_loop1043:
					do {
						if ((LA(1)=='_')) {
							match('_');
							{
							int _cnt1042=0;
							_loop1042:
							do {
								if (((LA(1) >= '0' && LA(1) <= '9'))) {
									mDIGIT(false);
								}
								else {
									if ( _cnt1042>=1 ) { break _loop1042; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
								}
								
								_cnt1042++;
							} while (true);
							}
						}
						else {
							break _loop1043;
						}
						
					} while (true);
					}
					{
					if ((LA(1)=='e')) {
						mEXPONENT(false);
					}
					else {
					}
					
					}
					}
				}
				else {
					{
					if ((LA(1)=='e')) {
						mINT_EXPONENT(false);
					}
					else {
					}
					
					}
				}
				
				}
			}
			
			}
		}
		catch (RecognitionException ex) {
			
			reportError(ex);
						consume();
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mDIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = DIGIT;
		int _saveIndex;
		
		try {      // for error handling
			{
			matchRange('0','9');
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mBASED_INTEGER(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BASED_INTEGER;
		int _saveIndex;
		
		try {      // for error handling
			{
			mEXTENDED_DIGIT(false);
			}
			{
			_loop1062:
			do {
				if ((_tokenSet_5.member(LA(1)))) {
					{
					switch ( LA(1)) {
					case '_':
					{
						match('_');
						break;
					}
					case '0':  case '1':  case '2':  case '3':
					case '4':  case '5':  case '6':  case '7':
					case '8':  case '9':  case 'a':  case 'b':
					case 'c':  case 'd':  case 'e':  case 'f':
					{
						break;
					}
					default:
					{
						throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
					}
					}
					}
					mEXTENDED_DIGIT(false);
				}
				else {
					break _loop1062;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mINT_EXPONENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = INT_EXPONENT;
		int _saveIndex;
		
		try {      // for error handling
			{
			match('e');
			}
			{
			switch ( LA(1)) {
			case '+':
			{
				match('+');
				break;
			}
			case '-':
			{
				match('-');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			{
			int _cnt1055=0;
			_loop1055:
			do {
				if (((LA(1) >= '0' && LA(1) <= '9'))) {
					mDIGIT(false);
				}
				else {
					if ( _cnt1055>=1 ) { break _loop1055; } else {throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());}
				}
				
				_cnt1055++;
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			
			reportError(ex);
						consume();
			
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mEXPONENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXPONENT;
		int _saveIndex;
		
		try {      // for error handling
			{
			match('e');
			}
			{
			switch ( LA(1)) {
			case '+':
			{
				match('+');
				break;
			}
			case '-':
			{
				match('-');
				break;
			}
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			mNUMERIC_LIT(false);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mEXTENDED_DIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = EXTENDED_DIGIT;
		int _saveIndex;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				mDIGIT(false);
				break;
			}
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':
			{
				matchRange('a','f');
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mBASE(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = BASE;
		int _saveIndex;
		
		try {      // for error handling
			mDIGIT(false);
			{
			if (((LA(1) >= '0' && LA(1) <= '9'))) {
				mDIGIT(false);
			}
			else {
			}
			
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	protected final void mHEX_DIGIT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = HEX_DIGIT;
		int _saveIndex;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case '0':  case '1':  case '2':  case '3':
			case '4':  case '5':  case '6':  case '7':
			case '8':  case '9':
			{
				matchRange('0','9');
				break;
			}
			case 'a':  case 'b':  case 'c':  case 'd':
			case 'e':  case 'f':
			{
				matchRange('a','f');
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mWS(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = WS;
		int _saveIndex;
		
		try {      // for error handling
			{
			switch ( LA(1)) {
			case ' ':
			{
				match(' ');
				break;
			}
			case '\r':
			{
				match('\r');
				match('\n');
				newline();
				break;
			}
			case '\n':
			{
				match('\n');
				newline();
				break;
			}
			case '\t':
			{
				match('\t');
				tab();
				break;
			}
			default:
			{
				throw new NoViableAltForCharException((char)LA(1), getFilename(), getLine(), getColumn());
			}
			}
			}
			_ttype = Token.SKIP;
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mANNEX_TEXT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = ANNEX_TEXT;
		int _saveIndex;
		
		try {      // for error handling
			match("{**");
			{
			_loop1079:
			do {
				switch ( LA(1)) {
				case '\n':
				{
					match('\n');
					newline();
					break;
				}
				case '\u0000':  case '\u0001':  case '\u0002':  case '\u0003':
				case '\u0004':  case '\u0005':  case '\u0006':  case '\u0007':
				case '\u0008':  case '\t':  case '\u000b':  case '\u000c':
				case '\u000e':  case '\u000f':  case '\u0010':  case '\u0011':
				case '\u0012':  case '\u0013':  case '\u0014':  case '\u0015':
				case '\u0016':  case '\u0017':  case '\u0018':  case '\u0019':
				case '\u001a':  case '\u001b':  case '\u001c':  case '\u001d':
				case '\u001e':  case '\u001f':  case ' ':  case '!':
				case '"':  case '#':  case '$':  case '%':
				case '&':  case '\'':  case '(':  case ')':
				case '+':  case ',':  case '-':  case '.':
				case '/':  case '0':  case '1':  case '2':
				case '3':  case '4':  case '5':  case '6':
				case '7':  case '8':  case '9':  case ':':
				case ';':  case '<':  case '=':  case '>':
				case '?':  case '@':  case 'A':  case 'B':
				case 'C':  case 'D':  case 'E':  case 'F':
				case 'G':  case 'H':  case 'I':  case 'J':
				case 'K':  case 'L':  case 'M':  case 'N':
				case 'O':  case 'P':  case 'Q':  case 'R':
				case 'S':  case 'T':  case 'U':  case 'V':
				case 'W':  case 'X':  case 'Y':  case 'Z':
				case '[':  case '\\':  case ']':  case '^':
				case '_':  case '`':  case 'a':  case 'b':
				case 'c':  case 'd':  case 'e':  case 'f':
				case 'g':  case 'h':  case 'i':  case 'j':
				case 'k':  case 'l':  case 'm':  case 'n':
				case 'o':  case 'p':  case 'q':  case 'r':
				case 's':  case 't':  case 'u':  case 'v':
				case 'w':  case 'x':  case 'y':  case 'z':
				case '{':  case '|':  case '}':  case '~':
				case '\u007f':
				{
					{
					match(_tokenSet_8);
					}
					break;
				}
				default:
					if (((LA(1)=='*') && ((LA(2) >= '\u0000' && LA(2) <= '\u007f')) && ((LA(3) >= '\u0000' && LA(3) <= '\u007f')))&&( LA(2)!='*' || LA(3) != '}' )) {
						match('*');
					}
					else if ((LA(1)=='\r') && (LA(2)=='\n') && ((LA(3) >= '\u0000' && LA(3) <= '\u007f'))) {
						match('\r');
						match('\n');
						newline();
					}
					else if ((LA(1)=='\r') && ((LA(2) >= '\u0000' && LA(2) <= '\u007f')) && ((LA(3) >= '\u0000' && LA(3) <= '\u007f'))) {
						match('\r');
						newline();
					}
				else {
					break _loop1079;
				}
				}
			} while (true);
			}
			match("**}");
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	public final void mSL_COMMENT(boolean _createToken) throws RecognitionException, CharStreamException, TokenStreamException {
		int _ttype; Token _token=null; int _begin=text.length();
		_ttype = SL_COMMENT;
		int _saveIndex;
		
		try {      // for error handling
			match("--");
			{
			_loop1083:
			do {
				if ((_tokenSet_9.member(LA(1)))) {
					{
					match(_tokenSet_9);
					}
				}
				else {
					break _loop1083;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		if ( _createToken && _token==null && _ttype!=Token.SKIP ) {
			_token = makeToken(_ttype);
			_token.setText(new String(text.getBuffer(), _begin, text.length()-_begin));
		}
		_returnToken = _token;
	}
	
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 0L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 287948901175001088L, 576460745860972544L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { -17179869185L, -268435457L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { -1L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 288019304278917120L, 543313362944L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 287948901175001088L, 543313362944L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 34359738368L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 287948935534739456L, 543313362944L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { -4398046520321L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	private static final long[] mk_tokenSet_9() {
		long[] data = { -9217L, -1L, 0L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_9 = new BitSet(mk_tokenSet_9());
	
	}
