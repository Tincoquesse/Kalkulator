package zadanie_Pd07;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.script.ScriptException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Test {

     void sprawdźWyniki() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\FOM\\IdeaProjects\\Zadania_13.02\\dane"));
        String line = reader.readLine();

        while (line != null) {
            System.out.println(line);
            String[] split = line.split("=");

            Expression expression = new ExpressionBuilder(split[0]).build();
            float działanie = (float) expression.evaluate();
            float wynik = Float.parseFloat(split[1]);

            if (działanie != wynik) {
                System.out.println("Błąd programu kompilacji");
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