package com.ivik.learning.Homework2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("This is the FizzBuzz challenge. I found two solutions: \r\n");

        int threes = 1;
        int fives = 1;

        System.out.println("This is my first solution:");      // This the first solution, which checks for multiples of
        for (int i = 1; i<=100; i++, threes++, fives++) {      // 3 and 5. At multiples of 15, it constructs the FizzBuzz
            if (threes == 3 || fives == 5) {                   // statement out of the separate Fizz and Buzz statements.
                if (threes == 3) {
                    System.out.print("Fizz");
                    threes = 0;
                }
                if (fives == 5) {
                    System.out.print("Buzz");
                    fives = 0;
                }
                System.out.println("!");                       // This exclamation mark is printed after every non-number.
            } else System.out.println("Counting: " + i);
        }

        System.out.println("\r\nThis is my second solution:");   // This is the second solution, which checks separately
        for (int i = 1; i<=100; i++, threes++, fives++) {        // for multiples of 15, 3 and 5 (in that order).
            if (threes == 3 && fives == 5){
                System.out.println("FizzBuzz!");
                threes = 0;
                fives = 0;
            } else if (threes == 3){
                System.out.println("Fizz!");
                threes = 0;
            } else if (fives == 5){
                System.out.println("Buzz!");
                fives = 0;
            } else System.out.println("Counting: " + i);
        }
    }
}
