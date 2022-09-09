package example.iterator;

import java.util.Iterator;

public class BookIterator implements Iterator<Book> {

    private Book[] books;
    private int currentBook = 0;
    private int totalBooks;

    public BookIterator(BookStore bookStore) {
        this.books = bookStore.getBooks();
        this.totalBooks = bookStore.getTotalBooks();
    }

    @Override
    public boolean hasNext() {
        return (currentBook < totalBooks && books[currentBook] != null);
    }

    @Override
    public Book next() {
        return books[currentBook++];
    }
}