package example.iterator;

import java.util.Iterator;

public class BookStore implements BookCollection {

    private static int MAX_BOOKS = 1000;
    private int totalBooks = 0;
    private Book[] books;

    public BookStore() {
        super();
        books = new Book[MAX_BOOKS];
    }

    public boolean addBook(Book book) {
        if (totalBooks < (MAX_BOOKS - 1)) {
            books[totalBooks++] = book;
            return true;
        } else {
            return false;
        }
    }

    public int getTotalBooks() {
        return totalBooks;
    }

    public Book[] getBooks() {
        return books;
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }

    @Override
    public Iterator<Book> reverseIterator() {
        return new ReverseBookIterator(this);
    }

}
