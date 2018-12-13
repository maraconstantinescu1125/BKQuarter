package com.quiz.model;

import org.springframework.stereotype.Service;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class CategoryQuestionId implements Serializable {

    @ManyToOne
    private Category category;
    @ManyToOne
    private Question question;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
