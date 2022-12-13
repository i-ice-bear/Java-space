package com.progress.learning.basic.Chapter6;

public class forEachForJava {
	public static void main(String[] args) {
		int [] marks = {1, 2, 3};
		float [] floatMark = {2.4f, 39.3f, 33.3f, 99.3f};
		String [] students = {"Mink", "Lovish", "Anshu"};
		System.out.println(students.length);
		System.out.println(marks.length);
		// Shows the length, of array
		forEachElement(args);
	}
	public static void forEachElement(String[] args) {
		int [] mainArray = {3, 1, 4, 5, 6};
		for (int i = mainArray.length - 1; i >= 0; i--) {
			System.out.println(mainArray[i]);
		}
	}
}
