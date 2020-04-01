package lv.javaguru.classwork.lesson10.books;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {

    private BookRepository repository;

    @BeforeEach
    void setUp() {
        repository = new BookRepository();
    }

    @Test
    void shouldSaveAndFindAllBooks() {
        BookEntity book = new BookEntity("Trevor Noah", "Born a crime");
        repository.save(book);

        assertEquals(Arrays.asList(book), repository.findAll());
    }

    @Test
    void shouldRetrieveBookById() {
        BookEntity book = new BookEntity("Trevor Noah", "Born a crime");
        long bookId = repository.save(book);

        assertEquals(book, repository.findById(bookId));
    }

    @Test
    void shouldFailWhenBookNotFound() {
        try {
            repository.findById(55L);
            fail();
        } catch (ItemNotFoundException ex) {
            assertEquals("Book not found by id: 55", ex.getMessage());
        }
    }

    @Test
    void shouldDeleteBookById() {
        BookEntity book = new BookEntity("Trevor Noah", "Born a crime");
        long bookId = repository.save(book);

        assertFalse(repository.findAll().isEmpty());

        repository.delete(bookId);

        assertTrue(repository.findAll().isEmpty());
    }
}