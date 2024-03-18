package org.example.models;

import java.util.Date;

public class Reservation {
    public Reservation() {
    }

    public Reservation(Long id, Date checkIn, Date checkOut, int children, int babies, int adults, int pets) {
        this.id = id;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.children = children;
        this.babies = babies;
        this.adults = adults;
        this.pets = pets;
    }

    private Long id;
    private Date checkIn;
    private Date checkOut;
    private int children;
    private int babies;
    private int adults;
    private int pets;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getBabies() {
        return babies;
    }

    public void setBabies(int babies) {
        this.babies = babies;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getPets() {
        return pets;
    }

    public void setPets(int pets) {
        this.pets = pets;
    }
}
