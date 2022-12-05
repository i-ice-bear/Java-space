package com.progress.tests.Chapter1;
import java.util.Scanner;

public class ScannerModulation {
    public static void main(String[] args) {
        Scanner mainIteration = new Scanner(System.in);
        System.out.print("Ae Customer, enter your order : ");
        String mainStream = mainIteration.nextLine();
        System.out.println("output from scanner : " + mainStream);
    }
}
