package de.hswhameln.beverages.projections;

import java.math.BigDecimal;

public interface ProductExtended {
    long getId();
    String getShortDescription();
    String getLongDescription();
    String getProductImage();
    BigDecimal getPrice();
    boolean isActive();
    String getName();
}
