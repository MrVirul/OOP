package Lab08.Question02;

public class Book {
    String isbn;
    String title;
    private Library library;

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }
}
