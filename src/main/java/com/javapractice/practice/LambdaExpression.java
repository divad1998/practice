package com.javapractice.practice;

//practise lambda expressions here.
public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface myInterface = () -> 2; //what happens internally? an implementer of MyInterface is created and its instance is created and stored in myInterface. an implemented version of getInt() is created and its body returns 2.
        System.out.println(myInterface.getInt());

        MyInterface1 myInterface1 = (s, ss) -> s + ss;
        System.out.println(myInterface1.getConcatString("David ", "Dinneya"));

    }


}

//functional interfaces
interface MyInterface {
    int getInt(); //target type is int

    private void print() {
        System.out.println("....");
    }
}
interface MyInterface1 {
    String getConcatString(String s, String ss);
}

//using a lambda expr having a block body, find the lowest positive factor
interface NumericFunc {
    int getFactor(int num);
}

class LambdaClass {

    public static void main(String[] args) {
        NumericFunc numericFunc = (num) -> {
                                            //declare factorHolder
                                            int factorHolder = 1;

                                            //loop dividing
                                            for (int factor = 2; factor < num; factor++) { //nested block
                                                if (num % factor == 0) {
                                                    factorHolder = factor;
                                                    break; //ends loop when factor is found
                                                }
                                            }
                                            return factorHolder; //has to be initialized as it's possible it isn't initialized within loop
                                };

        System.out.println("factor is " + numericFunc.getFactor(5));
    }
}
