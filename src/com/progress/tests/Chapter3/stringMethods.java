package com.progress.tests.Chapter3;

import java.util.Locale;

public class stringMethods {
	public static void main(String[] args) {
		/*
		* Length, Extraction Method
		* */
		String newLength = "Sample, Length!";
		System.out.println("Lenght of string : " + newLength.length());
		upperCaseString(args);
	}

	public static void upperCaseString(String[] args) {
		// Uppercase string
		String upperCasing = "upper, casing!";
		System.out.println("UpperCase String, : " +
				upperCasing.toUpperCase(Locale.ROOT));
		lowerCasing(args);
	}

	public static void lowerCasing(String[] args) {
		// Lowercase string
		String lowerCasing = "lower, casing!";
		System.out.println("Lower, casing : " +
				lowerCasing.toLowerCase(Locale.ROOT));
		trimString(args);
	}

	public static void trimString(String[] args) {
		// Removes trailing spaces, trim string
		String trimming = "  andy.support.korea@gmail.com  ";
		System.out.println("After trimming : " + trimming.trim());
		subString(args);
	}

	public static void subString(String[] args) {
		// Returns string character from a specific range of indexes
		String subStringIndex = "String, substring, indexing";
		System.out.println("Index, string : " + subStringIndex.substring(3, 9));
		replaceArgument(args);
	}

	public static void replaceArgument(String[] args) {
		// Replaced string, from a string
		String nameReplacement = "Anshu";
		String replacedString = nameReplacement.replace("hu", "hika");
		System.out.println("String after Replacement : " + replacedString);
		startsWithMethod(args);
	}

	public static void startsWithMethod(String[] args) {
		String checkStartswith = "Is i'm starting from is";
		boolean checkStartBool = checkStartswith.startsWith("Is");
		System.out.println("Is i'm starting : " + checkStartBool);
		endsWith(args);
	}

	public static void endsWith(String[] args) {
		String endsWith = "I'm ending on speaker";
		boolean checksEndsWith = endsWith.endsWith("speaker");
		System.out.println("Is im ending : " + checksEndsWith);
		regexCheck(args);
	}

	public static void regexCheck(String[] args) {
		String replaceString = "I'm replace from the name, <| anshu |>";
		String replaced = replaceString.replace("<| anshu |>", "anshika");
		System.out.println("Now thre replace character is : " + replaced);
	}
}
