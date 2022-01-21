package com.javapractice.practice;

import java.nio.charset.CharsetEncoder;
import java.sql.Array;

// Contains Chapter 6's self test
public class Stack<T> implements IGenStack<T> {

    T[] stack;
    int count = 0;

    Stack(T[] holder) {
        stack = holder;
    }

    // join stack
    public void push(T c) {

        stack[count++] = c;
    }

    // remove from stack
    public T pop() {
        return stack[--count];
    }

    public static void main(String[] args) throws StackFullException {

        Character[] charArray = new Character[5];
        Stack<Character> stack = new Stack<>(charArray);

        int i = 0;
        for (; i < 7; i++) {
            try {
                if (i >= stack.stack.length)
                    throw new StackFullException();
                char cToPush = (char) ('a' + i);
                stack.push(cToPush);
            } catch(StackFullException e) {
                ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
                exception.initCause(e);
                System.out.println(exception.getCause());
                //throw exception;
            }
        }

        System.out.print("Contents of Stack: ");
        for (int ii = 0; ii < 10 ; ii++) {
            try {
                if (ii >= stack.stack.length ? true : false)
                    throw new StackEmptyException();
                System.out.println(stack.pop());
            } catch (StackEmptyException e) {
                ArrayIndexOutOfBoundsException exception = new ArrayIndexOutOfBoundsException();
                exception.initCause(e);
                //System.out.println(exception.getCause());
                throw exception;
            }

            //System.out.print(stack.pop());
        }
        System.out.println();
    }
}

interface IGenStack<T> {
    void push(T t);
    T pop();
}

class Test {
    int i;
    Test(int ii) {
        i = ii;
    }

    static void swap(Test t, Test tt) {
        int tempHolder = t.i;
        t.i = tt.i;
        tt.i = tempHolder;
    }

    public static void main(String[] args) {
        Test firstInst = new Test(1);
        Test secInst = new Test(2);

        System.out.println("Initially:");
        System.out.println("First instance's i = " + firstInst.i);
        System.out.println("Second instance's i = " + secInst.i);

        swap(firstInst, secInst);
        System.out.println("After Swap:");
        System.out.println("First Instance's i = " + firstInst.i);
        System.out.println("Second instance's i = " + secInst.i);
    }
}

class RecursivePractice {

    static String getString(String s, int i) { //s = David, index = 2

        if (i == s.length()) {
            return s.charAt(0) + "";
        }
        int index = i + 1;
        String result = s.charAt(s.length() - i) + getString(s, index);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getString("David", 1));
    }
}

class VarArgsTest {

    int sum(int ii, int ...args) {

        int result = 0;
        for (int i : args) {
            result += i;
        }
        return result;
    }

    int[] sum(int ...i) {
        return i;
    }

    public static void main(String[] args) {
        VarArgsTest varArgsTest = new VarArgsTest();
        //int result = varArgsTest.sum(1,2,3,4,5,6,7,8,9);
        //System.out.println(varArgsTest.sum(1)); //ambiguous call

        //System.out.println(result);
    }
}

class StackFullException extends Exception {

    public String toString() {
        return "Stack is full.";
    }
}

class StackEmptyException extends StackFullException {

    public String toString() {
        return "Stack is empty.";
    }
}
