package com.quiz.repository;

import com.quiz.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerReposity extends JpaRepository<Answer, Integer> {
}
