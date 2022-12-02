/**
 * @about; Test from chapter 1 utility
 * @author; Anshu
 *
 * */

package practiceTest;

import java.util.Scanner;

public class cbseMarksCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your marks below 100;");
        float hindi, english, maths, accounts, economics;
        float overallPercentage;
        Scanner marksGet = new Scanner(System.in);

        System.out.print("Enter hindi marks : ");
        hindi = marksGet.nextFloat();

        while (hindi<0 || hindi>100){
            System.out.println("OOP, Error, Enter value below 100");
            System.out.print("Enter hindi marks : ");
            hindi = marksGet.nextFloat();
        }

        System.out.print("Enter English marks : ");
        english = marksGet.nextFloat();
        while (english<0 || english>100){
            System.out.println("OOP, Error, Enter value below 100");
            System.out.print("Enter english marks : ");
            english = marksGet.nextFloat();
        }


        System.out.print("Enter Maths marks : ");
        maths = marksGet.nextFloat();
        while (maths<0 || maths>100){
            System.out.println("OOP, Error, Enter value below 100");
            System.out.print("Enter maths marks : ");
            maths = marksGet.nextFloat();
        }


        System.out.print("Enter Accounts marks : ");
        accounts = marksGet.nextFloat();
        while (accounts<0 || accounts>100){
            System.out.println("OOP, Error, Enter value below 100");
            System.out.print("Enter accounts marks : ");
            accounts = marksGet.nextFloat();
        }


        System.out.print("Enter Economics marks : ");
        economics = marksGet.nextFloat();
        while (economics<0 || economics>100){
            System.out.println("OOP, Error, Enter value below 100");
            System.out.print("Enter economics marks : ");
            economics = marksGet.nextFloat();
        }

        float overallSubject = (hindi) + (english) + (maths) + (accounts) + (economics);
        overallPercentage = (overallSubject*100) / (500);

        System.out.println("Overall percentage is : " + overallPercentage);
    }
}
