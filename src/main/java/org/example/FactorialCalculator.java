package org.example;

public class FactorialCalculator {
    public int factorial(int n) {
        // Base case: factorial of 0 and 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Initialize the result to 1
        int result = 1;

        // Calculate the factorial using a loop
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        // Return the factorial result
        return result;
    }
}
