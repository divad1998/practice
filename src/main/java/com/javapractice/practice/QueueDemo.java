package com.javapractice.practice;

//ToDo: build a stack == done
public class QueueDemo {    

    public static void main(String[] args) {
        QueueDemo queueDemo = new QueueDemo();
        Queue bigQ = queueDemo.new Queue(10);
        Queue smallQ = queueDemo.new Queue(4);
        
        int i;

        System.out.println("Using bigQ to store the float values.");
        // put floats into bigQ
        for (i=0; i<10; i++) {
            bigQ.put(0.1f);
        }

        // retrieve and display elements from bigQ
        System.out.println("Contents of bigQ:");
        for (i=0; i<10; i++) {
            System.out.println(bigQ.get());
        }

        System.out.println("\nUsing smallQ to generate errors.");
        // Now, use smallQ to generate some errors
        for (i=0; i<5; i++) {
            System.out.println("Attempting to store value...");
            smallQ.put(0.1f);
            if(i!=4) {
                System.out.println("stored.");    
            }
            
        }

        // more errors on smallQ
        System.out.println("Contents of smallQ:");
        for (i=0; i<5; i++) {
            System.out.println(smallQ.get());
        }
    }

    class Queue{
        float q[];
        int putloc, getloc;

        Queue(int size) {
            q = new float[size];
            putloc = getloc = 0; 
        }

        void put(float fl) {

            if (putloc==q.length) {
                System.out.println("Sorry. Queue is full.");
                return; // halts function
            }

            q[putloc++] = fl;
        }

        float get() {

            if (getloc == putloc) {
                System.out.println(" Queue is empty.");
            }
            return q[getloc++];
        }
    }
}
