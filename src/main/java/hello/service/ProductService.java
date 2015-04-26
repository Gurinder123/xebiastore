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

    public boolean addProduct(Product product) {
        Product product1 = productDao.save(product);
        if (product1 != null) {
            return true;
        } else {
            return false;
        }
    }
}
