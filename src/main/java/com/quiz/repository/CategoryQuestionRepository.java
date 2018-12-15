package com.quiz.repository;

import com.quiz.model.Category;
import com.quiz.model.CategoryQuestion;
import com.quiz.model.CategoryQuestionId;
import com.quiz.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryQuestionRepository extends JpaRepository<CategoryQuestion, CategoryQuestionId> {

    @Query(value = "SELECT * FROM category_question c WHERE c.question_id = ?1", nativeQuery = true)
    List<CategoryQuestion> findByIdQuestion(Question question);

    @Query(value = "SELECT * FROM category_question c WHERE c.category_id = ?1", nativeQuery = true)
    List<CategoryQuestion> findByCategoryId(Category category);

}
