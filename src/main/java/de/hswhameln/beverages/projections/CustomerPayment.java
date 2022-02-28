package de.hswhameln.beverages.projections;

public interface CustomerPayment {
    long getId();
    String getPrename();
    String getSurname();
    boolean isActive();
    String getIban();
}
