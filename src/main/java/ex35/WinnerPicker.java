package ex35;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class WinnerPicker {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        System.out.print("Enter a name: ");
        String name = input.nextLine();

        // loops until empty input
        while (true)
        {
            list.add(name);
            System.out.print("Enter a name: ");
            name = input.nextLine();

            if(name.equals("") || name.equals(" "))
                break;
        }

        String winner = pickWinner(list);
        System.out.print("The winner is... " + winner);
    }

    // randomly picks a name from list
    public static String pickWinner(List<String> list)
    {
        Random rand = new Random();
        int num = rand.nextInt(list.size());

        return list.get(num);
    }

}
