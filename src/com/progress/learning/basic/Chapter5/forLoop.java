/**
 * @author; Anshu
     * For-loop iteration,
     * 2n = Generates, Natural odd numbers Ex. 2.4.6.8.10
     * 2n+1 = Generated, Natural Even numbers Ex. 1.3.5.7.9
 * */

package com.progress.learning.basic.Chapter5;

public class forLoop {
    public static void main(String[] args) {
        for (int numbers = 1; numbers < 10; numbers++) {
            System.out.println("Numbers are : " + numbers);
            numbers++;
        }
        arthmeticLoopOperation(args);
    }

    public static void printOddNumber(String[] args) {
        for (int newWay = 0; newWay < 20; newWay++) {
            // First 2 multiplies with nthTerm and 1 added init.
            System.out.println("Odd new-number list : " + 2 * (newWay) + 1);
            newWay++;
        }
        System.out.println("\n");
        for (int oddNumberPrint = 1; oddNumberPrint < 20; oddNumberPrint++) {
            System.out.println("Odd number lis is : " + oddNumberPrint);
            oddNumberPrint++;
        }
    }

    public static void decrementingLoop(String[] args) {
        System.out.println("\n");
        for (int decrementing = 6; decrementing > 3; decrementing--) {
            System.out.println("Decrementing integer : " + decrementing);
        }
    }

    public static void arthmeticLoopOperation(String[] args) {
        for (int numericIntegers = 100; numericIntegers != 0; numericIntegers--) {
            System.out.println("Numeric decrementation : " + numericIntegers);
        }
    }
}