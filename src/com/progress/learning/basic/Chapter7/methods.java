package com.progress.learning.basic.Chapter7;
import java.util.Scanner;

public class methods {
	int callerObject(int _coordinate1, int _coordinate2){
		System.out.println(_coordinate2 + _coordinate1);
		return _coordinate1;
	}
	static int multiplication (int _x_coordinate, int _y_coordinate){
		int output = _x_coordinate * _y_coordinate;
		System.out.println("Multiplication output : " + output);
		return output;
	}
	public static void main(String[] args) {
		Scanner getInteger = new Scanner(System.in);
		int _argument_1 = getInteger.nextInt();
		int _argument_2 = getInteger.nextInt();
		int output = multiplication(3, 3);
		/* * Object caller notation */
		methods callerObj = new methods();

		int voidCallerObject = callerObj.callerObject(3, 3);
		System.out.println("Object caller result : " + voidCallerObject);
	}

}