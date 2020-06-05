package com.company;
// Java program to implement solution of producer
// consumer problem.

import java.util.LinkedList;

class Threadexample {
    public static void main(String[] args)
            throws InterruptedException
    {
        // Object of a class that has both produce()
        // and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread sushiChef = new Thread(() -> {
            try {
                //number of times sushi is made
                pc.produce();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Create consumer thread
        Thread sushiWaiter = new Thread(() -> {
            try {
                pc.consume();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start both threads
        sushiChef.start();
        sushiWaiter.start();

        //
        sushiChef.join();
        sushiWaiter.join();
    }

}