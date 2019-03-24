package de.lostuxos.shopbase.base;

import de.lostuxos.shopbase.base.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
