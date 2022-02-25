package calculator_logic;

import calculating.Calculate;
import menageData.FileMenager;
import java.io.*;

public class Calculator{

    public String calculateToScreen(String pasekDziałańTreść) throws IOException {

        Calculate calculate = new Calculate();  //obiekt klasy Calculate do urochomienia obliczeń
        FileMenager fileMenager = new FileMenager("dane");

            String firstLine = pasekDziałańTreść;

            String result = null;
            if (firstLine.contains("+")) {
                 result =  calculate.addition(firstLine, fileMenager);
            }
            else if (firstLine.contains("-")) {
                result = calculate.subtraction(firstLine, fileMenager);
            }
            else if (firstLine.contains("*")) {
                result = calculate.multiplication(firstLine, fileMenager);
            }
            else if (firstLine.contains("/")){
                result = calculate.division(firstLine, fileMenager);
            }

        return result;
    }
}