//ReversedStrings.java
//AB 02/08/2026
//project for CIT-63


import java.util.Scanner;


public class ReversedStrings {


    static void main(String[] args) {

        System.out.println("\n\n*****Welcome to Reversed Strings*****\n\n");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a statement to reverse: ");
        String original = scanner.nextLine();

        // Variable to hold the reversed string
        String reversed= "";

        // Loop through the string backwards
        // We start at the last index and move toward index 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Output the result
        System.out.println("Reversed statement: " + reversed);

        scanner.close();

    }
}
