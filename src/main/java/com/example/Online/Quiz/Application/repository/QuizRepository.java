package com.example.Online.Quiz.Application.repository;

import com.example.Online.Quiz.Application.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {}
