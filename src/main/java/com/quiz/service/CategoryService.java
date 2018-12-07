package com.quiz.service;

import com.quiz.model.Category;
import com.quiz.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getCategory(){
        return categoryRepository.findAll();
    }
    public List<Category> saveCategory( Category category){
        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(int id){
        return categoryRepository.findById(id);
    }




}
