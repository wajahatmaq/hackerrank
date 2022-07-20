package com.problems.turing;


import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        List<List<Integer>> testCase = new ArrayList<>();
        testCase.add(Arrays.asList(5,7,3,9,4,9,8,3,1));
        testCase.add(Arrays.asList(1,2,2,4,4,1));
        testCase.add(Arrays.asList(1,2,3));
        System.out.println(getWinningCard(testCase));
        testCase = new ArrayList<>();
        testCase.add(Arrays.asList(5,5));
        testCase.add(Arrays.asList(2,2));
        System.out.println(getWinningCard(testCase));
    }

    public static int getWinningCard(List<List<Integer>> cards){
        int winner = -1;
        for(List<Integer> playerCards: cards){
            Map<Integer,Integer> counts = new HashMap<>();
            for(int card: playerCards){
                counts.put(card, counts.getOrDefault(card,0)+1);
            }
            for(Map.Entry<Integer,Integer> entry: counts.entrySet()){
                int card = entry.getKey();
                int count = entry.getValue();
                if(count==1){
                    winner=Math.max(card,winner);
                }
            }
        }
        return winner;
    }
}
