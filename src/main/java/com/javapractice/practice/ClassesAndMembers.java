package com.javapractice.practice;

import static java.lang.Integer.toBinaryString;

public class ClassesAndMembers {

    public static void main(String[] args) {

        System.out.println(toBinaryString(10)); // cool

        System.out.println(Math.abs(10));

        call(2);
        call(2.0f);

        char[] aQueue = {'a','b','c','d','e'};
        ClassesAndMembers nQueue = new ClassesAndMembers(aQueue);

        System.out.println("Contents of queue:");
        for (int a = 0; a < aQueue.length; a++) {
            System.out.print(nQueue.get(a) + ", ");
        }
        System.out.println();

        System.out.println("Factorial of 5 is " + Factorial.factR(5));

        var s = new Static();
        var ss = new Static();
        s.y = 2;
        ss.y = 3;
        Static.x = 4; // this value will be shared by any instance declared

        System.out.println(s.multiply());
        System.out.println(ss.multiply());
    }

    //ToDo:  Method Overloading
    //THe act of declaring two or more similar methods in  a class. I know the diff btw the methods
    //the below wont work
    //int test() {}
    //double test() {}

    //this would work
    static void call(int i) {
        System.out.println("prints an integer " +i);
    }

    static void call(float i) {
        System.out.println("prints a floating value " +i);
    }

    //Overload Constructors
    //build a queue from an array
    char[] newQueue;
    ClassesAndMembers(char[] queue) {

        int length = queue.length;
        newQueue = new char[length];

        for (int i = 0; i < length; i++) {
            newQueue[i] = queue[i];
        }
    }

    char get(int i) {
        return newQueue[i];
    }

    //to demonstrate a recursive method
    static class Factorial {
        // recursive subroutine
        static int factR(int n) { //more tasking on memory relative to the iterative statements

            int result;
            int checkValue = 1;
            if (n == checkValue) {
                return checkValue;
            }
            int n1 = n - 1;
            result = factR(n1) * n; // 1*2*3*4*5
            System.out.println("Returning from call at n equals " + n1 + " and result is " + result);
            return result;
        }
    }
}
class Static {
    int y;
    static int x;

    int multiply() {
        return y * x;
    }
}
