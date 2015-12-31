package com.ivik.learning.Homework2;

import java.util.Arrays;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class Fibonacci {

    public static int GenerateFibonacci(int number){

        int i = 1;
        int fibo = -1; // The package refuses to run unless I assign an (arbitrary) value to this variable here.
        int a = 0;
        int b = 1;
        int a$;        // These are temporary values used to store current Fibonacci values before using them to
        int b$;        // calculate their successors

        while (i <= number){
            if (i == 1){
                fibo = 0;
            } else if (i == 2){
                fibo = 1;
            } else {
                fibo = a + b;
                a$ = a;
                b$ = b;
                a = b$;
                b = a$ + b$;
            }
            if (i == number){
                break;
            }
            i++;
        }

        return fibo;
    }

    public static void main(String[] args) {
        int number = 15;     // Adjust this value to determine the length of the sequence to be generated.
        int fiboOutput;
        System.out.println("Here are the first " + number + " values of the Fibonacci sequence:");

        for (int i = 1; i <= number; i++){
            fiboOutput = GenerateFibonacci(i);
            System.out.print(fiboOutput);
            if (i < number){     // This is to add commas in between sequence values, but not at the beginning or end of the series.
                System.out.print(",");
            }
        }
    }
}
