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

}
