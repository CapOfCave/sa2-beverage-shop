package de.hswhameln.beverages.projections;

public interface CustomerAddress {
    long getId();
    String getPrename();
    String getSurname();
    boolean isActive();
    String getStreet();
    String getStreetno();
    String getZipcode();
    String getCity();
    String getCountry();
}
