/**
 * @author; i-ice-bear Anshu
 * @description; Practice set of chapter 1
 *
 * */



package practiceSet;

import java.util.Scanner;

public class Chapter1 {
    public static void main(String[] args) {
//        question 1 write the sum of the three integers
        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        int outputSUm = (number1) + (number2) + (number3);
        System.out.println("The sum of three integers is : " + outputSUm);

//        Question 2 Write the calculation of the cgpa of three subjects
        float subjects1 = 45;
        float subjects2 = 95;
        float subjects3 = 48;
//        shortcut method
//        float cgpaSubmission = ((subjects1 + subjects2 + subjects3) / 30)
        float cgpaSubmission = ((subjects1 + subjects2 + subjects3) * 100) / 300 / 10;
        System.out.println("The CGP is : " + cgpaSubmission);

//       Question 4 Echo the name after the input
        Scanner echoHello = new Scanner(System.in);
        System.out.print("What's your name buddy ? ");
        String echoWelcome = echoHello.nextLine();
        System.out.println("Hello " + echoWelcome + "!");

//        Question 4 Program to convert the kilometers into miles
        int kilometers = 3;
        float milesConvert  = (float) (kilometers * 0.621371);
        System.out.println(milesConvert);

//        Question 5
        Scanner getNumber = new Scanner(System.in);
        System.out.print("Enter number : ");
        boolean hasNextNumberIsInt = getNumber.hasNextInt();
        System.out.println("The number is : " + hasNextNumberIsInt + " type");
    }
}
