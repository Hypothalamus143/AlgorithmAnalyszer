import org.logicng.formulas.Variable;

public abstract class Loop extends MultiLineStatement{
    Assignment assignment;
    LogicalOperation condition;
    SingleLineStatement increment;

    public Loop(Assignment assignment, LogicalOperation condition, SingleLineStatement increment) {
        this.assignment = assignment;
        this.condition = condition;
        this.increment = increment;
    }


    public String toString() {
        return super.toString();
    }

    public String getRuntime(){
        String length = null;
        if (increment.getExpression() instanceof Operation o) {
            if(o.getOperator().equals("++")){
                if(condition.getOperator().equals("<=")){
                    length = 
                    if(assignment.getExpression() instanceof Value){

                    }
                }

            }
            else
                throw new RuntimeException("Not yet supported");
        }
    }
}
