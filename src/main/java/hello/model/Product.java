package hello.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by gurinder on 26/4/15.
 */
@Entity
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String productName;

    @NotNull
    private String price;


    public Product() {
    }

    public Product(String productName, String price) {
        this.productName = productName;
        this.price = price;
    }


    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
