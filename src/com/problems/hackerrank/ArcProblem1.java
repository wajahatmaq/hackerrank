package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ArcProblem1 {

    public static void main(String[] args) {

        String str = "world";


        System.out.print(solution(str));

    }


    public static int solution(String S) {
        int len = S.length();

        HashSet<String> hashSet =  new HashSet<String>();
        for(int i=0; i<len;++i){
            boolean[] freq = new boolean[26];
            String str = "";
            for(int j=i;j<len;++j){
                int pos = S.charAt(j)-'a';
                if(freq[pos]==true){
                    break;
                }
                freq[pos]=true;
                str +=S.charAt(j);
                hashSet.add(str);
            }
        }
        return hashSet.size();

    }
}
