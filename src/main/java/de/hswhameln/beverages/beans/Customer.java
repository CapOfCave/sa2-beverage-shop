package de.hswhameln.beverages.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String prename;

    private String surname;

    private String password;

    private LocalDate birthdate;

    private String street;

    private String streetno;

    private String zipcode;

    private String city;

    private String country;

    private String iban;

    private boolean active;
}
