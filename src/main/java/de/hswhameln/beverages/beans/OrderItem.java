package de.hswhameln.beverages.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private Integer amount;

    private BigDecimal price;

    private BigDecimal vat;

    @ManyToOne
    @JoinColumn(name = "orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;


}
