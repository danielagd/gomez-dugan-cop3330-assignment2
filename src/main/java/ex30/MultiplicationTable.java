package ex30;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class MultiplicationTable {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int[][] arr = new int[12][12];

        arr = makeTable();

        // prints the table
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // creates a 2d array with the table values
    public static int[][] makeTable()
    {
        int[][] arr = new int[12][12];

        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                arr[i-1][j-1] = i * j;
            }
        }

        return arr;
    }

}
