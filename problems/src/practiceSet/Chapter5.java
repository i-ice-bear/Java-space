package practiceSet;

public class Chapter5 {
	public static void main(String[] args) {
		// Q1 Print a pattern
		int n = 4;
		for (int i = n; i > 0; i--) {
			for (int j = n; j < i;  j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sumCalculation(args);
	}

	public static void sumNaturalNumbers(String[] args) {
		int sum = 0, num = 100;

		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		System.out.println("The sum is " + sum);
	}

	public static void multiplicationTable(String[] args) {

	}
	public static void decrementMultiplication(String[] args){
		int tableNumber = 5, table = 1;
		for (int i = 10; i >= 1; i--) {
			table = tableNumber * i;
			System.out.printf("%d x %d is : %d \n", tableNumber, i , table);
		}
	}

	public static void factorialMultiplication(String[] args) {
		int numeric = 5;
		int index = 1;
		int factorialOutput = 1;
		while (index <= numeric){
			factorialOutput *= index;
			index++;
		}
		System.out.println(factorialOutput);
	}

	public static void sumCalculation(String[] args) {
		int tableNumber = 8, table = 1, sum = 0;
		for (int i = 1; i <= 10; i++) {
			table = tableNumber * i;
			System.out.printf("%d x %d is : %d \n", tableNumber, i , table);
			sum += tableNumber * i;
		}
		System.out.println(sum);
	}
}
