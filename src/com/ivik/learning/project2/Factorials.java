package com.ivik.learning.project2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class Factorials {

    public static int CalculateFactorial(int number){
        int factorial = number;
        int counter = number;

        if (counter == 0) {
            factorial = 1;                            // The factorial for 0 is 1 by stipulation, not calculation.

        } else if (counter == 1 || counter == 2){     // Factorials for 1 and 2 are identical with themselves, as already
                                                      // defined.
        } else do {
            if (counter > 1){                         // These two if-statements serve to ensure multiplying by 1
                counter--;                            // (while still terminating the loop) which is mathematically more
            }                                         // pure in calculating factorials, even if it less efficient.
            factorial = factorial * counter;
            if (counter == 1) {
                break;
            }
        } while (counter >= 1);
        return factorial;
    }

    public static void main(String[]args){
        for (int number = 0; number <= 10; number++) {
            System.out.println("The factorial of " + number + " is " + CalculateFactorial(number) + ".");
        }
    }
}
