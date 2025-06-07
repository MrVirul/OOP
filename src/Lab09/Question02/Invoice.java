package Lab09.Question02;

public class Invoice implements Printable {
    private String invoicedID;

    public Invoice(String invoicedID) {
        this.invoicedID = invoicedID;
    }

    @Override
    public void printDetails() {
        System.out.println("Invoice ID is : " + invoicedID );
        System.out.println();

    }
}
