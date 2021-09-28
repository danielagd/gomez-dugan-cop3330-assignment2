package ex39;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class SortingRecords {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] last_name = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        String last_and_first = "";
        Map<String, Employee> employees = new HashMap<>();

        // creating list
        employees.put(last_name[0], new Employee("John", last_name[0], "Manager", "2016-12-31"));
        employees.put(last_name[1], new Employee("Tou", last_name[1], "Software Engineer", "2016-10-05"));
        employees.put(last_name[2], new Employee("Michaela", last_name[2], "District Manager", "2015-12-19"));
        employees.put(last_name[3], new Employee("Jake", last_name[3], "Programmer", ""));
        employees.put(last_name[4], new Employee("Jacquelyn", last_name[4], "DBA", ""));
        employees.put(last_name[5], new Employee("Sally", last_name[5], "Web Developer", "2015-12-18"));

        // sorting list by TreeMap
        TreeMap<String, Employee> sorted = new TreeMap<>(employees);

        System.out.println("Name\t\t\t\t|Position\t\t\t|Separation Date");
        System.out.println("--------------------|-------------------|-------------------");

        // print table
        for(Map.Entry<String, Employee> person: sorted.entrySet())
        {
            last_and_first = person.getValue().getFirstName() + " " + person.getKey();
            System.out.printf("%-20s| %-18s| %-20s\n", last_and_first, person.getValue().getPosition(), person.getValue().getSeparationDate());
        }
    }
}

class Employee
{
    private String first;
    private String last;
    private String position;
    private String date;

    public Employee(String first, String last, String position, String date)
    {
        this.first = first;
        this.last = last;
        this.position = position;
        this.date = date;
    }

    public String getFirstName() {
        return first;
    }

    public String getPosition() {
        return position;
    }

    public String getSeparationDate() {
        return date;
    }
}

