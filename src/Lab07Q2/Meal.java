package Lab07Q2;

public class Meal {
    String orderID;
    String customerName;
    int quantity;

    public Meal (String orderID, String customerName, int quantity) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.quantity = quantity;
    }
    public Meal () {
        this.orderID = "orderID";
        this.customerName = "customerName";
        this.quantity = 0;
    }


    public void displayOrderDetails(){
        System.out.println();
        System.out.println("----Order Details----");
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Quantity: " + quantity);
       }

       public double CalculateBill(){
        return 12.0 * quantity;
       }
       public void CalculateBill(int couponAmount){
           CalculateBill();
       }
}
