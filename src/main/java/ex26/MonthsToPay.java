package ex26;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class MonthsToPay {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance = input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr = input.nextDouble() / 100.0;

        System.out.print("What is the monthly payment you can make? ");
        double monthly = input.nextDouble();

        int numOfMonths = PaymentCalculator.calculateMonthsUntilPaidOff(balance, apr, monthly);

        System.out.println("It will take " + numOfMonths + " months to pay off this card.");
    }
}

class PaymentCalculator
{
    // Calculates the month until payment is paid off
    public static int calculateMonthsUntilPaidOff(double b, double i, double p)
    {
        double n = 0;
        i = i / 365.0;

        n = -(1/30.0) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i);

        // rounds to nearest int
        int new_n = (int) Math.ceil(n);

        return new_n;
    }

}

