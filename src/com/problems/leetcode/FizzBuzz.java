package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {

        List<String> list = fizzBuzz(15);

    }

    public static List<String> fizzBuzz(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        boolean flag3 = false;
        boolean flag5 = false;
        boolean bothFlag = false;

        for (int i = 0; i < n; i++) {
            StringBuffer stringBuffer = new StringBuffer();
            flag3 = false;
            flag5 = false;
            if ((i+1) % 3 == 0) {
                flag3 = true;
            }
            if ((i+1) % 5 == 0) {
                flag5 = true;
            }

            if(flag3 && flag5){
                stringBuffer.append("FizzBuzz");
            }else if(flag3){
                stringBuffer.append("Fizz");
            } else if (flag5) {
                stringBuffer.append("Buzz");
            }else{
                stringBuffer.append(i+1);
            }

            fizzBuzzList.add(i,stringBuffer.toString());

        }
return fizzBuzzList;

    }
}
