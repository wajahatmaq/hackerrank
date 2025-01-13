package com.problems.interviewbit;

import java.util.Arrays;

public class PrettyPrint {

    public static void main(String[] args) {
        int a[][];
        int n=4;
        a=prettyPrint(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println("<---------------------------------------------------------------->");
        }
    }

    public static int[][] prettyPrint(int A){
        int [][] matrix=new int[(A*2)-1][(A*2)-1];
        for (int[] row: matrix)
            Arrays.fill(row, 0);

        return matrix;
    }
}
