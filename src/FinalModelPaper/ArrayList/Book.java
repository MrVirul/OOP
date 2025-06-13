package FinalModelPaper.ArrayList;

import java.util.SortedMap;

public class Book {
    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
    public void displayDetails(){
        System.out.println("Book isbn : " + isbn);
        System.out.println("Book title is " + title);
    }
}
