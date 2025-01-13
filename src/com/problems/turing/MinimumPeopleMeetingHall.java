package com.problems.turing;

import java.util.HashMap;
import java.util.Map;

public class MinimumPeopleMeetingHall {

    public static void main(String[] args) {
        int[] asked = {2, 2, 1, 2, 1};
        System.out.println(minimumPeople(asked));  // Output the minimum number of people
    }
    public static int minimumPeople(int[] asked) {
        // A map to store the frequency of each answer
        Map<Integer, Integer> map = new HashMap<>();
        int minPeople = 0;

        for (int ans : asked) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            // If k + 1 people all say that there are k others with the same number,
            // then there must be k + 1 people with this number.
            int groupSize = k + 1;
            // Calculate how many groups we need
            int groups = (int) Math.ceil((double) v / groupSize);
            minPeople += groups * groupSize;
        }

        return minPeople;
    }
}
