package com.progress.learning.basic.Chapter3;
import java.util.Locale;

public class stringMethods {
    public static void main(String[] args) {
        String NewString = "System string";
        int LengthString = NewString.length();
        System.out.printf("Length of the string is :%d \n", LengthString);
        lowerCaseString(args);
    }

    public static void lowerCaseString(String[] args) {
        String LowerCaseString = new String("Lower Case String");
        String lowerCase = LowerCaseString.toLowerCase(Locale.ROOT);
        System.out.println(lowerCase);
        toUpperCaseString(args);
    }

    public static void toUpperCaseString(String[] args) {
        String UpperCasing = new String("uppercasing string");
        String upperCaseUp = UpperCasing.toUpperCase(Locale.ROOT);
        System.out.println("Upper case string is : " + upperCaseUp);
        trimString(args);
    }

    public static void trimString(String[] args) {
        String nonTrimString = new String("   andy.suppor.korea@gmail.com   ");
        String trimString = nonTrimString.trim();
//      Returns string without any spaces
        System.out.println("String After trimming : " + trimString);
        subString(args);
    }

    public static void subString(String[] args) {
        // Returns the string from an index. Till the end
        String subStringIndex  = new String("Subbed Strings");
        String SubIndexString = subStringIndex.substring(3, 8);
        System.out.println("Now string returns from : " + SubIndexString);
        replaceArgument(args);
    }

    public static void replaceArgument(String[] args) {
        String ReplaceString = "Anshu";
        String ReplacedString = ReplaceString.replace('u', 'i'); // Takes only character
        String ReplaceCharacters = ReplaceString.replace("u", "ika"); // Takes string
        System.out.println("Now New String is : " + ReplaceCharacters);
        startsWithMethod(args);
    }

    public static void startsWithMethod(String[] args) {
        // Returns Boolean Values, True or False
        String startsMethod = new String("Aya Starts, Structure");
        String startsReturn = String.valueOf(startsMethod.startsWith("Aya")); /// Returns True Or false
        System.out.println("Will, it starts : " + startsReturn);
        endsWithMethod(args);
    }

    public static void endsWithMethod(String[] args) {
        String EndsMethod = new String("Java Langs,");
        String endsReturn = String.valueOf(EndsMethod.endsWith("Langs,"));
        System.out.println("Will, it ends : " + endsReturn);
        charactersAt(args);
    }

    public static void charactersAt(String[] args) {
        // What is the character of index[nth_term]. Returns the character number
        String characterReturns = new String("Characters, iteration");
        String character = String.valueOf(characterReturns.charAt(3));
        System.out.println("Character is : " + character);
        indexMethod(args);
    }

    public static void indexMethod(String[] args) {
        // Where is the character in the string... From index lang
        String indexOfReturns = new String("Anshu");
        String characterReturn = String.valueOf(indexOfReturns.indexOf("h")); // Enter your value here not integer
        System.out.println("Given Index Value is : " + characterReturn);

        // Index of Starting method
        String indexStartsReturns = new String("Anshushu");
        String intReturn = String.valueOf(indexStartsReturns.lastIndexOf("shu", 2));
        System.out.println("Returns : " + intReturn);
        lastIndexOf(args);

    }

    public static void lastIndexOf(String[] args) {
        // Where is the character in the string, from end string.
        String lastIndex = "Last index, Manupulationion";
        // String lastIndexReturn = String.valueOf(lastIndex.lastIndexOf("ion"));// Last index Returns
        String lastIndexReturn = String.valueOf(lastIndex.lastIndexOf("ion", 23));// Last index Returns
        System.out.println("Last index return is : " + lastIndexReturn);
        equalsMethod(args);
    }

    public static void equalsMethod(String[] args) {
        String EqualsTo = "Anshu";
        String ifEquals = String.valueOf(EqualsTo.equals("Anshi"));
        System.out.println("Is it equal : " + ifEquals);
        equalsIgnoreCase(args);
    }

    public static void equalsIgnoreCase(String[] args) {
        String EqualsTo = "Anshu";
        String ifEquals = String.valueOf(EqualsTo.equalsIgnoreCase("anshu"));
        System.out.println("Is it equal : " + ifEquals);
        escapeSequence(args);
    }

    public static void escapeSequence(String[] args) {
        System.out.println("Escape backslash \\ new strings");
        System.out.println("Escape new line \nnewline"); // Add new line character
        System.out.println("Escape tab line \t new tab line"); // Add space like a tab
    }
}
