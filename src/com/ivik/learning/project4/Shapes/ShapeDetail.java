package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class ShapeDetail {

    public static double shapeArea(Shape shape){
        return shape.area();
        }

    public static double shapePerimeter(Shape shape){
        return shape.perimeter();
    }

    public static String shapeName(Shape shape){
        return shape.name();
    }

    public static String myName0(Shape shape){
        return shape.myName();
    }
}
