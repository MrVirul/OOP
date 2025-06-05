package FinalModelPaper.Question01;

public class LibraryBook {

    private String bookId;
    private String title;
    private String author;
    private int copiesAvailable;

    public LibraryBook() {
        this.bookId = "0000";
        this.title = "No title";
        this.author = "No author";
        this.copiesAvailable = 0;
    }

    public LibraryBook(String title, String bookId, String author, int copiesAvailable) {
        this.title = title;
        this.bookId = bookId;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    void lendBook(int requestedCopies){
        if(requestedCopies > copiesAvailable){
            System.out.println("Not enough copies available. Please check back later.");
        } else {
            copiesAvailable = copiesAvailable - requestedCopies;
            System.out.println("Book issued successfully");
        }
    }

    void printBookDetails(){
        System.out.println("====Datils of books===");
        System.out.println("Book title is : ");
        System.out.println(title + " 's book ID is : " + bookId);
        System.out.println(title + " 's author is : " + author);
        System.out.println("Available copies : " + copiesAvailable);
        System.out.println();
    }
}
