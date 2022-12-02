/**
 * @author; i-ice-bear, anshu
 * @description; in java, there is a corresponding class of any variable and there are 8 types
 *               of variable.
 *               ex. int, boolean, long, short, String, byte, char, float, double
 * */

package com.progress.learning.basic.Chapter1;

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
