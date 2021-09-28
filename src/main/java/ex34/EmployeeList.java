package ex34;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class EmployeeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> list = new ArrayList<String>();

        // adding names to list
        list.add("John Smith");
        list.add("Jackie Johnson");
        list.add("Chris Jones");
        list.add("Amanda Cullen");
        list.add("Jeremy Goodwin");

        System.out.println("There are " + list.size() + " employees:");

        for (String name : list)
            System.out.println(name);

        System.out.print("\nEnter an employee name to remove: ");
        String remove_name = input.nextLine();

        list = removeEmployee(list, remove_name);

        System.out.println("\nThere are " + list.size() + " employees:");

        for (String name : list)
            System.out.println(name);
    }

    // removes desired employee from list
    public static List<String> removeEmployee(List<String> list, String name) {
            int index = list.indexOf(name);
            String removed_name = list.remove(index);
            return list;
        }
}
