package com.quiz.service;

import com.quiz.model.Category;
import com.quiz.model.CategoryQuestion;
import com.quiz.model.Question;
import com.quiz.repository.CategoryQuestionRepository;
import com.quiz.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    CategoryQuestionRepository categoryQuestionRepository;

    @Autowired
    CategoryQuestionService categoryQuestionService;

    public void saveQuestion(Question question, Category category){

        questionRepository.save(question);
        categoryQuestionService.saveCategoryQuestion(category,question,true);

    }

    public List<Question> getQuestions(){
        return questionRepository.findAll();
    }


    public List<Question> delete(int id){
        Optional<Question> questionOptional=questionRepository.findById(id);
        if(questionOptional.isPresent()){
            Question question=questionOptional.get();
            if(categoryQuestionRepository.findByIdQuestion(question).isEmpty()){
                questionRepository.delete(question);
            }
        }
        return questionRepository.findAll();
    }
}
