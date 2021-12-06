package com.javapractice.practice;

public class FourDimensionalArray {

    public static void main(String[] args) {
        
        int array4D[][][][] = new int[2][2][2][2];

        int i, j, k, l;

        for (i=0; i<2; i++) { 
            for (j=0; j<2; j++) { 
                for (k=0; k<2; k++) { 
                    for (l=0; l<2; l++) {

                        array4D[i][j][k][l] = l;
                        System.out.print(array4D[i][j][k][l] + " ");
                    }
                }
            }
        }
        System.out.println();
    }
    
}
