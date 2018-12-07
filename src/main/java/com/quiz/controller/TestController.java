package com.quiz.controller;

import com.quiz.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @Autowired
    TestController testController;

    @GetMapping(value="/all")
    public List<Test> getAll(){
        return testController.getAll();
    }
}
