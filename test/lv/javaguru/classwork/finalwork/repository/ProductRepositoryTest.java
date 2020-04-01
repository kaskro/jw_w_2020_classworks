package lv.javaguru.classwork.finalwork.repository;

import lv.javaguru.classwork.finalwork.model.ItemNotFoundException;
import lv.javaguru.classwork.finalwork.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    private Map<Long, Product> mapMock;
    private ProductRepository repository;

    @BeforeEach
    void setUp() {
        mapMock = new HashMap<>();
        repository = new ProductRepository(mapMock);
    }

    @Test
    void shouldFindAllProducts() {
        Product orange = new Product();
        Product fish = new Product();

        mapMock.put(1l, orange);
        mapMock.put(2l, fish);

        List<Product> products = repository.findAll();

        assertNotNull(products);
        assertEquals(2, products.size());
        assertTrue(products.contains(orange));
        assertTrue(products.contains(fish));
    }

    @Test
    void shouldFindProductById() {
        Product orange = new Product();

        mapMock.put(1l, orange);

        Product result = repository.findById(1l);

        assertEquals(orange, result);
    }

    @Test
    void shouldDeleteProductById() {
        Product orange = new Product();

        mapMock.put(1l, orange);

        repository.delete(1l);

        assertFalse(mapMock.containsKey(1l));
        assertFalse(mapMock.containsValue(orange));
    }

    @Test
    void shouldThrowErrorWhenProductByIdNotFound() {
        try {
            repository.findById(15l);
            fail();
        } catch (ItemNotFoundException ex) {
            assertEquals("Item not found by id: 15", ex.getMessage());
        }
    }

    @Test
    void shouldSaveProduct() {
        Product orange = new Product();

        Long productId = repository.save(orange);

        assertNotNull(productId);
        assertEquals(productId, orange.getId());
        assertTrue(mapMock.containsKey(productId));

    }
}