package org.example.models;

public class AdvertImage {
    public AdvertImage(Long id, Long advertId, Long imageId) {
        this.id = id;
        this.advertId = advertId;
        this.imageId = imageId;
    }

    public AdvertImage() {
    }

    private Long id;
    private Long advertId;

    private Long imageId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }

    public Long getImageId() {
        return imageId;
    }

    public void setImageId(Long imageId) {
        this.imageId = imageId;
    }
}
