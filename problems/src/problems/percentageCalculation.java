package problems;

import java.util.Scanner;

public class percentageCalculation {
    public static void main(String[] args) {
        float hindi, english, accounts, economics, maths, computer;
        float overallSubjects;
        System.out.println("Percentage calculation");
        Scanner marksValue = new Scanner(System.in);

        System.out.print("Enter your Hindi marks : ");
        hindi = marksValue.nextFloat();

        System.out.print("Enter your english marks : ");
        english = marksValue.nextFloat();

        System.out.print("Enter your Accounts marks : ");
        accounts = marksValue.nextFloat();

        System.out.print("Enter your Economics marks : ");
        economics = marksValue.nextFloat();

        System.out.print("Enter your maths marks : ");
        maths = marksValue.nextFloat();

        System.out.print("Enter your computer marks : ");
        computer = marksValue.nextFloat();

        overallSubjects = maths + hindi + accounts + economics + english + computer;
        float percentage = (overallSubjects * 100) / 600;
        System.out.println(percentage);
    }
}
