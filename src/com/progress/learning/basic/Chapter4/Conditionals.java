package com.progress.learning.basic.Chapter4;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner enterAge = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = enterAge.nextInt();
        if (age == 18){
            System.out.println("You can drive");
        } else{
            System.out.println("You can't drive");
        }
        conditionalRendering(args);
    }

    public static void conditionalRendering(String[] args) {
        Scanner distanceFormation = new Scanner(System.in);
        System.out.print("Enter 1 x CO-ordinates : ");
        float x_coordinate_1 = distanceFormation.nextFloat();
        System.out.print("Enter 2 x CO-ordinates : ");
        float x_coordinate_2 = distanceFormation.nextFloat();
        System.out.print("Enter 1 y CO-ordinates : ");
        float y_coordinate_1 = distanceFormation.nextFloat();
        System.out.print("Enter 2 y CO-ordinates : ");
        float y_coordinate_2 = distanceFormation.nextFloat();

        float distanceFormula = (float) Math.sqrt(Math.pow((x_coordinate_2 - x_coordinate_1), 2)  +
                Math.pow((y_coordinate_2 - y_coordinate_1), 2) );
        System.out.println("The distance is : " + distanceFormula);

        if (distanceFormula == 0){
            System.out.println("Distance is not valid : ");
        }else{
            System.out.println("Distance is : "+  distanceFormula);
        }
    }
}
