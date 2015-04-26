package hello.service;

import hello.dao.LoginDao;
import hello.dao.ProductDao;
import hello.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gurinder on 26/4/15.
 */
@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public void addProduct(Product product) {
        productDao.save(product);
    }
}
