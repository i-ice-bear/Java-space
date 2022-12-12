package com.progress.tests.Chapter4;
import java.io.IOException;
import java.util.Scanner;

public class Conditionals {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter your age : ");
		Scanner enterAge = new Scanner(System.in);
		int ageGet = enterAge.nextInt();
		System.out.println("Your age is : " + ageGet);
		if (ageGet >= 18){
			System.out.println("you can drive");
		} else if(ageGet <= 10){
			System.out.println("you're a kid now");
		}
		else {
			System.out.println("You can't set");
		}
	}
}
