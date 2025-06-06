package Lab08.Question01;

public class StudentCourseApp {
    public static void main(String[] args) {
        Course course1 = new Course("A001","OOP");
        Course course2 = new Course("A002","DAS");
        Course course3 = new Course("A003", "DM");

        Student student1 = new Student("IT2410","Virul",0);

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student1.enrollCourse(course3);

        student1.displayStudentDetails();
    }
}
