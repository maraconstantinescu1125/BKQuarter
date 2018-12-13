package com.quiz.service;

import com.quiz.model.Category;
import com.quiz.model.CategoryTest;
import com.quiz.model.CategoryTestId;
import com.quiz.model.Test;
import com.quiz.repository.CategoryRepository;
import com.quiz.repository.CategoryTestRepository;
import com.quiz.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryTestService {

    @Autowired
    CategoryTestRepository categoryTestRepository;

    @Autowired
    TestRepository testRepository;

    @Autowired
    CategoryRepository categoryRepository;

    public Optional<CategoryTest> findCategoryTestById(CategoryTestId id){
        return categoryTestRepository.findById(id);
    }

    public List<CategoryTest> findCategoryTestByTest(int testId){

        Optional<Test> testOptional=testRepository.findById(testId);
        if(testOptional.isPresent()){
            Test test=testOptional.get();
            return categoryTestRepository.findByIdTest(test);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CategoryTest> findCategoryTestByCategory(int categoryId){

        Optional<Category> categoryOptional=categoryRepository.findById(categoryId);
        if(categoryOptional.isPresent()){
            Category category=categoryOptional.get();
            return categoryTestRepository.findByCategoryId(category);
        } else {
            return Collections.emptyList();
        }
    }


    public void saveCategoryTest(Category category,Test test,boolean rights){
        CategoryTest categoryTest=new CategoryTest();
        CategoryTestId id=new CategoryTestId();
        id.setCategory(category);
        id.setTest(test);
        categoryTest.setId(id);
        categoryTest.setRights(rights);
        categoryTestRepository.save(categoryTest);
    }


}
