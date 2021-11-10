
/*
* Project:  Guessing Game Lab
* Class: GuessingGame.java
* Author:    Ariel Khavasov
* Date:     October 15, 2021
* This program makes a guessing game
*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    static int numOfGuesses;
    static int totalGuesses;
    static int totalGames;
    static int maxGuesses;
    static boolean win = false;

    public static void instructions() {

        System.out.println("This program allows you to play a guessing game. ");
        System.out.println(
                "For each guess, I will think of a number between 1 and 100 and will allow you to guess until you get it.");
        System.out.println("I will tell you whether the right answer is higher or lower than your guess.");

    }

    public static void main(String[] args) {
        Scanner sonsole = new Scanner(System.in);
        instructions();

        while (!win) {
            playGame();
            totalGuesses += numOfGuesses;
            System.out.println("Do you want to play again?");
            String ch = sonsole.next();
            if (ch.equals("y") || ch.equals("yes") || ch.equals("Yes") || ch.equals("Y") || ch.equals("ye")) {
                win = false;

            } else if (ch.equals("N") || ch.equals("No") || ch.equals("no") || ch.equals("n")) {
                returnStats(totalGames, totalGuesses, maxGuesses);
            }
        }

    }

    static void returnStats(int totalGames, int totalGuesses, int maxGuesses) {
        System.out.println("Overall Results: ");
        System.out.println("\t total games\t= " + totalGames);
        System.out.println("\t total guesses\t= " + totalGuesses);
        System.out.println("\t guesses/game\t=" + totalGuesses / totalGames);
        System.out.println("\t max guesses\t=" + maxGuesses);
        return;
    }

    static void playGame() {
        int max = 100;
        Random ran = new Random();
        int numToGuess = ran.nextInt(max) + 1;
        Scanner console = new Scanner(System.in);
        System.out.println("I'm thinking of a number...");
        System.out.println("Your Guess? ");
        numOfGuesses = 0;
        boolean localWin = false;
        do {

            int guess = console.nextInt();
            if (guess > numToGuess) {
                System.out.println("Lower");
                numOfGuesses++;
            } else if (guess < numToGuess) {
                System.out.println("Higher");
                numOfGuesses++;
            } else {
                numOfGuesses++;
                totalGames++;
                if (numOfGuesses > maxGuesses) {
                    maxGuesses = numOfGuesses;
                }

                System.out.println("You got it right in " + numOfGuesses + " guesses");

                win = true;

                localWin = true;
                break;
            }

        } while (!localWin);

    }
}