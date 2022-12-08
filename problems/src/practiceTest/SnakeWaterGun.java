/**
 * TODO: Create a rock, paper, sissor, with computer winner
 * */

package practiceTest;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SnakeWaterGun {
    static int generateNumber() {
        Random randNumber = new Random();
        int getRandomNumber = randNumber.nextInt(3);
        AtomicInteger computerDecision = new AtomicInteger(getRandomNumber);
        System.out.println(computerDecision.get());

        switch (getRandomNumber){
            case (0) ->{
                System.out.println("Rock!!!");
            } case (1)->{
                System.out.println("Paper!!!");
            } case (2) ->{
                System.out.println("Sissor!!!");
            }default -> {
                System.out.println("Can't, decided");
            }
        }
        return getRandomNumber;
    }

    public static void main(String[] args) {
        int generateNums = generateNumber();
        System.out.println("Computer, decided Now it's your turn");
    }
}
