package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BigSum {

    public static void main(String[] args) {

        List<Long> ar =  new ArrayList<>();
        ar.add(1000000001L);
        ar.add(1000000002L);
        ar.add(1000000003L);
        ar.add(1000000004L);
        ar.add(1000000005L);

        System.out.print(bigSum(ar));
    }

    public static Long bigSum(List<Long> ar){
        Long total = 0L;
        for(Long longNumber:ar){
            total+=longNumber;

        }
        return total;
    }
}
