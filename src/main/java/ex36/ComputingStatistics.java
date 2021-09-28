package ex36;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class ComputingStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter a number: ");
        String number = input.nextLine();

        // loops until user inputs done
        while (true) {
            if (isNumeric(number)) {
                int num = Integer.parseInt(number);
                list.add(num);
                System.out.print("Enter a number: ");
                number = input.nextLine();
            }

            else if (number.equals("done"))
                break;
        }

        System.out.print("Numbers: ");

        for (int n = 0; n < list.size(); n++)
        {
            if (n == list.size() - 1)
                System.out.println(list.get(n));
            else
                System.out.print(list.get(n) + ", ");
        }

        double avg = average(list);
        int min = min(list);
        int max = max(list);
        double std = std(list);

        System.out.printf("The average is %.2f\n",  avg);
        System.out.println("The minimum is " + min);
        System.out.println("The maximum is " + max);
        System.out.printf("The standard deviation is %.2f", std);
    }

    // checks if string has numerical values
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

    // calculates average of list
    public static double average(List<Integer> list)
    {
        double len = list.size();
        double avg = 0.0;

        for (int i = 0; i < len; i++)
            avg += list.get(i);

        return avg/len;
    }

    // calculate min value of list
    public static int min(List<Integer> list)
    {
        int len = list.size();
        int min = list.get(0);

        for (int i = 0; i < len; i++)
            if (list.get(i) < min)
                min = list.get(i);

        return min;
    }

    // calculate max value of list
    public static int max(List<Integer> list)
    {
        int len = list.size();
        int max = list.get(0);

        for (int i = 0; i < len; i++)
            if (list.get(i) > max)
                max = list.get(i);

        return max;
    }

    // calculate standard deviation of list
    public static double std(List<Integer> list)
    {
        int len = list.size();
        double std = 0;
        double avg = average(list);

        for (int i = 0; i < len; i++)
        {
            std += Math.pow(list.get(i) - avg, 2);
        }

        std /= len;
        std = Math.sqrt(std);

        return Math.round(std * 100.0) / 100.0;
    }


}
