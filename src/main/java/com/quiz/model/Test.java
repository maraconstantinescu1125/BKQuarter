package com.quiz.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "test")
public class Test implements Serializable {


    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="active")
    private boolean active;
    @Column(name="code_access")
    private String code_access;
    @Column(name="if_public")
    private boolean if_public;
    @Column(name="time_active")
    private LocalDateTime time_active;
    @Column(name="time")
    private long time;
    @Column(name="reversible")
    private boolean reversible;


    @ManyToMany(targetEntity = Question.class)
    @JoinTable(name = "test_question",
            joinColumns = { @JoinColumn(name = "test_id") },
            inverseJoinColumns = { @JoinColumn(name = "question_id") })
    private List<Question> questions = new ArrayList<>();



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

    public String getCode_access() {
        return code_access;
    }

    public void setCode_access(String code_access) {
        this.code_access = code_access;
    }

    public boolean isIf_public() {
        return if_public;
    }

    public void setIf_public(boolean if_public) {
        this.if_public = if_public;
    }

    public LocalDateTime getTime_active() {
        return time_active;
    }

    public void setTime_active(LocalDateTime time_active) {
        this.time_active = time_active;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public boolean isReversible() {
        return reversible;
    }

    public void setReversible(boolean reversible) {
        this.reversible = reversible;
    }



    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
