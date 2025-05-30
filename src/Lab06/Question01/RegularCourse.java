package Lab06.Question01;

public class RegularCourse extends Course {

    private boolean hasLiveSessions;

    public RegularCourse(){
        super();
        this.hasLiveSessions = false;
    }
    public RegularCourse(String courseID, String courseName, int durationWeeks, boolean hasLiveSessions){
        super(courseID, courseName, durationWeeks);
        this.hasLiveSessions = hasLiveSessions;
    }
    @Override
    public double calculateTotalFee(){
        return 100 * durationWeeks;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Live Session Status : " + (hasLiveSessions ? "Available" : "Not Available"));
        System.out.println("Total Fee : "+calculateTotalFee());
        System.out.println();
    }
}
