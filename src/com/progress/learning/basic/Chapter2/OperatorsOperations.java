/**
 * @author: i-ice-bear, Anshu
 * @description: operatorsOperations in java. Learning Module 6
 * @// FIXME: 01-Mar-23
 * */

package com.progress.learning.basic.Chapter2;

public class OperatorsOperations {
    public static void main(String[] args) {
//      Add operator
        int integer1 = 10;
        int integer2 = 20 + integer1;
        integer2 += 10;
        System.out.println("output is : " + integer2);
        assignmentOperators(args);
    }

    public static void assignmentOperators(String[] args) {
        int integerAss1 = 100;
        int integerAss2 = 200 + integerAss1;
        integerAss2 += 100; // Addition of 100 in variable. AssignmentOperator used.!
        System.out.println("Output is : " + integerAss2);
        comparisonOperators(args);
    }

    public static void comparisonOperators(String[] args) {
        int comparisonVar1 = 100;
        int comparisonVar2 = 100;
        boolean comparisonVariableOutput = comparisonVar1 == comparisonVar2;
        System.out.println("Has equal : " + comparisonVariableOutput);
        logicalOperators(args);
    }

    public static void logicalOperators(String[] args) {
        int logicalVar1 = 200;
        int logicalVar2 = 400;
        // If one condition is true then other operator is false then it evaluate false. Completely
        boolean comparisonLogical = logicalVar1 == logicalVar2 && logicalVar2 == 3;
        System.out.println("Logical output is : " + comparisonLogical);

        // If one condition is true then other condition is false then it evaluate, true . Completely
        comparisonLogical = logicalVar1 == logicalVar2 || logicalVar2 == 400;
        System.out.println("Comparison Or Logical value : " + comparisonLogical);

        moduloDivision(args);
    }

    public static void moduloDivision(String[] args) {
        float moduloDivisions = (float) (4.8 % 1.1);
        System.out.println("Modulo Division : " + moduloDivisions);
    }
}
