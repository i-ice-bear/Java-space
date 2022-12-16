package com.progress.tests.Chapter6;

public class arrayReverse {
	public static void main(String[] args) {
		int[] reverseArray = {1, 3, 5, 6, 8};
		int length = reverseArray.length;
		int mathFloat = Math.floorDiv(length, 2);
		int temporary = 0;
		for (int i = 0; i < mathFloat; i++) {
			temporary = reverseArray[i];
			reverseArray[i] = reverseArray[length - i - 1];
			reverseArray[length - i - 1] = temporary;
		}
		for (int element: reverseArray) {
			System.out.print(element + " ");
		}
	}
}
