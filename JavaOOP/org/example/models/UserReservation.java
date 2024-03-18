package org.example.models;

public class UserReservation {

    public UserReservation() {
    }

    public UserReservation(Long id, Long reservationId, Long userId, Long advertId) {
        this.id = id;
        this.reservationId = reservationId;
        this.userId = userId;
        this.advertId = advertId;
    }

    private Long id;
    private Long reservationId;
    private Long userId;
    private Long advertId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAdvertId() {
        return advertId;
    }

    public void setAdvertId(Long advertId) {
        this.advertId = advertId;
    }
}
