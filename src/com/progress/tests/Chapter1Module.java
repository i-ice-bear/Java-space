/**
 * Chapter 1 : Practice module with distance formula
 * */

package com.progress.tests;
import java.util.Scanner;

public class Chapter1Module {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);

        int myNumbers = myObject.nextInt(); // Integer literal
        System.out.print("Enter integer literal or variable : ");
        System.out.println("My numbers are : " + myNumbers);
        System.out.print("Give me a boolean variable : ");

        distanceFormula();

    }
    public static void distanceFormula(){
        float x_coordinate_1 = 4;
        float x_coordinate_2 = 6;
        float y_coordinate_1 = 6;
        float y_coordinate_2 = 4;

        float distanceFormula = (float) Math.sqrt(Math.pow((x_coordinate_2 - x_coordinate_1), 2)  +
                Math.pow((y_coordinate_2 - y_coordinate_1), 2) );
        System.out.println("The distance is : " + distanceFormula);
    }
}
