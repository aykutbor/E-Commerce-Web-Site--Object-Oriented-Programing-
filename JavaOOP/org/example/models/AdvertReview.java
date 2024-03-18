package org.example.models;

import java.util.Date;

public class AdvertReview extends Review{
    public AdvertReview() {
    }

    public AdvertReview(Long id, Long userId, String comment, Date commentDate, Long advertId, int rating) {
        super(id, userId, comment, commentDate);
        this.advertId = advertId;
        this.rating = rating;
    }

    private Long advertId;
    private int rating;

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
