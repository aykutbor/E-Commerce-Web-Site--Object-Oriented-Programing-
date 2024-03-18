package org.example.models;

public class Address {
    public Address(Long id, String address, Long countryId, Long cityId, String postalCode) {
        this.id = id;
        this.address = address;
        this.countryId = countryId;
        this.cityId = cityId;
        this.postalCode = postalCode;
    }

    public Address() {
    }

    private Long id;
    private String address;
    private Long countryId;
    private Long cityId;
    private String postalCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
