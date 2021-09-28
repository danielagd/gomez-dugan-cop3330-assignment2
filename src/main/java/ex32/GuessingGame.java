package ex32;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Let's play Guess the Number!");

        boolean response = playGame();

        // plays game until user inputs N
        while (response) {
            response = playGame();
        }

        System.out.print("Thank you for playing!");
    }

    public static boolean playGame() {
        Scanner input = new Scanner(System.in);
        Scanner a_input = new Scanner(System.in);

        int max = 10;

        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        int level = input.nextInt();

        // changes upperbound of random number
        max *= level;

        Random rand = new Random();
        int num = rand.nextInt(max) + 1;

        System.out.print("I have my number. What's your guess? ");
        int guess = input.nextInt();
        int num_guesses = 1;

        while (guess != num) {
            if (guess < num) {
                num_guesses += 1;
                System.out.print("Too low. Guess again: ");
                guess = input.nextInt();
            } else if (guess > num) {
                num_guesses += 1;
                System.out.print("Too high. Guess again: ");
                guess = input.nextInt();
            } else {
                num_guesses += 1;
                break;
            }
        }

        System.out.println("You got it in " + num_guesses + " guesses!\n");

        System.out.print("Do you wish to play again (Y/N)? ");
        String response = a_input.nextLine();

        if (response.equals("y") || response.equals("Y"))
            return true;
        return false;
    }

    // checks to see if string has numeric values
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}