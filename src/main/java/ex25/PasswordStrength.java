package ex25;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the password? ");
        String password = input.nextLine();

        int strength = PasswordChecker.passwordValidator(password);

        // very weak - 1 | weak - 2 | strong - (2+1+4) = 7 | v strong - (2+1+4+3) = 10

        if (strength == 1)
            System.out.println("The password \"" + password + "\" is a very weak password.");
        else if (strength == 2)
            System.out.println("The password \"" + password + "\" is a weak password.");
        else if (strength == 7)
            System.out.println("The password \"" + password + "\" is a strong password.");
        else if (strength == 10)
            System.out.println("The password \"" + password + "\" is a very strong password.");
    }
}

class PasswordChecker {

        public static int passwordValidator(String pass) {
            // +4 - eight characters
            // +2 - has letters
            // +1 - has numbers
            // +3 - has special character

            int strength = 0;
            int num = 0;
            int alpha = 0;
            int special = 0;
            int len = pass.length();

            if (len >= 8)
                strength += 4;

            for (int i = 0; i < len; i++) {
                // checks # of numbers
                if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
                    num += 1;
                // checks # of letters
                else if ((pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z') || (pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z'))
                    alpha += 1;
                else
                    //checks # of special characters
                    special += 1;
            }

            if (num != 0)
                strength += 1;
            if (alpha != 0)
                strength += 2;
            if (special != 0)
                strength += 3;

            return strength;
        }
    }

