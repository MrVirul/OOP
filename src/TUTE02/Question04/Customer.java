package TUTE02.Question04;

public class Customer {
    private int customerId;
    private String customerName;
    private int unitConsumed;

    public Customer() {
        this.customerId = 0;
        this.customerName = "Not Specified";
        this.unitConsumed = 0;
    }

    public Customer(int customerId, String customerName, int unitConsumed) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.unitConsumed = unitConsumed;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getUnitConsumed() {
        return unitConsumed;
    }

    public void setUnitConsumed(int unitConsumed) {
        this.unitConsumed = unitConsumed;
    }

    public double calculateBill() {
        double billAmount = 0.0;
        if (this.unitConsumed >= 100) {
            billAmount = unitConsumed * 20;
        } else if (this.unitConsumed < 100 && unitConsumed < 300) {
            billAmount = unitConsumed * 30;
        } else if (this.unitConsumed >= 300) {
            billAmount = unitConsumed * 40;
        }
        return billAmount;
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + getCustomerId());
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Units Consumed: " + getUnitConsumed());
        System.out.println("Bill Amount: " + calculateBill());
    }

}
