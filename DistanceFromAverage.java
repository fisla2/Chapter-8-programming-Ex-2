import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        final int MAX_VALUES = 15;
        final double SENTINEL = 99999;
        double[] numbers = new double[MAX_VALUES];
        int count = 0;
        double total = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter up to 15 double values (enter 99999 to quit):");

        while (count < MAX_VALUES) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            double value = input.nextDouble();

            if (value == SENTINEL) {
                break;
            }

            numbers[count] = value;
            total += value;
            count++;
        }

        if (count == 0) {
            System.out.println("Error: No values were entered.");
        } else {
            double average = total / count;
            System.out.println("\nYou entered " + count + " numbers.");
            System.out.println("Average: " + average);

            System.out
