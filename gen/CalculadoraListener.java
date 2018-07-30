// Generated from C:/Users/Marquinhos/Documents/Compiladores/Calculadora\Calculadora.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 */
	void enterToSetVar(CalculadoraParser.ToSetVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 */
	void exitToSetVar(CalculadoraParser.ToSetVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 */
	void enterCalculate(CalculadoraParser.CalculateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 */
	void exitCalculate(CalculadoraParser.CalculateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculadoraParser#setVar}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(CalculadoraParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculadoraParser#setVar}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(CalculadoraParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void enterSub(CalculadoraParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void exitSub(CalculadoraParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void enterSoma(CalculadoraParser.SomaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void exitSoma(CalculadoraParser.SomaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToMult_Div}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void enterToMult_Div(CalculadoraParser.ToMult_DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToMult_Div}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 */
	void exitToMult_Div(CalculadoraParser.ToMult_DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicacao(CalculadoraParser.MultiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicacao(CalculadoraParser.MultiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Potec}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void enterPotec(CalculadoraParser.PotecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potec}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void exitPotec(CalculadoraParser.PotecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void enterDivisao(CalculadoraParser.DivisaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 */
	void exitDivisao(CalculadoraParser.DivisaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Potenc}
	 * labeled alternative in {@link CalculadoraParser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPotenc(CalculadoraParser.PotencContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Potenc}
	 * labeled alternative in {@link CalculadoraParser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPotenc(CalculadoraParser.PotencContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MudaS}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterMudaS(CalculadoraParser.MudaSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MudaS}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitMudaS(CalculadoraParser.MudaSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterToAtom(CalculadoraParser.ToAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitToAtom(CalculadoraParser.ToAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterDouble(CalculadoraParser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitDouble(CalculadoraParser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterInt(CalculadoraParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitInt(CalculadoraParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterBraces(CalculadoraParser.BracesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitBraces(CalculadoraParser.BracesContext ctx);
}