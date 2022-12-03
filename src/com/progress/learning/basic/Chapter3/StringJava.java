/**
 * String having a special support in java, from a specified,
 * and it can also be used as a string,
 * @author; Anshu Naagar
 * @description; Chapter 3; String methods.
 * */

package com.progress.learning.basic.Chapter3;

import java.util.Scanner;

public class StringJava {
    public static void main(String[] args) {
        String newString = new String("Java");
        System.out.println(newString);
        stringClassInt(args);
    }

    public static void printLNMethod(String[] args) {
        System.out.println("New line method");
        System.out.print("Single line method");
        System.out.format("String formatting");

        // It is known as format specifiers. in printf function
        int a = 4; // %d is used for integer
        float b = 32.43f; // %f Is used for float in printf function
        char firstCharacter = '4'; // %c is used for character
        String sString = new String("New strings"); // %s is used for string

        System.out.printf("String character is : %s", sString);
        System.out.printf("First-Character is : %c", firstCharacter);
        System.out.format("Print Function reduncancy %d and %f", a, b);
    }
    public static void stringClassInt(String[] args){
        Scanner scannerClassifier = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String scannerStorage = scannerClassifier.nextLine();
        System.out.printf("Scanner String is : %s", scannerStorage);
    }
}
