package Lab08.Question03;

public class PrinterApp {
    public static void main(String[] args) {
        Document doc = new Document("Paper","Year1 semester 2 final paper");
        Printer printer = new Printer();
        printer.printDocument(doc);
    }
}
