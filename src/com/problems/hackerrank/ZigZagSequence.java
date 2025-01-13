package com.problems.hackerrank;

import java.util.Arrays;

public class ZigZagSequence {
    public static void main(String[] args) throws java.lang.Exception {
        int[] singleDimArray = {1, 2, 3, 4, 5, 6, 7};
        findZigZagSequence(singleDimArray, 7);
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a);
        int mid = (n - 1) / 2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int start = mid + 1;
        int end = n - 2;
        while (start <= end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start = start + 1;
            end = end -1;
        }
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
