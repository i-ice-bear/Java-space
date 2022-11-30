/**
 * @author; i-ice-bear, anshu naagar
 * @description; These are the
 * */


package com.progress.learning.basic;

import static java.lang.System.*;

public class Literals {
    public static void main(String[] args) {
        out.println("Literals");

        byte ageStatement = (byte) 1300;
        int variableStatement = 10;
        float floatStatement = 12.3f;
        double doubleStatement = 12.2D;
        long longStatement = 3222222222L;
        short shortStatement = 32;
        String mainString = "String literal";

        out.print(ageStatement + variableStatement + doubleStatement + longStatement + shortStatement+ mainString);
    }
}
