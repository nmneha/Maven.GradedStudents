package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    Student eren = new Student("Eren", "Yaeger", new Double[] {50.0, 50.0, 50.0, 50.0});
    Student levi = new Student("Levi", "Ackerman", new Double[] {100.0, 100.0, 100.0, 100.0});
    Student[] students = new Student[] {eren, levi};

    @Test
    public void constructorTest() {
        Classroom classroom = new Classroom();
        int size = classroom.getStudents().length;

        Assert.assertEquals(30, size);

    }

    @Test
    public void constructorNegativeTest() {
        Classroom classroom = new Classroom(20);
        int size = classroom.getStudents().length;

        Assert.assertFalse(30 == size);

    }

    @Test
    public void getStudentsTest() {
        Classroom classroom = new Classroom(students);
        Student[] expected = students;

        Student[] actual = classroom.getStudents();

        Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void getAverageExamScoresTest() {
         Classroom classroom = new Classroom(students);
        double expected = 75.0;

        double actual = classroom.getAverageExamScores();

        Assert.assertEquals(expected, actual, 0);

    }




}
