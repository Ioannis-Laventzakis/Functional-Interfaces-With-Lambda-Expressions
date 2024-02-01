package FactionalInterface;

// This is a functional interface named NumberProcessor.

// Functional interfaces have only one abstract method.
@FunctionalInterface
public interface NumberProcessor {
    // This is the abstract method of the interface.

    // It takes an integer as input and returns an integer.
    int process(int number);
}