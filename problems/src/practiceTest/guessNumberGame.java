/***
 * * Create a random number guess class game, which allows to play "Guess-the-number"
 * * Game Should have these following methods....!
 * *    Constructor : to generate random number...
 * *    takeUserInput() : to get the user input...
 * *    isCorrectNumber() : detect, whether the number is entered by the user is true...
 * *    TODO: Properties
 * *        @ noOfGuesses:
 * *        @ getters and setters of noOfGuesses.
 * * */

package practiceTest;
import java.util.Random;
import java.util.Scanner;

class GuessNumber {
    private final int randomNumber;
    private final int userInput;
    private String playerName;

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getUserInput() {
        Scanner getInput = new Scanner(System.in);
    }

    public void isCorrectNumber() {
        while (true){
            if (randomNumber > userInput && userInput != 0){
                System.out.println("Short Input ! , Try Again");
            } else if (randomNumber < userInput) {
                System.out.println("Big input!, Try again");
            } else{
                System.out.println("Error, Encountered");
            }
        }
    }
    GuessNumber(int randomNumber, int userInput) {
        this.randomNumber = randomNumber;
        this.userInput = userInput;
    }
}
public class guessNumberGame {
    public static void main(String[] args) {

        Random randomNumber = new Random();
        int getRandomInt = randomNumber.nextInt(1, 100);
        GuessNumber playGame = new GuessNumber(getRandomInt, 23);
        Scanner setPlayerName = new Scanner(System.in);
        System.out.println("Enter your name : ");
        playGame.setPlayerName(setPlayerName.nextLine());
    }
}