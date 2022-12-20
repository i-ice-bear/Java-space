package com.progress.learning.basic.Chapter7;
import java.util.*;

public class methodOverloading {
	static void change(int takeArgument) {
		takeArgument = 30;
		System.out.println("Argument is : " + takeArgument);
	}
	public static void main(String[] args) {
		int x = 302;
		change(x);
		int [] elementChange = {2342, 12432, 23423, 2134};
		change2(elementChange);
		System.out.println("The element is : " + elementChange[0]);
	}
	static void change2(int [] arrayChange){
		arrayChange[0] = 232;
		System.out.println("the element of change 2 is : " + arrayChange[0]);
	}
}