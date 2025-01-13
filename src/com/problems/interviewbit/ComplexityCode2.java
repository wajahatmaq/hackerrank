package com.problems.interviewbit;

public class ComplexityCode2 {

    public static void main(String[] args) {
        int i, j = 0, k = 0;
        int n=4;
        for (i = n/2; i <= n; i++) {
            for (j = 2; j <= n; j = j * 2) {
                k = k + n/2;
            }
        }
        System.out.println("i= "+i);
        System.out.println(" j="+j+ " k="+k);

    }
}
