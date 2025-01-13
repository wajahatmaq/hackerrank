package com.problems.securitiai;

public class Test {

    public static void main(String[] args) {
        World world = new World();
        world.start();
        for (int i=0; i<100000; i++){
            System.out.println(Thread.currentThread().getName());
        }
        World2 world2 = new World2();
        Thread t1 = new Thread(world2);
        t1.start();

    }
}
