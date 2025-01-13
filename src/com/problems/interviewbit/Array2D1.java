package com.problems.interviewbit;

import java.util.ArrayList;
import java.util.List;

public class Array2D1 {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(1);
        row1.add(2);
        row1.add(3);
        row1.add(4);
        matrix.add(0,row1);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(5);
        row2.add(6);
        row2.add(7);
        row2.add(8);
        matrix.add(1,row2);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(9);
        row3.add(10);
        row3.add(11);
        row3.add(12);
        matrix.add(2,row3);


        /*ArrayList<Integer> row4 = new ArrayList<>();
        row4.add(62);
        row4.add(98);
        row4.add(114);
        row4.add(108);
        matrix.add(3,row4);*/

        ArrayList<ArrayList<Integer>> B = performOps(matrix);
        for (int i = 0; i < B.size(); i++) {
            for (int j = 0; j < B.get(i).size(); j++) {
                System.out.print(B.get(i).get(j) + " ");
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < A.size(); i++) {
            B.add(new ArrayList<Integer>());

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).add(0);
            }

            for (int j = 0; j < A.get(i).size(); j++) {
                B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
            }
        }
        return B;
    }


}
