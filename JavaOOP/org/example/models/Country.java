package org.example.models;

public class Country {

    public Country(Long id, String countryName) {
        this.id = id;
        this.countryName = countryName;
    }

    public Country() {
    }

    private  Long id;
    private String countryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
