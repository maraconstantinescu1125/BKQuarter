package com.quiz.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Question")
public class Question {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "text")
    private String text;
    @Column(name = "score")
    private double score;
    @Column(name = "time")
    private long time;
    @Column(name = "type")
    private boolean type;
    @Column(name = "imageURL")
    private String imageURL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

}
