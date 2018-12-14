package com.quiz.controller;

import com.quiz.model.CategoryTest;
import com.quiz.model.CategoryTestId;
import com.quiz.model.Test;
import com.quiz.service.CategoryTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/category-test")
public class CategoryTestController {

    @Autowired
    CategoryTestService categoryTestService;

    @GetMapping(value="/getId")
    public Optional<CategoryTest> getCategoryTestById(@RequestBody CategoryTestId id){
        return categoryTestService.findCategoryTestById(id);
    }

    @GetMapping(value="/getByTest/{id}")
    public List<CategoryTest> getCategoryTestByTest(@PathVariable("id") Integer idTest){
        return categoryTestService.findCategoryTestByTest(idTest);
    }

    @GetMapping(value="/getByCategory/{id}")
    public List<CategoryTest> getCategoryTestByCategory(@PathVariable("id")Integer idCategory){
        return categoryTestService.findCategoryTestByCategory(idCategory);
    }

    @DeleteMapping(value="/delete/{idCategory}/{idTest}")
    public void delete(@PathVariable("idCategory")Integer idCategory,@PathVariable("idTest")Integer idTest){
        categoryTestService.deleteCategoryTest(idCategory,idTest);
    }


}
