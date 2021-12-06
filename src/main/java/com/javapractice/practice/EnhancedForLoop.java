package com.javapractice.practice;

public class EnhancedForLoop {

    //COmputing an Average 
    public static void main(String[] args) {
        
        float[] intArray = {1,2,3,4,5,6};
        float sum = 0;
        float average = 0;

        for (float a : intArray) {
            sum += a;

            if (a == 6) {
                average = sum / intArray.length;
                System.out.println(sum);
                System.out.println("Average of the values within the array is: " + average);
            }
        }
    }
}
