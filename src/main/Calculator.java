package main;
import GUI.*;

import calculating.Calculate;
import menageData.FileMenager;
import test.Test;
import java.io.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);   //obiekt Scanner do wprowadzania danych przez użytkownika
        Calculate calculate = new Calculate();  //obiekt Kalkulator z argumentem nazwy pliku do zapisu
        FileMenager fileMenager = new FileMenager("dane");

        System.out.println("Witaj w aplikacji Kalkulator!");
        boolean run = true;
        while (run) {
//            GUI.Window.main();
            System.out.println("Wpisz działanie - jeśli chcesz zakończyć napisz 'end'. ");
            String firstLineInput = scanner.nextLine();
            String firstLineInputPrime  = firstLineInput.replace(',','.');  //obsługa przecinka
            String firstLine = firstLineInputPrime.replace(" ", "");    //obsługa spacji


            if (firstLine.contains("end")) {
                fileMenager.closeWriting();  //zamykamy zapis do pliku 'dane'
                Test test = new Test(); //tworzymy obiekt testowy
                test.checkInternalResults();  //uruchamiamy metodę testu wewnętrznego
                run = false;
            }
             else if(firstLine.matches(".*[a-zA-Z]+.*")){
                System.out.println("Staraj się podać działanie bez liter");
            }
            else if (firstLine.contains("+")) {
                calculate.addition(firstLine, fileMenager);
            }
            else if (firstLine.contains("-")) {
                calculate.subtraction(firstLine, fileMenager);
            }
            else if (firstLine.contains("*")) {
                calculate.multiplication(firstLine, fileMenager);
            }
            else if (firstLine.contains("/")){
                calculate.division(firstLine, fileMenager);
            }
            else
                System.out.println("Wpisałeś złą składnię");
        }
    }
}