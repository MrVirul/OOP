package FinalModelPaper.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class inventory {

    ArrayList<Book> inventory = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public void setBook() {
        while (true){
            System.out.println("Enter book title and isbn or -99 to close ");
            String isbn = input.nextLine();

            if(isbn.equals("-99")){
                break;
            }
            System.out.println("enter book title ");
            String title = input.nextLine();

            Book book1 = new Book(isbn,title);
            inventory.add(book1);
        }
        System.out.println("Enter the isbn to remove ");
        String isbnToRemove = input.nextLine();
        boolean removed = false;
        for(int i = 0; i< inventory.size(); i++){
            inventory.remove(i);
            System.out.println("Book removed ");
            removed = false;
            break;
        }
        if (!removed){
            System.out.println("Error!! Book is not removed");
        }
        System.out.println("book count is " + inventory.size());

 } public void displayAllBooks(){
        for(int i = 0; i<inventory.size(); i++){
            System.out.println("Book" + (i+1) + " is" + inventory.get(i));
        }
    }
}
