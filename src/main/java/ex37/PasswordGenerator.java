package ex37;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class PasswordGenerator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int len = input.nextInt();

        System.out.print("How many special characters? ");
        int special = input.nextInt();

        System.out.print("How many numbers? ");
        int numbers = input.nextInt();

        // prompts until letters is the same amount as special + numbers
        while ((len - (special + numbers)) != (special + numbers))
        {
            System.out.println("Sorry, those values were invalid. Try again!\n");
            System.out.print("What's the minimum length? ");
            len = input.nextInt();

            System.out.print("How many special characters? ");
            special = input.nextInt();

            System.out.print("How many numbers? ");
            numbers = input.nextInt();
        }

        String result = makePassword(len, special, numbers);

        System.out.println("Your password is " + result);
    }

    // creates a randomized password for user
    public static String makePassword(int len, int special, int numbers)
    {
        String[] alpha = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] s_char = {"!", "&", "$", "#", "%", "*", "-", "_", "@", "+", "=", "?", "<", ">", "~", "/"};

        String[] password = new String[len];
        int letters = special + numbers;

        // Adding the letters
        for (int i = 0; i < letters; i++)
        {
            Random rand = new Random();
            int rand_int = rand.nextInt(alpha.length);
            password[i] = alpha[rand_int];
        }

        // Adding the numbers
        for (int i = letters; i < letters + numbers; i++)
        {
            Random rand = new Random();
            int rand_int = rand.nextInt(num.length);
            password[i] = num[rand_int];
        }

        // Adding the special characters
        for (int i = letters + numbers; i < len; i++)
        {
            Random rand = new Random();
            int rand_int = rand.nextInt(s_char.length);
            password[i] = s_char[rand_int];
        }

        // Shuffle password
        for (int i = 0; i < len; i++)
        {
            Random rand = new Random();
            int rand_int = rand.nextInt(len);

            String temp = password[rand_int];
            password[rand_int] = password[i];
            password[i] = temp;
        }

        // Convert into String
        String s = "";

        for (int i = 0; i < len; i++)
            s += password[i];

        return s;
    }
}
