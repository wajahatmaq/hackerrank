package com.problems.toptal;

import java.util.Comparator;
import java.util.Stack;
import java.util.stream.IntStream;

public class Q1 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] A = {10,10};
        int x = solution(A);
        System.out.println(x);
    }

    public static int solution(int[] A) {

        float filter = 0;
        int totalFilters = 0;
        float halfPollution = IntStream.of(A).sum() / 2;
        int[] sorted = IntStream.of(A)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(i -> i)
                .toArray();
        Stack<Float> stack = new Stack<Float>();

        for (int i = 0; i < sorted.length; i++) {
            if (stack != null && stack.size() > 0 && stack.peek()  > sorted[i]) {
                totalFilters++;
                filter += stack.peek()/ 2;
                stack.push((float) stack.pop() / 2);
            }else{
                totalFilters++;
                filter += (float) sorted[i] / 2;
                stack.push((float) sorted[i] / 2);
            }
                if (filter >= halfPollution) {
                    break;
                }

        }
        return totalFilters;
    }
}
