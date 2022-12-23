package com.progress.tests.Chapter7;

public class methods {
	int classObjectCall(int x, int y){
		return x%y;
	}
	static int addInt(int variable1, int variable2){
		return variable1 + variable2;
	}
	public static void main(String[] args) {
		System.out.println(addInt(3, 3));
		methods classMakers = new methods();
		System.out.println(classMakers.classObjectCall(2, 2));
	}
}