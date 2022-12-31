/** *
 * * This class tutorial is on the approach of code-with-harry;
 * * Without any, initialization and addition of values via methods;
 * * instantiation and attributes assign;
 * * */

package com.progress.learning.intermediate.Chapter8;
import java.util.Random;

// * Created A new Class;
class Employees{
	int employeeId;
	String employeeName;
	public void printMethods() {
		System.out.println("Employee id is : " + employeeId);
		System.out.println("Employee name is : " + employeeName);
	}
}

public class customClass {
	public static void main(String[] args) {
		Employees anshu = new Employees();
		Random generateValue = new Random();
		anshu.employeeId = generateValue.nextInt(1, 100);
		anshu.employeeName = "Anshu";
		anshu.printMethods();
	}
}