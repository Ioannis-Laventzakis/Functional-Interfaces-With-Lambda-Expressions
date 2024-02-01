package FactionalInterface;

public class Main {
    public static void main(String[] args) {
        // Define an array of integers to be processed.
        int[] numbers = {1, 2, 3, 4, 5};

        // Create a NumberProcessor instance using a lambda expression to double a number.
        NumberProcessor doubler = number -> number * 2;

        // Create a NumberProcessor instance using a lambda expression to square a number.
        NumberProcessor squarer = number -> number * number;

        // Create a NumberProcessor instance using a lambda expression to increment a number by one.
        NumberProcessor incrementer = number -> number + 1;

        // Loop through each number in the array.
        for (int number : numbers) {
            // Print the original number.
            System.out.println("Original: " + number);

            // Print the result of doubling the number.
            System.out.println("Doubled: " + doubler.process(number));

            // Print the result of squaring the number.
            System.out.println("Squared: " + squarer.process(number));

            // Print the result of incrementing the number.
            System.out.println("Incremented: " + incrementer.process(number));

            // Print a blank line for readability.
            System.out.println();
        }
    }
}