package com.ivik.learning.project5.morestudents.exam;

import com.ivik.learning.project3.students.model.Student;
import com.ivik.learning.project5.morestudents.util.SortStudentsByScoreDescending;
import com.ivik.learning.project5.morestudents.util.SortStudentsByScoreAscending;
import com.ivik.learning.project5.morestudents.util.SortUtils2;
import com.ivik.learning.project5.morestudents.util.StudentComparable;

/**
 * Created by Sebastien on 27-1-2016.
 */
public class TestMySortScoreDescendingAndAscending {

    private Student[] moreStudents;

    private void initExamScores(){
        Student student11 = new Student("Karel",55.0);
        Student student12 = new Student("Leo",99.5);
        Student student13 = new Student("Marinus",1.0);
        Student student14 = new Student("Niko",74.3);
        Student student15 = new Student("Otto",25.0);
        Student student16 = new Student("Pieter",47.0);
        Student student17 = new Student("Quirinus",82.8);
        Student student18 = new Student("Richard",77.7);
        Student student19 = new Student("Simon",77.6);
        Student student20 = new Student("Tinus",68.4);

        moreStudents = new Student[]{student11, student12, student13, student14, student15, student16, student17, student18, student19, student20};
    }

    public TestMySortScoreDescendingAndAscending() {
        initExamScores();
    }

    public void reportMoreStudentScores() {

        System.out.println("NAME                 SCORE ");
        System.out.println("-------------------- ------");
        for (Student i : moreStudents) {
            System.out.format("%-20s%7.2f%n", i.getName(),i.getScore());
        }
        System.out.println("\n\r");
    }

    public void sortDescending(){
        StudentComparable sortStudentsByScoreDescending = new SortStudentsByScoreDescending();
        SortUtils2.sortStudents(moreStudents,sortStudentsByScoreDescending);
        reportMoreStudentScores();
    }

    public void sortAscending(){
        StudentComparable sortStudentsByScoreAscending = new SortStudentsByScoreAscending();
        SortUtils2.sortStudents(moreStudents,sortStudentsByScoreAscending);
        reportMoreStudentScores();
    }

    public static void main(String[] args) {

        new TestMySortScoreDescendingAndAscending().sortDescending();
        new TestMySortScoreDescendingAndAscending().sortAscending();






    }
}
