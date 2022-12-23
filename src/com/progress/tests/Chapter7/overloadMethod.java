package com.progress.tests.Chapter7;

public class overloadMethod {
	void goodMorning(String giveString){
		System.out.println(giveString);
	}
	void goodMorning(String firstname, String surname){
		System.out.println(firstname + surname);
	}
	void goodMorning(String time, String firstname, String surname){
		System.out.println(time + firstname + surname);
	}

	public static void main(String[] args) {
		overloadMethod overload = new overloadMethod();
		overload.goodMorning("Anshu");
		overload.goodMorning("Anshu", "Naagar");
		overload.goodMorning("hello" + "Anshu" + "Naagar");
	}
}
