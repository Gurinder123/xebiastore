package hello.dao;

import hello.model.Product;
import hello.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by gurinder on 27/4/15.
 */
@Transactional
public interface ProductDao extends CrudRepository<Product, Long> {

    public Product findByPrice(Product product);

    public Product findByProductName(String name);
}
