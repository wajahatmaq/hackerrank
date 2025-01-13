package com.problems.enterprise64;

public class ClosestToZero {

    public static void main(String[] args) {

        int[] arr = new int[]{-22,1,-2,78,2,-2,24,56};

        System.out.println(findClosestToZero(arr));
    }

    public static int findClosestToZero(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }
        int closestToZero=arr[0];
        for(int i=0; i<arr.length; i++){
            if(Math.abs(closestToZero)>Math.abs(arr[i])){
                closestToZero = arr[i];
            }
        }



        return closestToZero;
    }
}
