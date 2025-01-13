package com.problems.leetcode;

public class PassingCars {

	public static void main(String[] args) {
		int[] A= {0,1,0,1,1};
		
		int x = solution(A);
System.out.println(x);
	}
	public static int solution(int[] A) {
		int count=0;
        int onesCount=0;
        int zeroesCount=0;
        int zeroesIndex=0;
        for(int i=0; i<A.length;i++ ) {
        	
        	if(A[i]==0){
        		if(i>zeroesIndex) {
        		//zeroesIndex=i;
        		zeroesCount++;
        		}
        	}
        	if(A[i]==1 && zeroesIndex<i) {
        		count++;
        		
        	}
        	
        }
        
        //count=onesCount * zeroesCount;
        return count;
    }
}
