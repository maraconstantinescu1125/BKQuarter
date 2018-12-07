package com.quiz.service;

import com.quiz.model.Test;
import com.quiz.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    TestRepository testRepository;

    public List<Test> getTests(){
        return testRepository.findAll();
    }
}
