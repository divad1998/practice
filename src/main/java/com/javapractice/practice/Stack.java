package com.javapractice.practice;

public class Stack {

    static int[] stack = {0,1,2,3,4,5,6,7,8,9};
    static int i = stack.length;

    // remove from stack
    private static int get() {
        return stack[--i]; 
    }
    public static void main(String[] args) {
        
        int i;
        
        for (i=0; i<stack.length; i++) {

            System.out.println(get());
        }
        
    }
    
}
