package com.ivik.learning.project10;

import java.util.Comparator;


/**
 * Created by Sebastien on 27-2-2016.
 */
public class BeverageAnonymousClassSorting {

    Beverage beverage1 = new Beverage("coffee", 1.50);
    Beverage beverage2 = new Beverage("tea", 1.20);
    Beverage beverage3 = new Beverage("wine", 2.00);
    Beverage beverage4 = new Beverage("beer", 2.00);
    Beverage beverage5 = new Beverage("golden nectar of the gods", 1000000);
    Beverage beverage6 = new Beverage("water", 1.00);
    Beverage[] priceList = new Beverage[]{beverage1, beverage2, beverage3, beverage4, beverage5, beverage6};

    Comparator compareItem = new Comparator(){

        public int compare(Object item1, Object item2){
            String string1 = (String) item1;
            String string2 = (String) item2;
            int comparison = string1.compareToIgnoreCase(string2);
            if (comparison < 0){return -1;}
            else if (comparison > 0){return 1;}
            else return 0;
        }
    };

    Comparator comparePrice = new Comparator(){

        public int compare(Object price1, Object price2){
            if ((double) price1 < (double) price2){return -1;}
            else if ((double) price1 > (double) price2){return 1;}
            else return 0;
        }
    };

    Beverage[] sortedBeveragesByItem(Beverage[] input, Comparator comp){
        Beverage temp;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i <= input.length-2; i++) {
                int decider = comp.compare(input[i].getItem(), input[i + 1].getItem());
                if (decider == 1) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return input;
    }

    Beverage[] sortedBeveragesByPrice(Beverage[] input, Comparator comp){
        Beverage temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i <= input.length - 2; i++) {
                int decider = comp.compare(input[i].getPrice(), input[i + 1].getPrice());
                if (decider == 1) {
                    temp = input[i];
                    input[i] = input[i + 1];
                    input[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        return input;
    }

    void priceListPrinter(Beverage[] priceList){
        for (int i = 0; i<= priceList.length-1; i++){
            System.out.format("%s: %.2f",priceList[i].getItem(),priceList[i].getPrice());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BeverageAnonymousClassSorting myTry = new BeverageAnonymousClassSorting();

        System.out.println("Price list in original, unsorted order:");
        myTry.priceListPrinter(myTry.priceList);
        System.out.println();

        System.out.println("Price list sorted by name:");
        Beverage[] priceListByName = myTry.sortedBeveragesByItem(myTry.priceList, myTry.compareItem);
        myTry.priceListPrinter(priceListByName);
        System.out.println();

        System.out.println("Price list sorted by price:");
        Beverage[] priceListByPrice = myTry.sortedBeveragesByPrice(myTry.priceList, myTry.comparePrice);
        myTry.priceListPrinter(priceListByPrice);

    }


}
