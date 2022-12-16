package com.progress.learning.basic.Chapter6;
import java.util.Arrays;

public class multiDimensionalArray {
	public static void main(String[] args) {
		int[][] myNumbers = { {1, 2, 3 }, {4, 5 ,6} };
		System.out.println(Arrays.deepToString(myNumbers));
		flatExample(args);
	}
	static void loopThrough(String[] args){
		int[][] oddNumbers = { {1, 3, 5}, {2, 4, 6} };
		System.out.println("Length of array : " + oddNumbers.length);
		for (int[] oddNumber : oddNumbers) {
			System.out.println("Elements : " + Arrays.toString(oddNumber));
		}
		int [][] nthDeeps;
		nthDeeps = new int[][]{{1, 2, 3}, {3, 4, 2}};
		System.out.println(Arrays.deepToString(nthDeeps));
	}

	public static void flatExample(String[] args) {
		int [][] flats;
		flats = new int[2][3];
		flats[0][0] = 101;
		flats[0][1] = 102;
		flats[0][2] = 103;
		flats[1][0] = 201;
		flats[1][1] = 202;
		flats[1][2] = 203;

		for (int i = 0; i < flats.length; i++) {
			for (int j = 0; j < flats[i].length; j++) {
				System.out.print(flats[i][j]);
				System.out.print(" ");
			}
			System.out.println("\n");
		}
	}
}
