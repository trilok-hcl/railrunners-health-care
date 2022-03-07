package com.econsult.controller;

import com.econsult.model.Feedback;
import com.econsult.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedbackController {
    @Autowired
    FeedbackRepository feedbackRepository;

    @GetMapping(value = "/feedback")
    public List<Feedback> getFeedback() {
        return feedbackRepository.findAll();
    }

    @PostMapping(value = "/fedback")
    public void save(@RequestBody Feedback feedback) {
        feedbackRepository.save(feedback);
    }
}
