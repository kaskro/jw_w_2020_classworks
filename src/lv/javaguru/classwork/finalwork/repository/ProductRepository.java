package lv.javaguru.classwork.finalwork.repository;

import lv.javaguru.classwork.finalwork.model.ItemNotFoundException;
import lv.javaguru.classwork.finalwork.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductRepository implements Repository<Product> {

    public ProductRepository(Map<Long, Product> repository) {
        this.repository = repository;
    }

    private final Map<Long, Product> repository;
    private long idCounter = 0;

    @Override
    public Long save(Product product) {
        final long newId = ++idCounter;
        repository.put(newId, product);
        product.setId(newId);
        return newId;
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(repository.values());
    }

    @Override
    public Product findById(Long id) {
        if (!repository.containsKey(id)) {
            throw new ItemNotFoundException("Item not found by id: " + id);
        }
        return repository.get(id);
    }

    @Override
    public void delete(Long id) {
        repository.remove(id);
    }
}
