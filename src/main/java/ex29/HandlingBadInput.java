package ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class HandlingBadInput {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean loop = true;

        System.out.print("What is the rate of return? ");
        String rate = input.nextLine();
        int num_rate = 0;

        // loops until finds a valid input
        while (loop)
        {
            if (isNumeric(rate))
            {
                num_rate = Integer.parseInt(rate);

                if (num_rate <= 0)
                    System.out.print("Sorry. That was not a valid input.\n");
                else {
                    // closes loop when rate is valid
                    loop = false;
                    break;
                }

            }

            // not numeric
            else {
                System.out.print("Sorry. That was not a valid input.\n");
            }

            System.out.print("What is the rate of return? ");
            rate = input.nextLine();
        }

        System.out.println("It will take " + (72/num_rate) + " years to double your initial investment.");
    }

    // checks to see if string contains digits
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
