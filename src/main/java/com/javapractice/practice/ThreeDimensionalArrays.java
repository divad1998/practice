package com.javapractice.practice;

public class ThreeDimensionalArrays {
    
    public static void main(String[] args) {
        
        int table3D[][][] = new int[2][2][2];

        int i, j, k;

        for (i=0; i<2; i++) { 
            for (j=0; j<2; j++) { 
                for (k=0; k<2; k++) { 

                    table3D[i][j][k] = k; 
                    System.out.print(table3D[i][j][k] + " ");
                }
            }
        }
        System.out.println();
    }
}
