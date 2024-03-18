package org.example.models;

import java.util.Date;

public class UserReview extends Review{
    public UserReview(Long id, Long userId, String comment, Date commentDate, Long ownerId) {
        super(id, userId, comment, commentDate);
        this.ownerId = ownerId;
    }

    public UserReview() {
    }

    private Long ownerId;

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }
}
