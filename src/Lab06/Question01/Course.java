package Lab06.Question01;

public class Course {
    protected String courseID;
    protected String courseName;
    protected int durationWeeks;

    public Course() {
        this.courseID = "0000";
        this.courseName = "No Entered";
        this.durationWeeks = 0;
    }

    public Course(String courseID, String courseName, int durationWeeks) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.durationWeeks = durationWeeks;
    }

    public void displayCourseDetails(){
        System.out.println("Lab08.Question01.Course ID is : " + courseID);
        System.out.println("Lab08.Question01.Course Name is : " + courseName);
        System.out.println("Duration Time : " + durationWeeks);
    }
    public double calculateTotalFee(){
         return 10000.0;
    }
    public double calculateTotalFee(double discountPercentage){
            double basicCourseFee = calculateTotalFee();
            double discountedFee = basicCourseFee * (discountPercentage/100);
            return basicCourseFee - discountedFee;
    }
}

