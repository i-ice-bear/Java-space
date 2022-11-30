/**
 * @author; i-ice-bear, Anshu
 * @descripton; in Java we take the input with the help of the scanner class module in java,
 * */


package com.progress.learning.basic;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
     Scanner myObject = new Scanner(System.in);
     System.out.print("Enter your value : ");
     boolean checkVariable = myObject.hasNextBoolean();
     System.out.println("The variable is : " + checkVariable);
    }
}
