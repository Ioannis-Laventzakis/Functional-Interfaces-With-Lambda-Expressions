package FactionalInterface;

@FunctionalInterface
public interface NumberProcessor {
    int process(int number);

    NumberProcessor doubler = number -> number * 2;
NumberProcessor squarer = number -> number * number;
NumberProcessor incrementer = number -> number + 1;
}