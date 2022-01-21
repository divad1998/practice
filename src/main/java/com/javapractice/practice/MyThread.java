package com.javapractice.practice;

//make this class a thread
//implement RUnnable
public class MyThread implements Runnable {

    //COmmented cuz unnecessary
//    String threadName;
//    MyThread(String name) {
//        threadName = name;
//    }

    //here, thread begins and contains execution
    @Override
    public void run() {
        //System.out.println(threadName + "starting.");
        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In run() count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(" interrupted.");
        }
        System.out.println(" terminating.");
    }
}

class UseThreads {
    public static void main(String[] args) { //main thread begins process
        System.out.println("Main thread starting.");
        //instantiate mythread and pass to Thread constructor
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread, "Child#1");
        //start child1 thread
        thread.start();

        for (int i = 0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Main thread interrupted");
            }
        }

        System.out.println("Main thread ending.");
    }
}
