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

    @Autowired
    UserRepository userRepository;


    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

    public Optional<Category> findById(int id) {
        return categoryRepository.findById(id);
    }

    public List<Category> update(Category categoryDetails) {
        Optional<Category> categoryOptional = categoryRepository.findById(categoryDetails.getId());
        if(categoryOptional.isPresent())
            {
            Category category=categoryOptional.get();
            category.setName(categoryDetails.getName());
            categoryRepository.save(categoryDetails);
            }
            return categoryRepository.findAll();
    }

    public List<Category> save(Category category,int idUser){
        Optional<User> optionalUser=userRepository.findById(idUser);
        if(optionalUser.isPresent()){
            User user=optionalUser.get();
            Category newCategory=new Category();
            newCategory.setName(category.getName());
            newCategory.setUser(user);
            categoryRepository.save(newCategory);
        }
        return categoryRepository.findAll();
    }

    public List<Category> getCategoriesByUser(User userId) {
        return categoryRepository.getByUser(userId);

    }

    public List<Category> getCategoriesByUserId(int userId) {

            return categoryRepository.getByUserId(userId);

    }
}
