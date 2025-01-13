package com.problems.hackerrank;

import java.util.*;

public class TuringQ2 {

    public static void main(String[] args) {

        int[][] a = {
                {5, 7, 3, 9, 4, 9, 8, 3, 1},
                {1, 2, 2, 4, 4, 1},
                {1, 2, 3},
        };
        Q2(a);
    }

    public static Integer Q2(int[][] a) {
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        List<Integer> arr =  new ArrayList<Integer>();
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (!m.containsKey(a[i][j])) {
                    m.put(a[i][j], 1);
                } else {
                    Integer count = m.get(a[i][j]);
                    count = count + 1;
                    m.put(a[i][j], count++);
                }

            }
        }

        Iterator hmIterator = m.entrySet().iterator();
        Integer res=0;
        while (hmIterator.hasNext()) {

            Map.Entry mapElement
                    = (Map.Entry) hmIterator.next();

            if (mapElement.getValue().equals(1)) {
                Integer i = (Integer) mapElement.getKey();
                res = Math.max(res,i);
            }
        }
        System.out.println(res);
        return res;
    }

}
