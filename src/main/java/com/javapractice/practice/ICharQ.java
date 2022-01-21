package com.javapractice.practice;

import java.lang.reflect.Array;

public interface ICharQ<T> {

    void put(T ch);
    T get() throws QueueEmptyException;
    void reset();

}

class CircularQueue<T> implements ICharQ<T>{

    T[] charQueue;
    int putIndex, getIndex;

    CircularQueue(T[] qRef) {
        charQueue = qRef;
        putIndex = getIndex = 0;

    }

    @Override
    public void put(T ch) {

        if (putIndex == charQueue.length) { // RIGHT! queue length would be doubled if necessary
            copy();
        }
        charQueue[putIndex++] = ch;
    }

    @Override
    public T get() throws QueueEmptyException {
        if (getIndex == putIndex) {
            throw new QueueEmptyException();
        }

        return charQueue[getIndex++];
    }

    @Override
    public void reset() {
        putIndex = getIndex = 0;
    }

    public void copy() { //get an empty queue with the same type
        T[] newQueue = (T[]) new Object[charQueue.length * 2];
        //T[] newQueue = new T[charQueue.length * 2];
        int i = 0;
        for (T c : charQueue) {
            if (i < charQueue.length) {
                newQueue[i] = c;
                i++;
            }
        }
        charQueue = newQueue;
    }
}

class MainClass {
    public static void main(String[] args) throws QueueEmptyException {
        Character[] a = new Character[4];
        ICharQ<Character> iCharQ = new CircularQueue<>(a);

        for (int i = 0; i < 10; i++) {
            iCharQ.put((char) ('a' + i));
        }
        System.out.print("Contents of icharQ: ");
        for (int i = 0; i < 11; i++) {
            try {
                System.out.print(iCharQ.get());
            } catch (QueueEmptyException q) {
                System.out.println(q); //calls toString()
            }
        }
        System.out.println();
    }
}

class QueueFullException extends Exception {

//    int size;
//
//    QueueFullException(int sizeHolder) {
//        size = sizeHolder;
//    }

//    public String toString() {
//        return "Queue is full as maximum size is " + size;
//    }
}

class QueueEmptyException extends QueueFullException {

    public String toString() {

        return "\nQueue is empty.";
    }


}
