package Lab08.Question02;

public class Library {
    private String LibraryName;
    private int bookCount;
    Book[] books = new Book[bookCount];

    public Library(String libraryName, int bookCount, Book[] books) {
        LibraryName = libraryName;
        this.bookCount = bookCount;
        this.books = books;
    }
    public void addBook(Book book){
        if(bookCount < books.length){
            books[bookCount] = book;
            book.setLibrary(this);
            bookCount++;
        }else
            System.out.println("Your book limit have exceeded");
    }
public void displayLibraryDetails(){
        for (int i = 0; i < bookCount; i++){
            System.out.println("Book ISBN number is : " + books[i].isbn + "\nBook title is : " +  books[i].title + "\n");
        }
}



}
