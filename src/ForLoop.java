public class ForLoop extends Loop{
    public ForLoop(Assignment assignment, LogicalOperation condition, Statement increment) {
        super(assignment, condition, increment);
    }

    @Override
    public String toString() {
        String res = "";
        res+="for("+assignment.toString()+condition.toString()+increment.toString()+")";
        return res+super.toString();
    }

}
