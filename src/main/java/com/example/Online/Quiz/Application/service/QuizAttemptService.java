package com.example.Online.Quiz.Application.service;

import com.example.Online.Quiz.Application.model.QuizAttempt;
import com.example.Online.Quiz.Application.repository.QuizAttemptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizAttemptService {
    @Autowired
    private QuizAttemptRepository quizAttemptRepository;

    public QuizAttempt save(QuizAttempt quizAttempt) {
        return quizAttemptRepository.save(quizAttempt);
    }

    public List<QuizAttempt> getAttemptsByUserId(Long userId) {
        return quizAttemptRepository.findByUserId(userId);
    }
}
