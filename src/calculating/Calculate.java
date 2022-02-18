package calculating;
import menageData.FileMenager;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Calculate {
FileMenager fileMenager;

    public Calculate() throws IOException {
    }

    public void addition(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("\\+");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first + second;
        System.out.println(sum);
        fileMenager.saveToFile(input, sum);
    }
    public void subtraction(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("-");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first - second;
        System.out.println(sum);
        fileMenager.saveToFile(input, sum);


    }
    public void multiplication(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("\\*");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first * second;
        System.out.println(sum);
        fileMenager.saveToFile(input, sum);
    }
    public void division(String input, FileMenager fileMenager){
        String[] składniki = input.split("/");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy / drugi;
        System.out.println(sum);
        fileMenager.saveToFile(input, sum);
    }


}
