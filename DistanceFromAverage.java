// Name: Faria Islam
// A Number: A01186565
// File: DistanceFromAverage.java

import java.util.Scanner; // Import the Scanner class for user input

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_VALUES = 15;        // Maximum number of double values allowed
        final double SENTINEL = 99999;    // Sentinel value to quit entering numbers
        double[] numbers = new double[MAX_VALUES]; // Array to store user inputs
        int count = 0;                    // Counter for how many valid numbers were entered
        double total = 0;                 // Sum of all entered numbers

        Scanner input = new Scanner(System.in); // Create Scanner object for input

        // Prompt the user to enter up to 15 double values
        System.out.println("Enter up to 15 double values (enter 99999 to quit):");

        // Loop to accept values until the count reaches 15 or the sentinel is entered
        while (count < MAX_VALUES) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            double value = input.nextDouble(); // Read user input

            if (value == SENTINEL) {
                break; // Exit the loop if sentinel is entered
            }

            numbers[count] = value; // Store the value in the array
            total += value;         // Add the value to the total
            count++;                // Increment the count
        }

        // Check if any valid numbers were entered
        if (count == 0) {
            // Display error if no values were entered before quitting
            System.out.println("Error: No values were entered.");
        } else {
            double average = total / count; // Calculate the average
            System.out.println("\nYou entered " + count + " numbers.");
            System.out.println("Average: " + average);

            // Display each number and its distance from the average
            System.out.println("\nNumber\tDistance from Average");
            for (int i = 0; i < count; i++) {
                double distance = Math.abs(numbers[i] - average); // Calculate distance
                System.out.println(numbers[i] + "\t" + distance); // Print value and distance
            }
        }

        input.close(); // Close the Scanner object
    }
}
