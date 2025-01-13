package com.problems.lamda;

public class Main {

    public static void main(String[] args) {
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello World");
            }
        };
        greeting2.sayHello();

        Greeting greeting3 = () -> System.out.println("Hellow World 3 ");
        greeting3.sayHello();

    }
}
