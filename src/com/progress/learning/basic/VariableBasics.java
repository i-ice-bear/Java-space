package com.progress.learning.basic;

public class VariableBasics {
    public static void integerString(){
        int integers = 10;
        System.out.println(integers);
    }
    public static void literalString(){
        byte bytes = 100;
        System.out.println(bytes);
    }
    public static void mainString(){
        System.out.println("Mainstreaming");
    }
    public static void main(String[] args) {
        literalString();
        System.out.println("mains, changes");
        integerString();
        mainString();
    }
}
