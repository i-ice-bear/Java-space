package practiceSet;

import java.util.Locale;
import java.util.Scanner;

public class Chapter3 {
    public static void main(String[] args) {
        //Problem 1 : Uppercasing string conversion to lowercasing conversion;
        String upperCaseString = "THE UPPERCASING STRING";
        String lowerCasingString = upperCaseString.toLowerCase(Locale.FRENCH);
        System.out.println(lowerCasingString);

        //Problem 2 : Replace of string from underscore,
        String UnderScoreString = "  Underscored String  ";
        String underScorred = UnderScoreString.replace(" ", "_");
        System.out.println(underScorred);

        //Problem 3 : Replace name to a string. ( Regex Replacement )
        Scanner inputName = new Scanner(System.in);
        System.out.print("Enter your name Please : ");
        String nameInput = inputName.nextLine();
        String replacingString = "Dear, <|name|>, Thank you buddy, for all, <|name|>";
        replacingString = replacingString.replace("<|name|>", nameInput);
        System.out.println("Now replaced string is : " + replacingString);

        //Problem 4 : Program to detect double and triple spaces
        String indexStringSpaces = "The   Method  this  set  space  formatting string spaces  for  all";
        indexStringSpaces = String.valueOf(indexStringSpaces.indexOf("   "));
        String doubeSpaceString = String.valueOf((indexStringSpaces.indexOf("  ")));
        System.out.println("Tripe spacing at : " + indexStringSpaces + " Index");
        System.out.println("Double spacing at : " + doubeSpaceString + " Index");

        //Problem 5 : Format string with the help of the escape sequence characters.
        String letter = "Dear Harry,\n\t This java course is awesome,\n\t Thank you!";
        System.out.println("Now word by word letters are : " + letter);
    }
}
