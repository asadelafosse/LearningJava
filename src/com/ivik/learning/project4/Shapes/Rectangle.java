package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class Rectangle extends Shape{

    int width;
    int height;
    String name;
    String className = "rectangle";

    public Rectangle (String definedName, int definedWidth, int definedHeight) {

        width = definedWidth;
        height = definedHeight;
        name = definedName;
    }

    public double area(){
            return width * height;
    }

    public double perimeter(){
         return((2 * width) + (2 * height));
    }

    String name() {
        return "rectangle";
    }

    String myName(){
        return name;
    }
}
