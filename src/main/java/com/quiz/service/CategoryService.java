package com.quiz.service;

import com.quiz.model.Category;
import com.quiz.model.User;
import com.quiz.repository.CategoryRepository;
import com.quiz.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;


    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public List<Category> saveCategory(Category category) {

        categoryRepository.save(category);
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public void update(Category categoryDetails) {
        Category category = categoryRepository.findById(categoryDetails.getId()).get();
        category.setName(categoryDetails.getName());
        categoryRepository.save(categoryDetails);

    }

    public List<Category> getCategoriesByUser(User userId) {
        return categoryRepository.getByUser(userId);

    }

    public List<Category> getCategoriesByUserId(int userId) {

            return categoryRepository.getByUserId(userId);

    }
}
