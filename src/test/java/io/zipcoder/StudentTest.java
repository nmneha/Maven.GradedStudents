package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
    public void constructorTrueTest() {
        String firstName = "Baekhyun";
        String lastName = "Byun";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        ArrayList<Double> expectedExamScores = new ArrayList<>(Arrays.asList(examScores));

        Student student = new Student(firstName, lastName, examScores);

        String retrieveFirstName = student.getFirstName();
        String retrieveLastName = student.getLastName();
        ArrayList<Double> retirevedExamScores = new ArrayList<>(Arrays.asList(examScores));

        Assert.assertEquals(firstName, retrieveFirstName);
        Assert.assertEquals(lastName, retrieveLastName);
        Assert.assertEquals(expectedExamScores, retirevedExamScores);
    }

    @Test
    public void constructorFalseTest() {
        String firstName = "Baekhyun";
        String lastName = "Byun";
        Double[] examScores = {100.00, 92.00, 85.00, 98.00};
        ArrayList<Double> expectedExamScores = new ArrayList<>(Arrays.asList(examScores));

        Student student = new Student(firstName, lastName, examScores);

        String retrieveFirstName = student.getFirstName();
        String retrieveLastName = student.getLastName();
        ArrayList<Double> retirevedExamScores = new ArrayList<>(Arrays.asList(examScores));

        String expectedFirstName = "Johnny";
        String expectedLastName = "Suh";


        Assert.assertFalse(firstName == retrieveFirstName);
        Assert.assertFalse(lastName, retrieveLastName);
        Assert.assertFalse(expectedExamScores, retirevedExamScores);
    }


}
