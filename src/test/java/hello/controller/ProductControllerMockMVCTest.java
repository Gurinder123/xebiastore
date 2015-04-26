package hello.controller;

import hello.Application;
import hello.dao.ProductDao;
import hello.model.Product;
import hello.service.ProductService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by gurinder on 26/4/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ProductControllerMockMVCTest {

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mvc;

    @Autowired
    ProductService productService;

    @Before
    public void setUp() {
        this.mvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void checkAddProduct() throws Exception {

        this.mvc.perform(get("/product/?productName=tv&price=100"))
                .andExpect(content().string("{\"status\":\"success\"}"));
    }

    @Test
    public void checkDeleteProduct() throws Exception {
        Product product = new Product();
        product.setProductName("fridge");
        product.setPrice("100");
        ProductDao productDao = Mockito.mock(ProductDao.class);
        when(productDao.findByProductName("fridge")).thenReturn(product);
        productService.deleteProduct(product);
        verify(productDao).findByProductName("fridge");
    }
}
