package com.ivik.learning.project3.students.util;

import com.ivik.learning.project3.students.model.Student;

/**
 * Created by Sebastien on 11-1-2016.
 */
public class SortUtils {

    public static void sortStudents(Student[] students){

        boolean sorted = false;

        while(!sorted){

            sorted = true;
            int j = 1;

            for (int i = 0; i<=students.length - 2; i++) {
                if(students[i].getScore() > students[j].getScore()) {
                    Student temp;
                    temp = students[i];
                    students[i] = students[i+1];
                    students[i+1] = temp;
                    temp = null;
                    sorted = false;
                }
            }
        }
    }
}
