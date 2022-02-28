package de.hswhameln.beverages.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String shortDescription;
    private String longDescription;
    private String productImage;
    private BigDecimal price;
    private boolean active;

    public Product() {
    }

    public Product(String shortDescription, String longDescription, String productImage, BigDecimal price, boolean active) {
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.productImage = productImage;
        this.price = price;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public String getProductImage() {
        return productImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isActive() {
        return active;
    }
}
