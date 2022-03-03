package test;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Test {

    private void checkResults() throws IOException {
         BufferedReader reader = new BufferedReader(new FileReader("calculationHistory.txt"));
         String line = reader.readLine();

         boolean resultOK = true;

         while (line != null) {
            System.out.println(line);
            String[] split = line.split("=");

            Expression expression = new ExpressionBuilder(split[0]).build();
            double action = expression.evaluate();
            double result = Double.parseDouble(split[1]);

            if (action != result) {
                System.out.println("Błąd w ostatnim działaniu!");
                resultOK = false;
                break;
            }
            line = reader.readLine();
        }
        if (resultOK)
             System.out.println("Wyniki są poprawne!");
    }

    public void checkInternalResults() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("calculationHistory.txt"));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split("=");

            Expression expression = new ExpressionBuilder(split[0]).build();
            double action = expression.evaluate();
            double result = Double.parseDouble(split[1]);

            if (action != result) {
                System.out.println("Błąd w ostatnim działaniu: "+ line);
                break;
            }
            line = reader.readLine();
        }
    }

    public static void main(String[] args) throws IOException, ScriptException {
        Test test = new Test();
        test.checkResults();
    }
}