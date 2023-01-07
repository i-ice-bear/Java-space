package com.progress.learning.intermediate.Chapter9;

import java.util.Random;

class SampleEmployee{
	private static int id;
	private static String employeeName;

	public static void setId(int getIds){
		id = getIds;
	}
	public static int getId(){
		return id;
	}
	public static void setEmployee(String employeeGet){
		employeeName = employeeGet;
	}
	public static String returnEmployee(){
		return employeeName;
	}
}

public class AccessModifiers {
	public static void salary() {

	}
	public static void main(String[] args) {
		Random getRandom = new Random();
		float randomNumber = getRandom.nextInt(1, 1000);
		SampleEmployee.setEmployee("Anshu");
		SampleEmployee.setId((int) randomNumber);
		System.out.println("Employee : " + SampleEmployee.returnEmployee());
		System.out.println("ID : " + SampleEmployee.getId());
	}
}
