package com.ivik.learning.project4.shapes;

import static com.ivik.learning.project4.shapes.ShapeDetail.*;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class ExamineShapes {

    public static void reportDetail(Shape shape){
        String typeName = shapeName(shape);      //this String serves to name the subclass a shape belongs to.
        String instanceName = myName0(shape);    //this String serves to be able to print the name of objects.
        double area = shapeArea(shape);
        System.out.print("The area of the " + typeName + " named '" + instanceName + "' is: ");
        System.out.format("%.2f", area);
        System.out.println(" cm.");
        double perimeter = shapePerimeter(shape);
        System.out.print("The perimeter of the " + typeName + " named '" + instanceName + "' is: ");
        System.out.format("%.2f", perimeter);
        System.out.println(" cm2.\r\n");
    }


    public static void main(String[] args) {
        double area;
        double perimeter;

        Rectangle rectangle1 = new Rectangle("rectangle 1",12,6);
        Square square1 = new Square("square 1",5);
        Circle circle1 = new Circle("circle 1",10);
        Triangle triangle1 = new Triangle("triangle 1",3,4,5);
        Shape ghost1 = new Shape("the ghost of christmas past");
        Shape ghost2 = new Shape();             //these are nonsense objects to test the default values in the Shape superclass

        reportDetail(rectangle1);        //it seemed more efficient to create a standardized method for printing area and perimeter.
        reportDetail(square1);
        reportDetail(circle1);
        reportDetail(triangle1);
        reportDetail(ghost1);
        reportDetail(ghost2);

    }

}
