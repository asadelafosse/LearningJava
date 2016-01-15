package com.ivik.learning.homework3.students.util;

import com.ivik.learning.homework3.students.model.Student;

/**
 * Created by Sebastien on 11-1-2016.
 */
public class SortUtils {

    public static void sortStudents(Student[] students){

        boolean sorted = false;

        while(sorted == false){

            sorted = true;
            int j = 1;

            for (int i = 0; i<=students.length - 2; i++) {
                j = i + 1;

                if(students[i].getScore() > students[j].getScore()) {
                    Student temp;
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                    temp = null;
                    sorted = false;
                }
            }
        }
    }
}
