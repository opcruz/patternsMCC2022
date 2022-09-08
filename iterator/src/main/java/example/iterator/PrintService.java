package example.iterator;

import java.util.Iterator;

public class PrintService {

    public static void printBooks(Iterator<Book> iterator) {
        // String language, String title, String author, long ISBN, double price
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("%10s | %35s | %15s | %15s | %10s\n", "Language", "Title", "Author", "ISBN", "Price");
        System.out.println("-------------------------------------------------------------------------------------------------");
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.printf("%10s | %35s | %15s | %15s | %10.2f\n", book.getLanguage(), book.getTitle(),
                    book.getAuthor(), book.getISBN(), book.getPrice());
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.println();
    }

}
