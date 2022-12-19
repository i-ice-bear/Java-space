package com.progress.tests.Chapter6;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class arrayPractice {
	public static void main(String[] args) {
		int[] printArray = {1, 5, 7, 9};
		for (int element: printArray) {
			System.out.print("[ " + element + " ]\n");
		}
		checkElement();
	}
	static void matrixAddition(){
		int[][] firstMatrix = {{1, 2, 3}, {4, 5, 6}};
		int[][] secondMatrix = {{7, 8, 9}, {10, 11, 12}};
		int[][] emptyContainer = {{0,0,0}, {0,0,0}};
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < firstMatrix[i].length; j++) {
				emptyContainer[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
				System.out.print("[ " + emptyContainer[i][j] + " ]");
			}
		}
	}
	static void reverseArray(){
		int[] reverseArray = {7, 5, 3, 1, 5, 9};
		for (int i = reverseArray.length - 1; i >= 0; i--) {
			System.out.println("[ "+ reverseArray[i] + " ]");
		}
	}
	static void randomPickElement(){
		String[] choiceStr = {"Rock", "Paper", "Scissor"};
		Random checkElement = new Random();
		int choiceRandom = checkElement.nextInt(choiceStr.length);
		System.out.println(choiceStr[choiceRandom]);
	}
	static void checkElement() {
		String[] elements = {"andy", "mink", "clown"};
		Scanner checkElement = new Scanner(System.in);
		System.out.print("Enter your element : ");
		boolean isContain = false;
		String elementGet = checkElement.nextLine().toLowerCase(Locale.ROOT);
		for (String elementSet: elements) {
			if (elementSet.equals(elementGet)){
				isContain = true;
				break;
			}
		}
		if (isContain){
			System.out.println("Yay, It have");
		} else{
			System.out.println("Nope it didn't have");
		}
	}
}