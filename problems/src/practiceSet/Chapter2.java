/**
 * @about; Chapter2 Practice set,
 * @author; anshu
 * */

package practiceSet;

import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {
//        Output of the following expressions.
        float a = (7/4.0f) * (9/2.0f);
        System.out.println(a);
        incrementationResult(args);
    }

    public static void incrementationResult(String[] args) {
        char character = 'B';
        character = (char) (character + 8);
        System.out.println("Real grade encryption : " + character);
        character = (char)(character - 8);
        System.out.println("Fake grade decryption : " + character);
        comparisonOperations(args);
    }

    public static void comparisonOperations(String[] args) {
        Scanner getNumber = new Scanner(System.in);
        System.out.print("The number expression is : ");
        int aVariable = getNumber.nextInt();
        System.out.println(aVariable > 9);
        velocityExpression(args);

    }

    public static void velocityExpression(String[] args) {
        int v = 5, u = 5, a = 5, s = 5;
        int logic = (int) ((int) Math.pow(v, 2) - Math.pow(u, 2)) / (2 * a * s);
        System.out.println(logic);
        algebraExpression(args);
    }

    public static void algebraExpression(String[] args) {
        int x = 7;
        int a = (7 * 49) / 7 + (35/7);
        System.out.println(a);
    }
}
