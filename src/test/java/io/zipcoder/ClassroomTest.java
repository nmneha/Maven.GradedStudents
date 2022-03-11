package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {

    @Test
    public void Classroom() {
        int maxNumberOfStudents = 30;
        Student[] students = new Student[maxNumberOfStudents];

        Classroom classroom = new Classroom(maxNumberOfStudents);
        int actualMaxNumberOfStudents = students.length;

        Assert.assertEquals(maxNumberOfStudents, actualMaxNumberOfStudents);

    }


}
