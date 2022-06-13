package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Pokerchips {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(50);
        arr.add(25);
        arr.add(10);
        arr.add(5);
        arr.add(1);

        pokerChips(arr);
    }

    private static void pokerChips(List<Integer> arr) {

        double numberOfChips = 0;
        double totalNumberOfChips = 0;
        int totalAmount = 126;

        for (int i = 0; i < arr.size(); i++) {

            if (Math.floor(totalAmount / arr.get(i)) >= 1) {
                numberOfChips = Math.floor(totalAmount / arr.get(i));
                totalAmount = (int) (totalAmount - (numberOfChips * arr.get(i)));
                totalNumberOfChips += numberOfChips;
            }
        }
        System.out.println(totalNumberOfChips);
    }

}
