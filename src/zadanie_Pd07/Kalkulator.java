package zadanie_Pd07;

import java.io.*;
import java.util.Scanner;

public class Kalkulator {

    FileWriter fileWriter;
    PrintWriter printWriter;

    public Kalkulator(String fileName) throws IOException {

        this.fileWriter = new FileWriter(fileName);
        this.printWriter = new PrintWriter(fileWriter);
    }

    void dodawanie(String input){

        String[] składniki = input.split("\\+");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy + drugi;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input, sum);

    }
    void odejmownie(String input){
        String[] składniki = input.split("-");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy - drugi;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);


    }
    void mnożenie(String input){
        String[] składniki = input.split("\\*");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = pierwszy * drugi;
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);
    }
    void dzielenie(String input){
        String[] składniki = input.split("/");
        double pierwszy = Double.parseDouble(składniki[0]);
        double drugi = Double.parseDouble(składniki[1]);
        double sum = (pierwszy / drugi);
        System.out.println(sum);
        printWriter.printf("%s=%s\n", input,sum);
    }


    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        Kalkulator kalkulatorRun = new Kalkulator("dane");
        System.out.println("Witaj w aplikacji Kalkulator!");
        boolean run = true;

        while (run) {
            System.out.println("Wpisz działanie -\n" +
                    "jeśli chcesz zakończyć napisz 'end'. ");
            String firstLineInput = scanner.nextLine();//pierwsza linia
            String firstLineInputPrime  = firstLineInput.replace(',','.');//obsługa przecinka
            String firstLine = firstLineInputPrime.replace(" ", "");//obsługa spacji

            if (firstLine.contains("+"))
                kalkulatorRun.dodawanie(firstLine);
            else if (firstLine.contains("-"))
                kalkulatorRun.odejmownie(firstLine);
            else if (firstLine.contains("*"))
                kalkulatorRun.mnożenie(firstLine);
            else if (firstLine.contains("/"))
                kalkulatorRun.dzielenie(firstLine);
            else if (firstLine.contains("end")) {
                kalkulatorRun.printWriter.close();
                Test test = new Test();
                test.sprawdźWynikWewnętrzny();
                run = false;
            }else
                System.out.println("Wpisałeś złą składnię");
        }
    }
}

