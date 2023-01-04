/**
 * TODO: Create a rock, paper, sissor, with computer winner
 * */

package practiceTest;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class rockPaperSissor {
    static int randomGenerator;
    public static void randomValueGenerator(){
        while (true) {
            Random randNumber = new Random();
            int getRandomNumber;
            getRandomNumber = randNumber.nextInt(3);
            randomGenerator = getRandomNumber;
            AtomicInteger computerDecision = new AtomicInteger(getRandomNumber);
        }
        System.out.println(randomGenerator);
    }
    public static int generateNumber() {

        switch (randomGenerator){
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
        return randomGenerator;
    }

    public static void main(String[] args) {
        logicLevel();
    }
    static void logicLevel(){
        int generateNums = generateNumber();
        System.out.println("Computer, decided Now it's your turn");
        int playedPoint = 5;
        int playerPoint = 0;
        while (true){
            Scanner getPlayerInput = new Scanner(System.in);
            System.out.println("Choose 0. Rock 1. Paper 2. Sissor");
            System.out.print("Ayo, Enter now : ");
            int playerInput = getPlayerInput.nextInt();
            System.out.println(playerInput);

            if (playerInput == generateNums){
                System.out.println("You rock! You played");
                playerPoint += 1;
                playedPoint -= 1;
                System.out.println("You have " + playerPoint + " points");
            }if (playerPoint > 5){
                System.out.println("Congrats, you cleared");
                break;
            } else if (playedPoint == 0){
                System.out.println("You're out of chance, ");
                System.out.println("Bye");
                break;
            }
            else {
                System.out.println("Play again : ");
            }
        }
    }
}
