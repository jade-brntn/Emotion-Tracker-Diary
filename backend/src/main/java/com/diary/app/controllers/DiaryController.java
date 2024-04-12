package com.diary.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.diary.app.models.Question;
import com.diary.app.models.Response;
import com.diary.app.repositories.QuestionRepository;
import com.diary.app.repositories.ResponseRepository;
import com.diary.app.services.SentimentAnalysisService;

@RestController
public class DiaryController {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private ResponseRepository responseRepository;
    @Autowired
    private SentimentAnalysisService sentimentAnalysisService;

    @GetMapping("/question")
    public Question getDailyQuestion() {
        // Implement logic to fetch and return a random question
    }

    @PostMapping("/response")
    public Response saveResponse(@RequestBody Response response) {
        double sentimentScore = sentimentAnalysisService.analyzeSentiment(response.getText());
        response.setSentimentScore(sentimentScore);
        return responseRepository.save(response);
    }
}
