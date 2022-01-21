package com.javapractice.practice;

public class BitWiseOperators{

    public static void main(String[] args) {
        // THe OPerators include AND, OR, XOR, >>, >>>, <<, NOT

        //The AND
        //(1) it is used to turn a bit off
        // eg, in converting lowercase to uppercase

        //(2) to check whether a bit within is on or off
        int a = 123, b = 128;
        if ((a & b) != 0)
            System.out.println("no bit is 0. wow!");
        else
            System.out.println("a bit is 0.");

        // Right shift
        byte bb = 3;
        int cc = bb >> 1; // worked. COnverted to int ie 0000 0000 0000 0000 0000 0000 0000 0011, then right shifted: 0000 0000 0000 0000 0000 0000 0000 0001
        System.out.println(cc);

        byte aa = -3;
        int dd = aa >> 1; // COnverted to int ie 1111 1111 1111 1111 1111 1111 1111 1101, then right shifted: 1111 1111 1111 1111 1111 1111 1111 1110
        System.out.println((byte)dd);

        // Zero/Unsigned Right shift
        byte ee = -3;
        int ff = ee >>> 25; // Converted to int ie  1111 1111 1111 1111 1111 1111 1111 1101, then right shifted without maintaining sign bit 0000 0000 0000 0000 0000 0000 0111 1111
        System.out.println((byte)ff);

        //OR
        byte i = 4; //0000 0100
        byte ii = 5; //0000 0101
        System.out.println(i | ii); //0000 0101 which is 5

        //XOR
        System.out.println(i ^ ii); //0000 0001 which is 1

        //NOT
        System.out.println(~i); //1111 1011
        System.out.println(~ii); //1111 1010
    }
}