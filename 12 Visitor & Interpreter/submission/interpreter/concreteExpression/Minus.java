package interpretorPattern.concreteExpression;

import interpretorPattern.expression.Expression;

public class Minus implements Expression {

    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }

}
