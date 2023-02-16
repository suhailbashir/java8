package org.suhail;

public class LamdaExample {
    public static void main(String[] args) {
        //prior java8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable");
            }
        };
        new Thread(runnable).start();

        //java 8 lamda sysntax
        //()->{};
        Runnable runnableLamda = () -> {
            System.out.println("Inside Lambda Runnable");
        };
        new Thread(runnableLamda).start();

        //More optimized solution in java8
        new Thread(() -> System.out.println("Just One line Lambda")).start();

    }
}