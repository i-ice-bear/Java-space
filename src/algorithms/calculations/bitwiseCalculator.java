package algorithms.calculations;

import java.util.Scanner;

public class bitwiseCalculator {
    public static void main(String[] args) {
        System.out.println("Bitwise calculator ! ");
        Scanner enterBitwise = new Scanner(System.in);

        System.out.print("Enter first modulo : ");
        float bitwiseCalculations = enterBitwise.nextByte();

        System.out.print("Enter second modulo : ");
        float bitwiseVariable2 = enterBitwise.nextByte();

        float outputBitwiseCalculation = (bitwiseCalculations % bitwiseVariable2);
        System.out.println("Output Bitwise Calculation : " + outputBitwiseCalculation);
    }
}
