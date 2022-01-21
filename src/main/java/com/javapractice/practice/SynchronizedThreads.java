package com.javapractice.practice;

//ToDo: ensure a method can't be used concurrently by 2 threads. Get it D! OBSERVATION: sout in synced method was printed in console after the second thread had started. But synchronization still hasn't changed
public class SynchronizedThreads implements Runnable {

    Thread thread;
    SynchronizedThreads(String name) {
        thread = new Thread(this, name);
    }

    //instantiate thread and start thread
    static SynchronizedThreads createAndStart(String name) {
        SynchronizedThreads syncedThread = new SynchronizedThreads(name);
        syncedThread.thread.start();
        return syncedThread;
    }

    @Override
    public void run() {

        System.out.println(thread.getName() + " is starting.");

        SynchronizedClass syncedClass = new SynchronizedClass();
        //use a synchronized block
        synchronized(syncedClass) {
            int result = syncedClass.syncedSubroutine();
        }

        //terminating
        System.out.println(thread.getName() + " is terminating.");
    }
}

// create object containing the special method
class SynchronizedClass {

    //create method
    int syncedSubroutine() {

        //create a loop that sums
        int sum = 0;
        int count = 0;
        for (; count < 5; count++) {
            sum += count;
            System.out.println(count);
        }
        System.out.println(Thread.currentThread() + " is done with summation. Sum is " + sum + ".");
        return sum;
    }
}

//create Caller
class M {
    public static void main(String[] args) {
       SynchronizedThreads thread1 = SynchronizedThreads.createAndStart("thread#1");
       SynchronizedThreads thread2 = SynchronizedThreads.createAndStart("thread#2");

       //wait for thread to finish
        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main was interrupted, oops!");
        }

        System.out.println("Main thread about to end.");
    }
}
