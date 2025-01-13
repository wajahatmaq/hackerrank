package com.problems.careem;

import java.util.Arrays;

public class MissingRoll {
    public static void main(String[] args) {
        int arr[] = new int[4];
        arr[0] =1;
        arr[1] =2;
        arr[2] =3;
        arr[3] =4;
        int m=6;
        int F=4;
        int result[]= missingRolls(arr,m,F);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] missingRolls(int[] A, int M,int F ) {
        int len = A.length;
        int s = (F + len) * M;
        for (int v : A) {
            s -= v;
        }
        int zeroResult[] = new int[1];
        zeroResult[0] =0;
        if (s > F * 6 || s < F) {
            return zeroResult;
        }
        int[] ans = new int[F];
        Arrays.fill(ans, s / F);
        for (int i = 0; i < s % F; ++i) {
            ++ans[i];
        }
        return ans;

    }
}
