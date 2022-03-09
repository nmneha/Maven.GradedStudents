package io.zipcoder;

import java.util.*;

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
       Arrays.fill(students, student); // do a for loop instead, error if you try to add more than max
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

    public Map<String, Student> getGradeBook() {
        HashMap<String, Student> gradebook = new HashMap<>();
        for (int i = 0; i < students.length; i++) {
            double percentile = students[i].getAverageExamScore()/getAverageExamScores();
            if(percentile > .9) {
                gradebook.put("A", students[i]);
            } else if(percentile > .71 && percentile < .9) {
                gradebook.put("B", students[i]);
            } else if(percentile > .50 && percentile < .71) {
                gradebook.put("C", students[i]);
            } else if(percentile > .11 && percentile < .50) {
                gradebook.put("D", students[i]);
            } else if(percentile < .11) {
                gradebook.put("F", students[i]);
            }
        }

        return gradebook;

    }




}
