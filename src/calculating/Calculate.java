package calculating;
import menageData.FileMenager;

public class Calculate {

    public String addition(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("\\+");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first + second;
        fileMenager.saveToFile(input, sum);
        return String.valueOf(sum);
    }
    public String subtraction(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("-");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first - second;
        fileMenager.saveToFile(input, sum);
        return String.valueOf(sum);
    }
    public String multiplication(String input, FileMenager fileMenager){
        String[] splittedInput = input.split("\\*");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first * second;
        fileMenager.saveToFile(input, sum);
        return String.valueOf(sum);
    }
    public String division(String input, FileMenager fileMenager){
        String[] składniki = input.split("/");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy / drugi;
        fileMenager.saveToFile(input, sum);
        return  String.valueOf(sum);
    }


}
