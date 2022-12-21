package com.progress.learning.basic.Chapter7;
import org.jetbrains.annotations.NotNull;

public class varArgs {
	static int sum(int _arg_1, int _arg_2){
		return _arg_1 + _arg_2;
	}
	static int sum(int staticInt, int @NotNull ...argument){
		int resultSum = 0;
		for (int element:argument) {
			System.out.println("The elements are : " + element);
			resultSum += element;
		}
		return resultSum;
	}
	public static void main(String[] args) {
		int[] submissionArray = {4, 2, 3, 23, 32, 35, 24};
		System.out.println("the sum is : " + sum(32, submissionArray));
	}
}
