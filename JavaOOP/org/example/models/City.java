package org.example.models;

public class City {
    public City(Long id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }

    public City() {
    }

    private Long id;
    private String cityName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
