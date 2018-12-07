package com.quiz.repository;

import com.quiz.model.CategoryTest;
import com.quiz.model.CategoryTestId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryTestRepository extends JpaRepository<CategoryTest, CategoryTestId> {
}
