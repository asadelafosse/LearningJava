package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class Circle extends Shape{

    int radius;
    String name;

    public Circle (String definedName, int definedRadius) {
        radius = definedRadius;
        name = definedName;
    }

    public double area(){
        return Math.PI * Math.pow (radius, 2);
    }

    public double perimeter(){
        return 2 * radius * Math.PI;
    }

    String name() {
        return "circle";
    }

    String myName(){
        return name;
    }

}
