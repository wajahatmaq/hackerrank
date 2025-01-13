package com.problems.hackerrank;

public class StringReverse {

    public static void main(String[] args) {
        String str="this is a string";
        String reversal ="";
        for(int i=str.length()-1; i>0; i--){
            reversal+=str.charAt(i);
        }

        System.out.println(reversal);
    }
}
