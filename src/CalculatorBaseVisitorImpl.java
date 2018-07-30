/**
 * Created by Marquinhos on 17/02/2017.
 */
import java.util.HashMap;

public class CalculatorBaseVisitorImpl extends CalculadoraBaseVisitor<Double> {
    private HashMap<String, Double> variables = new HashMap<String, Double>();

    @Override
    public Double visitSoma(CalculadoraParser.SomaContext ctx) {
        return visit(ctx.maisoumenos()) + visit(ctx.mult_Div());
    }

    @Override
    public Double visitSub(CalculadoraParser.SubContext ctx) {
        return visit(ctx.maisoumenos()) - visit(ctx.mult_Div());
    }

    @Override
    public Double visitMultiplicacao(CalculadoraParser.MultiplicacaoContext ctx) {
        return visit(ctx.mult_Div()) * visit(ctx.pow());
    }

    @Override
    public Double visitDivisao(CalculadoraParser.DivisaoContext ctx) {
        return visit(ctx.mult_Div()) / visit(ctx.pow());
    }

    @Override
    public Double visitSetVariable(CalculadoraParser.SetVariableContext ctx) {
        Double value = visit(ctx.maisoumenos());
        variables.put(ctx.IDENTIFICADOR().getText(), value);
        return value;
    }

    @Override
    public Double visitPotenc(CalculadoraParser.PotencContext ctx) {
        if (ctx.pow() != null)
            return Math.pow(visit(ctx.unaryMinus()), visit(ctx.pow()));
        return visit(ctx.unaryMinus());
    }

    @Override
    public Double visitMudaS(CalculadoraParser.MudaSContext ctx) {
        return -1*visit(ctx.unaryMinus());
    }

    @Override
    public Double visitBraces(CalculadoraParser.BracesContext ctx) {
        return visit(ctx.maisoumenos());
    }



    @Override
    public Double visitInt(CalculadoraParser.IntContext ctx) {
        return Double.parseDouble(ctx.INTEIRO().getText());
    }

    @Override
    public Double visitVariable(CalculadoraParser.VariableContext ctx) {
        return variables.get(ctx.IDENTIFICADOR().getText());
    }

    @Override
    public Double visitDouble(CalculadoraParser.DoubleContext ctx) {
        return Double.parseDouble(ctx.DOUBLE().getText());
    }

    @Override
    public Double visitCalculate(CalculadoraParser.CalculateContext ctx) {
        return visit(ctx.maisoumenos());
    }
}

