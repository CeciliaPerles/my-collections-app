package mycollectionsapp.model;

import javax.persistence.Entity;

@Entity
public class Address {

    private String street;
    private String number;
    private String city;
    private String state;
    private String postalCode;
    private String country;
}
