// File: PalindromeCheckerApp.java

import java.util.Scanner;

public class PalindromeCheckerApp {

    // Entry point of the application
    public static void main(String[] args) {

        // UC1: Application Entry & Welcome Message
        System.out.println("=======================================");
        System.out.println("   Welcome to Palindrome Checker App   ");
        System.out.println("=======================================");
        System.out.println("Application Name : PalindromeChecker");
        System.out.println("Application Version : 1.0");
        System.out.println("---------------------------------------");
        System.out.println("This application validates whether a given string");
        System.out.println("is a palindrome under different conditions.");
        System.out.println("---------------------------------------");

        // UC2: Accept user input and check palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = scanner.nextLine();

        // Normalize input: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(normalized).reverse().toString();

        // Check palindrome condition
        if (normalized.equals(reversed)) {
            System.out.println("Result: \"" + input + "\" is a palindrome!");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a palindrome.");
        }

        // Close scanner
        scanner.close();
    }
}
