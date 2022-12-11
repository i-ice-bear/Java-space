package com.progress.learning.basic.Chapter6;
import java.util.Arrays;

public class BasicArray {
	public static void main(String[] args) {
		/*
		* Basic static array, which stores element data in
		* the type of indexes.
		*  */

		/*Method 1: Declaration and then initialization  */
		int [] numbers = new int[3];
		numbers[1] = 30;
		System.out.println(numbers[1]);

		/*Method 2: Declaration and then memory allocation indexWize*/
		String [] students = new String[10];
		students[0] = "Anshu";
		System.out.println(Arrays.toString(students));

		/* Method 3 : Declaration, Initialization and memory allocation together*/
		int [] marks = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(marks));
		System.out.println(Arrays.toString(Arrays.stream(marks).toArray()));

	}
}
