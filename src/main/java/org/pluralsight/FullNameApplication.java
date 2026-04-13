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
        String fullNameNoInitial = firstName + " " + lastName + " " + suffix;


        switch (scannerHandlerInt()) {
            case 1:
                System.out.println("Your full name is: " + fullName.trim().replaceAll("//s+", " "));
                break;
            case 2:
                System.out.println("Your full name is: " + fullNameNoInitial.trim().replaceAll("//s+", " "));
                break;
        }
    }

    public static int scannerHandlerInt() {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Press 1 if you want to keep your initial in the final name, otherwise press 2.");
            if (input.hasNextInt()) {
                choice = input.nextInt();
                if (choice >= 1 && choice <= 2) {
                    break;
                } else {
                    System.out.println("Please put in number 1 or 2.");
                    input.next();
                }
            }
        }
        return choice;
    }
}
