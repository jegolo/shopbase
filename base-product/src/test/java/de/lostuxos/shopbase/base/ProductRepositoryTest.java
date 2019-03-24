package de.lostuxos.shopbase.base;

import de.lostuxos.shopbase.base.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        classes = { ProductJpaConfig.class },
        loader = AnnotationConfigContextLoader.class)
@Transactional
public class ProductRepositoryTest {

    @Autowired
    private ProductRepository repository;

    @Test
    public void testWrite() {
        Product product = new Product();
        product.setId(1);
        product.setName("Test Product");
        product.setCreationDate(LocalDate.now());
        product.setCreator("Jens");
        product.setModificationDate(LocalDate.now());
        product.setModifier("Jens");

        repository.save(product);

        Product test = repository.findById(1L).get();
        assertEquals(product.getName(), test.getName());
        assertEquals(product.getCreator(), test.getCreator());
    }
}
