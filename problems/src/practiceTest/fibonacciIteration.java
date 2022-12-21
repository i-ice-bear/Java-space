package practiceTest;
import java.util.Scanner;

public class fibonacciIteration {
	static void _fibonacci_iteration(int _fibNumber){
		int num1 = 0, num2 = 1;
		int counter = 0;

		while (counter < _fibNumber){
			int number3 = num1 + num2;
			num1 = num2;
			num2 = number3;
			counter++;
			System.out.println("Value of " + counter + " term is : " + num1);
		}
	}
	public static void main(String[] args) {
		Scanner fibonacci = new Scanner(System.in);
		System.out.print("Enter iteration : ");
		int fibonacciNumber = fibonacci.nextInt();
		_fibonacci_iteration(fibonacciNumber);
	}
}
