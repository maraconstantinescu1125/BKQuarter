package com.quiz.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "MyTest")
public class MyTest {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "score")
    private double score;
    @Column(name = "time_submitted")
    private LocalDateTime time_submitted;
    @Column(name = "time")
    private long time;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "category_id")
    @JoinColumn(name = "test_id")
    private CategoryTest categoryTest;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public LocalDateTime getTime_submitted() {
        return time_submitted;
    }

    public void setTime_submitted(LocalDateTime time_submitted) {
        this.time_submitted = time_submitted;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CategoryTest getCategoryTest() {
        return categoryTest;
    }

    public void setCategoryTest(CategoryTest categoryTest) {
        this.categoryTest = categoryTest;
    }
}

