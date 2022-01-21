package com.javapractice.practice;

//ToDo: build a stack == done; turn the prev to a multi-threaded system
public class QueueDemo {

    public static void main(String[] args) {
        System.out.println("main starting...");

        //instantiate queue
        Queue bigQ = new Queue(10);
        //Queue smallQ = new Queue(4);

        //create queue using factory
        QueueThread queueThread1 = QueueThread.createAndStart("Put-Thread", bigQ);
        QueueThread queueThread2 = QueueThread.createAndStart("Get-Thread", bigQ);

        //ensure main terminates ultimately
        try {
            queueThread1.thread.join();
            queueThread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("main interrupted.");
        }

        System.out.println("main is terminating.");


//        System.out.println("\nUsing smallQ to generate errors.");
//        // Now, use smallQ to generate some errors
//        for (i = 0; i < 5; i++) {
//            System.out.println("Attempting to store value...");
//            smallQ.put(0.1f);
//            if (i != 4) {
//                System.out.println("stored.");
//            }
//
//        }

//        // more errors on smallQ
//        System.out.println("Contents of smallQ:");
//        for (i = 0; i < 5; i++) {
//            System.out.println(smallQ.get());
//        }
    }
}

class QueueThread implements Runnable{

    Thread thread;
    Queue q;

    QueueThread(String threadName, Queue qHolder) {
        thread = new Thread(this, threadName);
        q = qHolder;
    }

    //factory method for threads
    static QueueThread createAndStart(String threadName, Queue q) {
        QueueThread queueThread = new QueueThread(threadName, q);
        queueThread.thread.start();
        return queueThread;
    }

    //where thread starts proper
    @Override
    public void run() {
        //loop variable
        int i;

        if (thread.getName().compareTo("Put-Thread") == 0) {
            System.out.println(thread.getName() + " is starting.");

            System.out.println("Using bigQ to store the float values.");
            // put floats into bigQ
            for (i = 0; i < 10; i++) {
                q.put(0.1f);
            }
            System.out.println(thread.getName() + " is terminating.");
        }
        else {
            System.out.println(thread.getName() + " is starting.");
            // retrieve and display elements from bigQ
            System.out.println("Contents of bigQ:");
            for (i = 0; i < 10; i++) {
                System.out.println(q.get());
            }
            System.out.println(thread.getName() + " is terminating.");
        }
    }
}

class Queue {

    private float q[];
    private int putloc, getloc;

    Queue(int size) {
        q = new float[size];
        putloc = getloc = 0;
    }

    synchronized void put(float fl) {

        if (putloc==q.length) {
            System.out.println("Sorry. Queue is full.");
            return; // halts function
        }

        q[putloc++] = fl;
    }

    synchronized float get() {

        if (getloc == putloc) {
            System.out.println(" Queue is empty.");
        }
        return q[getloc++];
    }
}

