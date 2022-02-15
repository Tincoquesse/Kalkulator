package zadanie_Pd07;

import test.Test;

import java.io.*;
import java.util.Scanner;

public class Calculator {

    FileWriter fileWriter;
    PrintWriter printWriter;

    public Calculator(String fileName) throws IOException {

        this.fileWriter = new FileWriter(fileName);
        this.printWriter = new PrintWriter(fileWriter);
    }

    void addition(String input){
        String[] splittedInput = input.split("\\+");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first + second;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input, sum);
    }
    void subtraction(String input){
        String[] splittedInput = input.split("-");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first - second;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);


    }
    void multiplication(String input){
        String[] splittedInput = input.split("\\*");
        double first = Double.parseDouble(splittedInput[0]);
        double second = Double.parseDouble(splittedInput[1]);
        double sum = first * second;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);
    }
    void division(String input){
        String[] składniki = input.split("/");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy / drugi;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);
    }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);   //obiekt Scanner do wprowadzania danych przez użytkownika
        Calculator CalculatorRun = new Calculator("dane");  //obiekt Kalkulator z argumentem nazwy pliku do zapisu

        System.out.println("Witaj w aplikacji Kalkulator!");
        boolean run = true;
        while (run) {
            System.out.println("Wpisz działanie - " +
                    "jeśli chcesz zakończyć napisz 'end'. ");
            String firstLineInput = scanner.nextLine();
            String firstLineInputPrime  = firstLineInput.replace(',','.');  //obsługa przecinka
            String firstLine = firstLineInputPrime.replace(" ", "");    //obsługa spacji

            if (firstLine.contains("+"))
                CalculatorRun.addition(firstLine);
            else if (firstLine.contains("-"))
                CalculatorRun.subtraction(firstLine);
            else if (firstLine.contains("*"))
                CalculatorRun.multiplication(firstLine);
            else if (firstLine.contains("/"))
                CalculatorRun.division(firstLine);
            else if (firstLine.contains("end")) {
                CalculatorRun.printWriter.close();  //zamykamy zapis do pliku 'dane'
                Test test = new Test(); //tworzymy obiekt testowy
                test.checkInternalResults();  //uruchamiamy metodę testu wewnętrznego
                run = false;
            }else
                System.out.println("Wpisałeś złą składnię");
        }
    }
}

