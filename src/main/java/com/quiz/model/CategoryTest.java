package com.quiz.model;


import javax.persistence.*;

@Entity
@Table(name = "category_test")
@AssociationOverrides({
        @AssociationOverride(name = "id.category",
                joinColumns = @JoinColumn(name = "category_id")),
        @AssociationOverride(name = "id.test",
                joinColumns = @JoinColumn(name = "test_id")) })


public class CategoryTest {

    @EmbeddedId
    private CategoryTestId id;
    private boolean rights;


    public CategoryTestId getId() {
        return id;
    }

    public void setId(CategoryTestId id) {
        this.id = id;
    }

    public boolean isRights() {
        return rights;
    }

    public void setRights(boolean rights) {
        this.rights = rights;
    }
}
