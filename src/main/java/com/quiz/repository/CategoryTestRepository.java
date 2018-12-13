package com.quiz.repository;

import com.quiz.model.Category;
import com.quiz.model.CategoryTest;
import com.quiz.model.CategoryTestId;
import com.quiz.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryTestRepository extends JpaRepository<CategoryTest, CategoryTestId> {

    @Query(value= "SELECT * FROM category_test c WHERE c.test_id = ?1" , nativeQuery = true)
     List<CategoryTest> findByIdTest(Test test);


    @Query(value= "SELECT * FROM category_test c WHERE c.category_id = ?1" , nativeQuery = true)
     List<CategoryTest> findByCategoryId(Category category);

}
