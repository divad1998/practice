package com.javapractice.practice;

import static com.javapractice.practice.Autoboxing.i;

public class UseMain {

    public static void main(String[] args) { //beginning of main thread

        //Main thread starting
        System.out.println("Main Thread starting....");

        Thread thread = Thread.currentThread();
        //get initial name and priority
        String iniialThreadName = thread.getName();
        int initialPriority = thread.getPriority();
        System.out.println("Initial name of MainThread is '" + iniialThreadName + "' and its priority is '" + initialPriority + "'.");

        System.out.println();

        String newThreadName = "StartUp Thread";
        thread.setName(newThreadName);
        int newPriority = Thread.NORM_PRIORITY + 3;
        thread.setPriority(newPriority);
        System.out.println("Main thread is now named: '" + thread.getName() + "', and its priority is now '" + thread.getPriority() + "'.");

        System.out.println(thread.getName() + " is terminating....");

//        int i = 4;
//        System.out.println(Autoboxing.i); //increasing chance of name conflict
        //Autoboxing.i = 5; //seems something has been changed ?

    }
}
