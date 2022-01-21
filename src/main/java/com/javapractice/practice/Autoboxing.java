package com.javapractice.practice;

import static java.lang.System.out;

public class Autoboxing {

    //since jdk 5, java automatically box these values. Hence, :
    //Integer integer = 100;
    //prior it was,
    //Integer integer1 = Integer.valueOf(100);

    //when I dont break in a switch statement

    static Integer i = 4;

    public static void main(String[] args) {

        switch (i) {
            case 2 -> out.println("2");
            //no need to check the next case
            case 4 -> out.println(4);
        }
    }
}