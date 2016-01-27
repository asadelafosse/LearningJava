package com.ivik.learning.project5.morestudents.util;

import com.ivik.learning.project3.students.model.Student;

/**
 * Created by Sebastien on 27-1-2016.
 */
public class SortStudentsByScoreAscending implements StudentComparable {

    @Override
    public int compareTo(Student s1, Student s2) {

        if (s1.getScore() == s2.getScore()) {
            return 0;
        } else if (s1.getScore() > s2.getScore()) {
            return -1;
        } else //if(s1.getScore() < s2.getScore()){         //This if statement is superfluous, so I have deactivated it.
            return 1;
        //}
    }
}
