package com.quiz.controller;


import com.quiz.model.Category;
import com.quiz.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping(value="/get")
    public List<Category> getCategories(){

        categoryService.getCategory();

        return null;
    }

}
