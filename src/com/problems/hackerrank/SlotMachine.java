package com.problems.hackerrank;
import java.util.HashSet;
import java.util.Set;

public class SlotMachine {

    public static int calculateMinStops(String[] spins) {
        int totalStops = 0;

        // Iterate through each spin
        for (String spin : spins) {
            Set<Character> uniqueNumbers = new HashSet<>();

            // Iterate through each digit of the spin to identify unique numbers
            for (char num : spin.toCharArray()) {
                uniqueNumbers.add(num);
            }

            // Add the number of unique numbers to the total stops
            totalStops += uniqueNumbers.size();
        }

        return totalStops;
    }

    public static void main(String[] args) {
        String[] spins = {"712", "246", "365", "312"};
        int totalStops = calculateMinStops(spins);

        System.out.println("Total stops: " + totalStops);
    }
}