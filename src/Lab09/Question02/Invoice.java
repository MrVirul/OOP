package Lab09.Question02;

public class Invoice implements Printable{

    int invoiceID;

    public Invoice(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    @Override
    public void displayDetails() {
        System.out.println("Invoice ID is : " + invoiceID);
    }
}
