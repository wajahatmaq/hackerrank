package com.problems.careem;

public class BitCount {

    public static void main(String[] args) {
        int A=2;
        int B=4;

        bitCounter(A,B);

    }

    private static void bitCounter(int A, int B) {

        int result=A*B;
        System.out.println("The number of bits set to 1 in " + result + " is: " + Integer.bitCount(result));
    }
}
