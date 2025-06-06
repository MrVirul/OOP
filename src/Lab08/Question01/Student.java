package Lab08.Question01;

public class Student {
    private String studentID;
    private String studentName;
    private int courseCount;
    Course[] course = new Course[3];

    public Student(String studentID, String studentName, int courseCount) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.courseCount = courseCount;
    }

    public Student (){
        this.studentName = "Null";
        this.studentID = "Null";
        this.courseCount = 0;
        Course course1 = new Course("IT00","Null");
    }
    public void enrollCourse(Course C){
        if (courseCount < course.length) {
            course[courseCount] = C;
            courseCount++;
        } else {
            System.out.println("Cannot enroll in more courses. Maximum limit reached.");
        }
    }

    public void displayStudentDetails() {
        System.out.println("Student ID  is : " + studentID);
        System.out.println("Student Name is : " + studentName);
        System.out.println("Student course count is : " + courseCount);

        for (int i = 0; i >= courseCount; i++){
             if (course[i] != null) {
                 System.out.println("Course " + (i+1) + ": " + course[i].courseCode + " - " + course[i].courseTitle);
            }
        }
    }
}
