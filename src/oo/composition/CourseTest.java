package oo.composition;

public class CourseTest {

    public static void main(String[] args) {

        Student student1 = new Student("Henrique");
        Student student2 = new Student("Lucas");
        Student student3 = new Student("Diogo");

        Course course1 = new Course("Matematica");
        Course course2 = new Course("Portugues");
        Course course3 = new Course("Biologia");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student2);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for(Student student: course1.students) {
            System.out.println(student);
        }

        Course findCourse = student1.getCourseByName("Matematica");
        if(findCourse != null) {
            System.out.println(findCourse.students);
        }

    }

}
