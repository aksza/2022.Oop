package oop.labor11.lab11_4;

public interface IExpression {
    public static boolean isOperator(String op){
        return switch (op) {
            case "*", "+", "/" -> true;
            default -> false;
        };
    }
    public static double evaluate( String postfixExpression) throws ExpressionException{
        Stack exp = new Stack(postfixExpression.length()/2);
        String[] items = postfixExpression.split(" ");
        for(String item:items){
            if(!isOperator(item)){
                try {
                    try {
                        exp.push(Double.parseDouble(item));
                    } catch (StackException stackException) {
                        throw new ExpressionException("Wrong postfix expression");
                    }
                } catch (NumberFormatException e){
                    throw new ExpressionException("Wrong operand: "+ item);
                }
            }
            else{
                try {
                    double res = (double)exp.top();
                    exp.pop();
                    double nr = (double)exp.top();
                    exp.pop();
                    switch (item) {
                        case "+" -> exp.push(res + nr);
                        case "*" -> exp.push(res * nr);
                        case "/" -> exp.push(res / nr);
                    }
                }catch (StackException stackException){
                    throw new ExpressionException("Wrong postfix expression");
                }
            }
        }
        try {
            return (double)exp.top();
        }catch (StackException stackException){
            throw new ExpressionException("Wrong postfix expression");
        }
    }
}
