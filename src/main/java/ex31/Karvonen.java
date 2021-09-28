package ex31;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class Karvonen {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Resting pulse: ");
        String pulse = input.nextLine();

        // runs until a number is inputted
        while (!isNumeric(pulse)) {
            System.out.print("That input was invalid. What is the resting pulse? ");
            pulse = input.nextLine();
        }

        int num_pulse = Integer.parseInt(pulse);

        System.out.print("Age: ");
        String age = input.nextLine();

        // runs until a number is inputted
        while (!isNumeric(age)) {
            System.out.print("That input was invalid. What is your age? ");
            age = input.nextLine();
        }

        int num_age = Integer.parseInt(age);

        System.out.println("\nIntensity\t| Rate");
        System.out.println("------------|--------");

        double rate = 0;

        // prints table
        for (int i = 55; i < 100; i = i + 5)
        {
            rate = getRate(num_age, i, num_pulse);
            System.out.println(i + "%\t\t\t| " + rate + " bpm");
        }
    }

    // calculates the rate
    public static double getRate(int age, int intensity, int pulse)
    {
        double r =  (((220 - age) - pulse) * (intensity / 100.0)) + pulse;
        return Math.round(r);
    }

    // checks if string has numeric values
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
