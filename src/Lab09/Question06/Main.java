package Lab09.Question06;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.enrollCourse("OOP");
        student.displayStudentDetails();
        System.out.println();
        Instructor instructor= new Instructor();
        instructor.enrollCourse("OOP");
        instructor.assignCourse("DSA");
        instructor.printTeacherDetails();
    }
}
