/**
 * && - Double AND operator
 * || - Double or Operator
 * ! = Not operator
 * These, signs are used to provide logics to the java program
 * */


package com.progress.learning.basic.Chapter4;
import java.util.Scanner;

public class relationalConditionalOperators {
    public static void main(String[] args) {
        // Both condition will have to be true statement, for execution
        System.out.print("Enter your age : ");
        Scanner enterAge = new Scanner(System.in);
        int Age = enterAge.nextInt();

        if(Age > 18 && Age != 18){
            System.out.println("You can drive");
        }else{
            System.out.println("You can't drive");
        }
        LogicalOrOperator(args);
    }

    public static void LogicalOrOperator(String[] args) {
        // If any condition is true, then it will execute as true
        Scanner enterMarks = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int marks = enterMarks.nextInt();

        if (marks > 32 || marks == 32){
            System.out.println("Congrats, paas ");
        } else{
            System.out.println("Sorry, you're fail");
        }
        notLogicalOperator(args);
    }

    public static void notLogicalOperator(String[] args) {
        // It will evaluate as false, if a condition is true
        boolean a = true;
        boolean b = true;
        System.out.println("now bool(a) is : " + !a);
        System.out.println("now bool(b) is : " + !b);
    }
}
