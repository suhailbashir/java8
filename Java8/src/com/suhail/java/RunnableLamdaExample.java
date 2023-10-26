package com.suhail.java;

public class RunnableLamdaExample {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable...");
            }
        };

        new Thread(r).start();

        new Thread(()-> System.out.println("Inside Runnable but with Lambda...")).start();


    }
}
