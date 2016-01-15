package com.ivik.learning.homework3;

/**
 * Created by Sebastien on 15-1-2016.
 */
public class PracticeArrayManipulation {

    public static void printArray(int arrayInput[]){
        for(int i: arrayInput){
            System.out.format("%4d", i);
        }
    }

    public static void main(String[] args) {
        int[] anArray1a = new int[]{5,20,40,15,1,30,100,6,300,23,48};
        int[] anArray1b = anArray1a;
        int[] anArray2a = java.util.Arrays.copyOfRange(anArray1a, 3, 9);
        int[] anArray2b = anArray2a;

        System.out.print("Unsorted Array 1: ");
        printArray(anArray1a);
        System.out.print("\r\n");

        java.util.Arrays.sort(anArray1b);
        System.out.print("Sorted Array 1:   ");
        printArray(anArray1b);
        System.out.print("\r\n");

        System.out.print("Unsorted Array 2: ");
        printArray(anArray2a);
        System.out.print("\r\n");

        java.util.Arrays.sort(anArray2b);
        System.out.print("Sorted Array 2:   ");
        printArray(anArray2b);
        System.out.print("\r\n");
    }

}
