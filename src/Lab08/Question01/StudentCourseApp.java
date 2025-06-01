package Lab08.Question01;

public class StudentCourseApp {
    public static void main(String[] args){

        Course[] initialCourse = new Course[3];

        initialCourse[0] = new Course("A00","OOP");
        initialCourse[1] = new Course("A001","DSA");
        initialCourse[3] = new Course("A002","DM");

        Student student1 = new Student("IT001", "Virul",1,initialCourse);

        student1.enrollCourse(initialCourse[1]);
        student1.enrollCourse(initialCourse[2]);
        student1.enrollCourse(initialCourse[3]);

        student1.displayCourseDetails();
    }
}
