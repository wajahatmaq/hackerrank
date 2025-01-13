package com.problems.understandingstatic;

public class StaticMain {


    public static void main(String[] args) {

        ChangeValue changeValue = new ChangeValue();
        System.out.println(ChangeValue.value);
        changeValue.incrementValue();
        System.out.println(ChangeValue.value);
        ChangeValue changeValue2 = new ChangeValue();
        System.out.println(ChangeValue.value);

    }
}
