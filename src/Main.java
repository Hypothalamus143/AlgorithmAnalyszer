public class Main {
    public static void main(String[] args) {
        Function sum = new Function("sum");
        Declaration d1 = new Declaration("n");
        Declaration d2 = new Declaration("i");
        sum.addStatement(d1);
        sum.addStatement(new ForLoop(new Assignment(d1.getVariable(), new AssignmentOperator("="), new Value(0)), new Binary(new LogicalOperator("<"), d2.getVariable(), d1.getVariable()), new SingleLineStatement(new Unary(new Operator("++"), d2.getVariable(), false))));
        System.out.println(sum);
    }
}