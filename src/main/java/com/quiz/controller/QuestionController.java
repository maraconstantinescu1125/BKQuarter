package com.quiz.controller;


import com.quiz.model.Question;
import com.quiz.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping(value="/all")
    public List<Question> getAll(){
        return questionService.getQuestions();
    }
}
