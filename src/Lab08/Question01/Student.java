package Lab08.Question01;

public class Student {
    protected String studentID;
    protected String studentName;
    protected int courseCount = 0;
    private Course [] courses = new Course[3];

    public Student() {
        this.studentID = "0000";
        this.studentName = "Null";
        this.courseCount = 0;
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course("0000" + i, "No Course " + i);
        }
    }
    public Student(String studentID, String studentName, int courseCount, Course[] courses) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courseCount = courseCount;
        for (int i = 0; i < courses.length; i++) {
            courses[i] = new Course("C000" + i, "Default Course " + i);
        }
    }

    public boolean  enrollCourse(Course c){
        if(courseCount < 3 ){
            courses[courseCount] = c;
            courseCount++;
            System.out.println("Successfully enrolled in course: ");
            return true;
        } else {
            System.out.println("Cannot enroll in more courses. Maximum limit (3) reached.");
            return false;
        }
    }
    public void displayCourseDetails(){
        System.out.println("Student ID is : " + studentID);
        System.out.println("Student Name is : " + studentName);
        System.out.println("Currently enrolled course count" + courseCount);
        for (int i = 0; i <= courses.length; i++){
            System.out.println("Enrolled to : " + courses[i]);
        }
    }

}
