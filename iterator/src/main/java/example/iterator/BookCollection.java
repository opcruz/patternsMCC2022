package example.iterator;

import java.util.Iterator;

public interface BookCollection extends Iterable<Book> {

    public Iterator<Book> iterator();

    public Iterator<Book> reverseIterator();

}