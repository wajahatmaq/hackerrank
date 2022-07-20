package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(2);
        a.add(1);
        a.add(4);

        System.out.println(lonelyInteger(a));

    }

    public static int lonelyInteger(List<Integer> arr) {

        Map<Integer,Integer> map = new HashMap<>();
        int returnValue=0;
        int value=0;
        for(int i:arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                value = map.get(i);
                value++;
                map.put(i,value);
            }

        }
        for(Map.Entry<Integer,Integer> m: map.entrySet()){
            if(m.getValue() == 1){
               returnValue = m.getKey();
            }
        }
        return returnValue;
    }
}
