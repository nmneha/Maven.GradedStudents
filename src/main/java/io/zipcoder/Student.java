package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    public Student(String firstName, String lastName, Double[] examScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = new ArrayList<>(Arrays.asList(examScores));
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();
    }

    public String getExamScores() {
        String scores = "";
        int examNum = 1;
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            scores += "Exam " + examNum + " ->" + examScores.get(i) + "\n";
            examNum++;
        }
        return scores;
    }

    public void addExamScore(double examScore) {
        examScores.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore) {
         examScores.set(examNumber-1, newScore);
    }

    public Double getAverageExamScore() {
        double sum = 0;
        for (int i = 0; i < getNumberOfExamsTaken(); i++) {
            sum += examScores.get(i);
        }
        return sum / getNumberOfExamsTaken();
    }

    public String toString() {
        String student = "Student Name: " + getFirstName() + getLastName() + "\n" +
                    "Average score: " + getAverageExamScore() + "\n" +
                    "Exam Scores:" +  getExamScores();
            return student;
        }
}




