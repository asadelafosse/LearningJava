package com.ivik.learning.project5.morestudents.util;

import com.ivik.learning.project3.students.model.Student;

/**
 * Created by Sebastien on 27-1-2016.
 */
public interface StudentComparable {
    /**
     * if comparison is equal, return 0;
     * if s1 is considered less than s2, return -1;
     * if s1 is considered greater than s2, return 1;
     * @param s1
     * @param s2
     * @return
     */
    int compareTo(Student s1, Student s2);
}
