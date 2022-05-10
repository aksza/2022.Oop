package oop.labor11.lab11_4;

public class Main {
    public static void main(String[] args) {
        String[] expressions = {
                "1 2 + 3 2 + * ",
                "1 2 + +",
                "1 a +",
                "1 2,3 *",
                "1 3 /" ,
                "1,3 a +",
                "-1 2 3 * +"};
        for( String expr: expressions ) {
            try {
                System.out.println("Eval(" + expr + "): " +
                        IExpression.evaluate(expr));
            } catch (ExpressionException e) {
                System.out.println("Wrong expression: " + expr);
                System.out.println("\t" + e.getMessage());
            }
        }
    }
}
