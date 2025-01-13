package com.problems.leetcode;

public class MinAbsSum {

	public static void main(String[] args) {
		int[] A = {1,5,2,-2};
		int x = solution(A);
			System.out.println(x);
	}
	public static int solution(int[] A) {
        int sum =0;
        int[] intArray = null ;
        if(A.length>0) {
        	intArray = new int[A.length];
        }
        for(int i=0; i<A.length; i++){
        	if(i%2==0) {
        		intArray[i]=-1;
        	}else {
        		intArray[i]=1;
        	}
        }
        
        for(int i=0; i<A.length; i++){
        	sum=sum+(A[i]*intArray[i]);
        }
        return sum;
    }
}
