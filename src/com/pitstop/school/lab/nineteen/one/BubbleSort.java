//Kyle Pittman 4/13/2015.
package com.pitstop.school.lab.nineteen.one;

public class BubbleSort {
    private static int[] sort(int[] arrayToSort){
        int count = 0;
        for (int i = 0; i < arrayToSort.length ; i++) {
            int smallestPos = i;
            for (int j = i; j < arrayToSort.length; j++) {
                if(arrayToSort[j] <= arrayToSort[smallestPos]) smallestPos = j;
                count++;
            }
            int holder = arrayToSort[i];
            arrayToSort[i] = arrayToSort[smallestPos];
            arrayToSort[smallestPos] = holder;
        }
        System.out.println(count);
        return arrayToSort;
    }

    public static void main(String[] args) {
        int[] toSort = new int[100];
        for (int i = 0; i < toSort.length; i++) {
            toSort[i] = (int) (Math.random() * 100);
        }
        int[] sorted = sort(toSort);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    /**
     * O(n^2)
     */
}
