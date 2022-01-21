package com.javapractice.practice;

import org.w3c.dom.ls.LSOutput;

//exemplifying Nested classes
public class Outer {

    Outer() {

    }

    int[] nums = {1,2,3,4,5};

    //nesting within a block scope
    public static void main(String[] args) { //the block

        class BlockInner {
            BlockInner() {
                System.out.println("understood hopefully.");
            }
        }
    }

    static void printNums() {
        System.out.println("jnvjlfjnf");
    }

    class Inner { //Inner class
        //access nums
        int x = nums[0]; //worked
    }

    static class Inner1 {
        Outer outer = new Outer();
        int y = outer.nums[0]; //it can only access a non-static member of its outer by instantiating

        String[] strs = {"bkdfjbvb", "bvbhrf"};

        void accessMethod() { //can access its outer's static member directly
            Outer.printNums();
            Outer.main(strs);
        }
    }

    //can't come before a non-varags
//    void testVarArgs(int... varargs, String s) {
//
//    }
}