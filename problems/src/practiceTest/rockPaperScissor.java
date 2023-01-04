/**
 * TODO: Rock Paper Scissor
 * */

package practiceTest;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissor {
    static int randomValue;
    static int getValue;
    public static void generateRandomValue() {
        int playerPlay = 5;
        int playerPoint = 0;
        while (true){
            Random valueGenerate = new Random();
            Scanner getInput = new Scanner(System.in);
            System.out.print("Choose Value : ");
            getValue = getInput.nextInt();
            if (getValue > 3 || getValue < 0){
                System.out.print("Give another input : ");
                getValue = getInput.nextInt();
            }
            switch (randomValue) {
                case (0) -> {
                    System.out.println("Rock");
                    playerPlay -= 1;
                }
                case (1) -> {
                    System.out.println("Paper");
                    playerPlay -= 1;
                }
                case (2) -> {
                    playerPlay -= 1;
                    System.out.println("Scissor");
                }
                default -> {
                    playerPlay -= 1;
                    System.out.println("Undef' Value");
                }
            }
            if (getValue == randomValue){
                System.out.println("You got a point");
                playerPlay -= 1;
                playerPoint += 1;
            } else if (playerPlay == 0 || playerPlay < 0){
                System.out.println("You're out of the chance");
                break;
            }
            randomValue = valueGenerate.nextInt(0, 3);
        }
    }
    public static void main(String[] args) {
        generateRandomValue();
    }
}