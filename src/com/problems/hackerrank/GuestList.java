package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuestList {
    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();
        list1.add("asd");
        list1.add("dsa");
        list1.add("qwe");
        list1.add("ewq");
        list1.add("qaz");
        list1.add("wsx");

        List<String> list2 = new ArrayList<String>();
        list2.add("asd");
        list2.add("dsa");
        list2.add("qwe");
        list2.add("ewq");
        list2.add("qaz");
        list2.add("wsx");




        System.out.print(checkGuestList(list1,list2));
    }

    public static boolean checkGuestList(List<String> list1, List<String> list2){
        Map<String,Integer> map =  new HashMap<String,Integer>();

        for(String str:list1){
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                Integer num = map.get(str);
                num++;
                map.put(str,num);
            }
        }

        for(String str:list2){
            if(!map.containsKey(str)){
                map.put(str,1);
            }else{
                Integer num = map.get(str);
                num--;
                map.put(str,num);
            }
        }


        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getValue()!=0){
                return false;
            }
        }
        return true;
    }
}
