public class Assignment extends SingleLineStatement{
    private Variable variable;
    private AssignmentOperator operator;

    public Assignment(Variable variable, AssignmentOperator operator, Expression expression){
        super(expression);
        this.variable = variable;
        this.operator = operator;
    }

    @Override
    public String toString() {
        return variable.toString() + operator.toString()+super.toString();
    }
}
