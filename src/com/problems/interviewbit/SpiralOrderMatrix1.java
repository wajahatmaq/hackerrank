package com.problems.interviewbit;

public class SpiralOrderMatrix1 {

    public static int[] spiralOrder(final int[][] A) {
        int len=A.length*A[0].length;
        int[] arr = new int[len];
        int k=0;
        for(int i=0; i<A.length; i++){
            for(int j=0; j<A[0].length; j++){

                System.out.println(A[i][j]);
                arr[k]=A[i][j];
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        int[][] matrix3 = {
                {1}
        };
        spiralOrder(matrix);
    }
}
