package example.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("English", "Head First Java, 2nd Edition", "Kathy Sierra", 10123758943l, 10.5d);
        books[1] = new Book("English", "Effective Java (3rd Edition)", "Bloch Joshua", 34422235432l, 8.65d);
        books[2] = new Book("English", "Mastering Java Machine Learning", "Dr Uday Kamath", 2123765476l, 21.45d);
        books[3] = new Book("English", "Cloud-Native Java", "Kenny Bastani ", 21332343434l, 28.99d);
        books[4] = new Book("English", "Java 9 Modularity", "Paul Bakker", 1645243587l, 36.68d);

        BookStore store = new BookStore();
        Arrays.stream(books).forEach(store::addBook);

        System.out.println("Printing Book details of Book Store");
        PrintService.printBooks(store.iterator());
        System.out.println("Printing Book details of Book Store in reverse order");
        PrintService.printBooks(store.reverseIterator());
    }

}
