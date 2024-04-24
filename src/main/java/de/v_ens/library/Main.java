package de.v_ens.library;


public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[]{
                new Book("Title1", "Author1", 123456),
                new Book("Title2", "Author2", 789012),
                new Book("Title3", "Author3", 345678)
        };

        Library myLibrary = new Library(books);

        System.out.println(myLibrary.toString());

    }
}
