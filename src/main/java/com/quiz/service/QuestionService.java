package com.quiz.service;

import com.quiz.model.Category;
import com.quiz.model.CategoryQuestion;
import com.quiz.model.Question;
import com.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    CategoryQuestionService categoryQuestionService;

    public void saveQuestion(Question question, Category category){

        questionRepository.save(question);
        categoryQuestionService.saveCategoryQuestion(category,question,true);

    }

    public List<Question> getQuestions(){
        return questionRepository.findAll();
    }
}
