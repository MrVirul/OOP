package Lab08.Question01;

public class Course {
     String courseCode;
     String courseTitle;

    public Course(String courseCoded, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
    }
    public void displayCourseDetails(){
        System.out.println("Course title is " + courseTitle);
        System.out.println("Course code is " + courseCode);
    }
}
