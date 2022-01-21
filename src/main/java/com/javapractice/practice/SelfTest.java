package com.javapractice.practice;

public class SelfTest {

    public static void main(String[] args) {

        int i = 0;
        if (i == 0 ? true : false) {
            System.out.println("oh yeah!");
        }

        //1
        double[] oneDArray = new double[12];
        double oneDArray1[] = new double[12];

        //2
        int[] x = {1,2,3,4,5};

        //3
        double xx[] = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        for (double xa : xx)
            i += xa;
        System.out.println("Average of xx's elements is " + (double)i / xx.length);

        //4
        // sort an array of strings
        String[] strs = {"a", "aaa", "aaaaa", "aa", "aaaa"};
        int a;
        int b;
        String tempHolder;

        for (a = 1; a < strs.length; a++) //do this 4 times
            for (b = strs.length - 1; b >= a; b--) //compare elements and sort
                if (strs[b].length() < strs[b-1].length()) {
                    tempHolder = strs[b];
                    strs[b] = strs[b - 1];
                    strs[b - 1] = tempHolder;
                }
        for (String y : strs)
            System.out.print(y + " ");
        System.out.println();

        //5
        //.indexOf(arg) returns the index of the first character where the string first appears
        //.lastIndexOf(arg) returns the index of the first character where the string appears last

        //6
        String s = "I like Java";
        System.out.println(s.length());
        System.out.println(s.charAt(0));

        //8: can't be applied
//        double xxx = 2.0;
//        double xxxx = 3.0;
//        System.out.println(xxx ^ xxxx);

        //9
        int y = 2;
        int y1 = y < 0 ? 10 : 20;
        System.out.println(y1);

        //10
        //it's a logical operator because the bitwise operator can't be applied to the boolean type

        //11
        //(a) yes, it throws outOfBounds exception
        //(b) same error
//        int[] intArray = {1,2,3};
//        System.out.println(intArray[-1]);

        //12
        // The >>> moves the bits to the right adding 0 as the highest order bit

        //13
        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;
        min = max = nums[0];
        for (int a1 : nums) {
            min = a1 < min ? a1 : min;
            max = a1 > max ? a1 : max;
        }
        System.out.println("minimum value is " + min);
        System.out.println("maximum value is " + max);

        //14
        //can't. Because the enhanced for plies on one element per time

        //15
        //yes, but it is less efficient than switching on an int

        //16
        //var

        //17
        var done = false;

        //18
        //String var = ""; // can be a name of a variable but not a name of a class

        //19
        //invalid, because the array type is inferred auto so square braces shouldn't be added to the var

        //20
        //var alpha = 10, beta = 20; // not allowed as only one variable is allowed atm

        //21
        //var mask = 1L; // this is howTO

    }

    //7
    class Encode {
        public static void main(String[] args) {
            String msg = "Hey";
            String encodedMsg = "";
            String decodedMsg = "";
            String key = "12345678";

            var i = 0;
            //encode msg
            for (; i < msg.length(); i++) {
                encodedMsg = encodedMsg + (char) (msg.charAt(i) ^ Integer.parseInt(key));
            }
            System.out.println("Original msg: " + msg);
            System.out.println("Encoded msg: " + encodedMsg);

            //decode msg
            for (var ii = 0; ii < encodedMsg.length(); ii++) {
                decodedMsg = decodedMsg + (char) (encodedMsg.charAt(ii) ^ Integer.parseInt(key));
            }
            System.out.println("Decoded msg: " + decodedMsg);
        }
    }
    private void testAccess() {

    }
}
