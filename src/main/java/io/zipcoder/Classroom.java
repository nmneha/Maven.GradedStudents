package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Classroom {
    private Student[] students;

    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] student) {
        students = student;
    }

    public Classroom() {
        this(30);
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScores() {
        double sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;
    }

    public void addStudent(Student student) {
       Arrays.fill(students, student); // for loop student[i] = student
    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i ++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName) {
                students[i] = null;
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = students[i+1];
            }
        }
    }

    public Student[] getStudentsByScore() {
        for (int i = 0; i < students.length-1; i++) {
            if (students[i + 1].getAverageExamScore() > students[i].getAverageExamScore()) {
                students[i] = students[i+1];
            }
        }

        for (int i = 0; i < students.length-1; i++) {
            if (students[i].getAverageExamScore() == students[i+1].getAverageExamScore()) {
              String firstName1 = students[i].getFirstName();
               String firstName2 = students[i+1].getFirstName();
               if(firstName1.charAt(i) < firstName2.charAt(i)) {
                   students[i] = students[i+1];
               }
            }
        }


        return students;

    }

    public Student[] getGradeBook() {

    }




}
