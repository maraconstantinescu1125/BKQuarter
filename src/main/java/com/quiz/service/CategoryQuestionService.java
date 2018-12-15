package com.quiz.service;

import com.quiz.model.*;
import com.quiz.repository.CategoryQuestionRepository;
import com.quiz.repository.CategoryRepository;
import com.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryQuestionService {

    @Autowired
    CategoryQuestionRepository categoryQuestionRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    QuestionRepository questionRepository;

    public List<CategoryQuestion> findCategoryQuestionByCategory(int categoryId) {

        Optional<Category> categoryOptional = categoryRepository.findById(categoryId);
        if (categoryOptional.isPresent()) {
            Category category = categoryOptional.get();
            return categoryQuestionRepository.findByCategoryId(category);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CategoryQuestion> findCategoryQuestionByQuestion(int questionId) {

        Optional<Question> questionOptional = questionRepository.findById(questionId);
        if (questionOptional.isPresent()) {
            Question question = questionOptional.get();
            return categoryQuestionRepository.findByIdQuestion(question);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Question> findQuestionByCategory(int categoryId) {
        List<Question> questions = new ArrayList<>();
        List<CategoryQuestion> list = findCategoryQuestionByCategory(categoryId);
        for (CategoryQuestion categoryQuestion : list) {
            questions.add(categoryQuestion.getId().getQuestion());
        }
        return questions;
    }

    public void saveCategoryQuestion(Category category, Question question, boolean rights) {
        CategoryQuestion categoryQuestion = new CategoryQuestion();
        CategoryQuestionId id = new CategoryQuestionId();
        id.setCategory(category);
        id.setQuestion(question);
        categoryQuestion.setId(id);
        categoryQuestion.setRights(rights);
        categoryQuestionRepository.save(categoryQuestion);
    }
}
