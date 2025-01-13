package com.problems.securitiai;

public class MainCounter {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);

        counterThread1.start();
        counterThread2.start();

        try{
            counterThread1.join();
            counterThread2.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(counter.getCount());
    }
}
