package com.javapractice.practice;

public interface Interface { //every letter in code is important.. jeez!!! snjljvbjbfnejfefrfgjlfrufuirf scu

    //are static,final and must be initialized
    int x = 0;
    int y = 0;

    void blah();

    private static void blablah() {
        System.out.println("dfjjks");
    }
}

//can avoid implementing all methods if an abstract class
abstract class ImplementInterface implements Interface {

    // must implement method in interface
    //oh, intellij not perfectly intelligent here
//    @Override
//    void blah() {
//
//    }

//    @Override
//    public void blah() {
//
//    }

    void test() {
        System.out.println("test");
    }

    abstract void testThis(int a);
}

//must implements methods in interface and extended abstract class
class ImplementInterfaceExtender extends ImplementInterface {
    @Override
    public void blah() {

    }

    @Override
    void testThis(int a) {

    }
}

class THis implements Interface {

    @Override
    public void blah() {
        System.out.println("blah in THis");
    }
}

class Main {
    public static void main(String[] args) {
        Interface implementInterface = new THis();
        implementInterface.blah();
    }
}
