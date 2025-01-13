package com.problems.turing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterDistance {

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'e';
        int[] arr = null;
        arr = findMinimumDistance(s, c);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] findMinimumDistance(String s, char c) {
        int n = s.length();
        int[] minDis = new int[n];

        int cPosition = -n;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cPosition = i;
                //minDis[i] = 0;
            }
            minDis[i] = i - cPosition;
        }

        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                cPosition = i;
            }
            minDis[i] = Math.min(minDis[i], Math.abs(i - cPosition));
        }

        return minDis;
    }
}
