package com.ivik.learning.project10;

/**
 * Created by Sebastien on 27-2-2016.
 */
public class Beverage {
    private String item;
    private double price;

    public Beverage(){}

    public Beverage(String item, double price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
