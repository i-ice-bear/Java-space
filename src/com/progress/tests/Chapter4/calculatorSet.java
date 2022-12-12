package com.progress.tests.Chapter4;
import java.util.Scanner;

public class calculatorSet {
	public static void main(String[] args) {
		Scanner getIntegers = new Scanner(System.in);

		System.out.print("Enter first number : ");
		float firstInteger = getIntegers.nextFloat();

		System.out.print("Enter second number : ");
		float secondInteger = getIntegers.nextFloat();

		System.out.print("Enter operation : ");
		char operation = getIntegers.next().charAt(0);

		switch (operation){
			case ('+') ->{
				int output = (int) (firstInteger + secondInteger);
				System.out.println("The output is : " + output);
			} case('-') ->{
				int output = (int) (firstInteger - secondInteger);
				System.out.println("The output is : " + output);
			} case ('*') ->{
				int output = (int) (firstInteger * secondInteger);
				System.out.println("The output is : " + output);
			} case ('%') ->{
				int output = (int) (firstInteger % secondInteger);
				System.out.println("The output is : " + output);
			} case ('/') -> {
				int output = (int) (firstInteger / secondInteger);
				System.out.println("The output is : " + output);
			}
			default -> {
				System.out.println("value not provided properly: ");
				System.out.println("Try again!");
			}
		}
	}
}
