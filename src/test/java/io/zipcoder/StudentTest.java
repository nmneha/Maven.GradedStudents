package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void constructorTrueTest() {
        String firstName = "Mikey";
        String lastName = "Way";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        Student student = new Student(firstName, lastName, examScores);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualExamScores = student.getExamScores();

        String expectedFirstName = "Mikey";
        String expectedLastName = "Way";
        String expectedExamScores = "Exam Scores: \n" +
                "Exam 1 -> 100.0\n" +
                "Exam 2 -> 92.0\n" +
                "Exam 3 -> 85.0\n" +
                "Exam 4 -> 98.0\n";

        Assert.assertEquals(expectedFirstName, actualFirstName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedExamScores, actualExamScores);
    }

    @Test
    public void constructorFalseTest() {
        String firstName = "Gerard";
        String lastName = "Way";
        Double[] examScores = {100.0, 92.0, 85.0, 98.0};
        Student student = new Student(firstName, lastName, examScores);

        String actualFirstName = student.getFirstName();
        String actualLastName = student.getLastName();
        String actualExamScores = student.getExamScores();

        String expectedFirstName = "Frank";
        String expectedLastName = "Iero";
        String expectedExamScores = "Exam Scores: \n" +
                "Exam 1 -> 99.0\n" +
                "Exam 2 -> 95.0\n" +
                "Exam 3 -> 83.0\n" +
                "Exam 4 -> 92.0\n";



        Assert.assertFalse(expectedFirstName.equals(actualFirstName));
        Assert.assertFalse(expectedLastName.equals(actualLastName));
        Assert.assertFalse(expectedExamScores.equals(actualExamScores));
    }

    @Test
    public void setGetLastNameTest() {
        String firstName = "Gerard";
        String lastName = "Way";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        Student student = new Student(firstName, lastName, examScores);

        student.setLastName("Iero");
        String actual = student.getLastName();
        String expected = "Iero";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setGetLastNameFalse() {
        String firstName = "Gerard";
        String lastName = "Way";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        Student student = new Student(firstName, lastName, examScores);

        student.setLastName("Iero");
        String actual = student.getLastName();
        String expected = "Way";

        Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void setGetFirstNameTest() {
        String firstName = "Gerard";
        String lastName = "Way";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        Student student = new Student(firstName, lastName, examScores);

        student.setFirstName("Frank");
        String actual = student.getFirstName();
        String expected = "Frank";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setGetFirstNameFalse() {
        String firstName = "Gerard";
        String lastName = "Way";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        Student student = new Student(firstName, lastName, examScores);

        student.setFirstName("Frank");
        String actual = student.getFirstName();
        String expected = "Gerard";

        Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void getNumberOfExamsTakenTest() {
        String firstName = "Steve";
        String lastName = "Rogers";
        Double[] examScores = {55.0, 67.0, 78.0, 90.0};
        Student student = new Student(firstName, lastName, examScores);

        Integer actualNumberOfExams = student.getNumberOfExamsTaken();
        Integer expectedNumberOfExams = 4;

        Assert.assertEquals(expectedNumberOfExams, actualNumberOfExams);

    }

    @Test
    public void getNumberOfExamsTakenFalse() {
        String firstName = "Steve";
        String lastName = "Rogers";
        Double[] examScores = {55.0, 67.0, 78.0, 90.0};
        Student student = new Student(firstName, lastName, examScores);

        Integer actualNumberOfExams = student.getNumberOfExamsTaken();
        Integer expectedNumberOfExams = 0;

        Assert.assertFalse(expectedNumberOfExams == actualNumberOfExams);

    }

    @Test
    public void getExamScoresTest() {
        String firstName = "Tony";
        String lastName = "Stark";
        Double[] examScores = {77.0, 67.0, 78.0, 90.0};
        Student student = new Student(firstName, lastName, examScores);

        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 77.0\n" +
                "Exam 2 -> 67.0\n" +
                "Exam 3 -> 78.0\n" +
                "Exam 4 -> 90.0\n";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getExamScoresFalse() {
        String firstName = "Tony";
        String lastName = "Stark";
        Double[] examScores = {77.0, 67.0, 78.0, 90.0};
        Student student = new Student(firstName, lastName, examScores);

        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 72.0\n" +
                "Exam 2 -> 67.0\n" +
                "Exam 3 -> 78.0\n" +
                "Exam 4 -> 90.0\n";

        Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void addExamScoreTest() {
        String firstName = "Tamaki";
        String lastName = "Suoh";
        Double[] examScoreArr = {20.0, 30.0, 40.0, 50.0};
        ArrayList<Double> examScores = new ArrayList<>(Arrays.asList(examScoreArr));
        Student student = new Student(firstName, lastName, examScoreArr);

        student.addExamScore(70);

    }


}
