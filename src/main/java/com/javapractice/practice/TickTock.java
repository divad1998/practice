package com.javapractice.practice;

//using wait() and notify() to sync two threads
public class TickTock {

    String state;

    synchronized void tick(boolean running) {

        if (!running) { //stop the clock
            state = "ticked";
            notify(); //notify all waiting threads
            return;
        }
        //make each 'tick' take half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Thread was interrupted while sleeping!");
        }
        //print 'tick'
        System.out.print("Tick ");

        state = "ticked"; // set the current state to ticked

        notify(); //let tock() run
        try {
            while (!state.equals("tocked"))
                wait(); //wait for tock() to complete
        } catch (InterruptedException e) {
            System.out.println("thread couldn't wait. An interruption interruption occurred");
        }
    }

    synchronized void tock(boolean running) {

        if (!running) { // stop the clock
            state = "tocked";
            notify();
            return;
        }
        // make each 'tock' take half a second
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            System.out.println("Thread was interrupted while sleeping!");
        }
        //print tock
        System.out.println("Tock");

        state = "tocked"; // set the current state to tocked

        notify(); // let tick() run
        try {
            while(!state.equals("ticked"))
                wait(); //wait for tick to complete
        } catch(InterruptedException e) {
            System.out.println("Interruption occurred");
        }
    }
}

class MyT implements Runnable {

    Thread thrd;
    TickTock ttOb;

    //construct new thread
    MyT(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
    }
    // factory method that creates and starts thread
    public static MyT createStart(String name, TickTock tt) {
        MyT myT = new MyT(name, tt);
        myT.thrd.start(); // start thread
        return myT;
    }

    //entry point of thread
    @Override
    public void run() {

        if (thrd.getName().compareTo("Tick") == 0) {
            for (int i = 0; i<5; i++)
                ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for (int i = 0; i < 5; i++)
                ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}

class ThreadCom {

    public static void main(String[] args) {
        TickTock tt = new TickTock();
        MyT myt1 = MyT.createStart("Tick", tt);
        MyT myt2 = MyT.createStart("Tock", tt);

        try {
            myt1.thrd.join();
            myt2.thrd.join();
        }
        catch (InterruptedException exc) {
            System.out.println("Main Thread was interrupted.");
        }
    }
}

