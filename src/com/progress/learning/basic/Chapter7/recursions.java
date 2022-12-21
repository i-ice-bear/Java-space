package com.progress.learning.basic.Chapter7;
import java.util.Scanner;

public class recursions {
	static int factorialCallers(int factorialCalls){
		// factorial(n) = (n-1) * (n-2).... 1
		/*
		 * @Method: Iterative Approach
		 * */
		if (factorialCalls == 0 || factorialCalls == 1){
			return 1;
		} else{
			return factorialCalls *
					factorialCallers(factorialCalls - 1 );
		}
	}
	static int iterativeFactorial(int factorialIteration){
		int product = 1;
		if (factorialIteration == 0 || factorialIteration == 1){
			return 1;
		} else{
			for (int i = 1; i <= factorialIteration ; i++) {
				product *= i;
			}
			return product;
		}
	}

	public static void main(String[] args) {
		Scanner factorialRecursion = new Scanner(System.in);
		System.out.print("Enter recursion : ");
		int factorialRecurse = factorialRecursion.nextInt();

		System.out.println("The factorial is : " + factorialCallers(factorialRecurse));
		System.out.println("Iterative approach : " + iterativeFactorial(factorialRecurse));
	}
}