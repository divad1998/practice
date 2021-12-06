package com.javapractice.practice;

public class IrregularArrays {

    public static void main(String[] args) {
        
        int table[][] = new int[2][];

        table[0] = new int[9];
        table[1] = new int[10];

        int i, j;

        for (i=0; i<1; i++) {
            for (j=0; j<9; j++) {
                
                if (j != 2 && j != 4 && j!=7) { // they all have to pass
                    
                    table[i][j] = i + j;
                    if (j==8) {
                        System.out.print(table[i][j]);
                    } else {
                        System.out.print(table[i][j] + ",");
                    }
                } else {
                    System.out.print(" ,");
                }              
            }
        }
        System.out.println();

        for (i=1; i<=1; i++) {
            for (j=0; j<10; j++) {
                
                if (j!=0 && j!=3 && j!=6 && j!=7 && j!=9) {
                    
                    table[i][j] = i + j + 8;
                    System.out.print(table[i][j] + ",");
                } else {
                    if (j==9) {
                        System.out.print(" .");
                    } else {
                        System.out.print(" ,");
                    }     
                }
            }
        }
        System.out.println();
    }
}