package ex27;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Daniela Gomez-Dugan
 */

public class ValidatingInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String prompt;

        System.out.print("Enter the first name: ");
        String first_name = input.nextLine();

        System.out.print("Enter the last name: ");
        String last_name = input.nextLine();

        System.out.print("Enter the ZIP code: ");
        String zip_code = input.nextLine();

        System.out.print("Enter the employee ID: ");
        String id = input.nextLine();

        prompt = validateInput(first_name, last_name, zip_code, id);

        System.out.print(prompt);
    }

    // creates a prompt based on inputs
    public static String validateInput(String f, String l, String z, String id) {
        String r = "";

        // Checks first name length
        if (f.length() < 2)
            r += "The first name must be at least 2 characters long.\n";
        // checks if first name is empty
        if (f.equals(""))
            r += "The first name must be filled in.\n";

        // Checks last name length
        if (l.length() < 2)
            r += "The last name must be at least 2 characters long.\n";
        // checks if last name is empty
        if (l.equals(""))
            r += "The last name must be filled in.\n";

        // checks ID
        for (int i = 0; i < id.length(); i++) {
            // check if id has letters in correct places
            if (i == 0 || i == 1){
                if (id.charAt(i) <= 'A' || id.charAt(i) >= 'Z'){
                    r += "The employee ID must be in format of AA-1234.\n";
                    break;
                }
            }
            // checks if id has hypen in correct place
            else if (i == 2 && !((id.charAt(i)) == '-')) {
                r += "The employee ID must be in format of AA-1234.\n";
                break;
            }
            // check if id has numbers in correct places
            else if ((i == 3 || i == 4 || i == 5 || i == 6) && !(id.charAt(i) >= '0' && id.charAt(i) <= '9')) {
                r += "The employee ID must be in format of AA-1234.\n";
                break;
            }
        }

        // checks if zip code is empty
        if (z.equals(""))
            r += "The zipcode must be filled in.\n";
        else {
            // checks if zip code is 5 digits
            for (int i = 0; i < z.length(); i++)
                if (!(z.charAt(i) >= '0' && z.charAt(i) <= '9')) {
                    r += "The zipcode must be a 5 digit number.\n";
                    break;
                }
        }

        if (r.length() == 0)
            r = "There were no errors found.";

        return r;
    }
}
