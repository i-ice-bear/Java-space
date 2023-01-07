package com.progress.learning.intermediate.Chapter9.test;

class circleConfigs {
	private static int radius;
	private static int diameter;
	public static void setRadius(int setRadii){
		radius = setRadii;
	}
	public static int returnRadius(){
		return radius;
	}
	public static void setDiameter(int getDiameter){
		diameter = getDiameter;
	}
	public static int returnDiameter(){
		return diameter;
	}
}
public class circleAccessModifiers {
	public static void main(String[] args) {
		circleConfigs.setRadius(3000);
		circleConfigs.setDiameter(200);
		System.out.println("Diameter : " + circleConfigs.returnDiameter());
		System.out.println("Radius:" + circleConfigs.returnRadius());
	}
}
