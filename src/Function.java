import org.matheclipse.core.eval.ExprEvaluator;

import java.util.ArrayList;
import java.util.List;

public class Function {
    List<Statement> statements = new ArrayList<>();
    private String name;
    public Function(String name){
        this.name = name;
    }

    public  void addStatement(Statement statement){
        statements.add(statement);
    }

    public String toString() {
        String res = "";
        res += name+"{\n";
        for(Statement s : statements){
            if(s instanceof MultiLineStatement){
                String[] resarr = s.toString().split("\n");
                for(String str : resarr) {
                    res += "\t";
                    res += str;
                    res += "\n";
                }
            }
            else{
                res += "\t";
                res += s.toString();
                res += "\n";
            }
        }
        res += "}\n";
        return res;
    }
    public String getRuntime() {
        ExprEvaluator evaluator = new ExprEvaluator(false, (short) 100);
        String res = "0";
        for(Statement s : statements)
            res = evaluator.eval(res+s.getRuntime()).toString();
        return res;
    }
}
