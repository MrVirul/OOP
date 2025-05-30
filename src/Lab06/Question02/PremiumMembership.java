package Lab06.Question02;

public class PremiumMembership extends  Membership{
    private boolean includePersonalTraining;

    public PremiumMembership(){
        super();
        this.includePersonalTraining = false;
    }

    public PremiumMembership(String membershipID, String memberName, int durationMonths, boolean includePersonalTraining){
        super(membershipID, memberName, durationMonths);
        this.includePersonalTraining = includePersonalTraining;
    }
    @Override
    public double calculateFee(){
        return (300 * durationMonths) + (includePersonalTraining ? 100 : 0);
    }

    @Override
    public void displayMembershipDetails(){
        super.displayMembershipDetails();
        System.out.println("Total fee is : "+calculateFee());
        System.out.println("Personal training status : " + includePersonalTraining);
    }
}
