package com.quiz.controller;

import com.quiz.model.Category;
import com.quiz.model.CategoryTestId;
import com.quiz.model.Test;
import com.quiz.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping(value="/all")
    public List<Test> getAll(){
        return testService.getTests();
    }



    @PostMapping(value="/addTestToCategory/{categoryId}/")
    public Test addTestToCategory(@PathVariable int categoryId, @RequestBody Test test){
        return testService.addTestToCategory(categoryId, test);

    }

    @PutMapping(value="/updateTest/{id}")
    public Test update(@PathVariable int id, @RequestBody Test test){
        Test attachedTest = testService.getTestById(id);
        attachedTest.setName(test.getName());
        return attachedTest;
    }

    @DeleteMapping(value="/delete/{id}")
    public List<Test> delete(@PathVariable int id){
        return testService.delete(id);
    }
}
