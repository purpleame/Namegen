package org.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Now enter your last name: ");
        String lastName = input.nextLine();
        System.out.println("Do you have an initial, if so, enter it here: ");
        String middleInitial = input.nextLine();
        System.out.println("Do you also have a suffix?");
        String suffix = input.nextLine();

        String fullName = firstName + " " + middleInitial + ". " + lastName + " " + suffix;
        System.out.println("Your full name is: " + fullName.trim().replaceAll("//s+", " "));

    }
}
