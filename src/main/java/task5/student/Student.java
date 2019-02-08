package task5.student;

import task5.Course;

import java.util.*;

public class Student {
    private String name;
    private HashMap<Course, Score> courses = new HashMap<>();

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    <T extends Number> void addCourse(Course course, T score) {
        if (course.isRealScore()) {
            courses.put(course, new Score<>(score.doubleValue()));
        } else {
            courses.put(course, new Score<>(score.intValue()));
        }
    }

    Score getScore(Course course) {
        if (onCourse(course))
            return courses.get(course);
        return null;
    }

    boolean onCourse(Course course){
        return courses.containsKey(course);
    }

    void showCourses(){
        List<Map.Entry<Course, Score>> list = new ArrayList<>(courses.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Course, Score> courseScoreEntry : list) {
            System.out.println(courseScoreEntry.getKey().toString()+ " " + courseScoreEntry.getValue().toString());
        }
    }

}
