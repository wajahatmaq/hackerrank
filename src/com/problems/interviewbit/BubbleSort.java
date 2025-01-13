package com.problems.interviewbit;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr= new int[]{99,23,45,1,98,85,64,10};
        int n=arr.length;
        for(int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                if (arr[j] < arr[j+1]) /* For descending order use < */
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Sorted list of numbers:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
