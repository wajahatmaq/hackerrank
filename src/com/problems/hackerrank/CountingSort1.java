package com.problems.hackerrank;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class CountingSort1 {

    public static void main(String[] args) {

        int arr[] = {1,1,3,2,1};
        countingSort1(arr);
    }

    private static int[] countingSort1(int[] arr) {
        int len = Arrays.stream(arr).max().getAsInt();
        int[] myIntArray = new int[len+1];
        Arrays.fill(myIntArray, 0);

        for(int i=0; i<arr.length; i++){
            myIntArray[arr[i]] +=1;
            //System.out.print(myIntArray[i]);
        }

        Arrays.stream(myIntArray).forEach(System.out::println);
        return myIntArray;
    }
}
