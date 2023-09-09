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
		COMMA=9, COLON=10, SEMI=11, LARROW=12, RARROW=13, ARROWASSIGN=14, TILDE=15, 
		ARITHMATICOPERATORS=16, COMPARATIVEOPERATORS=17, SHORTASSIGNOPS=18, BOOLEANOPERATORS=19, 
		UNARYOPERATOR=20, FUNC=21, IF=22, ELSE=23, WHILE=24, IMPORT=25, FROM=26, 
		CLASS=27, NEW=28, COMMENT=29, WS=30, MULTILINECOMMENT=31, BOOL=32, NULL=33, 
		ID=34, INT=35, FLOAT=36, STRING=37;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_stmt = 2, RULE_import_stmt = 3, 
		RULE_funcassignment = 4, RULE_varassignment = 5, RULE_clsassign = 6, RULE_classdef = 7, 
		RULE_define_blocks = 8, RULE_getattribs = 9, RULE_call = 10, RULE_if_stmt = 11, 
		RULE_while_stmt = 12, RULE_conditional_block = 13, RULE_args = 14, RULE_params = 15, 
		RULE_type_conversion = 16, RULE_list = 17, RULE_dict_definitions = 18, 
		RULE_dict = 19, RULE_funcassignment_expr = 20, RULE_expr = 21, RULE_atom = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "stmt", "import_stmt", "funcassignment", "varassignment", 
			"clsassign", "classdef", "define_blocks", "getattribs", "call", "if_stmt", 
			"while_stmt", "conditional_block", "args", "params", "type_conversion", 
			"list", "dict_definitions", "dict", "funcassignment_expr", "expr", "atom"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'='", "'.'", "','", 
			"':'", "';'", "'->'", "'<-'", "'=>'", "'~'", null, null, null, null, 
			"'!'", "'func'", "'if'", "'else'", "'while'", "'import'", "'from'", "'class'", 
			"'new'", null, null, null, null, "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LLIST", "RLIST", "ASSIGN", 
			"DOT", "COMMA", "COLON", "SEMI", "LARROW", "RARROW", "ARROWASSIGN", "TILDE", 
			"ARITHMATICOPERATORS", "COMPARATIVEOPERATORS", "SHORTASSIGNOPS", "BOOLEANOPERATORS", 
			"UNARYOPERATOR", "FUNC", "IF", "ELSE", "WHILE", "IMPORT", "FROM", "CLASS", 
			"NEW", "COMMENT", "WS", "MULTILINECOMMENT", "BOOL", "NULL", "ID", "INT", 
			"FLOAT", "STRING"
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 271043264554L) != 0) {
				{
				{
				setState(46);
				stmt();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52);
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
			setState(54);
			match(LBRACE);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 271043264554L) != 0) {
				{
				{
				setState(55);
				stmt();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
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
		public If_stmtContext if_stmt() {
			return getRuleContext(If_stmtContext.class,0);
		}
		public While_stmtContext while_stmt() {
			return getRuleContext(While_stmtContext.class,0);
		}
		public VarassignmentContext varassignment() {
			return getRuleContext(VarassignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HydroParser.SEMI, 0); }
		public FuncassignmentContext funcassignment() {
			return getRuleContext(FuncassignmentContext.class,0);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				if_stmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				while_stmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				varassignment();
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
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				funcassignment();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				call();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(71);
					match(SEMI);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(74);
				expr(0);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(75);
					match(SEMI);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(78);
				classdef();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(79);
					match(SEMI);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(82);
				import_stmt();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(83);
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
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(IMPORT);
				setState(89);
				match(LBRACE);
				setState(90);
				match(STRING);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(91);
					match(COMMA);
					setState(92);
					match(STRING);
					}
					}
					setState(97);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(98);
				match(RBRACE);
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(99);
					match(FROM);
					setState(100);
					match(STRING);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(IMPORT);
				setState(104);
				match(STRING);
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(105);
					match(FROM);
					setState(106);
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
		public TerminalNode ARROWASSIGN() { return getToken(HydroParser.ARROWASSIGN, 0); }
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
		enterRule(_localctx, 8, RULE_funcassignment);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(FUNC);
				setState(112);
				match(ID);
				setState(113);
				match(LPAREN);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(114);
					params();
					}
				}

				setState(117);
				match(RPAREN);
				setState(118);
				block();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(ID);
				setState(120);
				match(LPAREN);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(121);
					params();
					}
				}

				setState(124);
				match(RPAREN);
				setState(125);
				match(ARROWASSIGN);
				setState(126);
				block();
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
	public static class VarassignmentContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HydroParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HydroParser.ID, i);
		}
		public TerminalNode ASSIGN() { return getToken(HydroParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(HydroParser.SEMI, 0); }
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
		enterRule(_localctx, 10, RULE_varassignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(129);
				match(ID);
				}
				break;
			}
			setState(132);
			match(ID);
			setState(133);
			match(ASSIGN);
			setState(134);
			expr(0);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(135);
				match(SEMI);
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
		enterRule(_localctx, 12, RULE_clsassign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(NEW);
			setState(139);
			match(ID);
			setState(140);
			match(LPAREN);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 270852423722L) != 0) {
				{
				setState(141);
				args();
				}
			}

			setState(144);
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
		enterRule(_localctx, 14, RULE_classdef);
		int _la;
		try {
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(CLASS);
				setState(147);
				match(ID);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RARROW) {
					{
					setState(148);
					match(RARROW);
					setState(149);
					match(ID);
					}
				}

				setState(152);
				match(LBRACE);
				setState(153);
				define_blocks();
				setState(154);
				match(RBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(CLASS);
				setState(157);
				match(ID);
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(158);
					match(LBRACE);
					setState(159);
					match(RARROW);
					setState(160);
					match(ID);
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==COMMA) {
						{
						setState(161);
						match(COMMA);
						setState(162);
						match(ID);
						}
					}

					setState(165);
					match(RBRACE);
					}
					break;
				}
				setState(168);
				match(LBRACE);
				setState(169);
				define_blocks();
				setState(170);
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
		public List<TerminalNode> FUNC() { return getTokens(HydroParser.FUNC); }
		public TerminalNode FUNC(int i) {
			return getToken(HydroParser.FUNC, i);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> TILDE() { return getTokens(HydroParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(HydroParser.TILDE, i);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(HydroParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(HydroParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 16, RULE_define_blocks);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNC) {
					{
					{
					setState(174);
					match(FUNC);
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TILDE) {
						{
						setState(175);
						match(TILDE);
						}
					}

					setState(178);
					match(ID);
					setState(179);
					match(LPAREN);
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ID) {
						{
						setState(180);
						params();
						}
					}

					setState(183);
					match(RPAREN);
					setState(184);
					block();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(190);
					match(ID);
					setState(191);
					match(ASSIGN);
					setState(192);
					expr(0);
					}
					}
					setState(197);
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
		enterRule(_localctx, 18, RULE_getattribs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			atom();
			setState(201);
			match(DOT);
			setState(202);
			match(ID);
			setState(203);
			match(LPAREN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 270852423722L) != 0) {
				{
				setState(204);
				args();
				}
			}

			setState(207);
			match(RPAREN);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(DOT);
					setState(209);
					match(ID);
					setState(210);
					match(LPAREN);
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((_la) & ~0x3f) == 0 && ((1L << _la) & 270852423722L) != 0) {
						{
						setState(211);
						args();
						}
					}

					setState(214);
					match(RPAREN);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 20, RULE_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(ID);
			setState(221);
			match(LPAREN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 270852423722L) != 0) {
				{
				setState(222);
				args();
				}
			}

			setState(225);
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
		enterRule(_localctx, 22, RULE_if_stmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(IF);
			setState(228);
			conditional_block();
			setState(229);
			block();
			setState(237);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(230);
					match(ELSE);
					setState(231);
					match(IF);
					setState(232);
					conditional_block();
					setState(233);
					block();
					}
					} 
				}
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(240);
				match(ELSE);
				setState(241);
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
		enterRule(_localctx, 24, RULE_while_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(WHILE);
			setState(245);
			conditional_block();
			setState(246);
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
		enterRule(_localctx, 26, RULE_conditional_block);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(LPAREN);
				setState(249);
				expr(0);
				setState(250);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
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
		enterRule(_localctx, 28, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			expr(0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(256);
				match(COMMA);
				setState(257);
				expr(0);
				}
				}
				setState(262);
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
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(ID);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(264);
				match(COMMA);
				setState(265);
				match(ID);
				}
				}
				setState(270);
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
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_type_conversion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(LPAREN);
			setState(272);
			match(ID);
			setState(273);
			match(RPAREN);
			setState(274);
			atom();
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
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(LLIST);
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 270852423722L) != 0) {
				{
				setState(277);
				args();
				}
			}

			setState(280);
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
	public static class Dict_definitionsContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(HydroParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(HydroParser.STRING, i);
		}
		public List<TerminalNode> COLON() { return getTokens(HydroParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(HydroParser.COLON, i);
		}
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
		public Dict_definitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict_definitions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitDict_definitions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dict_definitionsContext dict_definitions() throws RecognitionException {
		Dict_definitionsContext _localctx = new Dict_definitionsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dict_definitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(STRING);
			setState(283);
			match(COLON);
			setState(284);
			expr(0);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(285);
				match(COMMA);
				setState(286);
				match(STRING);
				setState(287);
				match(COLON);
				setState(288);
				expr(0);
				}
				}
				setState(293);
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
	public static class DictContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(HydroParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(HydroParser.RBRACE, 0); }
		public Dict_definitionsContext dict_definitions() {
			return getRuleContext(Dict_definitionsContext.class,0);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitDict(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dict);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(LBRACE);
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(295);
				dict_definitions();
				}
			}

			setState(298);
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
	public static class Funcassignment_exprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HydroParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(HydroParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HydroParser.RPAREN, 0); }
		public TerminalNode ARROWASSIGN() { return getToken(HydroParser.ARROWASSIGN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Funcassignment_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcassignment_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HydroVisitor ) return ((HydroVisitor<? extends T>)visitor).visitFuncassignment_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Funcassignment_exprContext funcassignment_expr() throws RecognitionException {
		Funcassignment_exprContext _localctx = new Funcassignment_exprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_funcassignment_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(ID);
			setState(301);
			match(LPAREN);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(302);
				params();
				}
			}

			setState(305);
			match(RPAREN);
			setState(306);
			match(ARROWASSIGN);
			setState(307);
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
	public static class ExprContext extends ParserRuleContext {
		public Token op;
		public TerminalNode UNARYOPERATOR() { return getToken(HydroParser.UNARYOPERATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Funcassignment_exprContext funcassignment_expr() {
			return getRuleContext(Funcassignment_exprContext.class,0);
		}
		public Type_conversionContext type_conversion() {
			return getRuleContext(Type_conversionContext.class,0);
		}
		public GetattribsContext getattribs() {
			return getRuleContext(GetattribsContext.class,0);
		}
		public ClsassignContext clsassign() {
			return getRuleContext(ClsassignContext.class,0);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(310);
				match(UNARYOPERATOR);
				setState(311);
				expr(7);
				}
				break;
			case 2:
				{
				setState(312);
				funcassignment_expr();
				}
				break;
			case 3:
				{
				setState(313);
				type_conversion();
				}
				break;
			case 4:
				{
				setState(314);
				getattribs();
				}
				break;
			case 5:
				{
				setState(315);
				clsassign();
				}
				break;
			case 6:
				{
				setState(316);
				call();
				}
				break;
			case 7:
				{
				setState(317);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(331);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(329);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(320);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(321);
						((ExprContext)_localctx).op = match(BOOLEANOPERATORS);
						setState(322);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(323);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(324);
						((ExprContext)_localctx).op = match(ARITHMATICOPERATORS);
						setState(325);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(326);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(327);
						((ExprContext)_localctx).op = match(COMPARATIVEOPERATORS);
						setState(328);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(333);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
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
		enterRule(_localctx, 44, RULE_atom);
		try {
			setState(342);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(334);
				match(INT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				match(FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(ID);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(BOOL);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(NULL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(STRING);
				}
				break;
			case LLIST:
				enterOuterAlt(_localctx, 7);
				{
				setState(340);
				list();
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 8);
				{
				setState(341);
				dict();
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
		case 21:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0159\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"9\b\u0001\n\u0001\f\u0001<\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002D\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002M\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002Q\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002U\b\u0002\u0003\u0002W\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003^\b\u0003"+
		"\n\u0003\f\u0003a\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"l\b\u0003\u0003\u0003n\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004t\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0080\b\u0004\u0001\u0005\u0003\u0005\u0083\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0089\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u008f\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u0097\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a4\b\u0007\u0001\u0007\u0003\u0007\u00a7\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00ad"+
		"\b\u0007\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b6\b\b\u0001\b\u0001\b\u0005\b\u00ba\b\b\n\b\f\b\u00bd\t\b\u0001"+
		"\b\u0001\b\u0001\b\u0005\b\u00c2\b\b\n\b\f\b\u00c5\t\b\u0003\b\u00c7\b"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00ce\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d5\b\t\u0001\t\u0005\t\u00d8\b\t"+
		"\n\t\f\t\u00db\t\t\u0001\n\u0001\n\u0001\n\u0003\n\u00e0\b\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00ec\b\u000b\n\u000b\f\u000b\u00ef"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00f3\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fe"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0103\b\u000e\n\u000e"+
		"\f\u000e\u0106\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f"+
		"\u010b\b\u000f\n\u000f\f\u000f\u010e\t\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0117"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0122\b\u0012\n"+
		"\u0012\f\u0012\u0125\t\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0129"+
		"\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0130\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013f\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u014a\b\u0015\n\u0015\f\u0015\u014d\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0003\u0016\u0157\b\u0016\u0001\u0016\u0000\u0001"+
		"*\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,\u0000\u0000\u017f\u00001\u0001\u0000\u0000"+
		"\u0000\u00026\u0001\u0000\u0000\u0000\u0004V\u0001\u0000\u0000\u0000\u0006"+
		"m\u0001\u0000\u0000\u0000\b\u007f\u0001\u0000\u0000\u0000\n\u0082\u0001"+
		"\u0000\u0000\u0000\f\u008a\u0001\u0000\u0000\u0000\u000e\u00ac\u0001\u0000"+
		"\u0000\u0000\u0010\u00c6\u0001\u0000\u0000\u0000\u0012\u00c8\u0001\u0000"+
		"\u0000\u0000\u0014\u00dc\u0001\u0000\u0000\u0000\u0016\u00e3\u0001\u0000"+
		"\u0000\u0000\u0018\u00f4\u0001\u0000\u0000\u0000\u001a\u00fd\u0001\u0000"+
		"\u0000\u0000\u001c\u00ff\u0001\u0000\u0000\u0000\u001e\u0107\u0001\u0000"+
		"\u0000\u0000 \u010f\u0001\u0000\u0000\u0000\"\u0114\u0001\u0000\u0000"+
		"\u0000$\u011a\u0001\u0000\u0000\u0000&\u0126\u0001\u0000\u0000\u0000("+
		"\u012c\u0001\u0000\u0000\u0000*\u013e\u0001\u0000\u0000\u0000,\u0156\u0001"+
		"\u0000\u0000\u0000.0\u0003\u0004\u0002\u0000/.\u0001\u0000\u0000\u0000"+
		"03\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000"+
		"\u000024\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000045\u0005\u0000"+
		"\u0000\u00015\u0001\u0001\u0000\u0000\u00006:\u0005\u0003\u0000\u0000"+
		"79\u0003\u0004\u0002\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005\u0004\u0000\u0000>\u0003"+
		"\u0001\u0000\u0000\u0000?W\u0003\u0016\u000b\u0000@W\u0003\u0018\f\u0000"+
		"AC\u0003\n\u0005\u0000BD\u0005\u000b\u0000\u0000CB\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DW\u0001\u0000\u0000\u0000EW\u0003\b\u0004\u0000"+
		"FH\u0003\u0014\n\u0000GI\u0005\u000b\u0000\u0000HG\u0001\u0000\u0000\u0000"+
		"HI\u0001\u0000\u0000\u0000IW\u0001\u0000\u0000\u0000JL\u0003*\u0015\u0000"+
		"KM\u0005\u000b\u0000\u0000LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MW\u0001\u0000\u0000\u0000NP\u0003\u000e\u0007\u0000OQ\u0005\u000b"+
		"\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QW\u0001"+
		"\u0000\u0000\u0000RT\u0003\u0006\u0003\u0000SU\u0005\u000b\u0000\u0000"+
		"TS\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000V?\u0001\u0000\u0000\u0000V@\u0001\u0000\u0000\u0000VA\u0001\u0000"+
		"\u0000\u0000VE\u0001\u0000\u0000\u0000VF\u0001\u0000\u0000\u0000VJ\u0001"+
		"\u0000\u0000\u0000VN\u0001\u0000\u0000\u0000VR\u0001\u0000\u0000\u0000"+
		"W\u0005\u0001\u0000\u0000\u0000XY\u0005\u0019\u0000\u0000YZ\u0005\u0003"+
		"\u0000\u0000Z_\u0005%\u0000\u0000[\\\u0005\t\u0000\u0000\\^\u0005%\u0000"+
		"\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000be\u0005\u0004\u0000\u0000cd\u0005\u001a\u0000\u0000"+
		"df\u0005%\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fn\u0001\u0000\u0000\u0000gh\u0005\u0019\u0000\u0000hk\u0005%\u0000\u0000"+
		"ij\u0005\u001a\u0000\u0000jl\u0005%\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kl\u0001\u0000\u0000\u0000ln\u0001\u0000\u0000\u0000mX\u0001\u0000\u0000"+
		"\u0000mg\u0001\u0000\u0000\u0000n\u0007\u0001\u0000\u0000\u0000op\u0005"+
		"\u0015\u0000\u0000pq\u0005\"\u0000\u0000qs\u0005\u0001\u0000\u0000rt\u0003"+
		"\u001e\u000f\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000uv\u0005\u0002\u0000\u0000v\u0080\u0003\u0002"+
		"\u0001\u0000wx\u0005\"\u0000\u0000xz\u0005\u0001\u0000\u0000y{\u0003\u001e"+
		"\u000f\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|}\u0005\u0002\u0000\u0000}~\u0005\u000e\u0000\u0000"+
		"~\u0080\u0003\u0002\u0001\u0000\u007fo\u0001\u0000\u0000\u0000\u007fw"+
		"\u0001\u0000\u0000\u0000\u0080\t\u0001\u0000\u0000\u0000\u0081\u0083\u0005"+
		"\"\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0005\"\u0000"+
		"\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0088\u0003*\u0015\u0000"+
		"\u0087\u0089\u0005\u000b\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000"+
		"\u008a\u008b\u0005\u001c\u0000\u0000\u008b\u008c\u0005\"\u0000\u0000\u008c"+
		"\u008e\u0005\u0001\u0000\u0000\u008d\u008f\u0003\u001c\u000e\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u0002\u0000\u0000\u0091"+
		"\r\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u001b\u0000\u0000\u0093\u0096"+
		"\u0005\"\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095\u0097\u0005"+
		"\"\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0003"+
		"\u0000\u0000\u0099\u009a\u0003\u0010\b\u0000\u009a\u009b\u0005\u0004\u0000"+
		"\u0000\u009b\u00ad\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u001b\u0000"+
		"\u0000\u009d\u00a6\u0005\"\u0000\u0000\u009e\u009f\u0005\u0003\u0000\u0000"+
		"\u009f\u00a0\u0005\r\u0000\u0000\u00a0\u00a3\u0005\"\u0000\u0000\u00a1"+
		"\u00a2\u0005\t\u0000\u0000\u00a2\u00a4\u0005\"\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005\u0004\u0000\u0000\u00a6\u009e"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a8"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0003\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0010\b\u0000\u00aa\u00ab\u0005\u0004\u0000\u0000\u00ab\u00ad\u0001"+
		"\u0000\u0000\u0000\u00ac\u0092\u0001\u0000\u0000\u0000\u00ac\u009c\u0001"+
		"\u0000\u0000\u0000\u00ad\u000f\u0001\u0000\u0000\u0000\u00ae\u00b0\u0005"+
		"\u0015\u0000\u0000\u00af\u00b1\u0005\u000f\u0000\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0005\"\u0000\u0000\u00b3\u00b5\u0005\u0001"+
		"\u0000\u0000\u00b4\u00b6\u0003\u001e\u000f\u0000\u00b5\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8\u00ba\u0003\u0002"+
		"\u0001\u0000\u00b9\u00ae\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00c7\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000"+
		"\u0000\u00c0\u00c2\u0003*\u0015\u0000\u00c1\u00be\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c3\u0001\u0000\u0000\u0000\u00c7\u0011\u0001\u0000\u0000\u0000"+
		"\u00c8\u00c9\u0003,\u0016\u0000\u00c9\u00ca\u0005\b\u0000\u0000\u00ca"+
		"\u00cb\u0005\"\u0000\u0000\u00cb\u00cd\u0005\u0001\u0000\u0000\u00cc\u00ce"+
		"\u0003\u001c\u000e\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d9"+
		"\u0005\u0002\u0000\u0000\u00d0\u00d1\u0005\b\u0000\u0000\u00d1\u00d2\u0005"+
		"\"\u0000\u0000\u00d2\u00d4\u0005\u0001\u0000\u0000\u00d3\u00d5\u0003\u001c"+
		"\u000e\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000\u00d6\u00d8\u0005\u0002"+
		"\u0000\u0000\u00d7\u00d0\u0001\u0000\u0000\u0000\u00d8\u00db\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000"+
		"\u0000\u0000\u00da\u0013\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0005\"\u0000\u0000\u00dd\u00df\u0005\u0001\u0000"+
		"\u0000\u00de\u00e0\u0003\u001c\u000e\u0000\u00df\u00de\u0001\u0000\u0000"+
		"\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0005\u0002\u0000\u0000\u00e2\u0015\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0005\u0016\u0000\u0000\u00e4\u00e5\u0003\u001a\r\u0000"+
		"\u00e5\u00ed\u0003\u0002\u0001\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000"+
		"\u00e7\u00e8\u0005\u0016\u0000\u0000\u00e8\u00e9\u0003\u001a\r\u0000\u00e9"+
		"\u00ea\u0003\u0002\u0001\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb"+
		"\u00e6\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed"+
		"\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f2\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0"+
		"\u00f1\u0005\u0017\u0000\u0000\u00f1\u00f3\u0003\u0002\u0001\u0000\u00f2"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u0017\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005\u0018\u0000\u0000\u00f5"+
		"\u00f6\u0003\u001a\r\u0000\u00f6\u00f7\u0003\u0002\u0001\u0000\u00f7\u0019"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0001\u0000\u0000\u00f9\u00fa"+
		"\u0003*\u0015\u0000\u00fa\u00fb\u0005\u0002\u0000\u0000\u00fb\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fe\u0003*\u0015\u0000\u00fd\u00f8\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe\u001b\u0001\u0000"+
		"\u0000\u0000\u00ff\u0104\u0003*\u0015\u0000\u0100\u0101\u0005\t\u0000"+
		"\u0000\u0101\u0103\u0003*\u0015\u0000\u0102\u0100\u0001\u0000\u0000\u0000"+
		"\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u001d\u0001\u0000\u0000\u0000"+
		"\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010c\u0005\"\u0000\u0000\u0108"+
		"\u0109\u0005\t\u0000\u0000\u0109\u010b\u0005\"\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u001f"+
		"\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005\u0001\u0000\u0000\u0110\u0111\u0005\"\u0000\u0000\u0111\u0112\u0005"+
		"\u0002\u0000\u0000\u0112\u0113\u0003,\u0016\u0000\u0113!\u0001\u0000\u0000"+
		"\u0000\u0114\u0116\u0005\u0005\u0000\u0000\u0115\u0117\u0003\u001c\u000e"+
		"\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005\u0006\u0000"+
		"\u0000\u0119#\u0001\u0000\u0000\u0000\u011a\u011b\u0005%\u0000\u0000\u011b"+
		"\u011c\u0005\n\u0000\u0000\u011c\u0123\u0003*\u0015\u0000\u011d\u011e"+
		"\u0005\t\u0000\u0000\u011e\u011f\u0005%\u0000\u0000\u011f\u0120\u0005"+
		"\n\u0000\u0000\u0120\u0122\u0003*\u0015\u0000\u0121\u011d\u0001\u0000"+
		"\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124%\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0128\u0005\u0003\u0000"+
		"\u0000\u0127\u0129\u0003$\u0012\u0000\u0128\u0127\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000"+
		"\u012a\u012b\u0005\u0004\u0000\u0000\u012b\'\u0001\u0000\u0000\u0000\u012c"+
		"\u012d\u0005\"\u0000\u0000\u012d\u012f\u0005\u0001\u0000\u0000\u012e\u0130"+
		"\u0003\u001e\u000f\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130"+
		"\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u0005\u0002\u0000\u0000\u0132\u0133\u0005\u000e\u0000\u0000\u0133\u0134"+
		"\u0003\u0002\u0001\u0000\u0134)\u0001\u0000\u0000\u0000\u0135\u0136\u0006"+
		"\u0015\uffff\uffff\u0000\u0136\u0137\u0005\u0014\u0000\u0000\u0137\u013f"+
		"\u0003*\u0015\u0007\u0138\u013f\u0003(\u0014\u0000\u0139\u013f\u0003 "+
		"\u0010\u0000\u013a\u013f\u0003\u0012\t\u0000\u013b\u013f\u0003\f\u0006"+
		"\u0000\u013c\u013f\u0003\u0014\n\u0000\u013d\u013f\u0003,\u0016\u0000"+
		"\u013e\u0135\u0001\u0000\u0000\u0000\u013e\u0138\u0001\u0000\u0000\u0000"+
		"\u013e\u0139\u0001\u0000\u0000\u0000\u013e\u013a\u0001\u0000\u0000\u0000"+
		"\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000"+
		"\u013e\u013d\u0001\u0000\u0000\u0000\u013f\u014b\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\n\n\u0000\u0000\u0141\u0142\u0005\u0013\u0000\u0000\u0142"+
		"\u014a\u0003*\u0015\u000b\u0143\u0144\n\t\u0000\u0000\u0144\u0145\u0005"+
		"\u0010\u0000\u0000\u0145\u014a\u0003*\u0015\n\u0146\u0147\n\b\u0000\u0000"+
		"\u0147\u0148\u0005\u0011\u0000\u0000\u0148\u014a\u0003*\u0015\t\u0149"+
		"\u0140\u0001\u0000\u0000\u0000\u0149\u0143\u0001\u0000\u0000\u0000\u0149"+
		"\u0146\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"+\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0157"+
		"\u0005#\u0000\u0000\u014f\u0157\u0005$\u0000\u0000\u0150\u0157\u0005\""+
		"\u0000\u0000\u0151\u0157\u0005 \u0000\u0000\u0152\u0157\u0005!\u0000\u0000"+
		"\u0153\u0157\u0005%\u0000\u0000\u0154\u0157\u0003\"\u0011\u0000\u0155"+
		"\u0157\u0003&\u0013\u0000\u0156\u014e\u0001\u0000\u0000\u0000\u0156\u014f"+
		"\u0001\u0000\u0000\u0000\u0156\u0150\u0001\u0000\u0000\u0000\u0156\u0151"+
		"\u0001\u0000\u0000\u0000\u0156\u0152\u0001\u0000\u0000\u0000\u0156\u0153"+
		"\u0001\u0000\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0157-\u0001\u0000\u0000\u0000,1:CHLPTV_ekms"+
		"z\u007f\u0082\u0088\u008e\u0096\u00a3\u00a6\u00ac\u00b0\u00b5\u00bb\u00c3"+
		"\u00c6\u00cd\u00d4\u00d9\u00df\u00ed\u00f2\u00fd\u0104\u010c\u0116\u0123"+
		"\u0128\u012f\u013e\u0149\u014b\u0156";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}