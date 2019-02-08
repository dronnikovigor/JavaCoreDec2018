package task5.student;


import org.junit.Before;
import org.junit.Test;
import task5.Course;

import java.util.ArrayList;

public class StudentsTest {
    private ArrayList<Student> students = new ArrayList<>();

    @Before
    public void setUp() {
        Student student = new Student(("Peter"));
        student.addCourse(Course.ENGLISH, 3.0);
        student.addCourse(Course.RUSSIAN, 4);
        student.addCourse(Course.MATH, 5);
        students.add(student);

        student = new Student(("Vasya"));
        student.addCourse(Course.ENGLISH, 3.0);
        student.addCourse(Course.RUSSIAN, 2);
        student.addCourse(Course.MATH, 4);
        students.add(student);

        student = new Student(("Kolya"));
        student.addCourse(Course.ENGLISH, 5.0);
        student.addCourse(Course.RUSSIAN, 4);
        student.addCourse(Course.MATH, 3);
        students.add(student);
    }

    @Test
    public void testScore() {
        for (Student st : students) {
            System.out.println("\n" + st.getName());
            st.showCourses();
        }
    }

    @Test
    public void testCourses() {
        for (Student st : students) {
            System.out.println("\n"+st.getName());
            for (Course course: Course.values() ) {
                System.out.print(course.toString());
                if (st.onCourse(course))
                    System.out.println(" " + st.onCourse(course) + " " +st.getScore(course));
                else
                    System.out.println(" " + st.onCourse(course));
            }
        }
    }

}
