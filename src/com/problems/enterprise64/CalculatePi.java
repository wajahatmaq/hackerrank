package com.problems.enterprise64;

public class CalculatePi {

    public static void main(String[] args) {
        double[][] rands = new double[100000][2];
        for (int i = 0; i < rands.length; i++) {
            rands[i][0] = Math.random(); // x
            rands[i][1] = Math.random(); // y
        }

        double pi = approx(rands);
        System.out.println("Approximate pi: " + pi);
    }

    private static double approx(double[][] rands) {
        double pi = 0;
        double d=0;
        int circlePoints=0;
        int squarePoints=0;
        for(double[] pt:rands){
            double x=pt[0];
            double y=pt[1];
            d= Math.pow(x,2) + Math.pow(y,2);
            if(d<=1)
                circlePoints++;

            squarePoints++;
        }

        pi=4*circlePoints/squarePoints;

        return pi;
    }

}
