package com.progress.tests.Chapter2;

import java.util.Scanner;

public class associativity {
	public static void main(String[] args) {
		/*
		* Higher, associativity of brackets
		* Example, Via distance formula
		* */
		Scanner getCoOrdinates = new Scanner(System.in);
		System.out.print("Enter coordinates : ");
		int x_coordinate = getCoOrdinates.nextInt();
		int y_coordinate = getCoOrdinates.nextInt();
		int x_coordinate2 = getCoOrdinates.nextInt();
		int y_coordinate2 = getCoOrdinates.nextInt();

		int distanceFormula = (int) Math.sqrt(Math.pow((x_coordinate2 - x_coordinate), 2)
				+ Math.pow((y_coordinate2 - y_coordinate), 2));
		System.out.printf("DistanceFormat is : %d", distanceFormula);
		precedenceEvaluation(args);
	}

	public static void precedenceEvaluation(String[] args) {
		/*
		* Mini Precedence of javaLangs,
		* */
		int miniPrecedence = 9+3;
		int semiPrecedence = 3 - 2;
		System.out.println(miniPrecedence + " " + semiPrecedence);
	}
}
