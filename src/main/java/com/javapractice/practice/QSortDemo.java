package com.javapractice.practice;

public class QSortDemo {

    public static void main(String[] args) {
        char[] a = {'d', 'n', 'a', 'j', 'p', 'o', 'i'}; //i = 3; j = 3; pon == nop
        int i;


        System.out.print("Original array: ");
        for(i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();

        //quick sort array
        QuickSort.callQSort(a);

        System.out.print("Sorted array ");
        for (i=0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    class QuickSort {

        //subroutine to reach the actual quicksorter
        static void callQSort(char[] items) {
            qSort(items, 0, items.length - 1);
        }

        //using do-while
        private static void qSort(char[] items, int left, int right) {
            int i, j; //for?
            char x, y; //for?

            i = left; j = right; // what for?
            x = items[(left+right)/2]; //gets middle char in array

            do {
                while((items[i] < x) && (i < right)) {
                    i++;
                }
                while((x < items[j]) && (j > left)) {
                    j--;
                }

                if (i <= j) {
                    y = items[i];
                    items[i] = items[j];
                    items[j] = y;
                    i++; j--;
                }
            } while (i <= j);

            if (left < j) qSort(items, left, j);
            if(i < right) qSort(items, i, right);
        }
    }
}
