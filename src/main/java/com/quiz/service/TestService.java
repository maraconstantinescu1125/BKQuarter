package com.quiz.service;

import com.quiz.model.*;
import com.quiz.repository.CategoryRepository;
import com.quiz.repository.CategoryTestRepository;
import com.quiz.repository.QuestionRepository;
import com.quiz.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    @Autowired
    CategoryTestService categoryTestService;

    @Autowired
    CategoryQuestionService categoryQuestionService;

    @Autowired
    QuestionRepository questionRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public Test createTest(String name){
        Test test = new Test();
        test.setActive(true);
        test.setName(name);
        return testRepository.save(test);
    }

    public Question createQuestion(String text){
        Question question = new Question();
        question.setText(text);
        return questionRepository.save(question);
    }



    public List<Test> getTests(){
        return testRepository.findAll();
    }



    public Test getTestById(int id){
        return testRepository.getOne(id);
    }

    public Test addTestToCategory(int categoryId, Test test){
       Optional<Category> categoryOptional= categoryRepository.findById(categoryId);
       if(categoryOptional.isPresent()){
           Category category=categoryOptional.get();
           List<Question> questions=new ArrayList<>();
            for(Question question:test.getQuestions()){
                question = questionRepository.save(question);
                questions.add(question);
                categoryQuestionService.saveCategoryQuestion(category,question,true);
            }
            test.setQuestions(questions);
            test=testRepository.save(test);
           categoryTestService.saveCategoryTest(category,test,true);
        return test;
        }
        return null;
    }

    public List<Test> delete(int id){

        Optional<Test> testOptional=testRepository.findById(id);

        if(testOptional.isPresent()){
            if(categoryTestService.findCategoryTestByTest(id).isEmpty())
            testRepository.deleteById(id);
        }
        return testRepository.findAll();
    }
}
