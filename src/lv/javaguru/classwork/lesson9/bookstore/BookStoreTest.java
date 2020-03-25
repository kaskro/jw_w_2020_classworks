package lv.javaguru.classwork.lesson9.bookstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookStoreTest {

    public static void main(String[] args) {

        List<Book> bookList = createData();
        printBookList(bookList);

        Collections.sort(bookList);
        printBookList(bookList);

        bookList.sort(new BookAuthorComparator());
        printBookList(bookList);

    }

    private static void printBookList(List<Book> bookList) {
        bookList.stream()
                .forEach(book -> System.out.println(book));
        System.out.println("===================================================================================");
    }

    public static List<Book> createData() {
        List<Book> list = new ArrayList<>();
        list.add(new Book(Genre.HORROR, "The female Persuasion", "Meg Wolitzer"));
        list.add(new Book(Genre.NOVEL, "True roots", "Kristin Cavallari"));
        list.add(new Book(Genre.DETECTIVE, "A Day in the Life of Marlon Bundo", "Kristin Cavallari"));
        list.add(new Book(Genre.DRAMA, "She felt like feeling nothing", "r.h. Sin"));
        list.add(new Book(Genre.HORROR, "The rational bible: Exodus", "Denis Prager"));
        list.add(new Book(Genre.NOVEL, "Ready player one", "Ernest Cline"));
        return list;
    }
}
