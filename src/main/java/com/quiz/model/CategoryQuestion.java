package com.quiz.model;

import javax.persistence.*;

@Entity
@Table(name = "category_question")
@AssociationOverrides({
        @AssociationOverride(name = "id.category",
                joinColumns = @JoinColumn(name = "category_id")),
        @AssociationOverride(name = "id.question",
                joinColumns = @JoinColumn(name = "question_id")) })
public class CategoryQuestion {

    @EmbeddedId
    private CategoryQuestionId id;
    private boolean rights;


    public CategoryQuestionId getId() {
        return id;
    }

    public void setId(CategoryQuestionId id) {
        this.id = id;
    }

    public boolean isRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }
}
