package FactionalInterface;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        NumberProcessor doubler = number -> number * 2;
        NumberProcessor squarer = number -> number * number;
        NumberProcessor incrementer = number -> number + 1;

        for (int number : numbers) {
            System.out.println("Original: " + number);
            System.out.println("Doubled: " + doubler.process(number));
            System.out.println("Squared: " + squarer.process(number));
            System.out.println("Incremented: " + incrementer.process(number));
            System.out.println();
        }
    }
}