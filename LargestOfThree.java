//LargestOfThree.java
//AB 02/08/2026
//project for CIT-63

import java.util.Scanner;


public class LargestOfThree {
    static void main(String[] args) {
        System.out.println("\n\n*****Welcome to Largest Of Three!*****\n\n");

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        //Collect input from user of three integers
        System.out.println("Enter Three Numbers To Find the Lagest");
        System.out.println("\nFirst Number: ");
        int num1 = scanner.nextInt();
        System.out.println("\nSecond Number: ");
        int num2 = scanner.nextInt();
        System.out.println("\nThird Number: ");
        int num3 = scanner.nextInt();

        int largest;

        //use nested if statements to find the Largest
        if (num1 >=num2) {
           if (num1 >= num3) {
               largest = num1;
           } else  {
               largest = num3;
           }

        }  else {
            if (num2 >= num3) {
               largest = num2;
            } else   {
                largest = num3;
            }
        }

        //Provide results back to the user
        System.out.println("The Largest Number: " + largest);

        scanner.close();






    }
}
