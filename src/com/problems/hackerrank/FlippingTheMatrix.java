package com.problems.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class FlippingTheMatrix {

    public static void main(String[] args) {

        List<List<Integer>> matrix = new ArrayList<>();

        List<Integer> row1 = new ArrayList<>();
        row1.add(112);
        row1.add(42);
        row1.add(83);
        row1.add(119);
        matrix.add(0,row1);

        List<Integer> row2 = new ArrayList<>();
        row2.add(56);
        row2.add(125);
        row2.add(56);
        row2.add(49);
        matrix.add(1,row2);

        List<Integer> row3 = new ArrayList<>();
        row3.add(15);
        row3.add(78);
        row3.add(101);
        row3.add(43);
        matrix.add(2,row3);


        List<Integer> row4 = new ArrayList<>();
        row4.add(62);
        row4.add(98);
        row4.add(114);
        row4.add(108);
        matrix.add(3,row4);

        for(int i=0; i<matrix.size(); i++){
                System.out.println("    ");
            for(int j=0; j<matrix.size(); j++){
                System.out.print("  "+matrix.get(i).get(j));
            }
        }

    }

    public static int flippingMatrix(List<List<Integer>> matrix) {
        // Write your code here
            // Write your code here
            int len = matrix.size();
            System.out.println(len);
            int columnToFlip=len/2;
            int rowToFlip=0;
            List<Integer> coulIntegers = new ArrayList<>();
            for(int i=0; i<len; i++){
                coulIntegers.add(matrix.get(i).get(columnToFlip));
            }

            for(int i=0; i<len; i++){
                //matrix.get(i).add(columnToFlip, coulIntegers.get(index)); add(matrix.get(i).get(columnToFlip));
            }
            //System.out.println("    ");
            // for(int j=0; j<len; j++){
            //     System.out.print("  " + );
            // }
            return 0;
        }
}
