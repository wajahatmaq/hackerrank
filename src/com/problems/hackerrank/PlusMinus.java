package com.problems.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {
    public static void main(String[] args) throws IOException {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-1);
        plusMinus(arr);


    }

    public static void plusMinus(List<Integer> arr) {
        double positive = 0;
        double negative = 0;
        double zeroes = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positive++;
            } else if (arr.get(i) < 0) {
                negative++;
            } else {
                zeroes++;
            }
        }
        DecimalFormat df = new DecimalFormat("#.######");

        System.out.println( df.format(positive/arr.size()));
        System.out.println( df.format(negative/arr.size()));
        System.out.println( df.format(zeroes/arr.size()));

    }
}
