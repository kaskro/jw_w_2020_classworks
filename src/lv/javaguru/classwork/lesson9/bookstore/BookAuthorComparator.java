package lv.javaguru.classwork.lesson9.bookstore;

import java.util.Comparator;

public class BookAuthorComparator implements Comparator<Book> {
    @Override
    public int compare(Book thisBook, Book thatBook) {
        return thisBook.getAuthor().compareTo(thatBook.getAuthor());
    }
}
