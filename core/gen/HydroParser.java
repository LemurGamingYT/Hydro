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
		RULE_clsassign = 7, RULE_classdef = 8, RULE_define_blocks = 9, RULE_getattribs = 10, 
		RULE_attrassign = 11, RULE_call = 12, RULE_conditional_stmt = 13, RULE_if_stmt = 14, 
		RULE_while_stmt = 15, RULE_for_stmt = 16, RULE_conditional_block = 17, 
		RULE_args = 18, RULE_params = 19, RULE_type_conversion = 20, RULE_list = 21, 
		RULE_expr = 22, RULE_atom = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "stmt", "import_stmt", "assignments", "funcassignment", 
			"varassignment", "clsassign", "classdef", "define_blocks", "getattribs", 
			"attrassign", "call", "conditional_stmt", "if_stmt", "while_stmt", "for_stmt", 
			"conditional_block", "args", "params", "type_conversion", "list", "expr", 
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 420251476951074L) != 0) {
				{
				{
				setState(48);
				stmt();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(56);
			match(LBRACE);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 420251476951074L) != 0) {
				{
				{
				setState(57);
				stmt();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
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
		public ClassdefContext classdef() {
			return getRuleContext(ClassdefContext.class,0);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				conditional_stmt();
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
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				assignments();
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
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				call();
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(74);
					match(SEMI);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				expr(0);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(78);
					match(SEMI);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				classdef();
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(82);
					match(SEMI);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				import_stmt();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(86);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(IMPORT);
			setState(92);
			match(LBRACE);
			setState(93);
			match(STRING);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				match(STRING);
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(101);
			match(RBRACE);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM) {
				{
				setState(102);
				match(FROM);
				setState(103);
				match(STRING);
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
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				varassignment();
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
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
			setState(110);
			match(FUNC);
			setState(111);
			match(ID);
			setState(112);
			match(LPAREN);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(113);
				params();
				}
			}

			setState(116);
			match(RPAREN);
			setState(117);
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
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(119);
				match(TYPE);
				}
			}

			setState(122);
			match(ID);
			setState(123);
			match(ASSIGN);
			setState(124);
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
	public static class ClsassignContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(HydroParser.NEW, 0); }
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ClsassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clsassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitClsassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsassignContext clsassign() throws RecognitionException {
		ClsassignContext _localctx = new ClsassignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_clsassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(NEW);
			setState(127);
			match(ID);
			setState(128);
			match(LPAREN);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138676105379874L) != 0) {
				{
				setState(129);
				args();
				}
			}

			setState(132);
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
	public static class ClassdefContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(HydroParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public List<TerminalNode> LBRACE() { return getTokens(HydroParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(HydroParser.LBRACE, i);
		}
		public Define_blocksContext define_blocks() {
			return getRuleContext(Define_blocksContext.class,0);
		}
		public List<TerminalNode> RBRACE() { return getTokens(HydroParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(HydroParser.RBRACE, i);
		}
		public TerminalNode RARROW() { return getToken(HydroParser.RARROW, 0); }
		public TerminalNode COMMA() { return getToken(HydroParser.COMMA, 0); }
		public ClassdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitClassdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassdefContext classdef() throws RecognitionException {
		ClassdefContext _localctx = new ClassdefContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_classdef);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(CLASS);
				setState(135);
				match(ID);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(136);
					match(RARROW);
					setState(137);
					match(ID);
					}
				}

				setState(140);
				match(LBRACE);
				setState(141);
				define_blocks();
				setState(142);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(CLASS);
				setState(145);
				match(ID);
				setState(154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(146);
					match(LBRACE);
					setState(147);
					match(RARROW);
					setState(148);
					match(ID);
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(149);
						match(COMMA);
						setState(150);
						match(ID);
						}
					}

					setState(153);
					match(RBRACE);
					}
					break;
				}
				setState(156);
				match(LBRACE);
				setState(157);
				define_blocks();
				setState(158);
				match(RBRACE);
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
	public static class Define_blocksContext extends ParserRuleContext {
		public List<FuncassignmentContext> funcassignment() {
			return getRuleContexts(FuncassignmentContext.class);
		}
		public FuncassignmentContext funcassignment(int i) {
			return getRuleContext(FuncassignmentContext.class,i);
		}
		public List<VarassignmentContext> varassignment() {
			return getRuleContexts(VarassignmentContext.class);
		}
		public VarassignmentContext varassignment(int i) {
			return getRuleContext(VarassignmentContext.class,i);
		}
		public Define_blocksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_blocks; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitDefine_blocks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_blocksContext define_blocks() throws RecognitionException {
		Define_blocksContext _localctx = new Define_blocksContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_define_blocks);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNC) {
					{
					{
					setState(162);
					funcassignment();
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==TYPE) {
					{
					{
					setState(168);
					varassignment();
					}
					}
					setState(173);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class GetattribsContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(HydroParser.DOT, 0); }
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public TerminalNode STRING() { return getToken(HydroParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
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
		enterRule(_localctx, 20, RULE_getattribs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(177);
			match(DOT);
			setState(178);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(179);
				match(LPAREN);
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138676105379874L) != 0) {
					{
					setState(180);
					args();
					}
				}

				setState(183);
				match(RPAREN);
				}
				break;
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
	public static class AttrassignContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(HydroParser.DOT, 0); }
		public TerminalNode ASSIGN() { return getToken(HydroParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AttrassignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrassign; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitAttrassign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttrassignContext attrassign() throws RecognitionException {
		AttrassignContext _localctx = new AttrassignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attrassign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(ID);
			setState(187);
			match(DOT);
			setState(188);
			match(ID);
			setState(189);
			match(ASSIGN);
			setState(190);
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
	public static class CallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public TerminalNode THREAD() { return getToken(HydroParser.THREAD, 0); }
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
		enterRule(_localctx, 24, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THREAD) {
				{
				setState(192);
				match(THREAD);
				}
			}

			setState(195);
			match(ID);
			setState(196);
			match(LPAREN);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138676105379874L) != 0) {
				{
				setState(197);
				args();
				}
			}

			setState(200);
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
		public For_stmtContext for_stmt() {
			return getRuleContext(For_stmtContext.class,0);
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
		enterRule(_localctx, 26, RULE_conditional_stmt);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				if_stmt();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				while_stmt();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				for_stmt();
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
		enterRule(_localctx, 28, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(IF);
			setState(208);
			conditional_block();
			setState(209);
			block();
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					match(ELSE);
					setState(211);
					match(IF);
					setState(212);
					conditional_block();
					setState(213);
					block();
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(220);
				match(ELSE);
				setState(221);
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
		enterRule(_localctx, 30, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(WHILE);
			setState(225);
			conditional_block();
			setState(226);
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
	public static class For_stmtContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(HydroParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(HydroParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(HydroParser.SEMI, i);
		}
		public Conditional_blockContext conditional_block() {
			return getRuleContext(Conditional_blockContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode INCREMENT() { return getToken(HydroParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(HydroParser.DECREMENT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public For_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitFor_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stmtContext for_stmt() throws RecognitionException {
		For_stmtContext _localctx = new For_stmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_stmt);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(FOR);
				setState(229);
				match(ID);
				setState(230);
				match(SEMI);
				setState(231);
				conditional_block();
				setState(232);
				match(SEMI);
				setState(233);
				match(ID);
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==INCREMENT || _la==DECREMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(FOR);
				setState(238);
				match(ID);
				setState(239);
				expr(0);
				setState(240);
				block();
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
		enterRule(_localctx, 34, RULE_conditional_block);
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(LPAREN);
				setState(245);
				expr(0);
				setState(246);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				expr(0);
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
		enterRule(_localctx, 36, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			expr(0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(252);
				match(COMMA);
				setState(253);
				expr(0);
				}
				}
				setState(258);
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
		enterRule(_localctx, 38, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(ID);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(260);
				match(COMMA);
				setState(261);
				match(ID);
				}
				}
				setState(266);
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
	public static class Type_conversionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public TerminalNode ANY() { return getToken(HydroParser.ANY, 0); }
		public Type_conversionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_conversion; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitType_conversion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_conversionContext type_conversion() throws RecognitionException {
		Type_conversionContext _localctx = new Type_conversionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LPAREN);
			setState(268);
			match(ID);
			setState(269);
			match(RPAREN);
			setState(270);
			match(ANY);
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
		enterRule(_localctx, 42, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(LLIST);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 138676105379874L) != 0) {
				{
				setState(273);
				args();
				}
			}

			setState(276);
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
		public Type_conversionContext type_conversion() {
			return getRuleContext(Type_conversionContext.class,0);
		}
		public GetattribsContext getattribs() {
			return getRuleContext(GetattribsContext.class,0);
		}
		public AttrassignContext attrassign() {
			return getRuleContext(AttrassignContext.class,0);
		}
		public ClsassignContext clsassign() {
			return getRuleContext(ClsassignContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(279);
				match(UNARYOPERATOR);
				setState(280);
				expr(8);
				}
				break;
			case 2:
				{
				setState(281);
				type_conversion();
				}
				break;
			case 3:
				{
				setState(282);
				getattribs();
				}
				break;
			case 4:
				{
				setState(283);
				attrassign();
				}
				break;
			case 5:
				{
				setState(284);
				clsassign();
				}
				break;
			case 6:
				{
				setState(285);
				call();
				}
				break;
			case 7:
				{
				setState(286);
				list();
				}
				break;
			case 8:
				{
				setState(287);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(299);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(291);
						((ExprContext)_localctx).op = match(BOOLEANOPERATORS);
						setState(292);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(294);
						((ExprContext)_localctx).op = match(ARITHMATICOPERATORS);
						setState(295);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(297);
						((ExprContext)_localctx).op = match(COMPARATIVEOPERATORS);
						setState(298);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 46, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u0133\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"L\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002T\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002X\b\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003a\b\u0003\n\u0003\f\u0003d\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0003\u0004m\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005s\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0003\u0006y\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u008b"+
		"\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u0098\b\b\u0001\b\u0003\b\u009b\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00a1\b\b\u0001\t\u0005\t\u00a4\b\t\n"+
		"\t\f\t\u00a7\t\t\u0001\t\u0005\t\u00aa\b\t\n\t\f\t\u00ad\t\t\u0003\t\u00af"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b6\b\n\u0001\n"+
		"\u0003\n\u00b9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0003\f\u00c2\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00c7\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003\r\u00ce\b\r"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00d8\b\u000e\n\u000e\f\u000e\u00db"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00df\b\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f3\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00fa\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012"+
		"\u00ff\b\u0012\n\u0012\f\u0012\u0102\t\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0107\b\u0013\n\u0013\f\u0013\u010a\t\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0113\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0121\b\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u012c\b\u0016\n\u0016\f\u0016\u012f\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0000\u0001,\u0018\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"\u0000\u0003\u0002\u0000++..\u0001\u0000\u0013\u0014\u0001\u0000).\u014b"+
		"\u00003\u0001\u0000\u0000\u0000\u00028\u0001\u0000\u0000\u0000\u0004Y"+
		"\u0001\u0000\u0000\u0000\u0006[\u0001\u0000\u0000\u0000\bl\u0001\u0000"+
		"\u0000\u0000\nn\u0001\u0000\u0000\u0000\fx\u0001\u0000\u0000\u0000\u000e"+
		"~\u0001\u0000\u0000\u0000\u0010\u00a0\u0001\u0000\u0000\u0000\u0012\u00ae"+
		"\u0001\u0000\u0000\u0000\u0014\u00b0\u0001\u0000\u0000\u0000\u0016\u00ba"+
		"\u0001\u0000\u0000\u0000\u0018\u00c1\u0001\u0000\u0000\u0000\u001a\u00cd"+
		"\u0001\u0000\u0000\u0000\u001c\u00cf\u0001\u0000\u0000\u0000\u001e\u00e0"+
		"\u0001\u0000\u0000\u0000 \u00f2\u0001\u0000\u0000\u0000\"\u00f9\u0001"+
		"\u0000\u0000\u0000$\u00fb\u0001\u0000\u0000\u0000&\u0103\u0001\u0000\u0000"+
		"\u0000(\u010b\u0001\u0000\u0000\u0000*\u0110\u0001\u0000\u0000\u0000,"+
		"\u0120\u0001\u0000\u0000\u0000.\u0130\u0001\u0000\u0000\u000002\u0003"+
		"\u0004\u0002\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000"+
		"\u000053\u0001\u0000\u0000\u000067\u0005\u0000\u0000\u00017\u0001\u0001"+
		"\u0000\u0000\u00008<\u0005\u0003\u0000\u00009;\u0003\u0004\u0002\u0000"+
		":9\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000"+
		"\u0000<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0004\u0000\u0000@\u0003\u0001\u0000\u0000\u0000"+
		"AC\u0003\u001a\r\u0000BD\u0005\u000b\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DZ\u0001\u0000\u0000\u0000EG\u0003\b\u0004\u0000"+
		"FH\u0005\u000b\u0000\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HZ\u0001\u0000\u0000\u0000IK\u0003\u0018\f\u0000JL\u0005\u000b\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LZ\u0001\u0000"+
		"\u0000\u0000MO\u0003,\u0016\u0000NP\u0005\u000b\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PZ\u0001\u0000\u0000\u0000QS\u0003"+
		"\u0010\b\u0000RT\u0005\u000b\u0000\u0000SR\u0001\u0000\u0000\u0000ST\u0001"+
		"\u0000\u0000\u0000TZ\u0001\u0000\u0000\u0000UW\u0003\u0006\u0003\u0000"+
		"VX\u0005\u000b\u0000\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000"+
		"\u0000XZ\u0001\u0000\u0000\u0000YA\u0001\u0000\u0000\u0000YE\u0001\u0000"+
		"\u0000\u0000YI\u0001\u0000\u0000\u0000YM\u0001\u0000\u0000\u0000YQ\u0001"+
		"\u0000\u0000\u0000YU\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000"+
		"\u0000[\\\u0005\"\u0000\u0000\\]\u0005\u0003\u0000\u0000]b\u0005.\u0000"+
		"\u0000^_\u0005\t\u0000\u0000_a\u0005.\u0000\u0000`^\u0001\u0000\u0000"+
		"\u0000ad\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0005"+
		"\u0004\u0000\u0000fg\u0005#\u0000\u0000gi\u0005.\u0000\u0000hf\u0001\u0000"+
		"\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0007\u0001\u0000\u0000\u0000"+
		"jm\u0003\f\u0006\u0000km\u0003\n\u0005\u0000lj\u0001\u0000\u0000\u0000"+
		"lk\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000\u0000no\u0005\u001d\u0000"+
		"\u0000op\u0005+\u0000\u0000pr\u0005\u0001\u0000\u0000qs\u0003&\u0013\u0000"+
		"rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0005\u0002\u0000\u0000uv\u0003\u0002\u0001\u0000v\u000b\u0001"+
		"\u0000\u0000\u0000wy\u00050\u0000\u0000xw\u0001\u0000\u0000\u0000xy\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005+\u0000\u0000{|\u0005"+
		"\u0007\u0000\u0000|}\u0003,\u0016\u0000}\r\u0001\u0000\u0000\u0000~\u007f"+
		"\u0005%\u0000\u0000\u007f\u0080\u0005+\u0000\u0000\u0080\u0082\u0005\u0001"+
		"\u0000\u0000\u0081\u0083\u0003$\u0012\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000"+
		"\u0000\u0084\u0085\u0005\u0002\u0000\u0000\u0085\u000f\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005$\u0000\u0000\u0087\u008a\u0005+\u0000\u0000\u0088"+
		"\u0089\u0005\u0010\u0000\u0000\u0089\u008b\u0005+\u0000\u0000\u008a\u0088"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e"+
		"\u0003\u0012\t\u0000\u008e\u008f\u0005\u0004\u0000\u0000\u008f\u00a1\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0005$\u0000\u0000\u0091\u009a\u0005+\u0000"+
		"\u0000\u0092\u0093\u0005\u0003\u0000\u0000\u0093\u0094\u0005\u0010\u0000"+
		"\u0000\u0094\u0097\u0005+\u0000\u0000\u0095\u0096\u0005\t\u0000\u0000"+
		"\u0096\u0098\u0005+\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099"+
		"\u009b\u0005\u0004\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009a"+
		"\u009b\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u0003\u0000\u0000\u009d\u009e\u0003\u0012\t\u0000\u009e\u009f"+
		"\u0005\u0004\u0000\u0000\u009f\u00a1\u0001\u0000\u0000\u0000\u00a0\u0086"+
		"\u0001\u0000\u0000\u0000\u00a0\u0090\u0001\u0000\u0000\u0000\u00a1\u0011"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a4\u0003\n\u0005\u0000\u00a3\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00af\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00aa\u0003"+
		"\f\u0006\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ae\u00a5\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001\u0000"+
		"\u0000\u0000\u00af\u0013\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0005\b\u0000\u0000\u00b2\u00b8\u0005+\u0000"+
		"\u0000\u00b3\u00b5\u0005\u0001\u0000\u0000\u00b4\u00b6\u0003$\u0012\u0000"+
		"\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b9\u0005\u0002\u0000\u0000"+
		"\u00b8\u00b3\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u0015\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005+\u0000\u0000\u00bb"+
		"\u00bc\u0005\b\u0000\u0000\u00bc\u00bd\u0005+\u0000\u0000\u00bd\u00be"+
		"\u0005\u0007\u0000\u0000\u00be\u00bf\u0003,\u0016\u0000\u00bf\u0017\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c2\u0005\u001b\u0000\u0000\u00c1\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0005+\u0000\u0000\u00c4\u00c6\u0005\u0001"+
		"\u0000\u0000\u00c5\u00c7\u0003$\u0012\u0000\u00c6\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0002\u0000\u0000\u00c9\u0019\u0001\u0000\u0000"+
		"\u0000\u00ca\u00ce\u0003\u001c\u000e\u0000\u00cb\u00ce\u0003\u001e\u000f"+
		"\u0000\u00cc\u00ce\u0003 \u0010\u0000\u00cd\u00ca\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000"+
		"\u00ce\u001b\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u001e\u0000\u0000"+
		"\u00d0\u00d1\u0003\"\u0011\u0000\u00d1\u00d9\u0003\u0002\u0001\u0000\u00d2"+
		"\u00d3\u0005\u001f\u0000\u0000\u00d3\u00d4\u0005\u001e\u0000\u0000\u00d4"+
		"\u00d5\u0003\"\u0011\u0000\u00d5\u00d6\u0003\u0002\u0001\u0000\u00d6\u00d8"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d2\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da"+
		"\u0001\u0000\u0000\u0000\u00da\u00de\u0001\u0000\u0000\u0000\u00db\u00d9"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u001f\u0000\u0000\u00dd\u00df"+
		"\u0003\u0002\u0001\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0001\u0000\u0000\u0000\u00df\u001d\u0001\u0000\u0000\u0000\u00e0\u00e1"+
		"\u0005 \u0000\u0000\u00e1\u00e2\u0003\"\u0011\u0000\u00e2\u00e3\u0003"+
		"\u0002\u0001\u0000\u00e3\u001f\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005"+
		"!\u0000\u0000\u00e5\u00e6\u0005+\u0000\u0000\u00e6\u00e7\u0005\u000b\u0000"+
		"\u0000\u00e7\u00e8\u0003\"\u0011\u0000\u00e8\u00e9\u0005\u000b\u0000\u0000"+
		"\u00e9\u00ea\u0005+\u0000\u0000\u00ea\u00eb\u0007\u0001\u0000\u0000\u00eb"+
		"\u00ec\u0003\u0002\u0001\u0000\u00ec\u00f3\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0005!\u0000\u0000\u00ee\u00ef\u0005+\u0000\u0000\u00ef\u00f0\u0003"+
		",\u0016\u0000\u00f0\u00f1\u0003\u0002\u0001\u0000\u00f1\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00e4\u0001\u0000\u0000\u0000\u00f2\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f3!\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0001\u0000"+
		"\u0000\u00f5\u00f6\u0003,\u0016\u0000\u00f6\u00f7\u0005\u0002\u0000\u0000"+
		"\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003,\u0016\u0000\u00f9"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f9\u00f8\u0001\u0000\u0000\u0000\u00fa"+
		"#\u0001\u0000\u0000\u0000\u00fb\u0100\u0003,\u0016\u0000\u00fc\u00fd\u0005"+
		"\t\u0000\u0000\u00fd\u00ff\u0003,\u0016\u0000\u00fe\u00fc\u0001\u0000"+
		"\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101%\u0001\u0000\u0000"+
		"\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103\u0108\u0005+\u0000\u0000"+
		"\u0104\u0105\u0005\t\u0000\u0000\u0105\u0107\u0005+\u0000\u0000\u0106"+
		"\u0104\u0001\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108"+
		"\u0106\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109"+
		"\'\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0005\u0001\u0000\u0000\u010c\u010d\u0005+\u0000\u0000\u010d\u010e\u0005"+
		"\u0002\u0000\u0000\u010e\u010f\u0005/\u0000\u0000\u010f)\u0001\u0000\u0000"+
		"\u0000\u0110\u0112\u0005\u0005\u0000\u0000\u0111\u0113\u0003$\u0012\u0000"+
		"\u0112\u0111\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0005\u0006\u0000\u0000"+
		"\u0115+\u0001\u0000\u0000\u0000\u0116\u0117\u0006\u0016\uffff\uffff\u0000"+
		"\u0117\u0118\u0005\u001a\u0000\u0000\u0118\u0121\u0003,\u0016\b\u0119"+
		"\u0121\u0003(\u0014\u0000\u011a\u0121\u0003\u0014\n\u0000\u011b\u0121"+
		"\u0003\u0016\u000b\u0000\u011c\u0121\u0003\u000e\u0007\u0000\u011d\u0121"+
		"\u0003\u0018\f\u0000\u011e\u0121\u0003*\u0015\u0000\u011f\u0121\u0003"+
		".\u0017\u0000\u0120\u0116\u0001\u0000\u0000\u0000\u0120\u0119\u0001\u0000"+
		"\u0000\u0000\u0120\u011a\u0001\u0000\u0000\u0000\u0120\u011b\u0001\u0000"+
		"\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0120\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u011e\u0001\u0000\u0000\u0000\u0120\u011f\u0001\u0000"+
		"\u0000\u0000\u0121\u012d\u0001\u0000\u0000\u0000\u0122\u0123\n\u000b\u0000"+
		"\u0000\u0123\u0124\u0005\u0019\u0000\u0000\u0124\u012c\u0003,\u0016\f"+
		"\u0125\u0126\n\n\u0000\u0000\u0126\u0127\u0005\u0016\u0000\u0000\u0127"+
		"\u012c\u0003,\u0016\u000b\u0128\u0129\n\t\u0000\u0000\u0129\u012a\u0005"+
		"\u0017\u0000\u0000\u012a\u012c\u0003,\u0016\n\u012b\u0122\u0001\u0000"+
		"\u0000\u0000\u012b\u0125\u0001\u0000\u0000\u0000\u012b\u0128\u0001\u0000"+
		"\u0000\u0000\u012c\u012f\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000"+
		"\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e-\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0131\u0007\u0002\u0000"+
		"\u0000\u0131/\u0001\u0000\u0000\u0000%3<CGKOSWYbhlrx\u0082\u008a\u0097"+
		"\u009a\u00a0\u00a5\u00ab\u00ae\u00b5\u00b8\u00c1\u00c6\u00cd\u00d9\u00de"+
		"\u00f2\u00f9\u0100\u0108\u0112\u0120\u012b\u012d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}