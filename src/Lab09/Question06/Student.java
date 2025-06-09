package Lab09.Question06;

public class Student implements Enrollable{
    private String courseName;
    @Override
    public void enrollCourse(String courseName) {
        this.courseName = courseName;
    }
    public void displayStudentDetails(){

        System.out.println("\nStudent Enroll Course: " + courseName);
    }
}
