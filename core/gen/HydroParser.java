package core.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HydroParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LPAREN=1, RPAREN=2, LBRACE=3, RBRACE=4, LLIST=5, RLIST=6, ASSIGN=7, DOT=8, 
		COMMA=9, AT=10, SEMI=11, COLON=12, TILDE=13, QUESTION=14, LARROW=15, RARROW=16, 
		ARROWASSIGN=17, DOUBLECOLONS=18, INCREMENT=19, DECREMENT=20, AMPERSAND=21, 
		ARITHMATICOPERATORS=22, COMPARATIVEOPERATORS=23, SHORTASSIGNOPS=24, BOOLEANOPERATORS=25, 
		UNARYOPERATOR=26, THREAD=27, TASK=28, FUNC=29, IF=30, ELSE=31, WHILE=32, 
		FOR=33, IMPORT=34, FROM=35, CLASS=36, NEW=37, OVERRIDE=38, COMMENT=39, 
		WS=40, BOOL=41, NULL=42, ID=43, INT=44, FLOAT=45, STRING=46, ANY=47, TYPE=48;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_stmt = 2, RULE_import_stmt = 3, 
		RULE_assignments = 4, RULE_funcassignment = 5, RULE_varassignment = 6, 
		RULE_getattribs = 7, RULE_call = 8, RULE_conditional_stmt = 9, RULE_if_stmt = 10, 
		RULE_while_stmt = 11, RULE_conditional_block = 12, RULE_args = 13, RULE_params = 14, 
		RULE_list = 15, RULE_expr = 16, RULE_atom = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "stmt", "import_stmt", "assignments", "funcassignment", 
			"varassignment", "getattribs", "call", "conditional_stmt", "if_stmt", 
			"while_stmt", "conditional_block", "args", "params", "list", "expr", 
			"atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'.'", "','", 
			"'@'", "';'", "':'", "'~'", "'?'", "'->'", "'<-'", "'=>'", "'::'", "'++'", 
			"'--'", "'&'", null, null, null, null, "'!'", "'thread'", "'task'", "'func'", 
			"'if'", "'else'", "'while'", "'for'", "'import'", "'from'", "'class'", 
			"'new'", "'override'", null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LLIST", "RLIST", "ASSIGN", 
			"DOT", "COMMA", "AT", "SEMI", "COLON", "TILDE", "QUESTION", "LARROW", 
			"RARROW", "ARROWASSIGN", "DOUBLECOLONS", "INCREMENT", "DECREMENT", "AMPERSAND", 
			"ARITHMATICOPERATORS", "COMPARATIVEOPERATORS", "SHORTASSIGNOPS", "BOOLEANOPERATORS", 
			"UNARYOPERATOR", "THREAD", "TASK", "FUNC", "IF", "ELSE", "WHILE", "FOR", 
			"IMPORT", "FROM", "CLASS", "NEW", "OVERRIDE", "COMMENT", "WS", "BOOL", 
			"NULL", "ID", "INT", "FLOAT", "STRING", "ANY", "TYPE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HydroParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HydroParser.EOF, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 420036594368544L) != 0) {
				{
				{
				setState(36);
				stmt();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HydroParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HydroParser.RBRACE, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(LBRACE);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 420036594368544L) != 0) {
				{
				{
				setState(45);
				stmt();
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Conditional_stmtContext conditional_stmt() {
			return getRuleContext(Conditional_stmtContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HydroParser.SEMI, 0); }
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Import_stmtContext import_stmt() {
			return getRuleContext(Import_stmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				conditional_stmt();
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(54);
					match(SEMI);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				assignments();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(58);
					match(SEMI);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				call();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(62);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				expr(0);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(66);
					match(SEMI);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				import_stmt();
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(70);
					match(SEMI);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_stmtContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HydroParser.IMPORT, 0); }
		public TerminalNode LBRACE() { return getToken(HydroParser.LBRACE, 0); }
		public List<TerminalNode> STRING() { return getTokens(HydroParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HydroParser.STRING, i);
		}
		public TerminalNode RBRACE() { return getToken(HydroParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(HydroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HydroParser.COMMA, i);
		}
		public TerminalNode FROM() { return getToken(HydroParser.FROM, 0); }
		public Import_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitImport_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_stmtContext import_stmt() throws RecognitionException {
		Import_stmtContext _localctx = new Import_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_stmt);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(IMPORT);
				setState(76);
				match(LBRACE);
				setState(77);
				match(STRING);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(78);
					match(COMMA);
					setState(79);
					match(STRING);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(85);
				match(RBRACE);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(86);
					match(FROM);
					setState(87);
					match(STRING);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(IMPORT);
				setState(91);
				match(STRING);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(92);
					match(FROM);
					setState(93);
					match(STRING);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentsContext extends ParserRuleContext {
		public VarassignmentContext varassignment() {
			return getRuleContext(VarassignmentContext.class,0);
		}
		public FuncassignmentContext funcassignment() {
			return getRuleContext(FuncassignmentContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitAssignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignments);
		try {
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				varassignment();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				funcassignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncassignmentContext extends ParserRuleContext {
		public TerminalNode FUNC() { return getToken(HydroParser.FUNC, 0); }
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public FuncassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcassignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitFuncassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncassignmentContext funcassignment() throws RecognitionException {
		FuncassignmentContext _localctx = new FuncassignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(FUNC);
			setState(103);
			match(ID);
			setState(104);
			match(LPAREN);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(105);
				params();
				}
			}

			setState(108);
			match(RPAREN);
			setState(109);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarassignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HydroParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TYPE() { return getToken(HydroParser.TYPE, 0); }
		public VarassignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varassignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitVarassignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarassignmentContext varassignment() throws RecognitionException {
		VarassignmentContext _localctx = new VarassignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varassignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(111);
				match(TYPE);
				}
			}

			setState(114);
			match(ID);
			setState(115);
			match(ASSIGN);
			setState(116);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GetattribsContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(HydroParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(HydroParser.DOT, i);
		}
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(HydroParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(HydroParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(HydroParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(HydroParser.RPAREN, i);
		}
		public List<ArgsContext> args() {
			return getRuleContexts(ArgsContext.class);
		}
		public ArgsContext args(int i) {
			return getRuleContext(ArgsContext.class,i);
		}
		public GetattribsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getattribs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitGetattribs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetattribsContext getattribs() throws RecognitionException {
		GetattribsContext _localctx = new GetattribsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getattribs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			atom();
			setState(119);
			match(DOT);
			setState(120);
			match(ID);
			setState(121);
			match(LPAREN);
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138538532208672L) != 0) {
				{
				setState(122);
				args();
				}
			}

			setState(125);
			match(RPAREN);
			setState(135);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					match(DOT);
					setState(127);
					match(ID);
					setState(128);
					match(LPAREN);
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138538532208672L) != 0) {
						{
						setState(129);
						args();
						}
					}

					setState(132);
					match(RPAREN);
					}
					} 
				}
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(ID);
			setState(139);
			match(LPAREN);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138538532208672L) != 0) {
				{
				setState(140);
				args();
				}
			}

			setState(143);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_stmtContext extends ParserRuleContext {
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public Conditional_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitConditional_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_stmtContext conditional_stmt() throws RecognitionException {
		Conditional_stmtContext _localctx = new Conditional_stmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditional_stmt);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				while_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class If_stmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(HydroParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(HydroParser.IF, i);
		}
		public List<Conditional_blockContext> conditional_block() {
			return getRuleContexts(Conditional_blockContext.class);
		}
		public Conditional_blockContext conditional_block(int i) {
			return getRuleContext(Conditional_blockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(HydroParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(HydroParser.ELSE, i);
		}
		public If_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_stmtContext if_stmt() throws RecognitionException {
		If_stmtContext _localctx = new If_stmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(IF);
			setState(150);
			conditional_block();
			setState(151);
			block();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(152);
					match(ELSE);
					setState(153);
					match(IF);
					setState(154);
					conditional_block();
					setState(155);
					block();
					}
					} 
				}
				setState(161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(162);
				match(ELSE);
				setState(163);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_stmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HydroParser.WHILE, 0); }
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stmtContext while_stmt() throws RecognitionException {
		While_stmtContext _localctx = new While_stmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(WHILE);
			setState(167);
			conditional_block();
			setState(168);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Conditional_blockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public Conditional_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitConditional_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Conditional_blockContext conditional_block() throws RecognitionException {
		Conditional_blockContext _localctx = new Conditional_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditional_block);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(LPAREN);
				setState(171);
				expr(0);
				setState(172);
				match(RPAREN);
				}
				break;
			case LLIST:
			case UNARYOPERATOR:
			case BOOL:
			case NULL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HydroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HydroParser.COMMA, i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			expr(0);
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				expr(0);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(HydroParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(HydroParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(ID);
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				match(ID);
				}
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode LLIST() { return getToken(HydroParser.LLIST, 0); }
		public TerminalNode RLIST() { return getToken(HydroParser.RLIST, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(LLIST);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138538532208672L) != 0) {
				{
				setState(194);
				args();
				}
			}

			setState(197);
			match(RLIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode UNARYOPERATOR() { return getToken(HydroParser.UNARYOPERATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GetattribsContext getattribs() {
			return getRuleContext(GetattribsContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode BOOLEANOPERATORS() { return getToken(HydroParser.BOOLEANOPERATORS, 0); }
		public TerminalNode ARITHMATICOPERATORS() { return getToken(HydroParser.ARITHMATICOPERATORS, 0); }
		public TerminalNode COMPARATIVEOPERATORS() { return getToken(HydroParser.COMPARATIVEOPERATORS, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(200);
				match(UNARYOPERATOR);
				setState(201);
				expr(4);
				}
				break;
			case 2:
				{
				setState(202);
				getattribs();
				}
				break;
			case 3:
				{
				setState(203);
				call();
				}
				break;
			case 4:
				{
				setState(204);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(216);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(208);
						((ExprContext)_localctx).op = match(BOOLEANOPERATORS);
						setState(209);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(210);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(211);
						((ExprContext)_localctx).op = match(ARITHMATICOPERATORS);
						setState(212);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(213);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(214);
						((ExprContext)_localctx).op = match(COMPARATIVEOPERATORS);
						setState(215);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HydroParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(HydroParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(HydroParser.BOOL, 0); }
		public TerminalNode NULL() { return getToken(HydroParser.NULL, 0); }
		public TerminalNode STRING() { return getToken(HydroParser.STRING, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atom);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(223);
				match(ID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(224);
				match(BOOL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(225);
				match(NULL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(226);
				match(STRING);
				}
				break;
			case LLIST:
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u00e7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0005\u0000"+
		"&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001/\b\u0001\n\u0001\f\u00012\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u00028\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002H\b\u0002\u0003\u0002J\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003Q\b\u0003\n\u0003\f\u0003"+
		"T\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003Y\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003_\b\u0003\u0003"+
		"\u0003a\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004e\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005k\b\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006q\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007|\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\u0007"+
		"\u0005\u0007\u0086\b\u0007\n\u0007\f\u0007\u0089\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u008e\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u0094"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u009e\b\n\n\n\f\n\u00a1\t\n\u0001\n\u0001\n\u0003\n\u00a5\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u00b0\b\f\u0001\r\u0001\r\u0001\r\u0005\r\u00b5\b\r"+
		"\n\r\f\r\u00b8\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00bd"+
		"\b\u000e\n\u000e\f\u000e\u00c0\t\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00c4\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ce\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0005\u0010\u00d9\b\u0010\n\u0010\f\u0010\u00dc"+
		"\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00e5\b\u0011\u0001\u0011\u0000\u0001 "+
		"\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"\u0000\u0000\u00fd\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0002,\u0001\u0000\u0000\u0000\u0004I\u0001\u0000\u0000\u0000\u0006`"+
		"\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nf\u0001\u0000\u0000"+
		"\u0000\fp\u0001\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010"+
		"\u008a\u0001\u0000\u0000\u0000\u0012\u0093\u0001\u0000\u0000\u0000\u0014"+
		"\u0095\u0001\u0000\u0000\u0000\u0016\u00a6\u0001\u0000\u0000\u0000\u0018"+
		"\u00af\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000\u0000\u0000\u001c"+
		"\u00b9\u0001\u0000\u0000\u0000\u001e\u00c1\u0001\u0000\u0000\u0000 \u00cd"+
		"\u0001\u0000\u0000\u0000\"\u00e4\u0001\u0000\u0000\u0000$&\u0003\u0004"+
		"\u0002\u0000%$\u0001\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000*+\u0005\u0000\u0000\u0001+\u0001\u0001\u0000"+
		"\u0000\u0000,0\u0005\u0003\u0000\u0000-/\u0003\u0004\u0002\u0000.-\u0001"+
		"\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"01\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000034\u0005\u0004\u0000\u00004\u0003\u0001\u0000\u0000\u000057\u0003"+
		"\u0012\t\u000068\u0005\u000b\u0000\u000076\u0001\u0000\u0000\u000078\u0001"+
		"\u0000\u0000\u00008J\u0001\u0000\u0000\u00009;\u0003\b\u0004\u0000:<\u0005"+
		"\u000b\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<J\u0001\u0000\u0000\u0000=?\u0003\u0010\b\u0000>@\u0005\u000b\u0000\u0000"+
		"?>\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@J\u0001\u0000\u0000"+
		"\u0000AC\u0003 \u0010\u0000BD\u0005\u000b\u0000\u0000CB\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DJ\u0001\u0000\u0000\u0000EG\u0003\u0006"+
		"\u0003\u0000FH\u0005\u000b\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001"+
		"\u0000\u0000\u0000HJ\u0001\u0000\u0000\u0000I5\u0001\u0000\u0000\u0000"+
		"I9\u0001\u0000\u0000\u0000I=\u0001\u0000\u0000\u0000IA\u0001\u0000\u0000"+
		"\u0000IE\u0001\u0000\u0000\u0000J\u0005\u0001\u0000\u0000\u0000KL\u0005"+
		"\"\u0000\u0000LM\u0005\u0003\u0000\u0000MR\u0005.\u0000\u0000NO\u0005"+
		"\t\u0000\u0000OQ\u0005.\u0000\u0000PN\u0001\u0000\u0000\u0000QT\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000"+
		"SU\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000UX\u0005\u0004\u0000"+
		"\u0000VW\u0005#\u0000\u0000WY\u0005.\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Ya\u0001\u0000\u0000\u0000Z[\u0005\"\u0000\u0000"+
		"[^\u0005.\u0000\u0000\\]\u0005#\u0000\u0000]_\u0005.\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000"+
		"`K\u0001\u0000\u0000\u0000`Z\u0001\u0000\u0000\u0000a\u0007\u0001\u0000"+
		"\u0000\u0000be\u0003\f\u0006\u0000ce\u0003\n\u0005\u0000db\u0001\u0000"+
		"\u0000\u0000dc\u0001\u0000\u0000\u0000e\t\u0001\u0000\u0000\u0000fg\u0005"+
		"\u001d\u0000\u0000gh\u0005+\u0000\u0000hj\u0005\u0001\u0000\u0000ik\u0003"+
		"\u001c\u000e\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000lm\u0005\u0002\u0000\u0000mn\u0003\u0002\u0001"+
		"\u0000n\u000b\u0001\u0000\u0000\u0000oq\u00050\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0005"+
		"+\u0000\u0000st\u0005\u0007\u0000\u0000tu\u0003 \u0010\u0000u\r\u0001"+
		"\u0000\u0000\u0000vw\u0003\"\u0011\u0000wx\u0005\b\u0000\u0000xy\u0005"+
		"+\u0000\u0000y{\u0005\u0001\u0000\u0000z|\u0003\u001a\r\u0000{z\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\u0087\u0005\u0002\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0080"+
		"\u0005+\u0000\u0000\u0080\u0082\u0005\u0001\u0000\u0000\u0081\u0083\u0003"+
		"\u001a\r\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0005\u0002"+
		"\u0000\u0000\u0085~\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000"+
		"\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000"+
		"\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0005+\u0000\u0000\u008b\u008d\u0005\u0001\u0000\u0000"+
		"\u008c\u008e\u0003\u001a\r\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u0002\u0000\u0000\u0090\u0011\u0001\u0000\u0000\u0000\u0091"+
		"\u0094\u0003\u0014\n\u0000\u0092\u0094\u0003\u0016\u000b\u0000\u0093\u0091"+
		"\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094\u0013"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u001e\u0000\u0000\u0096\u0097"+
		"\u0003\u0018\f\u0000\u0097\u009f\u0003\u0002\u0001\u0000\u0098\u0099\u0005"+
		"\u001f\u0000\u0000\u0099\u009a\u0005\u001e\u0000\u0000\u009a\u009b\u0003"+
		"\u0018\f\u0000\u009b\u009c\u0003\u0002\u0001\u0000\u009c\u009e\u0001\u0000"+
		"\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000"+
		"\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a4\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0005\u001f\u0000\u0000\u00a3\u00a5\u0003\u0002"+
		"\u0001\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u0015\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005 \u0000"+
		"\u0000\u00a7\u00a8\u0003\u0018\f\u0000\u00a8\u00a9\u0003\u0002\u0001\u0000"+
		"\u00a9\u0017\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005\u0001\u0000\u0000"+
		"\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u00ad\u0005\u0002\u0000\u0000\u00ad"+
		"\u00b0\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003 \u0010\u0000\u00af\u00aa"+
		"\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u0019"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b6\u0003 \u0010\u0000\u00b2\u00b3\u0005"+
		"\t\u0000\u0000\u00b3\u00b5\u0003 \u0010\u0000\u00b4\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u001b\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00be\u0005+\u0000"+
		"\u0000\u00ba\u00bb\u0005\t\u0000\u0000\u00bb\u00bd\u0005+\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd\u00c0\u0001\u0000\u0000\u0000"+
		"\u00be\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000"+
		"\u00bf\u001d\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c3\u0005\u0005\u0000\u0000\u00c2\u00c4\u0003\u001a\r\u0000\u00c3"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0006\u0000\u0000\u00c6"+
		"\u001f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0006\u0010\uffff\uffff\u0000"+
		"\u00c8\u00c9\u0005\u001a\u0000\u0000\u00c9\u00ce\u0003 \u0010\u0004\u00ca"+
		"\u00ce\u0003\u000e\u0007\u0000\u00cb\u00ce\u0003\u0010\b\u0000\u00cc\u00ce"+
		"\u0003\"\u0011\u0000\u00cd\u00c7\u0001\u0000\u0000\u0000\u00cd\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ce\u00da\u0001\u0000\u0000\u0000\u00cf\u00d0\n\u0007"+
		"\u0000\u0000\u00d0\u00d1\u0005\u0019\u0000\u0000\u00d1\u00d9\u0003 \u0010"+
		"\b\u00d2\u00d3\n\u0006\u0000\u0000\u00d3\u00d4\u0005\u0016\u0000\u0000"+
		"\u00d4\u00d9\u0003 \u0010\u0007\u00d5\u00d6\n\u0005\u0000\u0000\u00d6"+
		"\u00d7\u0005\u0017\u0000\u0000\u00d7\u00d9\u0003 \u0010\u0006\u00d8\u00cf"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d2\u0001\u0000\u0000\u0000\u00d8\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db!\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00e5\u0005"+
		",\u0000\u0000\u00de\u00e5\u0005-\u0000\u0000\u00df\u00e5\u0005+\u0000"+
		"\u0000\u00e0\u00e5\u0005)\u0000\u0000\u00e1\u00e5\u0005*\u0000\u0000\u00e2"+
		"\u00e5\u0005.\u0000\u0000\u00e3\u00e5\u0003\u001e\u000f\u0000\u00e4\u00dd"+
		"\u0001\u0000\u0000\u0000\u00e4\u00de\u0001\u0000\u0000\u0000\u00e4\u00df"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e0\u0001\u0000\u0000\u0000\u00e4\u00e1"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e5#\u0001\u0000\u0000\u0000\u001e\'07;?CG"+
		"IRX^`djp{\u0082\u0087\u008d\u0093\u009f\u00a4\u00af\u00b6\u00be\u00c3"+
		"\u00cd\u00d8\u00da\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}