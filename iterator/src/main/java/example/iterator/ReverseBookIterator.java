package example.iterator;

import java.util.Iterator;

public class ReverseBookIterator implements Iterator<Book> {

    private Book[] books;
    private int currentBook;
    private int totalBooks;

    public ReverseBookIterator(BookStore bookStore) {
        this.books = bookStore.getBooks();
        this.totalBooks = bookStore.getTotalBooks();
        this.currentBook = totalBooks - 1;
    }

    @Override
    public boolean hasNext() {
        return (currentBook >= 0 && books[currentBook] != null);
    }

    @Override
    public Book next() {
        return books[currentBook--];
    }
}
