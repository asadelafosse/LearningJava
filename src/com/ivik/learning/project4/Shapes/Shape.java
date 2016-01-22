package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class Shape {
    String name;

    public Shape () {
        name = "unknown";  //this name will only be returned by default, when no proper constructor is used.
    }

    public Shape (String definedName) {
        name = definedName;             // I included a name field for individual objects for output purposes.
    }

    double area() {
        return 0;     //added this as a default nonsense value for an insufficiently defined shape that is not part of any subclass
    }

    double perimeter(){
        return 0;     //added this as a default nonsense value for an insufficiently defined shape that is not part of any subclass
    }

    String name(){
        return "undefined shape";         //I included a name field for every shape for output purposes.
    }

    String myName(){
        return name;
    }

}
