package practiceSet;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Employees {
	//* * Problem 1 : Class
	static String employeeName;
	static int employeeSalary;
	public static void getName(String name){
		employeeName = name;
	}
	public static void getSalary(int Salary){
		employeeSalary = Salary;
	}

	public static void returnOutput() {
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Salary : " + employeeSalary);
	}
}

class Phone {
	public String ringing(){
		return " i'm ringing";
	}
	public String vibrating(){
		return " i'm vibrating";
	}
	public String calling(String contactName) {
		return " Calling " + contactName;
	}
}

class Square {
	static int side;
	public static int areaDimension(){
		return side * side;
	}
	public static int perimeterDimension(){
		return  4 * side;
	}

	public static void returnValue() {
		System.out.println("Side : " + areaDimension());
		System.out.println("Perimeter : " + perimeterDimension());
	}
}
class TommyVec{
	public static void running(){
		System.out.println("I'm running");
	}

	public static void firing() {
		System.out.println("I'm firing");
	}
	public static void hitting(){
		System.out.println("Hitting");
	}
}

public class Chapter8 {
	public static void main(String[] args) {
		Employees.getName("Anshu");
		Employees.getSalary(30000000);
		Employees.returnOutput();

		Phone asus = new Phone();
		System.out.println("Hey" + asus.ringing());
		System.out.println("Hey" + asus.vibrating());

		Square.side = 50;
		Square.returnValue();

		TommyVec.firing();
	}
}