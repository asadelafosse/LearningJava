package com.ivik.learning.homework3.students.exam;

import com.ivik.learning.homework3.students.model.Student;
import com.ivik.learning.homework3.students.util.SortUtils;

/**
 * Created by Sebastien on 11-1-2016.
 */
public class StudentExamScores {

    private Student[] students;

        private void initExamScores() {
        Student student1 = new Student("Anton", 34.5);
        Student student2 = new Student("Bernard", 12.3);
        Student student3 = new Student("Cornelis", 100.0);
        Student student4 = new Student("Dirk", 66.7);
        Student student5 = new Student("Eduard", 80.0);
        Student student6 = new Student("Ferdinand", 55.5);
        Student student7 = new Student("Gerard", 0.0);
        Student student8 = new Student("Hendrik", 71.4);
        Student student9 = new Student("Izaak", 95.2);
        Student student10 = new Student("Johannes", 66.7);

        students = new Student[]{student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
    }

    public StudentExamScores() {
        initExamScores();
    }

    public void reportStudentScores() {

        SortUtils.sortStudents(students);

        System.out.println("NAME                 SCORE ");
        System.out.println("-------------------- ------");
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i].getName());
            for (int j = 0; j < 20 - students[i].getName().length(); j++){
                System.out.print(" ");
            }
            System.out.format("%7.2f%n", students[i].getScore());

        }
    }

    public static void main(String[] args) {
        new StudentExamScores().reportStudentScores();


    }

}