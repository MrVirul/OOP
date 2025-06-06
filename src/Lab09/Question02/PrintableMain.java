package Lab09.Question02;

public class PrintableMain {
    public static void main(String[] args) {

        Printable report1 = new Report("battery health");
        Printable invoice1 = new Invoice(001);

        report1.displayDetails();
        invoice1.displayDetails();


    }
}
