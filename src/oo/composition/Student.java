package oo.composition;

import java.util.ArrayList;

public class Student {

    final String name;
    final ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.students.add(this);
    }

    Course getCourseByName(String name) {
        for (Course course: this.courses) {
            if(course.name.equalsIgnoreCase(name)) {
                return course;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                '}';
    }
}
