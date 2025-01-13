package com.problems.understandingsingleton;

public class SingletonPattern {

    public static SingletonPattern singletonPattern;

    private SingletonPattern(){

    }
    static {
        singletonPattern = new SingletonPattern();
    }
}
