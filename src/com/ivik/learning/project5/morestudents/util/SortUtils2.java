package com.ivik.learning.project5.morestudents.util;

import com.ivik.learning.project3.students.model.Student;

/**
 * Created by Sebastien on 27-1-2016.
 */
public class SortUtils2 {

    public static void sortStudents(Student[] students, StudentComparable compare){

        boolean sorted = false;
        Student temp;

        while(!sorted){

            sorted = true;

            for (int i = 0; i<=students.length - 2; i++) {
                int swap = compare.compareTo(students[i],students[i+1]);
                if(swap == 0 || swap == 1){              // if swap is 0 or 1, nothing needs to be done
                } else if(swap == -1) {
                    temp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                    temp = null;
                    sorted = false;
                }
            }
        }
    }
}
