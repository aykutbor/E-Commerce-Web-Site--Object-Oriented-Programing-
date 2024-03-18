package org.example.models;

public class Advertisement {
    public Advertisement() {
    }

    public Advertisement(Long id, String title, double price, double discount, String description, Long categoryId, int guest, int bedroom, int bed, int bathroom) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.categoryId = categoryId;
        this.guest = guest;
        this.bedroom = bedroom;
        this.bed = bed;
        this.bathroom = bathroom;
    }

    private Long id;

    private String title;
    private double price;

    private double discount;

    private String description;

    private Long categoryId;

    private int guest;

    private int bedroom;

    private int bed;

    private int bathroom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public int getGuest() {
        return guest;
    }

    public void setGuest(int guest) {
        this.guest = guest;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }
}
