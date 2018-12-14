package com.quiz.controller;


import com.quiz.model.Category;
import com.quiz.model.User;
import com.quiz.service.CategoryService;
import com.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import java.util.List;

@RestController
@RequestMapping(value="/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    UserService userService;

    @GetMapping(value="/categories")
    public List<Category> getCategories(){

       return categoryService.getCategory();


    }

    @PutMapping(value="/update")
    public List<Category> update(@RequestBody Category category){
        return categoryService.update(category);
    }

    @GetMapping(value="/categoryByUser/{id}")
    public List<Category> getCategoryByUser(@PathVariable("id") Integer userId){
        return categoryService.getCategoriesByUserId(userId);
    }

    @PostMapping(value="/saveCategory/{id}")
    public List<Category> save(@RequestBody Category category,@PathVariable Integer id){

        return categoryService.save(category,id);
    }

}
