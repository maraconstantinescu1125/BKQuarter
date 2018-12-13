package com.quiz.repository;

import com.quiz.model.Category;
import com.quiz.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> getByUser(User user);

    List<Category> getByUserId(int id);

}
