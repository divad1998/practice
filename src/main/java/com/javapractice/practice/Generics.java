package com.javapractice.practice;

public class Generics<T, V> {

    Generics(T t, V v) {

    }

    //the followiing lines exemplify Generics improvement of type mismatch error
    //use Object
    public static Object returnString(int integer) {

        return integer * 2;
    }

    //use generics
    T returnString(T integer) {
        return integer;
    }

    boolean test(Generics<T, V> holder) {
        //....
        return true;
    }

    void testInference() {
        Generics<Integer, String> generics = new Generics<>(2, "String");
    }

    public static void main(String[] args) {

        //using Obj
        //String s = (String) returnString(2); //throws a run-time error
        //using generics
//        Generics<Integer> generics = new Generics<>();
//        String s = generics.returnString(2); //throws a compile-time error
//        System.out.println(s);

        //why they are called refernce types
//        var i = 2;
//        var ii = 4;
//        i = ii; // here I pass the value of ii to i, not giving 4 another reference/not giving 4 another reference to its memory address.

        //using bounded types
        //var boundedGenerics = new Generics<>(); //weird! wrong? WHAT are the type arguments? HMMM. Now understood. This is a raw type definition.

        //test diamond operator type inference
        var generics = new Generics<Integer, String>(1, "String");

        if (generics.test(new Generics<>(2, "String")))
            System.out.println("gjjjd");
    }
}

class AnotherGenerics<T extends Number> { //this generic type will be used in this class

    T ob;

    AnotherGenerics(T o) {
        ob = o;
    }

    boolean absCompare(AnotherGenerics<?> arg) {
        return Math.abs(ob.intValue()) == Math.abs(arg.ob.doubleValue());
    }

//    static <T extends Comparable<T>> void test(T t) { //this means that T is comparable and for T to be comparable it must implement Comparable
//        System.out.println();
//    }

    public static void main(String[] args) {
//        AnotherGenerics<Integer> anotherGenerics = new AnotherGenerics<>(55);
//        AnotherGenerics<Float> anotherGenerics1 = new AnotherGenerics<>(2.2f);
//        anotherGenerics.absCompare(anotherGenerics1); // ok
//
//        System.out.println(!true);
        Integer i = 5;
        //test(i); //shouldn't work! As Integer implements Comparable. SEE LINE 52
    }
}

class FlightSchedule<T, E extends T> {

    public static <T> T myGen(T t) {
        return t;
    }
}

interface IGenIF<T, V extends T> {

}

class ImplementingClass<T, V extends T> implements IGenIF<T, V> {

}

class Counter<T> {

    public static void main(String[] args) {
        Counter counter = new Counter(); //raw type
    }
}