package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class Triangle extends Shape {

    public int sideA;
    public int sideB;
    public int sideC;
    String name;

    public Triangle (String definedName, int definedSideA, int definedSideB, int definedSideC) {
        sideA = definedSideA;
        sideB = definedSideB;
        sideC = definedSideC;
        name = definedName;
    }

    public double perimeter() {
        return sideA + sideB + sideC;
    }

    public double area(){
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    String name() {
        return "triangle";
    }

    String myName(){
        return name;
    }

}
