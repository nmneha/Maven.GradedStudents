package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

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

        Assert.assertEquals(30, size);

    }

    @Test
    public void getStudentsTest() {
        Student student = new Student("Kyle", "James", new Double[] {10.0, 20.0, 30.0, 40.0});
        Student[] students = new Student[] {student};
        Classroom classroom = new Classroom(students);
        Student[] expected = students;

        Student[] actual = classroom.getStudents();

        Assert.assertArrayEquals(expected, actual);

    }






}
