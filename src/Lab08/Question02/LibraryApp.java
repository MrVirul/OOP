package Lab08.Question02;

public class LibraryApp {
    public static void main(String[] args) {
        Book[] initialBooks = new Book[10];
        Library library = new Library("Virul's Library",0, initialBooks);

        Book book1 = new Book("A001","madol duwa");
        Book book2 = new Book("A002","hinchi hawa");
        Book book3 = new Book("A003","Virul Book");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayLibraryDetails();

    }
}
