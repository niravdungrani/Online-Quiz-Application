package com.example.Online.Quiz.Application.controller;

import com.example.Online.Quiz.Application.model.QuizAttempt;
import com.example.Online.Quiz.Application.service.QuizAttemptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attempts")
public class QuizAttemptController {
    @Autowired
    private QuizAttemptService quizAttemptService;

    @PostMapping
    public ResponseEntity<QuizAttempt> saveAttempt(@RequestBody QuizAttempt quizAttempt) {
        return ResponseEntity.ok(quizAttemptService.save(quizAttempt));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<QuizAttempt>> getAttemptsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(quizAttemptService.getAttemptsByUserId(userId));
    }
}
