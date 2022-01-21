package com.javapractice.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//intellij can automatically rename file if you change the name of this class
public class Exceptions {

    public static void main(String[] args) throws IOException {
//        char ch;
//        try {
//            ch = prompt("Enter a letter"); // receives inputed value
//        } catch (IOException e) {
//            //e.printStackTrace();
//            System.out.println("I/O exception occurred.");
//            ch = 'X';
//        }

//        System.out.println("You pressed " + ch);

        // testing chained exceptions
        try {

            throw new MyException();
        } catch (MyException me) {
            me.printStackTrace();

            //throw new IOException("wrong indexing in code.", aioub);

        }
    }
}
class MyException extends Throwable{

    @Override
    public void printStackTrace() {

        System.out.println("my stack trace.");
    }


}
