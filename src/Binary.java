public class Binary extends Operation{
    Expression expression2;
    public Binary(Operator operator, Expression expression1, Expression expression2) {
        super(operator, expression1);
        this.expression2 = expression2;
    }

    @Override
    public String toString() {
        return expression1.toString()+operator.toString()+expression2.toString();
    }
}
