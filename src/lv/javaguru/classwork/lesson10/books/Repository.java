package lv.javaguru.classwork.lesson10.books;

import java.util.List;

public interface Repository<T> {

    T findById(Long id);

    List<T> findAll();

    Long save(T entity);

    void delete(Long id);

}
