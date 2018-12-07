package com.quiz.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "test")
public class Test {


    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="active")
    private boolean active;
    @Column(name="code_access")
    private String accessCode;
    @Column(name="public")
    private boolean ifPublic;
    @Column(name="time_active")
    private LocalDateTime timeActive;
    @Column(name="time")
    private long time;
    @Column(name="return")
    private boolean ifReturn;
    @Column(name="nr_questions")
    private int numberQuestions;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }

    public boolean isIfPublic() {
        return ifPublic;
    }

    public void setIfPublic(boolean ifPublic) {
        this.ifPublic = ifPublic;
    }

    public LocalDateTime getTimeActive() {
        return timeActive;
    }

    public void setTimeActive(LocalDateTime timeActive) {
        this.timeActive = timeActive;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isIfReturn() {
        return ifReturn;
    }

    public void setIfReturn(boolean ifReturn) {
        this.ifReturn = ifReturn;
    }

    public int getNumberQuestions() {
        return numberQuestions;
    }

    public void setNumberQuestions(int numberQuestions) {
        this.numberQuestions = numberQuestions;
    }

}
