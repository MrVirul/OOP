package TUTE02.Question04;

public class Customer {
    private int customerId;
    private String customerName;
    private int unitConsumed;

    public Customer(){
        this.customerId = 0;
        this.customerName = "Not Specified";
        this.unitConsumed = 0;
    }

    public Customer(int customerId, String customerName, int unitConsumed) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.unitConsumed = unitConsumed;
    }


}
