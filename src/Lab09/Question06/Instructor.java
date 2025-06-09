package Lab09.Question06;

public class Instructor implements Enrollable, Teachable{
    private String courseName;
    private String assignCourse;

    @Override
    public void enrollCourse(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public void assignCourse(String courseName) {
        this.courseName = courseName;
    }

    public void printTeacherDetails(){
        System.out.println("Instructor enrolled course is :  " + courseName);
        System.out.println("Instructor assigned course is : " + assignCourse);
    }
}
