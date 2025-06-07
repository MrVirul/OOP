package Lab08.Question03;

public class Printer {
   public void printDocument(Document doc){
       System.out.println("\nPrinting Document " + doc.getTitle() + "\n");
       doc.displayDocument();
   }
}
