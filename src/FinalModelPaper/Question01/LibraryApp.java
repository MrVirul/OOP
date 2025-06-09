package FinalModelPaper.Question01;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LibraryBook book1 = new LibraryBook();
        LibraryBook book2 = new LibraryBook();


        System.out.print("Enter Book Id : ");
        book1.setBookId(input.nextLine());

        System.out.print("Enter Book title : ");
        book1.setTitle(input.nextLine());

        System.out.print("Enter Book author : ");
        book1.setAuthor(input.nextLine());
        System.out.println();

        System.out.print("Enter the available number of the book : ");
        book1.setCopiesAvailable(input.nextInt());

        System.out.print("Enter Book Id : ");
        book2.setBookId(input.nextLine());

        System.out.print("Enter Book title : ");
        book2.setTitle(input.nextLine());

        System.out.print("Enter Book author : ");
        book2.setAuthor(input.nextLine());

        System.out.print("Enter the available number of the book : ");
        book2.setCopiesAvailable(input.nextInt());

        System.out.println("how many numbers of book you need from book 1 : ");
        int requestedCopies = input.nextInt();
        book1.lendBook(requestedCopies);
        book1.printBookDetails();

        System.out.println("how many number of book are need from book 2 : ");
        requestedCopies = input.nextInt();
        book2.lendBook(requestedCopies);
        book2.printBookDetails();
    }

}
