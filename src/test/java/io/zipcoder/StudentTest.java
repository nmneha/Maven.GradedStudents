package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


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
        Student student = new Student(firstName, lastName, examScoreArr);

        student.addExamScore(70);
        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 20.0\n" +
                "Exam 2 -> 30.0\n" +
                "Exam 3 -> 40.0\n" +
                "Exam 4 -> 50.0\n" +
                "Exam 5 -> 70.0\n";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addExamScoreFalse() {
        String firstName = "Tamaki";
        String lastName = "Suoh";
        Double[] examScoreArr = {20.0, 30.0, 40.0, 50.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        student.addExamScore(70);
        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 20.0\n" +
                "Exam 2 -> 30.0\n" +
                "Exam 3 -> 40.0\n" +
                "Exam 4 -> 50.0\n";

        Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void setExamScoreTest() {
        String firstName = "Satoru";
        String lastName = "Gojo";
        Double[] examScoreArr = {66.0, 66.0, 77.0, 66.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        student.setExamScore(3, 66);
        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 66.0\n" +
                "Exam 2 -> 66.0\n" +
                "Exam 3 -> 66.0\n" +
                "Exam 4 -> 66.0\n";

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setExamScoreFalse() {
        String firstName = "Suguru";
        String lastName = "Getou";
        Double[] examScoreArr = {45.0, 56.0, 68.0, 78.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        student.setExamScore(3, 67);
        String actual = student.getExamScores();
        String expected = "Exam Scores: \n" +
                "Exam 1 -> 45.0\n" +
                "Exam 2 -> 56.0\n" +
                "Exam 3 -> 68.0\n" +
                "Exam 4 -> 78.0\n";

        Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void getAverageExamScoreTest() {
        String firstName = "Lelouch";
        String lastName = "Lamperouge";
        Double[] examScoreArr = {99.0, 97.0, 96.0, 100.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        Double actual = student.getAverageExamScore();
        Double expected = 98.0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAverageExamScoreFalse() {
        String firstName = "Lelouch";
        String lastName = "V Brittania";
        Double[] examScoreArr = {99.0, 97.0, 96.0, 100.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        Double actual = student.getAverageExamScore();
        Double expected = 99.0;

        Assert.assertFalse(expected == actual);
    }

    @Test
    public void toStringTest() {
        String firstName = "Kaneki";
        String lastName = "Ken";
        Double[] examScoreArr = {45.0, 50.0, 66.0, 74.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        String actual = student.toString();
        String expected = "Student Name: " + "Kaneki" + " " + "Ken" + "\n" +
                "Average score: " + 58.75 + "\n" +
                "Exam Scores: \n" +
                "Exam 1 -> 45.0\n" +
                "Exam 2 -> 50.0\n" +
                "Exam 3 -> 66.0\n" +
                "Exam 4 -> 74.0\n";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringFalse() {
        String firstName = "Kaneki";
        String lastName = "Ken";
        Double[] examScoreArr = {45.0, 50.0, 66.0, 74.0};
        Student student = new Student(firstName, lastName, examScoreArr);

        String actual = student.toString();
        String expected = "Student Name: " + "Kaneki" + " " + "Ken" + "\n" +
                "Average score: " + 58 + "\n" +
                "Exam Scores: \n" +
                "Exam 1 -> 45.0\n" +
                "Exam 2 -> 50.0\n" +
                "Exam 3 -> 66.0\n" +
                "Exam 4 -> 74.0\n";

        Assert.assertFalse(expected == actual);
    }

}
