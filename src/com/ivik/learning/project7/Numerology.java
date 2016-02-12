package com.ivik.learning.project7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sebastien on 11-2-2016.
 */
public class Numerology {

    private static int scanLine(String rawIntLine){
        char[] elements = rawIntLine.toCharArray();
        int sum = 0;
        for (int i = 0; i <= (elements.length -1); i++){
            sum += Character.getNumericValue(elements[i]);
        }
        return sum;
    }

    private static void scanFile(String fileName) throws FileNotFoundException {
        int lineSum;
        Scanner fileScanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        fileScanner.useDelimiter("\r\n");

        while (fileScanner.hasNext()){
            String rawLine = fileScanner.next();
            lineSum = scanLine(rawLine);
            System.out.print(lineSum);
            if (lineSum == 42){
                System.out.print(" (which is the answer to life, the universe and everything)");
            }
            System.out.println();
        }

    }

    private static void printFile(String fileName) throws IOException {
        char[] in = new char[50];
        FileReader reader = new FileReader(fileName);
        reader.read(in);
        System.out.println(in);
        reader.close();
        System.out.println();
    }

    public static void main(String[] args) throws IOException{
        String fileName = ("numbers1.txt");

        System.out.println("The file " + fileName + " has the following lines:");
        printFile(fileName);

        System.out.println("The sum of each of the lines in " + fileName + " is:");
        scanFile(fileName);

    }
}
