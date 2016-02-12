package com.ivik.learning.project7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Sebastien on 12-2-2016.
 */
public class SortingLinesFromFile {

    private static double[] sortLine(String unsortedLine) throws IOException {
        String[] unsortedArray = unsortedLine.split(" ");
        double[] doubleArray = new double[unsortedArray.length];
        for(int i = 0; i<= unsortedArray.length-1; i++){
            doubleArray[i] = Double.parseDouble(unsortedArray[i]);
        }
        double[] sortedArray = doubleArray;
        java.util.Arrays.sort(sortedArray);

        FileWriter writer = new FileWriter("outcome3.txt", true);
        for (int i = 0; i<= sortedArray.length-2; i++){
            writer.write(sortedArray[i] + " ");
        }
        writer.write(sortedArray[sortedArray.length-1] + "\n");
        writer.flush();
        writer.close();

        return sortedArray;
    }

    private static void scanFile(String fileName) throws IOException {
        int lineSum;
        Scanner fileScanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        fileScanner.useDelimiter("\r\n");

        while (fileScanner.hasNext()) {
            String rawLine = fileScanner.next();
            double[] sortedLine = sortLine(rawLine);
            for (int i = 0; i <= (sortedLine.length - 2); i++) {
                System.out.print(sortedLine[i] + " ");
            }
            System.out.println(sortedLine[sortedLine.length - 1]);
        }
    }



    private static void printFile(String fileName) throws IOException {
        char[] in = new char[500];
        FileReader reader = new FileReader(fileName);
        reader.read(in);
        System.out.println(in);
        reader.close();
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        String fileName = ("numbers3.txt");

        System.out.println("The file " + fileName + " has the following lines:");
        printFile(fileName);

        System.out.println("After sorting, these lines are:");

        File file = new File("outcome3.txt");


        scanFile(fileName);

        System.out.println("Writing to file " + file + "...");


    }
}
