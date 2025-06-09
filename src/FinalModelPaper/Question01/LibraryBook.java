package FinalModelPaper.Question01;

import java.util.concurrent.CountDownLatch;

public class LibraryBook {
    private String bookId;
    private String title;
    private String author;
    private int copiesAvailable;

    public LibraryBook(String bookId, String title, String author, int copiesAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public LibraryBook() {
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public void lendBook(int requestedCopies){
        if(requestedCopies <= copiesAvailable){
            System.out.println("Book issued");
            copiesAvailable = copiesAvailable - requestedCopies;
        } else {
            System.out.println("Not enough copies available. Please check back later.");
        }
    }
    public void printBookDetails(){
        System.out.println("count of books available after lending " + copiesAvailable + "\n");
    }
}
