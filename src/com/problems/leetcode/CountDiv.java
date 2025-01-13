package com.problems.leetcode;

import java.util.stream.IntStream;

public class CountDiv {

	public static void main(String[] args) {
		 long start = System.nanoTime();

		    // call the method
		 int x = solution(16,342,17);

		    // get the end time
		    long end = System.nanoTime();
		
		    long execution = end - start;
		    System.out.println("Execution time: " + execution/1000000000  + " seconds");
		
		System.out.println(x);
	}
	public static int solution(int a, int b, int k) {
		return (int) IntStream.range(a, b).filter(n -> n % k == 0).count();
        


        //return count;
    }
}
