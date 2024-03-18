package org.example.models;

import java.util.Date;

public class Owner extends User {

    public Owner() {

    }

    public Owner(Long id, String firstName, String lastName, String email, String password, Date birthDay, String phone, String identity, String imgUrl, String taxNumber, String description, String job, Long addressId) {
        super(id, firstName, lastName, email, password, birthDay, phone, identity, imgUrl);
        this.taxNumber = taxNumber;
        this.description = description;
        this.job = job;
        this.addressId = addressId;
    }

    private String taxNumber;
    private String description;
    private String job;

    private Long addressId;

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }
}
