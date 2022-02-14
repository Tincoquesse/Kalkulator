package zadanie_Pd07;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

     void sprawdźWyniki() throws IOException {
         BufferedReader reader = new BufferedReader(new FileReader("dane"));
         String line = reader.readLine();

         boolean ok = true;

         while (line != null) {
            System.out.println(line);
            String[] split = line.split("=");

            Expression expression = new ExpressionBuilder(split[0]).build();
            double działanie = expression.evaluate();
            double wynik = Double.parseDouble(split[1]);

            if (działanie != wynik) {
                System.out.println("Błąd w ostatnim działaniu");
                ok = false;
                break;
            }
            line = reader.readLine();
        }
         if (ok)
             System.out.println("Wyniki poprawne");
    }

    void sprawdźWynikWewnętrzny() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("dane"));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split("=");

            Expression expression = new ExpressionBuilder(split[0]).build();
            double działanie = expression.evaluate();
            double wynik = Double.parseDouble(split[1]);

            if (działanie != wynik) {
                System.out.println("Błąd w ostatnim działaniu: "+ line);
                break;
            }
            line = reader.readLine();
        }

    }

    public static void main(String[] args) throws IOException, ScriptException {
        Test test = new Test();
        test.sprawdźWyniki();
    }
}