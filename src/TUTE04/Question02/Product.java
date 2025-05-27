package TUTE04.Question02;

import java.util.Scanner;

public class Product {
    private int productID;
    private String productName;
    private double basePrice;
    private String membershipType;

    public Product() {
        this.productID = 000;
        this.productName = "NOT ENTERED";
        this.basePrice = 0.00;
        this.membershipType = "NOT ENTERED";
    }

    public Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public Product(int productID, String productName, double basePrice) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
    }

    public Product(int productID, String productName, double basePrice, String membershipType) {
        this.productID = productID;
        this.productName = productName;
        this.basePrice = basePrice;
        this.membershipType = membershipType;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getMembershipType() {
        return membershipType;
    }
public void setMembershipType(String membershipType){

    if(membershipType.equalsIgnoreCase("Premium") ||
       membershipType.equalsIgnoreCase("Regular") ||
       membershipType.equalsIgnoreCase("Non")){

        if(membershipType.equalsIgnoreCase("Premium")){
            this.membershipType = "Premium";
        } else if (membershipType.equalsIgnoreCase("Regular")) {
            this.membershipType = "Regular";
        } else if (membershipType.equalsIgnoreCase("Non")){
            this.membershipType = "Non";
        } else {
            this.membershipType = "Non Member";
            System.out.println("Invalid membership type. Set to Non-Member.");
        }

    } else {
        this.membershipType = "Non Member";
        System.out.println("Invalid membership type. Set to Non-Member.");
    }
}
public double calculateFinalPrice(){
        double discount = 0.00;

        if (membershipType.equals("Premium")){
          discount = 0.20;
        } else if (membershipType.equals("Regular")) {
            discount = 0.10;
    } else {
            discount = 0.00;
        }
    double discountAmount = basePrice * discount;
    double finalPrice = basePrice - discountAmount;

    return finalPrice;
}
    public double calculateFinalPriceWithSeasonalDiscount(double seasonalDiscountRate) {

        double membershipDiscount = 0.00;

        if (membershipType.equals("Premium")) {
            membershipDiscount = 0.20;
        } else if (membershipType.equals("Regular")) {
            membershipDiscount = 0.10;
        } else {
            membershipDiscount = 0.00;
        }

        double membershipDiscountAmount = basePrice * membershipDiscount;

        double priceAfterMembershipDiscount = basePrice - membershipDiscountAmount;

        double seasonalDiscountAmount = priceAfterMembershipDiscount * seasonalDiscountRate;

        double finalPrice = priceAfterMembershipDiscount - seasonalDiscountAmount;

        return finalPrice;
    }
public void displayProductDetails(){
    System.out.println("Product ID is : "+productID);
    System.out.println("Product Name : "+productName);
    System.out.println("Base Price : "+getBasePrice());
    System.out.println("Membership Type : "+getMembershipType());
    System.out.println("Final Price (after discount)"+calculateFinalPrice());
}
public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        Product product1 = new Product(0001,"Laptop");

    System.out.print("Enter Base price : ");
    double basePrice = input.nextDouble();
    product1.setBasePrice(basePrice);

    System.out.print("Enter membership type : ");
    String membershipType = input.next();
    product1.setMembershipType(membershipType);

    System.out.println();

    product1.calculateFinalPrice();
    product1.calculateFinalPriceWithSeasonalDiscount(0.20);

    product1.displayProductDetails();
}

}
