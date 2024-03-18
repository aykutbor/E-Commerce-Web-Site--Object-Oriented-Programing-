package org.example.models;

public class UserCard {
    public UserCard() {
    }

    public UserCard(Long id, Long cardId, Long userId) {
        this.id = id;
        this.cardId = cardId;
        this.userId = userId;
    }

    private Long id;

    private Long cardId;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCardId() {
        return cardId;
    }

    public void setCardId(Long cardId) {
        this.cardId = cardId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
