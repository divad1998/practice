package com.javapractice.practice;

// use BitWise AND to show bit pattern of value
public class ShowBitsDemo {

    public static void main(String[] args) {

        byte value = 14;
        byte agent = 8;

        for (; agent != 0; agent = (byte) (agent/2))
            if ((agent & value) != 0) //if all bits are not off
                System.out.print(1);
            else
                System.out.print(0);

        System.out.println();

    }

}
