package lv.javaguru.classwork.lesson10.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BookRepositoryTest {

    private BookRepository repository;

    @BeforeEach
    void setUp() {
        repository = new BookRepository();
    }

    @Test
    void shouldFindAllBooks() {
        BookEntity book = new BookEntity("Trevor Noah", "Born a crime");
        repository.save(book);
        assertEquals(Arrays.asList(book), repository.findAll());
    }

    @Test
    void shouldStoreBook() {

    }

    @Test
    void shouldRetrieveBookById() {

    }

    @Test
    void shouldFailWhenBookNotFound() {

    }

    @Test
    void shouldDeleteBookById() {

    }
}