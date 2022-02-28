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

    public Customer() {
    }

    public Customer(String prename, String surname, String password, LocalDate birthdate, String street, String streetno, String zipcode, String city, String country, String iban, boolean active) {
        this.prename = prename;
        this.surname = surname;
        this.password = password;
        this.birthdate = birthdate;
        this.street = street;
        this.streetno = streetno;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
        this.iban = iban;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public String getPrename() {
        return prename;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetno() {
        return streetno;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIban() {
        return iban;
    }

    public boolean isActive() {
        return active;
    }


}
