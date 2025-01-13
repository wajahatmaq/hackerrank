package com.problems.multithreading;

public class SynchronizedExchangerMain {
    public static void main(String[] args) {
        SynchronizedExchangerStatic synchronizedExchanger = new SynchronizedExchangerStatic();

        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0; i<1000; i++){
                            SynchronizedExchangerStatic.setObject(""+i);
                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i=0; i<1000; i++){
                            System.out.println( SynchronizedExchangerStatic.getObject());
                        }
                    }
                }
        );

        t1.start();
        t2.start();

    }
}
