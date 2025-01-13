package com.problems.enterprise64;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FindLargest {

    public static void main(String[] args) {

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(23);
        listOfNumbers.add(45);
        listOfNumbers.add(68);
        listOfNumbers.add(12);
        listOfNumbers.add(85);
        listOfNumbers.add(102);
        listOfNumbers.add(97);

        System.out.println(findLargest(listOfNumbers));

    }

    private static int findLargest(List<Integer> listOfNumbers) {
        int largest=0;

        for(Integer x:listOfNumbers){
            if(largest<x){
                largest=x;
            }
        }

        return largest;
    }


}
