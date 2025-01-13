package com.problems.interviewbit;

import java.util.HashMap;

public class FibonacciMemoization {
    private static HashMap<Integer, Integer> memo = new HashMap<>();
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        if (memo.containsKey(n)) {
            return memo.get(n); // Return cached value
        }
        int result = fibonacci(n - 1) + fibonacci(n - 2);
        memo.put(n, result); // Store the computed value
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));
    }
}
