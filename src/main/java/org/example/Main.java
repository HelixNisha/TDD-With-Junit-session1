package org.example;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the FactorialCalculator
        FactorialCalculator calculator = new FactorialCalculator();

        // Calculate factorial of a number and print the result
        int number = 5; // Change the number to calculate different factorials
        int factorial = calculator.factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}