// Generated from C:/Users/Marquinhos/IdeaProjects/Calculadora\Calculadora.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculadoraParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEIRO=1, DOUBLE=2, POTENCIA=3, ENTER=4, ESPACO_BRANCO=5, IDENTIFICADOR=6, 
		SOMA=7, IGUALDADE=8, MENOS=9, MULTIPLICACAO=10, DIVISAO=11, P_ESQ=12, 
		P_DIR=13;
	public static final int
		RULE_input = 0, RULE_setVar = 1, RULE_maisoumenos = 2, RULE_mult_Div = 3, 
		RULE_pow = 4, RULE_unaryMinus = 5, RULE_atom = 6;
	public static final String[] ruleNames = {
		"input", "setVar", "maisoumenos", "mult_Div", "pow", "unaryMinus", "atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'^'", "'\n'", null, null, "'+'", "'='", "'-'", "'*'", 
		"'/'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEIRO", "DOUBLE", "POTENCIA", "ENTER", "ESPACO_BRANCO", "IDENTIFICADOR", 
		"SOMA", "IGUALDADE", "MENOS", "MULTIPLICACAO", "DIVISAO", "P_ESQ", "P_DIR"
	};
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
	public String getGrammarFileName() { return "Calculadora.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculadoraParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalculateContext extends InputContext {
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculadoraParser.EOF, 0); }
		public TerminalNode ENTER() { return getToken(CalculadoraParser.ENTER, 0); }
		public CalculateContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterCalculate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitCalculate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitCalculate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToSetVarContext extends InputContext {
		public SetVarContext setVar() {
			return getRuleContext(SetVarContext.class,0);
		}
		public TerminalNode ENTER() { return getToken(CalculadoraParser.ENTER, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public ToSetVarContext(InputContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterToSetVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitToSetVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitToSetVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_input);
		int _la;
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ToSetVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				setVar();
				setState(15);
				match(ENTER);
				setState(16);
				input();
				}
				break;
			case 2:
				_localctx = new CalculateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				maisoumenos(0);
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ENTER) {
					{
					setState(19);
					match(ENTER);
					}
				}

				setState(22);
				match(EOF);
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

	public static class SetVarContext extends ParserRuleContext {
		public SetVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setVar; }
	 
		public SetVarContext() { }
		public void copyFrom(SetVarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetVariableContext extends SetVarContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CalculadoraParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUALDADE() { return getToken(CalculadoraParser.IGUALDADE, 0); }
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public SetVariableContext(SetVarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterSetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitSetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitSetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetVarContext setVar() throws RecognitionException {
		SetVarContext _localctx = new SetVarContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setVar);
		try {
			_localctx = new SetVariableContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(IDENTIFICADOR);
			setState(27);
			match(IGUALDADE);
			setState(28);
			maisoumenos(0);
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

	public static class MaisoumenosContext extends ParserRuleContext {
		public MaisoumenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maisoumenos; }
	 
		public MaisoumenosContext() { }
		public void copyFrom(MaisoumenosContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends MaisoumenosContext {
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(CalculadoraParser.MENOS, 0); }
		public Mult_DivContext mult_Div() {
			return getRuleContext(Mult_DivContext.class,0);
		}
		public SubContext(MaisoumenosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SomaContext extends MaisoumenosContext {
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public TerminalNode SOMA() { return getToken(CalculadoraParser.SOMA, 0); }
		public Mult_DivContext mult_Div() {
			return getRuleContext(Mult_DivContext.class,0);
		}
		public SomaContext(MaisoumenosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitSoma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitSoma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToMult_DivContext extends MaisoumenosContext {
		public Mult_DivContext mult_Div() {
			return getRuleContext(Mult_DivContext.class,0);
		}
		public ToMult_DivContext(MaisoumenosContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterToMult_Div(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitToMult_Div(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitToMult_Div(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaisoumenosContext maisoumenos() throws RecognitionException {
		return maisoumenos(0);
	}

	private MaisoumenosContext maisoumenos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MaisoumenosContext _localctx = new MaisoumenosContext(_ctx, _parentState);
		MaisoumenosContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_maisoumenos, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ToMult_DivContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(31);
			mult_Div(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(39);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new SomaContext(new MaisoumenosContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_maisoumenos);
						setState(33);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(34);
						match(SOMA);
						setState(35);
						mult_Div(0);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new MaisoumenosContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_maisoumenos);
						setState(36);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(37);
						match(MENOS);
						setState(38);
						mult_Div(0);
						}
						break;
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Mult_DivContext extends ParserRuleContext {
		public Mult_DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult_Div; }
	 
		public Mult_DivContext() { }
		public void copyFrom(Mult_DivContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiplicacaoContext extends Mult_DivContext {
		public Mult_DivContext mult_Div() {
			return getRuleContext(Mult_DivContext.class,0);
		}
		public TerminalNode MULTIPLICACAO() { return getToken(CalculadoraParser.MULTIPLICACAO, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public MultiplicacaoContext(Mult_DivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterMultiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitMultiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMultiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PotecContext extends Mult_DivContext {
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PotecContext(Mult_DivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterPotec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitPotec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitPotec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisaoContext extends Mult_DivContext {
		public Mult_DivContext mult_Div() {
			return getRuleContext(Mult_DivContext.class,0);
		}
		public TerminalNode DIVISAO() { return getToken(CalculadoraParser.DIVISAO, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public DivisaoContext(Mult_DivContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterDivisao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitDivisao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mult_DivContext mult_Div() throws RecognitionException {
		return mult_Div(0);
	}

	private Mult_DivContext mult_Div(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Mult_DivContext _localctx = new Mult_DivContext(_ctx, _parentState);
		Mult_DivContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_mult_Div, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PotecContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(45);
			pow();
			}
			_ctx.stop = _input.LT(-1);
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(53);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacaoContext(new Mult_DivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mult_Div);
						setState(47);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(48);
						match(MULTIPLICACAO);
						setState(49);
						pow();
						}
						break;
					case 2:
						{
						_localctx = new DivisaoContext(new Mult_DivContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mult_Div);
						setState(50);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(51);
						match(DIVISAO);
						setState(52);
						pow();
						}
						break;
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class PowContext extends ParserRuleContext {
		public PowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pow; }
	 
		public PowContext() { }
		public void copyFrom(PowContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PotencContext extends PowContext {
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public TerminalNode POTENCIA() { return getToken(CalculadoraParser.POTENCIA, 0); }
		public PowContext pow() {
			return getRuleContext(PowContext.class,0);
		}
		public PotencContext(PowContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterPotenc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitPotenc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitPotenc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PowContext pow() throws RecognitionException {
		PowContext _localctx = new PowContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pow);
		try {
			_localctx = new PotencContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			unaryMinus();
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(59);
				match(POTENCIA);
				setState(60);
				pow();
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

	public static class UnaryMinusContext extends ParserRuleContext {
		public UnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryMinus; }
	 
		public UnaryMinusContext() { }
		public void copyFrom(UnaryMinusContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MudaSContext extends UnaryMinusContext {
		public TerminalNode MENOS() { return getToken(CalculadoraParser.MENOS, 0); }
		public UnaryMinusContext unaryMinus() {
			return getRuleContext(UnaryMinusContext.class,0);
		}
		public MudaSContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterMudaS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitMudaS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitMudaS(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ToAtomContext extends UnaryMinusContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ToAtomContext(UnaryMinusContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterToAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitToAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitToAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryMinusContext unaryMinus() throws RecognitionException {
		UnaryMinusContext _localctx = new UnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unaryMinus);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				_localctx = new MudaSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(MENOS);
				setState(64);
				unaryMinus();
				}
				break;
			case INTEIRO:
			case DOUBLE:
			case IDENTIFICADOR:
			case P_ESQ:
				_localctx = new ToAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableContext extends AtomContext {
		public TerminalNode IDENTIFICADOR() { return getToken(CalculadoraParser.IDENTIFICADOR, 0); }
		public VariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracesContext extends AtomContext {
		public TerminalNode P_ESQ() { return getToken(CalculadoraParser.P_ESQ, 0); }
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public TerminalNode P_DIR() { return getToken(CalculadoraParser.P_DIR, 0); }
		public BracesContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterBraces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitBraces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitBraces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends AtomContext {
		public TerminalNode DOUBLE() { return getToken(CalculadoraParser.DOUBLE, 0); }
		public DoubleContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends AtomContext {
		public TerminalNode INTEIRO() { return getToken(CalculadoraParser.INTEIRO, 0); }
		public IntContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculadoraListener ) ((CalculadoraListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CalculadoraVisitor ) return ((CalculadoraVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
				_localctx = new DoubleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(DOUBLE);
				}
				break;
			case INTEIRO:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(INTEIRO);
				}
				break;
			case IDENTIFICADOR:
				_localctx = new VariableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(IDENTIFICADOR);
				}
				break;
			case P_ESQ:
				_localctx = new BracesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(71);
				match(P_ESQ);
				setState(72);
				maisoumenos(0);
				setState(73);
				match(P_DIR);
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
		case 2:
			return maisoumenos_sempred((MaisoumenosContext)_localctx, predIndex);
		case 3:
			return mult_Div_sempred((Mult_DivContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean maisoumenos_sempred(MaisoumenosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mult_Div_sempred(Mult_DivContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17P\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\27\n\2\3\2\3\2\5\2\33\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\7\4*\n\4\f\4\16\4-\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\58\n\5\f\5\16\5;\13\5\3\6\3\6\3\6\5\6@\n\6\3\7\3\7\3\7\5\7E\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\2\4\6\b\t\2\4\6\b\n\f\16\2\2S\2\32"+
		"\3\2\2\2\4\34\3\2\2\2\6 \3\2\2\2\b.\3\2\2\2\n<\3\2\2\2\fD\3\2\2\2\16M"+
		"\3\2\2\2\20\21\5\4\3\2\21\22\7\6\2\2\22\23\5\2\2\2\23\33\3\2\2\2\24\26"+
		"\5\6\4\2\25\27\7\6\2\2\26\25\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31"+
		"\7\2\2\3\31\33\3\2\2\2\32\20\3\2\2\2\32\24\3\2\2\2\33\3\3\2\2\2\34\35"+
		"\7\b\2\2\35\36\7\n\2\2\36\37\5\6\4\2\37\5\3\2\2\2 !\b\4\1\2!\"\5\b\5\2"+
		"\"+\3\2\2\2#$\f\5\2\2$%\7\t\2\2%*\5\b\5\2&\'\f\4\2\2\'(\7\13\2\2(*\5\b"+
		"\5\2)#\3\2\2\2)&\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\7\3\2\2\2-+\3"+
		"\2\2\2./\b\5\1\2/\60\5\n\6\2\609\3\2\2\2\61\62\f\5\2\2\62\63\7\f\2\2\63"+
		"8\5\n\6\2\64\65\f\4\2\2\65\66\7\r\2\2\668\5\n\6\2\67\61\3\2\2\2\67\64"+
		"\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\t\3\2\2\2;9\3\2\2\2<?\5\f\7"+
		"\2=>\7\5\2\2>@\5\n\6\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2AB\7\13\2\2BE\5"+
		"\f\7\2CE\5\16\b\2DA\3\2\2\2DC\3\2\2\2E\r\3\2\2\2FN\7\4\2\2GN\7\3\2\2H"+
		"N\7\b\2\2IJ\7\16\2\2JK\5\6\4\2KL\7\17\2\2LN\3\2\2\2MF\3\2\2\2MG\3\2\2"+
		"\2MH\3\2\2\2MI\3\2\2\2N\17\3\2\2\2\13\26\32)+\679?DM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}