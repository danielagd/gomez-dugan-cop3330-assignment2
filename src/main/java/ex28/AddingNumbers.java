package ex28;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class AddingNumbers {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        // creates an int array with inputs
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            arr[i] = input.nextInt();
        }

        int sum = findSum(arr);
        System.out.println("The total is " + sum + ".");
    }

    // finds sum of integers in the array
    public static int findSum(int[] arr)
    {
        int sum = 0;
        int len = arr.length;

        for(int i = 0; i < len; i++)
            sum += arr[i];

        return sum;
    }

}
