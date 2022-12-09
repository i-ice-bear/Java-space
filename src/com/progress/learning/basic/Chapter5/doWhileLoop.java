package com.progress.learning.basic.Chapter5;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class doWhileLoop {
    public static void main(String[] args) {
        firstNaturalNumbers(args);
    }

    public static void doWhileCondition(String[] args) {
        Scanner integerInput = new Scanner(System.in);
        int inputIntegers = integerInput.nextInt();
        // It will run one time, obviously
        do{
            System.out.println("main");
            inputIntegers++;
        } while(inputIntegers > 3);
    }

    public static void firstNaturalNumbers(String[] args) {
        int firstInteger = 1;

        do{
            System.out.println("Print N natural numbers : "+ firstInteger ++);
        } while(firstInteger <= 100);
    }
}
