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
		checkSort(args);
	}
	static void checkSort(String[] args){
		int[] sortArray = {1, 3, 5, 7, 9};
		boolean isSort = true;
		for (int i = 0; i < sortArray.length - 1; i++) {
			if (sortArray[i] > sortArray[i+1]){
				isSort = false;
				break;
			}
		}
		if (isSort){
			System.out.println("Array is sorted");
		} else{
			System.out.println("Array is not sorted");
		}
	}
}
