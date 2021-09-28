package ex33;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class Magic8 {
    public static void main(String[] agrs)
    {
        Scanner input = new Scanner(System.in);

        String[] prompts = {"Yes.", "No.", "Ask again later."};

        System.out.println("What's your question? ");
        String question = input.nextLine();

        String str = getPrompt(prompts);

        System.out.print(str);
    }

    // randomly chooses a prompt to print
    public static String getPrompt(String[] arr)
    {
        Random rand = new Random();
        int num = rand.nextInt(3);

        return arr[num];
    }
}
