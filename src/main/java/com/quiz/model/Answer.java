package com.quiz.model;

public class Answer {
    private int id;
    private String text;
    private boolean ifCorrect;
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
