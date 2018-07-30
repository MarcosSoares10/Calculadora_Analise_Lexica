// Generated from C:/Users/Marquinhos/IdeaProjects/Calculadora\Calculadora.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code ToSetVar}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToSetVar(CalculadoraParser.ToSetVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Calculate}
	 * labeled alternative in {@link CalculadoraParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalculate(CalculadoraParser.CalculateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetVariable}
	 * labeled alternative in {@link CalculadoraParser#setVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(CalculadoraParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(CalculadoraParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Soma}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoma(CalculadoraParser.SomaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToMult_Div}
	 * labeled alternative in {@link CalculadoraParser#maisoumenos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToMult_Div(CalculadoraParser.ToMult_DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplicacao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacao(CalculadoraParser.MultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potec}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotec(CalculadoraParser.PotecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divisao}
	 * labeled alternative in {@link CalculadoraParser#mult_Div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisao(CalculadoraParser.DivisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Potenc}
	 * labeled alternative in {@link CalculadoraParser#pow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPotenc(CalculadoraParser.PotencContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MudaS}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMudaS(CalculadoraParser.MudaSContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ToAtom}
	 * labeled alternative in {@link CalculadoraParser#unaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToAtom(CalculadoraParser.ToAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(CalculadoraParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(CalculadoraParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(CalculadoraParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Braces}
	 * labeled alternative in {@link CalculadoraParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBraces(CalculadoraParser.BracesContext ctx);
}