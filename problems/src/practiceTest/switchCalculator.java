package practiceTest;

import java.util.Scanner;

public class switchCalculator {
    public static void main(String[] args) {
        float number1, number2;
        char character;

        Scanner getNumber1 = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        number1 = getNumber1.nextFloat();
        System.out.print("Enter number 2 : ");
        number2 = getNumber1.nextFloat();

        System.out.println("Choose [ + | * | - ]");
        System.out.println("Choose [ / | ~ | % ]");
        System.out.println("\tif you want to use floor division use : (~) sign");

        Scanner getCharacter = new Scanner(System.in);
        System.out.print("Enter mathmetical character : ");
        character = getCharacter.next().charAt(0);


        switch (character) {
            case ('+') -> {
                int output = (int) (number1 + number2);
                System.out.println("The sum via addition is : " + output);
            }
            case ('-') -> {
                int output = (int) (number1 - number2);
                System.out.println("The sum via subtraction is : " + output);
            }
            case ('*') -> {
                int output = (int)(number1 * number2);
                System.out.println("The sum via multiplication is : " + output);
            }
            case ('/') ->{
                int output = (int) (number1 / number2);
                System.out.println("The sum via division is : " + output);
            }
            case ('%') ->{
                int output = (int) (number1 % number2);
                System.out.println("The sum via modulo remainder is : " + output);
            }
            case ('~') ->{
                int output = (int) Math.floor(number1 / number2);
                System.out.println("The sum of numbers is : " + output);
            }
            default -> System.out.println("No casing works");
        }
    }
}
