package Lab06.Question02;

public class Membership {
    private String membershipID;
    private String memberName;
    protected int durationMonths;

    public Membership(){
        this.membershipID = "000";
        this.memberName = "Not Entered";
        this.durationMonths = 0;
    }

    public Membership(String membershipID, String memberName, int durationMonths) {
        this.membershipID = membershipID;
        this.memberName = memberName;
        this.durationMonths = durationMonths;
    }
    public void displayMembershipDetails(){
        System.out.println("Membership ID is : " + membershipID);
        System.out.println("Member Name is : " + memberName);
        System.out.println("Months Duration is " + durationMonths);
    }
    public double calculateFee(){
        return 5000.0;
    }

    public double calculateFee(double discountPercentage){
         return calculateFee() * 10 / 100;
    }
}
