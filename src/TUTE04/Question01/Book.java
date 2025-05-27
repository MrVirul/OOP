package TUTE04.Question01;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private double price;

    public Book() {
        this.title = "No Title";
        this.author = "No Author";
        this.ISBN = "No ISBN";
        this.price = 0.00;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String ISBN, String author, String title) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
    }

    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getBookDetails() {
        return "Book Details:\n" +
                "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ISBN: " + ISBN + "\n" +
                "Price: $" + String.format("%.2f", price);
    }

    public String getBookDetails(String ISBN) {
        return this.ISBN.equals(ISBN) ? getBookDetails() : "No book found with ISBN: " + ISBN;
    }
    public static void main(String [] args){

        Book book1 = new Book("The Dragons Houre", "Arthor C Clark", "Adventure", 1500.00);
        System.out.println(book1.getBookDetails());


    }
}
