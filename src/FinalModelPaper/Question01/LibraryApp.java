package FinalModelPaper.Question01;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter book 1 details ");
        System.out.print("Enter book title : ");
        String bookTitle1 = input.nextLine();
        System.out.print("Enter book ID : ");
        String bookId1 = input.nextLine();
        System.out.print("Enter book author name : ");
        String author1 = input.nextLine();
        System.out.print("Enter numbers of copies available : ");
        int copiesAvailable1 = input.nextInt();
        input.nextLine();
        System.out.println();

        LibraryBook book1 = new LibraryBook(bookTitle1,bookId1,author1,copiesAvailable1);

        System.out.println("Enter book 2 details ");
        System.out.print("Enter book 2 title : ");
        String bookTitle2 = input.nextLine();
        System.out.print("Enter book ID : ");
        String bookId2 = input.nextLine();
        System.out.print("Enter book author name : ");
        String author2 = input.nextLine();
        System.out.print("Enter numbers of copies available : ");
        int copiesAvailable2 = input.nextInt();
        input.nextLine();
        System.out.println();

        LibraryBook book2 = new LibraryBook(bookTitle1,bookId1,author1,copiesAvailable1);

        System.out.print("Enter the copies you want for book 1 :");
        int requestedCopies1 = input.nextInt();
        book1.lendBook(requestedCopies1);

        System.out.print("Enter the copies you want for book 2 :");
        int requestedCopies2 = input.nextInt();
        book2.lendBook(requestedCopies2);

        System.out.println("Book details after issuing");
        System.out.println("--------------------------");
        book1.printBookDetails();
        book2.printBookDetails();
    }
}
