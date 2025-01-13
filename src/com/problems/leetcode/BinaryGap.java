package com.problems.leetcode;

public class BinaryGap {

	public static void main(String[] args) {
		
		try {
			int x = solution(1376796946);
			System.out.println(x);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	 public static int solution(int N) {
	        // write your code in Java SE 8
	    String binary=null; 
	        if (N>0) {
	               binary = Integer.toBinaryString(N); 
	        }
	        boolean start=false;
	        int max=0;
	        int gap=0;
	        for(int i=0; i< binary.length(); i++){
	            if(binary.charAt(i) == '1'){
	                start=true;
	                if(gap>= max){
	                    max=gap;
	                    gap=0;
	                }
	            }else if(binary.charAt(i)== '0' && start){
	                gap++;
	            }
	        }
	        return max;
	        
	    }
}
