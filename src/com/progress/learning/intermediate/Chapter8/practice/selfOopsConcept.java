/** *
 * * Object-oriented-programming approach written by myself.
 * * To use a method as an attribute value setter, in-short cheap
 * * Cheap Constructor.
 * * */

package com.progress.learning.intermediate.Chapter8.practice;
import java.util.Random;
import java.util.Scanner;

class Employees{
	static int employeeId;
	static String employeeName;
	static int baseSalary = 30000;
	static float qualificationGrade;
	public static void setValues(int getId, String getName, float getGrade) {
		employeeId = getId;
		employeeName = getName;
		qualificationGrade = getGrade;
	}

	public static void printAttributes() {
		System.out.println("============ Your Qualification Report ============");
		System.out.println("Employee ID : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Base Salary : " + baseSalary);
		if (qualificationGrade < 5.0f){
			System.out.println("You're Rejected");
		} else if (qualificationGrade > 5.0f){
			System.out.println("You're hired");
		} else{
			System.out.println("You're unqualified");
		}
	}
}

public class selfOopsConcept {
	static String getName;
	static float qualificationCGP;
	static void getInputs() {
		Scanner getInputs = new Scanner(System.in);

		System.out.print("Enter Name : ");
		getName = getInputs.nextLine();

		System.out.print("Enter your CGP : ");
		qualificationCGP = getInputs.nextFloat();

		while (qualificationCGP > 10f || qualificationCGP == 0){
			System.out.print("Write Proper Value : ");
			qualificationCGP = getInputs.nextFloat();
		}
	}
	public static void main(String[] args) {
		getInputs();
		Random generateValue = new Random();
		int generateRandom = generateValue.nextInt(1, 999);
		Employees.setValues(generateRandom, getName, qualificationCGP);
		Employees.printAttributes();
	}
}
