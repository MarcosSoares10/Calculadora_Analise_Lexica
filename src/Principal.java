/**
 * Created by Marquinhos on 17/02/2017.
 */



import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;





public class Principal {

    public static void main(String[] args) throws Exception {
        String teste = "10+10*(2^2)";

        ANTLRInputStream input = new ANTLRInputStream(teste);
        CalculadoraLexer lexer = new CalculadoraLexer(input);

        ANTLRInputStream input2 = new ANTLRInputStream(" "+teste);
        CalculadoraLexer lexer2 = new CalculadoraLexer(input2);
        Token token = (lexer2.nextToken());

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculadoraParser parser = new CalculadoraParser(tokens);
        ParseTree tree = parser.input();

        CalculatorBaseVisitorImpl calcVisitor = new CalculatorBaseVisitorImpl();
        Double result = calcVisitor.visit(tree);
        System.out.println("Entrada: " + input);
         System.out.println("Resultado: " + result);

       while (token.getType() != CalculadoraLexer.EOF){
            System.out.println("\t" + token.getText() + " ===>>> "+  getTokenType(token.getType()));
            token = lexer2.nextToken();
        }


    }

    private static String getTokenType(int tokenType) {

        switch (tokenType){

            case CalculadoraLexer.INTEIRO:
               return "Inteiro";
            case CalculadoraLexer.DOUBLE:
                return "Double";
            case CalculadoraLexer.P_DIR:
                return "Parentese Direito";
            case CalculadoraLexer.SOMA:
                return "Operador Soma";
            case CalculadoraLexer.MULTIPLICACAO:
                return "Operador Multiplicação";
            case CalculadoraLexer.P_ESQ:
                return "Parentese Esquerdo";
            case CalculadoraLexer.DIVISAO:
                return "Operador Divisão";
            case CalculadoraLexer.MENOS:
                return "Operador Subtração";
            case CalculadoraLexer.POTENCIA:
                return "Exponenciação";
            default:
                return "OUTROS";
        }
    }
}
