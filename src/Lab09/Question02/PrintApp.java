package Lab09.Question02;

public class PrintApp {
    public static void main(String[] args) {
        Report report1 = new Report("Battery status");
        Invoice invoice1 = new Invoice("A001");
        Report report2 = new Report("HDD status");
        Invoice invoice2 = new Invoice("A002");

        Printable[] printItems = {report1,invoice1,report2,invoice2};

        for(int i =0; i < printItems.length; i++){
            printItems[i].printDetails();
        }

    }
}
