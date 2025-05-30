package Lab06.Question01;

public class PremiumCourse extends Course {
    protected boolean includeCertificate;

    public PremiumCourse(){
        super();
        this.includeCertificate = false;
    }
    public PremiumCourse(String courseID, String courseName, int durationWeeks, boolean includeCertificate){
        super(courseID, courseName, durationWeeks);
        this.includeCertificate = includeCertificate;
    }

    @Override
    public double calculateTotalFee(){
        return (150 * durationWeeks) + (includeCertificate ? 50 : 0 );
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Certificate included : " + includeCertificate);
    }
}

