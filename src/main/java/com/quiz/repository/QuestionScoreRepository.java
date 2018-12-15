package com.quiz.repository;

import com.quiz.model.QuestionScore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionScoreRepository extends JpaRepository<QuestionScore, Integer> {
}
