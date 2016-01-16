package com.ivik.learning.project2;

/**
 * Created by Sebastien on 27-12-2015.
 */
public class NamesAllowed {

    public static void main(String[] args) {

        String isChanged = "isChanged is a valid variable name.";
        System.out.println(isChanged);

        String $name = "$name is a valid variable name, but it does break coding conventions.";
        System.out.println($name);

        String €name = "€name is a valid variable name. (I did not know this symbol was allowed at the start of a variable.)";
        System.out.println(€name);

        String Name = "Name is a valid variable name, but it does break coding conventions.";
        System.out.println(Name);

        String string = "string is a valid variable name.";
        System.out.println(string);

        String For = "For is a valid variable name, but it does break coding conventions.";
        System.out.println(For);

        String While = "While is a valid variable name, but it does break coding conventions.";
        System.out.println(While);

        String _address = "_address is a valid variable name, but it does break coding conventions.";
        System.out.println(_address);

        String __4444 = "__4444 is a valid variable name, but it does break coding conventions.";
        System.out.println(__4444);

        System.out.println("---");

        // String 5name = "5name is not a valid variable name.";
        System.out.println("5name is not a valid variable name, because variables may not start with numbers.");

        // String #name = "#name is not a valid variable name.";
        System.out.println("#name is not a valid variable name, because variables may not start with other non-letter symbols than _ and $.");

        // String for = "for is not a valid variable name.";
        System.out.println("for is not a valid variable name, because it is already the name of a method.");

        // String while = "while is not a valid variable name.";
        System.out.println("while is not a valid variable name, because it is already the name of a method.");

        // String switch = "switch is not a valid variable name.";
        System.out.println("switch is not a valid variable name, because it is already the name of a method.");


    }
}
