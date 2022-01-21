package com.javapractice.practice;

public @interface MyAnnotation {
    String name();
    int age();
    String address();
}

class MyClass {

    //how to use an annotation
    @MyAnnotation(name = "dave", age = 24, address = "one man village")
    private String testAnnotation;
}


