package practiceSet;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter7{
	static void multiplicationTable(int _tableNum){
		for (int i = 1; i < 11; i++) {
			int tableAns = _tableNum * i;
			System.out.format("%d multiplied by %d = %d\n", _tableNum, i, tableAns);
		}
	}
	static void patternPrinting(int _patternLength){
		for (int i = 0; i < _patternLength; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static int sumRect(int sumNum){
		if (sumNum == 1) {
			return 1;
		} else{
			return sumNum + sumRect(sumNum - 1);
		}
		/* *
	    !   Assets before using this function
	    *	Scanner getNumber = new Scanner(System.in);
	    *	System.out.print("Enter your number : " );
	    *	int getSumNum = getNumber.nextInt();
	    *	System.out.println("The value of natural no Is : " + sumRect(getSumNum));
		* */
	}
	static void patternPrint(int patternLength){
		for (int i = 0; i < patternLength; i++) {
			for (int j = patternLength + 1; j > i + 1; j--) {
				System.out.print('*');
			}
			System.out.println("");
		}
	}
	static int fibonacci(int fibonacciInt){
		//* * Fibonacci : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89;
		if(fibonacciInt == 1 || fibonacciInt == 2){
			return fibonacciInt - 1;
		} else{
			return fibonacci(fibonacciInt - 1) + fibonacci(fibonacciInt - 2);
		}
		/* ! Assets before using this method.
			* System.out.println("The fibonacci is : " + fibonacci(7));
		 **/
	}
	static void setAverageNum(int ...numbers){
		int averageSum = 0;
		for (int number : numbers) {
			averageSum = (numbers.length / number);
		}
		System.out.println(averageSum);
	}
	static void printPatternRec(int lengthNumber){
		if (lengthNumber > 0){
			printPatternRec(lengthNumber - 1);
			for (int i = 0; i < lengthNumber; i++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	static void convertTemperature(int temperature){
//		(40°C × 9/5) + 32 = 104°F
		int output = (temperature * 9 / 5) + 32;
		System.out.println("Fahrenheit is : " + output);

	}
	public static void main(String[] args) {
		Scanner getTemp = new Scanner(System.in);
		System.out.print("Enter temperature : ");
		int temperatureSet = getTemp.nextInt();
		convertTemperature(temperatureSet);
	}
}