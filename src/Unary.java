public class Unary extends Operation{
    boolean isPrefix;
    public Unary(Operator operator, Variable variable, boolean isPrefix) {
        super(operator, variable);
        this.isPrefix = isPrefix;
    }

    @Override
    public String toString() {
        if(isPrefix)
            return operator.toString()+expression1.toString();
        else return expression1.toString()+operator.toString();
    }

}
