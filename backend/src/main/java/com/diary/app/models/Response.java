package com.diary.app.models;

import javax.persistence.*;

@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Question question;

    private String text;
    private double sentimentScore;

    public Response() {}

    public Response(User user, Question question, String text, double sentimentScore) {
        this.user = user;
        this.question = question;
        this.text = text;
        this.sentimentScore = sentimentScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    the Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    the double getSentimentScore() {
        return sentimentScore;
    }

    the void setSentimentScore(double sentimentScore) {
        this.sentimentScore = sentimentScore;
    }
}
