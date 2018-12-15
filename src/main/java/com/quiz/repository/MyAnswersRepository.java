package com.quiz.repository;

import com.quiz.model.MyAnswers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyAnswersRepository extends JpaRepository<MyAnswers, Integer> {
}
