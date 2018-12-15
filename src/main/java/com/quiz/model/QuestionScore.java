package com.quiz.model;

import javax.persistence.*;

@Entity
@Table(name = "QuestionScore")
public class QuestionScore {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "score")
    private double score;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "my_test_id")
    private MyTest myTest;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "question_id")
    private Question question;

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

    public MyTest getMyTest() {
        return myTest;
    }

    public void setMyTest(MyTest myTest) {
        this.myTest = myTest;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
