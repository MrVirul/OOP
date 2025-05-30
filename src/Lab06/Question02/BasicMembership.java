package Lab06.Question02;

public class BasicMembership extends Membership{
    private boolean hasGymAccess;

    public BasicMembership(){
        super();
        this.hasGymAccess = false;
    }

    public BasicMembership(String membershipID, String memberName, int durationMonths, boolean hasGymAccess){
        super(membershipID, memberName , durationMonths);
        this.hasGymAccess = hasGymAccess;
    }
    @Override
    public double calculateFee(){
            return 200 * durationMonths;
    }
@Override
public void displayMembershipDetails(){

    super.displayMembershipDetails();
    System.out.println("Gym access Status : " + hasGymAccess);
    System.out.println("Total fee is : " + calculateFee());
}
}
