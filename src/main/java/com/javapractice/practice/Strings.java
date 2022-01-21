package com.javapractice.practice;

public class Strings {

    public static void main(String[] args) {

        // constructing strings
        String str = new String("Hello Coders! I am here, Coders!");
        String str1 = new String(str);
        System.out.println(str);
        System.out.println(str1);

        //operating on strings
        //.equals()
        if (str.equals(str1)) {
            System.out.println("str and str1 are equal");
        }

        //.length()
        System.out.println(str.length());

        //charAt(index)
        System.out.println(str.charAt(0));

        //.compareTo()
        System.out.println(str.compareTo(str1));

        //.indexOf()
        int index = str.indexOf("Coders!"); // returns index of first character in string
        System.out.println(index);
        System.out.println(str.lastIndexOf("Coders!"));

        // concatenation
        String str2 = " And I'm coming in hard!";
        System.out.println(str + str2);

        //Array of Strings
        String[] strArray = {"This is", "david."};
        for (String s : strArray) {
            System.out.print(s + " ");
        }
        System.out.println();

        // Strings are immutable
        String ss = "shit"; // for eg. char r can't be added to make this object "shirt".

        // mutable strings
        StringBuffer strBuffer = new StringBuffer("test");
        System.out.println(strBuffer.append("s"));
        strBuffer.setCharAt(4, 'y');
        System.out.println(strBuffer); // it's strange that we are printing a string buffer, coz of the name tho

        StringBuilder strBuilder = new StringBuilder("Dave");
        strBuilder.append('s');
        System.out.println(strBuilder);

        //substrings
        String substr = strBuilder.substring(1, 3);
        System.out.println(substr);

        //Using a string to control a switch ladder
        switch(substr) { // it is firstly hashed then .equals is called against the cases' hashes
            case "av":
                System.out.println("this is it.");
                break;
            case "va":
                System.out.println("Of course this isn't it");
                break;
        }

        //by-the-by
        int i;
        for (i = 0; i<2; i++) {
            System.out.println("dave");
        }

        if(i==2) { //at the end, i is indeed incremented to 2.
            System.out.println("so this is where the value is stored indeed! Boom!");
        }

        //local variable type inference:
        //can't be used as class names
//        class var{
//
//        }
        //can be used to declare local variables. Here it is declared within the main method.
        var a = 2;

        //using var to initialize the control variable of a for-loop
        for (var ii = 0; ii<3; ii++) {
            //...;
        }
        // inn the enhanced for-loop
        var sss = new String[2];
        for (var s : sss) {
            // '''
        }
        //only one variable declarable at a time
        //var aa, aaa, aaaa;

        //can't hold null
        //var n = null;

        //can't be used with array explicit initializers
        //var p = {"a", "b"};

        //lambda expressions not allowed
        //var bb = () -> "blah";

        //method references are not allowed
        //var prnt = System.out.println(("test"));
    }
    // var can't be used to declare an instance variable. See below:
    //var a = "a";

    //can't be used as return type
   // public var send() {
    //    return sss;

   // can't be used as the typ of thrown exception'
//    try
//    {
//        try {
//            FileOutputStream f = new FileOutputStream("...");
//        } catch (var e) {
//            e.printStackTrace();
//        }
//    }
}


