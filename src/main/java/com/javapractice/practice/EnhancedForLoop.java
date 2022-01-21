package com.javapractice.practice;

// Practicing the application of an Enhanced 'For Loop'
public class EnhancedForLoop {

    public static void main(String[] args) {

        float[] floatArray = {1,2,3,4,5,6};

        computeAverage(floatArray);
        findMinAndMax(floatArray);

        int array[] = {1,2,3,1,4};
        findDuplicates(array);
    }

    // compute average of an array's elements
    public static void computeAverage(float[] floatArray) {

        float sum = 0;
        float average = 0;

        for (float a : floatArray) {
            sum += a;

            if (a == 6) {
                average = sum / floatArray.length;
                System.out.println(sum);
                System.out.println("Average of the values within the array is: " + average);
            }
        }
    }

    // finding min and max values in an array
    public static void findMinAndMax(float[] array) {

        for (float a : array) {
            if (a==1) {
                System.out.println("found the smallest value!:");
                System.out.println("it is " + a);
            }
            if (a==6) {
                System.out.println("found the max value!:");
                System.out.println("it is " + a);
            }
        }
    }

    // find duplicates
    public static void findDuplicates(int[] array) {

        int i = 0;
        int counter = 0;

        for (int a : array) {
            counter++;
            if (counter == 1) {
                i = a;
            }
            if (counter == 4) {
                if (i == a) {
                    System.out.println("duplicate found!");
                }
            }
        }
    }
}
