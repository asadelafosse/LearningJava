package com.ivik.learning.project7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Sebastien on 11-2-2016.
 */
public class AddingLinesFromFile {

    private static int scanAndSum(String fileName) throws FileNotFoundException {
        int sum = 0;
        Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
        scanner.useDelimiter("\r\n");
        while(scanner.hasNext()){
            sum += scanner.nextInt();
        }
        scanner.close();
        return sum;
    }

    private static void printFile(String fileName) throws IOException {
        char[] in = new char[50];
        FileReader reader = new FileReader(fileName);
        reader.read(in);
        System.out.println(in);
        reader.close();
        System.out.println();
    }

    private static void main(String[] args) throws IOException{
        String fileName = ("numbers2.txt");

        System.out.println("The file " + fileName + " has the following lines:");
        printFile(fileName);

        int sum = scanAndSum(fileName);

        File file = new File("outcome2.txt");

        FileWriter writer = new FileWriter("outcome2.txt");
        System.out.println("Writing to file " + file + ":");
        System.out.println("The sum of all lines in " + fileName + " is " + sum + ".");
        writer.write("The sum of all lines in " + fileName + " is " + sum + ".\n");
        writer.flush();
        writer.close();
    }
}
