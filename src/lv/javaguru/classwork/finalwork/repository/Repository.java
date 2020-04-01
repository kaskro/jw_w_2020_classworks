package lv.javaguru.classwork.finalwork.repository;

import java.util.List;

public interface Repository<T> {

    Long save(T object);

    List<T> findAll();

    T findById(Long id);

    void delete(Long id);

}
