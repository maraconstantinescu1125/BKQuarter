package com.quiz.repository;

import com.quiz.model.MyTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTestRepository extends JpaRepository<MyTest, Integer> {
}
