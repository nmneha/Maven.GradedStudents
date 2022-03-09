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
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }

    }

    public void removeStudent(String firstName, String lastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName() == firstName && students[i].getLastName() == lastName) {
                students[i] = null;
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = students[i + 1];
                students[i + 1] = null;
            }
        }
    }

    public Student[] getStudentsByScore() {
        Student temp;
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i + 1].getAverageExamScore() > students[i].getAverageExamScore()) {
                temp = students[i + 1];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }

        for (int i = 0; i < students.length - 1; i++) {
            String firstName1 = students[i].getFirstName();
            String firstName2 = students[i + 1].getFirstName();
            String lastName1 = students[i].getLastName();
            String lastName2 = students[i + 1].getLastName();
            if (students[i].getAverageExamScore() == students[i + 1].getAverageExamScore()) {
                if (firstName1.charAt(0) < firstName2.charAt(0)) {
                    temp = students[i + 1];
                    students[i] = students[i + 1];
                    students[i + 1] = temp;
                } else if (firstName1.charAt(0) == firstName2.charAt(0)) {
                    if (lastName1.charAt(0) < lastName2.charAt(0)) {
                        temp = students[i + 1];
                        students[i] = students[i + 1];
                        students[i + 1] = temp;
                    } else if (lastName1.charAt(0) == lastName2.charAt(0)) {
                    }
                }

            }
        }
        return students;
    }
    //public Student[] getStudentByScore() {
    //List <Student> studentSortedList = Arrays.asList(students);
    //Comparator<Student> comparator =
    //      Comparator.comparingDouble((Student s) -> -s.getAverageExamScore())
    //                  .thenComparing(s -> s.getLastName())
    //                  .thenComparing(s -> s.getFirstName());
    //Collections.sort(studentSortedList, comparator);
    //return studentSortedList.toArray(new Student[students.length]);
    //change code, does not work with null

    public Map<Student, String> getGradeBook() {
        Double percentile;
        Student[] sortedClass = this.getStudentsByScore();
        Map<Student, String> gradebook = new HashMap<>();
        int count = getStudentsByScore().length;
        for (int i = 0; i < students.length; i++) {
           percentile = ((count-i-1.0/(count)));
            if (percentile >= .9) {
                gradebook.put(sortedClass[i], "A");
            } else if (percentile >= .71 && percentile < .9) {
                gradebook.put(sortedClass[i], "B");
            } else if (percentile >= .50 && percentile < .71) {
                gradebook.put(sortedClass[i], "C");
            } else if (percentile >= .11 && percentile < .50) {
                gradebook.put(sortedClass[i], "D");
            } else if (percentile < .11) {
                gradebook.put(sortedClass[i], "F");
            }
        }

        return gradebook;

    }

}