package com.quiz.controller;

import com.quiz.model.CategoryQuestion;
import com.quiz.service.CategoryQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categoryQuestion")
public class CategoryQuestionController {

    @Autowired
    CategoryQuestionService categoryQuestionService;


    @GetMapping(value="/getByCategoryId/{id}")
    public List<CategoryQuestion> getByCategoryId(@PathVariable("id")Integer idCategory){
        return categoryQuestionService.findCategoryQuestionByCategory(idCategory);
    }


    @GetMapping(value="/getByQuestionId/{id}")
    public List<CategoryQuestion> getByQuestionId(@PathVariable("id")Integer idQuestion){
        return categoryQuestionService.findCategoryQuestionByQuestion(idQuestion);
    }
}
