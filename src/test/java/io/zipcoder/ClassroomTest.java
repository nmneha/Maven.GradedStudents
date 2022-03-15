package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ClassroomTest {
    Student eren = new Student("Eren", "Yeager", new Double[] {50.0, 50.0, 50.0, 50.0});
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

            Assert.assertNotEquals(30, size);

    }

    @Test
    public void getStudentsTest() {
            Classroom classroom = new Classroom(students);
            Student[] expected = students;

            Student[] actual = classroom.getStudents();

            Assert.assertArrayEquals(expected, actual);

    }

    @Test
    public void getStudentsNegative() {
            Classroom classroom = new Classroom(students);
            Student[] expected = new Student[] {eren};

            Student[] actual = classroom.getStudents();

            Assert.assertFalse(expected.equals(actual));
    }

    @Test
    public void getAverageExamScoresTest() {
            Classroom classroom = new Classroom(students);
            double expected = 75.0;

            double actual = classroom.getAverageExamScores();

            Assert.assertEquals(expected, actual, 0);

    }

    @Test
    public void getAverageExamScoresNegative() {
            Classroom classroom = new Classroom(students);
            double expected = 50.0;

            double actual = classroom.getAverageExamScores();

            Assert.assertNotEquals(expected, actual, 0);
    }



    @Test
     public void addStudentsTest() {
            //Given
            Student[] students =  new Student[1];
            Classroom classroom = new Classroom(students);
            Student[] expected =  new Student[] {eren};
            //When
            classroom.addStudent(eren);

            Student[] actual = classroom.getStudents();

            Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void addStudentsNegative() {
            //Given
            Student mikasa = new Student("Mikasa", "Ackerman", new Double[] {98.0, 100.0, 100.0, 99.0});
            Classroom classroom = new Classroom(students);
            //Student[] expected =  new Student[] {eren, levi, mikasa};
            Student[] expected = new Student[]{eren, levi};
            //When
            classroom.addStudent(mikasa);

            Student[] actual = classroom.getStudents();

            Assert.assertFalse(expected.equals(actual));

    }

    @Test
    public void removeStudent() {
            Classroom classroom = new Classroom(students);
            classroom.removeStudent("Levi", "Ackerman");
            Student[] expected = new Student[] {eren, null};

            Student[] actual = classroom.getStudents();

            Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeStudentNegative() {
            Classroom classroom = new Classroom(students);
            classroom.removeStudent("Levi", "Ackerman");
            Student[] expected = new Student[] {eren, levi};

            Student[] actual = classroom.getStudents();

            Assert.assertFalse(expected.equals(actual));
    }


    @Test
    public void getStudentScoreTest() {
            Classroom classroom = new Classroom(students);
            Student[] expected = new Student[] {levi, eren};

            Student[] actual = classroom.getStudentsByScore();

            Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void getStudentScoreNegative() {
            Classroom classroom = new Classroom(students);
            Student[] expected = new Student[] {eren, levi};

            Student[] actual = classroom.getStudentsByScore();

            Assert.assertFalse(expected.equals(actual));
    }

    @Test
    public void getGradeBookTest() {
            Classroom classroom = new Classroom(students);
            Map<Student, String> expected = new HashMap<>();
            expected.put(eren, "C");
            expected.put(levi, "A");

            Map<Student, String> actual = classroom.getGradeBook();

            Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGradeBookNegative() {
        Classroom classroom = new Classroom(students);
        Map<Student, String> expected = new HashMap<>();
        expected.put(eren, "A");
        expected.put(levi, "A");

        Map<Student, String> actual = classroom.getGradeBook();

        Assert.assertNotEquals(expected, actual);
    }

    }
