package ex38;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class FilteringValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: " );
        String numbers = input.nextLine();

        String[] a = numbers.split(" ");

        int[] arr = new int[a.length];

        for (int i = 0; i < a.length; i++)
        {
            int num = Integer.parseInt(a[i]);
            arr[i] = num;
        }

        int[] new_arr = filterEvenNumbers(arr);

        System.out.print("The even numbers are ");

        // -1 = not used or changed
        for (int num: new_arr)
            if (num != -1)
                System.out.print(num + " ");
    }

    // adds only even numbers into new string
    public static int[] filterEvenNumbers(int[] arr)
    {
        int[] new_arr = new int[arr.length];

        for(int i = 0; i < new_arr.length; i++)
            new_arr[i] = -1;

        int i = 0;

        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] % 2 == 0)
            {
                new_arr[i] = arr[j];
                i++;
            }
        }

        return new_arr;
    }

}
