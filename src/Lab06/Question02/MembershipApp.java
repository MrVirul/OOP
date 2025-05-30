package Lab06.Question02;

public class MembershipApp {
public static void main(String []args) {

    BasicMembership basic1 = new BasicMembership();
    PremiumMembership premium1 = new PremiumMembership("P001", "Virul", 6, true);

    basic1.calculateFee();
    premium1.calculateFee();
    
    System.out.println();
    basic1.displayMembershipDetails();
    System.out.println();
    premium1.displayMembershipDetails();
}
}
