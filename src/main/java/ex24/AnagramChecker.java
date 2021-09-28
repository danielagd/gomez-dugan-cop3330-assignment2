package ex24;
import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class AnagramChecker {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they're anagrams:");

        System.out.print("Enter the first word: ");
        String first_word = input.nextLine();

        System.out.print("Enter the second word: ");
        String second_word = input.nextLine();

        boolean anagram = checkAnagram(first_word, second_word);

        if(anagram)
            System.out.println("\"" + first_word + "\" and " + "\"" + second_word + "\" are anagrams!");
        else
            System.out.println("\"" + first_word + "\" and " + "\"" + second_word + "\" are not anagrams. :(");

    }

    // Function returns true if anagrams, false otherwise
    public static boolean checkAnagram(String one, String two)
    {
        if (one.length() != two.length())
            return false;

        int one_len = one.length();
        int two_len = two.length();

        String first[] = new String[one_len];
        String second[] = new String[two_len];

        for (int i = 0; i < one_len; i++)
        {
            first[i] = one.substring(i, i + 1);
            second[i] = one.substring(i, i + 1);
        }

        Arrays.sort(first);
        Arrays.sort(second);

        for (int i = 0; i < one_len; i++)
        {
            if (!first[i].equals(second[i]))
                return false;
        }

        return true;
    }

}