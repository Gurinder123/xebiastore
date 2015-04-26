package hello.controller;

import hello.model.Product;
import hello.model.UserStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import hello.service.ProductService;

/**
 * Created by gurinder on 26/4/15.
 */

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/product")
    public
    @ResponseBody
    UserStatus addProduct(@RequestParam(value = "productName", required = true) String productName, @RequestParam(value = "price", required = true) String price) {
        Product product = new Product(productName, price);
        boolean checker = productService.addProduct(product);
        if (checker) {
            return new UserStatus("success");
        } else {
            return new UserStatus("failure");
        }

    }


    @RequestMapping("/delete")
    @ResponseBody
    public UserStatus deleteProduct(@RequestParam(value = "productName", required = true) String
                                            productName, @RequestParam(value = "price", required = true) String price) {
        Product product = new Product(productName, price);
        productService.deleteProduct(product);
        return new UserStatus("success");
    }

}


