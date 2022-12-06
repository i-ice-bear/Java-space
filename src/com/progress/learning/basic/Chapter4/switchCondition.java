package com.progress.learning.basic.Chapter4;
import java.util.Scanner;

public class switchCondition {
    public static void main(String[] args) {
        // If else ladder with if else with nested looping
        Scanner enterAge = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int ageInteger = enterAge.nextInt();

        if (ageInteger>90){
            System.out.println("You lived completely : ");
        }
        else if (ageInteger>50){
            System.out.println("Your half life is passed");
        }else if(ageInteger>40){
            System.out.println("You're under 40");
        } else if(ageInteger>13){
            System.out.println("You're a teenager");
        }else{
            System.out.println("you're a milk kid");
        }
        switchCaseException(args);
    }

    public static void switchCaseException(String[] args) {
        int age;
        Scanner getAge = new Scanner(System.in);
        System.out.print("Enter your age : ");
        age = getAge.nextInt();

        switch (age){
            case (14)->{
                System.out.println("You're in teenager");
            } case (18) ->{
                System.out.println("You're getting adult");
            } case (23) ->{
                System.out.println("You're good to go for a job");
            } case (60) ->{
                System.out.println("You're getting retired");
            }default -> {
                System.out.println("Enjoy Your life, ");
            }
        }
    }
}


