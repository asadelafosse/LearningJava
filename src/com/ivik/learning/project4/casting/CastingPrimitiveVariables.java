package com.ivik.learning.project4.casting;

/**
 * Created by Sebastien on 19-1-2016.
 */
public class CastingPrimitiveVariables {

    public static void main(String[] args) {
        double pi = 3.14;
        int wholePartPi = (int) pi;
        float piAsFloat = (float) pi;
        long mile = (long) 1609.34;

        System.out.println("pi (double) is: " + pi);
        System.out.println("wholePartPi (int) is: " + wholePartPi);
        System.out.println("piAsFloat (float) is: " + piAsFloat);
        System.out.println("mile (long) is: " + mile);
    }
}
