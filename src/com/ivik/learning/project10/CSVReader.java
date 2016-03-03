package com.ivik.learning.project10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Sebastien on 27-2-2016.
 */
public class CSVReader {

    //firstname,lastname,age,city,postcode,streetname,housenumber

    private static ArrayList<String> readCSV(String fileName) throws FileNotFoundException, IOException {
        ArrayList<String> csvAsString = new ArrayList();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        boolean hasNextLine = true;

        while (hasNextLine) {
            String aLine = reader.readLine();
            if (aLine != null) {
                csvAsString.add(aLine);
            } else {
                hasNextLine = false;
            }
        }
        reader.close();
        return csvAsString;
    }

    public static void main(String[] args) throws IOException, ArrayIndexOutOfBoundsException {
        ArrayList<String> csvRawArray = readCSV("People.csv");
        ArrayList<ArrayList<String>> csvSeparatedFinal = new ArrayList();
        ArrayList<String> csvSeparatedByLine = new ArrayList();

        for (int i = 0; i <= csvRawArray.size()-1; i++) {
            String unseparatedLine = csvRawArray.get(i);
            String[] separatedLine = unseparatedLine.split(",");
            Collections.addAll(csvSeparatedByLine, separatedLine);
            csvSeparatedFinal.add(csvSeparatedByLine);
        }

        System.out.println(csvSeparatedFinal);


    }
}
