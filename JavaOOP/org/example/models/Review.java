package org.example.models;

import java.util.Date;

public class Review {
    public Review(Long id, Long userId, String comment, Date commentDate) {
        this.id = id;
        this.userId = userId;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public Review() {
    }

    private Long id;
    private Long userId;

    private String comment;

    private Date commentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }
}
