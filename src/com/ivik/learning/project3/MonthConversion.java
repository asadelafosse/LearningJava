package com.ivik.learning.project3;

/**
 * Created by Sebastien on 15-1-2016.
 */
public class MonthConversion {

    public static String[] convertMonth(int month) {
        String[] monthWords;
        monthWords = new String[2];
        switch (month){
            case 1:
                monthWords[0] = "January";
                monthWords[1] = "first";
                break;
            case 2:
                monthWords[0] = "February";
                monthWords[1] = "second";
                break;
            case 3:
                monthWords[0] = "March";
                monthWords[1] = "third";
                break;
            case 4:
                monthWords[0] = "April";
                monthWords[1] = "fourth";
                break;
            case 5:
                monthWords[0] = "May";
                monthWords[1] = "fifth";
                break;
            case 6:
                monthWords[0] = "June";
                monthWords[1] = "sixth";
                break;
            case 7:
                monthWords[0] = "July";
                monthWords[1] = "seventh";
                break;
            case 8:
                monthWords[0] = "August";
                monthWords[1] = "eighth";
                break;
            case 9:
                monthWords[0] = "September";
                monthWords[1] = "ninth";
                break;
            case 10:
                monthWords[0] = "October";
                monthWords[1] = "tenth";
                break;
            case 11:
                monthWords[0] = "November";
                monthWords[1] = "eleventh";
                break;
            case 12:
                monthWords[0] = "December";
                monthWords[1] = "twelfth";
                break;
            default:
                monthWords[0] = "null";
                monthWords[1] = "null";
                break;
        }
        return monthWords;

    }

    public static void main(String[] args) {
        System.out.println("We are counting the months in the year:");
        for (int month = 1; month <= 15; month++) {
            String[] convertMonth = convertMonth(month);
            if (convertMonth[0] == "null" || convertMonth[1] == "null") {
                System.out.println("Huh? " + month + "? But there are only 12 months in a year!");
            } else System.out.println("The " + convertMonth[1] + " month of the year is " + convertMonth[0] + ".");

        }
    }

}
