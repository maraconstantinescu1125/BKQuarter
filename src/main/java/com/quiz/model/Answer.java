package com.quiz.model;

import javax.persistence.*;

@Entity
@Table(name = "answer")
public class Answer {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "text")
    private String text;
    @Column(name = "ifCorrect")
    private boolean ifCorrect;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "question_id")
    private Question question;

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

    public boolean isIfCorrect() {
        return ifCorrect;
    }

    public void setIfCorrect(boolean ifCorrect) {
        this.ifCorrect = ifCorrect;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
