package com.company;

import java.util.LinkedList;

public class PC {

    // This class has a list, producer (adds items to list
    // and consumer (removes items).

        // Create a list shared by producer and consumer
        // Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // Function called by producer thread
        public void produce() throws InterruptedException
        {
            int value = 0;
            while (true) {
                synchronized (this)
                {
                    // producer thread waits while list
                    // is full
                    while (list.size() == capacity)
                        wait();

//                    System.out.println("The table has "+ list.size() +" roll(s)");
                    System.out.println("The chef makes 1 roll "+ " (The sushi chef made "
                            + (value+ 1) + " roll(s) of sushi total)");


                    // to insert the jobs in the list
                    list.add(value++);
                    System.out.println("The table has "+ list.size() +" roll(s)");
                    // notifies the consumer thread that
                    // now it can start consuming
                    notify();

                    // makes the working of program easier
                    // to  understand
                    Thread.sleep(1000);
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException
        {
            while (true) {
                synchronized (this)
                {
                    // consumer thread waits while list
                    // is empty
                    while (list.size() == 0)
                        wait();

                    // to retrive the first job in the list
                    int val = list.removeFirst();

//                    System.out.println("The table has "+ value +" roll(s)");
                    System.out.println("The waiter serves 1 roll "+"(The waiter served "
                            + (val +1) + " roll(s) of sushi total).");

                    System.out.println("The table has "+ list.size() +" roll(s)");
                    // Wake up producer thread
                    notify();

                    // and sleep
                    Thread.sleep(1000);
                }
            }
        }
    }
