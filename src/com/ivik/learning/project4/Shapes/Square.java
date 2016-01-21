package com.ivik.learning.project4.shapes;

/**
 * Created by Sebastien on 20-1-2016.
 */
public class Square extends Rectangle {
    public Square (String definedName, int side){
        super(definedName, side, side);
    }

    String name() {
        return "square";
    }

}
