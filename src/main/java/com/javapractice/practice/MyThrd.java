package com.javapractice.practice;

//creating a thread by extending Thread and using a static method
public class MyThrd extends Thread {

    MyThrd(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("starting " + getName());
        try {
            for (int counter = 0; counter < 5; counter++) {
                Thread.sleep(400);
                System.out.println("counter is " + counter + " in " + getName());
            }
        }
        catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    public static MyThrd createAndStart(String name) {
        MyThrd myThrd = new MyThrd(name);
        myThrd.start();
        return myThrd;
    }
}

class Caller {
    public static void main(String[] args) {
        System.out.println("starting main thread");
        MyThrd myThrd1 = MyThrd.createAndStart("mythrd#thread1");
        MyThrd myThrd2 = MyThrd.createAndStart("mythrd#thread2");
        MyThrd myThrd3 = MyThrd.createAndStart("mythrd#thread3");

        //ensure main ends last using isALive()
//        do {
//            try {
//                for (int counter = 0; counter < 5; counter++) {
//                    Thread.sleep(500);
//                    System.out.println("counter is " + counter + " in main thread.");
//                }
//            }
//            catch (InterruptedException exc) {
//                System.out.println(exc);
//            }
//        } while(myThrd1.isAlive() & myThrd2.isAlive() & myThrd3.isAlive());

        //ensure main ends last using join()
        try {
            myThrd1.join();
            myThrd2.join();
            myThrd3.join();
        }
        catch(InterruptedException exc) { //tthrown if join fails for instance when main had been interrupted
            System.out.println("Join failed as main thread has been interrupted!");
        }

        System.out.println("exiting main thread.");

    }
}
