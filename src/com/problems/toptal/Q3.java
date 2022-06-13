package com.problems.toptal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] P = {4, 4, 5, 3};
        int[] S = {5, 5, 7, 3};
        int x = solution(P, S);
        System.out.println(x);
    }

    public static int solution(int[] P, int[] S) {
        int seatSpace = 0;
        int totalPeople = 0;
        int totalCars = P.length;
        List<Integer> sorted = new ArrayList<>();

        for (int i = 0; i < totalCars; i++) {
            seatSpace += S[i];
            totalPeople += P[i];
            sorted.add(S[i]);
        }

        if (seatSpace < totalPeople) {
            return totalCars; // since all of them will be used
        }

        Collections.sort(sorted, Collections.reverseOrder());


        int cars = 0;
        for (int i = 0; i < totalCars; i++) {
            if (totalPeople - sorted.get(i) > 0) {
                totalPeople -= sorted.get(i);
                cars++;
            } else {
                cars++;
                return cars;
            }
        }
        return cars;
    }
}
