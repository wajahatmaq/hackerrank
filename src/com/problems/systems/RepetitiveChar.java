package com.problems.systems;

import java.util.HashMap;
import java.util.Map;

public class RepetitiveChar {

    public static void main(String[] args) {
        /*Input: "swiss"
        Output: "w"

        Input: "success"
        Output: "u"

        Input: "aabb"
        Output: None*/
        String input1= "swiss";
        findChar(input1);
    }

    private static void findChar(String input1) {
        Map<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i<input1.length(); i++){
            char c = input1.charAt(i);
            if(charMap.containsKey(c)){
                Integer value= charMap.get(c);
                charMap.put(c,charMap.get(c)+1);


            }   else{
                charMap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> ch:charMap.entrySet()){
            if(ch.getValue().equals(1)){
                System.out.println(ch.getKey());
                break;
            }
        }
    }
}
