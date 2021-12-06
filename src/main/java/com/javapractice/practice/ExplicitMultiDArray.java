package com.javapractice.practice;

import java.util.Arrays;

public class ExplicitMultiDArray {
    
    public static void main(String[] args) {
        
        int nums3D[][][] = { 

            {{0,1}, {0,1}},
            {{0,1}, {0,1}}
        };

        if (nums3D[1][1][1] == 1) {
            System.out.println("interesting.");
        }
    }
}
