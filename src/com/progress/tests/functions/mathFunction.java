package com.progress.tests.functions;
import java.util.Scanner;

class SquareFunction {
	static void head(){
		while (true){
			Scanner getInput = new Scanner(System.in);
			System.out.print("Enter number : ");
     		int getInt = getInput.nextInt();
			int squareGetup = (int) Math.pow(getInt, 2);
			if (getInt < 0){
				System.out.println("Value Not Supported");
				break;
			} else if(getInt == 0){
				System.out.println(0);
				break;
			} else if (squareGetup < 0){
				throw new NegativeArraySizeException();
			}
			else{
				System.out.println("Value is : " + squareGetup);
			}
		}
	}
}

public class mathFunction {
	public static void main(String[] args) {
		SquareFunction.head();
	}
}