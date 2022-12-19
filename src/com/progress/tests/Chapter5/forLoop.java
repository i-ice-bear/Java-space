package com.progress.tests.Chapter5;

import java.util.Scanner;

public class forLoop {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			i++;
			System.out.println(i - 1);
		}
		doWhileLoop();
	}
	static void doWhileLoop(){
		Scanner checkCondition = new Scanner(System.in);
		int i = checkCondition.nextInt();
		do{
			System.out.println(i);
			i++;
		} while (i > 10);
	}
	static void whileLoop(){
		/* ! Warning: It's an infinite loop
		*  Run carefully*/
		while (true){
			System.out.println("Hello, world");
		}
	}
}
