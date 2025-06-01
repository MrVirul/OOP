package Lab08.Question01;

public class Course {
    private String courseCode;
    private String CourseTitle;

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        CourseTitle = courseTitle;
    }
    public void displayCourseDetails(){
        System.out.println("Course code is : ");
        System.out.println("Course title is : ");
    }
}
