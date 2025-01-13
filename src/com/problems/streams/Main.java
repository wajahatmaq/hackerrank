package com.problems.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer[] scores = new Integer[]{80,66,73,92,43};
        Stream<Integer> stream = Arrays.stream(scores);

        List<String> country = new ArrayList<>();
        country.add("India");
        country.add("Pakistan");
        country.add("China");
        country.add("SriLanka");
        country.add("Australia");
        country.add("England");
        country.add("Japan");
        country.add("Bangladesh");
        country.add("USA");
        Stream<String> countriesStream = country.stream();

        Stream<String> letters = Stream.of("a","b","c");

        List<String> sortedList = countriesStream
                .map(x->x.toUpperCase())
                .filter(x -> x.startsWith("P"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(country);
        System.out.println(sortedList);


    }
}
