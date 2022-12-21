package com.progress.learning.basic.Chapter7;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class methodOverloading {
	static void change(int integer){
		integer = 3232;
		System.out.println("integer variable from change is : " + integer);
	}
	static void tellJoke(){
		System.out.println("I make a new world \n" + "Plagiarism");
	}
	void addTwoNumbers (int _number_arg_1, int _number_arg_2){
		int output = _number_arg_1 + _number_arg_2;
		System.out.println("\t The output is : " + output);
	}

	/* * Method overloading starts form there */
	static void goodMorning(){
		System.out.println("Good morning, anything ");
	}
	static void goodMorning(int a){
		System.out.println("Good morning " + a + " Bro");
	}
	static void goodMorning(int a, int b){
		System.out.println("Good morning " + a + " Bro " + b);
	}
	static void goodMorning(String[] getName){
		System.out.println("Good morning " + Arrays.toString(getName));
	}
	static void changeArray(int @NotNull [] arrayPosition){
		arrayPosition[0] = 902;
		System.out.println("The 0th element is : " + arrayPosition[0]);
	}

	public static void main(String[] args) {
		tellJoke();
		int xVariable = 32;
		methodOverloading unsharedMethods = new methodOverloading();
		unsharedMethods.addTwoNumbers(3, 9);
		// * Case 1 : Method changeability inside the changeFunction.
		System.out.println("X variable is : " + xVariable);
		change(xVariable);

		// * case 2 : Array changeability.
		int [] arrayGet = {12, 32, 234, 523};
		changeArray(arrayGet);

		// * case 3 : Method overloading
		goodMorning();
		goodMorning(300); // * Arguments are actual
		String[] goodName = { "anshu" };
		goodMorning(goodName);
 	}
}