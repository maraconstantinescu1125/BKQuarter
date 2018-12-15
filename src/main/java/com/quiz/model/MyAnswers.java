package com.quiz.model;

import javax.persistence.*;

@Entity
@Table(name = "MyAnswers")
public class MyAnswers {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "question_score_id")
    private QuestionScore questionScore;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "answer_id")
    private Answer answer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public QuestionScore getQuestionScore() {
        return questionScore;
    }

    public void setQuestionScore(QuestionScore questionScore) {
        this.questionScore = questionScore;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
