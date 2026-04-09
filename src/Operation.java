import java.util.ArrayList;
import java.util.List;

public abstract class Operation extends Expression{
    Operator operator;
    Expression expression1;
    public Operation(Operator operator, Expression expression1){
       this.operator = operator;
       this.expression1 = expression1;
    }

    public int getRuntime(){return 1;}

    public Operator getOperator() {
        return operator;
    }
}
