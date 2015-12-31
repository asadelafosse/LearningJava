package com.ivik.learning.Homework2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class JavaPrimitive {
    public static int a = 010;
    public static int b = 0xFF;
    public static int c = 0b101;
    public static int d = 1000_1;
    public static float e = 5.67f;
    public static double f = 6.78;
    public static long huge = 88888888888l;
    public static char g = '\u20ac';
    public static boolean on = true;
    public static boolean off = false;

    public static void main(String[] args) {


        System.out.println("Variable a is the octal value for " + a + ".");
        System.out.println("Variable b is the hexadecimal value for " + b + ".");
        System.out.println("Variable c is the binary value for " + c + ".");
        System.out.println("Variable d is " + d + ".");
        System.out.println("Variable e is " + e + ".");
        System.out.println("Variable f is " + f + ".");
        System.out.println("Variable huge is " + huge + ".");
        System.out.println("Variable g is the character " + g + ".");
        System.out.println("Variable on has the boolean value " + on + ".");
        System.out.println("Variable off has the boolean value  " + off + ".");
    }

}

