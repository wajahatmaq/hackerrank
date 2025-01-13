package com.problems.interviewbit;

public class ComplexityCode {
    public static void main(String[] args) {
        int N=2;
        int count = 0;
        for (int i = N; i > 0; i /= 2) {
            for (int j = 0; j < i; j++) {
                count += 1;
            }
        }


    }
}
