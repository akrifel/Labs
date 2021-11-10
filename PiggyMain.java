
/*
* Project:  Lab2 Pig Latin
* Class: Piggymain
* Author:    Ariel Khavasov
* Date:     April 15, 2014
* This program takes a word and turns it into Pig Latin
*/
import java.io.Console;
import java.util.*;

public class PigLatin {
    static boolean isVowel(char ch) {
        if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u') {
            return true;
        } else {
            return false;

        }
    }

    // method that converts a word or string into Pig Latin
    static String pigLatinWord(String string) {
        int stringlength = string.length();
        int index = -1;
        for (int i = 0; i < stringlength; i++) {
            if (isVowel(string.charAt(i))) {
                index = i;
                break;
            }
        }
        // Pig Latin is possible only if vowels is present and this checks that
        if (index == -1)
            return "-1";
        return string.substring(index) + string.substring(0, index) + "ay";
    }

    public static void main(String args[]) {
        // Scanner to check input
        Scanner sonsole = new Scanner(System.in);
        System.out.println("Please Type a word that will be turned into pig latin");
        // piglatin word was shortend to piggyword
        String piggyWord = sonsole.nextLine();
        String turnedWord = pigLatinWord(piggyWord);
        if (turnedWord == "-1") {
            System.out.println(piggyWord + " Cannot Be Made into Piglatin");
            System.out.println("Try Another Word");
        } else {
            System.out.println(piggyWord + " Is " + turnedWord + " In Pig Latin");
        }
    }
}
