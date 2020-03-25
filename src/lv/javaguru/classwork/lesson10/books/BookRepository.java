package lv.javaguru.classwork.lesson10.books;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<BookEntity> {

    private Map<Long, BookEntity> bookRepository = new HashMap<>();
    private int idCounter = 0;

    @Override
    public BookEntity findById(Long id) {
        return null;
    }

    @Override
    public List<BookEntity> findAll() {
        return new ArrayList<>(bookRepository.values());
    }

    @Override
    public Long save(BookEntity entity) {
        long generatedId = idCounter++;
        entity.setId(generatedId);
        bookRepository.put(generatedId, entity);
        return generatedId;
    }

    @Override
    public void delete(Long id) {

    }
}
