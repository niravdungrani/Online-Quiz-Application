package com.example.Online.Quiz.Application.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long quizId;
    private String title;
    @ElementCollection
    private List<String> options;
    private String correctAnswer;

}
