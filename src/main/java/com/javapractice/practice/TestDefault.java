package com.javapractice.practice;

public interface TestDefault {

    int[] intArray = {1,2,3,4,5,6};

    default void remove(int x) {
        System.out.println("in default method in interface");
    }

    //not inheritable. so what's the use?
    static void add() {
        //...
    }
}

class Implementer implements TestDefault {

    int[] intArray = {1,2,3,4,5};

//    @Override
//    static void add() {
//        //...
//    }

    public static void main(String[] args) {
        Implementer testDefault = new Implementer();
        testDefault.remove(2);

        TestDefault td = new AnotherImplementer();
        td.remove(2);

        TestDefault.add();
    }
}

class AnotherImplementer implements TestDefault {

//    @Override
//    public void add() {
//        //...h
//    }
}
