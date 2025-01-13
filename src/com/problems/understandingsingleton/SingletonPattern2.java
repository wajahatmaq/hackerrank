package com.problems.understandingsingleton;

public class SingletonPattern2 {

    private SingletonPattern2 singletonPattern2=null;

    private SingletonPattern2(){

    }

    public SingletonPattern2 getInstance(){

        if(singletonPattern2 == null){
            singletonPattern2 = new SingletonPattern2();
        }
        return singletonPattern2;
    }
}
