package de.v_ens.library;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library{\n");
        for (Book book : books) {
            sb.append("  ").append(book.toString()).append(",\n");
        }
        sb.append("}");
        return sb.toString();
    }


}
