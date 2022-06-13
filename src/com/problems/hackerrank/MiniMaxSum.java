package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {

    public static void main(String[] args) {

        //    256741038 623958417 467905213 714532089 938071625
        List<Integer> arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        List<Long> longs = new ArrayList<Long>(arr.size());
        for (int i=0;i<arr.size();++i) {
            longs.add(arr.get(i).longValue());
        }
        Collections.sort(longs);
        long maxSum = 0;
        long minSum = 0;

        for (int i = 0; i < 4; i++) {
            maxSum+=longs.get(longs.size()-(1+i));
            minSum += longs.get(i);
        }
        System.out.println(maxSum);
        System.out.println(minSum);

    }
}
