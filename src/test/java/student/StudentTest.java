package student;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testStudentName() {
        Student student = new Student("Vamsi", 85);

        assertEquals("Vamsi", student.getName());
    }

    @Test
    public void testStudentMarks() {
        Student student = new Student("Vamsi", 85);

        assertEquals(85, student.getMarks());
    }

    @Test
    public void testPassResult() {
        Student student = new Student("Vamsi", 85);

        assertEquals("PASS", student.getResult());
    }

    @Test
    public void testFailResult() {
        Student student = new Student("Rahul", 35);

        assertEquals("FAIL", student.getResult());
    }
}