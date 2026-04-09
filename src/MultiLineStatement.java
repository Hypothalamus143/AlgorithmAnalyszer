import java.util.ArrayList;
import java.util.List;
import org.matheclipse.core.eval.ExprEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.core.interfaces.IExpr;
public class MultiLineStatement extends Statement{
    List<Statement> statements = new ArrayList<>();
    public String toString() {
        String res = "{\n";
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

    @Override
    public String getRuntime() {
        ExprEvaluator evaluator = new ExprEvaluator(false, (short) 100);
        String res = "0";
        for(Statement s : statements)
            res = evaluator.eval(res+s.getRuntime()).toString();
        return res;
    }
}
