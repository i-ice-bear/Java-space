package practiceSet;
import java.util.Scanner;

public class chapter6 {
	public static void main(String[] args) {
		//Question1 Create float array, And calculate sum.
		float [] floatArray = {2.3f, 3.3f, 3.6f, 2.4f, 9.2f};
		float sumArray = 0f;
		for (float element : floatArray) {
			sumArray = sumArray + element;
		}
		System.out.println("Sum of float array is : " + sumArray);
		_question7(args);
	}

	public static void _question2(String[] args) {
		// Is an array takes an element or not ?
		Scanner checkNumSet = new Scanner(System.in);
		System.out.print("Enter the number : ");
		float [] floatArray = {2.3f, 3.3f, 3.6f, 2.4f, 9.2f};
		boolean isElement = false;
		float checkNumInt = checkNumSet.nextFloat();

		for (float arrayInt: floatArray) {
			if (checkNumInt == arrayInt){
				isElement = true;
				break;
			}
		}

		if (isElement){
			System.out.println("Value " + checkNumInt + " Present in the array");
		} else{
			System.out.println("Value " + checkNumInt + " is not Present in the array");
		}

	}

	public static void _question3(String[] args) {
		// Average marks of physics in class
		float [] physicsMarks = {90f, 23f, 43f, 54f, 52f};
		float average = 0f;
		float sum = 0;
		for (float indexElement : physicsMarks){
			sum = indexElement + sum;
			average = (sum) / 5;
		}
		System.out.println("The average marks of physics from class : " + average);
	}

	public static void _question4(String[] args) {
		// Print each two elements of array
		int[][] matrixArray = { {1, 4, 5}, {2, 4, 6} };
		int[][] matrixArray2 = { {1, 4, 2}, {3, 6, 7} };
		int[][] result = { {0, 0, 0}, {0,0,0} };
		for (int i = 0; i < matrixArray.length; i++) {
			for (int j = 0; j < matrixArray[i].length; j++) {
				result[i][j] = matrixArray[i][j] + matrixArray2[i][j];
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}
 	}

	public static void _question5(String[] args) {
		/*
		 * another approach: a[i] = a[l-i-1]
		 * length = l, i = index, 1 = for swapping */

		int [] arr = new int [] {1, 2, 3, 4};
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void _question6(String[] args) {
		/*
		* Find minimum and maximum value in array,
		* */
		int[] minimumArray = {3, 2, 6, 3, 9, 202, 1};
		int minimumVal = Integer.MAX_VALUE;
		System.out.println(minimumVal);

		for (int elementArray: minimumArray) {
			if (elementArray < minimumVal){
				minimumVal = elementArray;
			}
		}
		System.out.println(minimumVal);
	}

	public static void _question7(String[] args) {
		int[] sortArray = {1, 3, 5, 7, 8};
		boolean isSorted = true;
		for (int i = 0; i < sortArray.length - 1; i++) {
			if (sortArray[i] > sortArray[i+1]){
				isSorted = false;
				break;
			}
		}
		if (isSorted){
			System.out.println("Array is sorted");
		} else{
			System.out.println("Array is not sorted");
		}
	}


}
