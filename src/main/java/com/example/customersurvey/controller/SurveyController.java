package com.example.customersurvey.controller;

import com.example.customersurvey.model.FeedbackQ;
import com.example.customersurvey.model.FeedbackResponse;
import com.example.customersurvey.model.ScoreResponse;
import com.example.customersurvey.model.Survey;
import com.example.customersurvey.repository.FeedbackResponseRepo;
import com.example.customersurvey.repository.ScoreResponseRepo;
import com.example.customersurvey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

/**
 * @author ozgeonec
 */
@RestController
public class SurveyController {

    private SurveyRepo surveyRepo;
    private FeedbackResponseRepo feedbackResponseRepo;
    private ScoreResponseRepo scoreResponseRepo;

    @Autowired
    public SurveyController(SurveyRepo surveyRepo) {
        this.surveyRepo = surveyRepo;
    }

    @GetMapping("/surveys")
    public List<Survey> retrieveAllSurveys(){
        return surveyRepo.findAll();
    }

    @GetMapping("/surveys/{id}")
    public Survey retrieveItem(@PathVariable Long id){
        Optional<Survey> surveyItem = surveyRepo.findById(id);
        if(surveyItem.isEmpty()){
            throw new SurveyItemNotFoundException(id);
        }
        return surveyItem.get();
    }

    @DeleteMapping("/surveys/{id}")
    public void deleteItem(@PathVariable Long id) {
        surveyRepo.deleteById(id);
    }

    @PostMapping("/surveys")
    public ResponseEntity<Object> createSurvey(@RequestBody Survey survey){
        Survey savedSurveyItem = surveyRepo.save(survey);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedSurveyItem.getSurveyId()).toUri();
        return ResponseEntity.created(location).body(savedSurveyItem);
    }
    @PutMapping("/surveys/{id}")
    public ResponseEntity<Object> updateSurvey(@RequestBody Survey survey, @PathVariable Long id){
        Optional<Survey> existingSurvey = surveyRepo.findById(id);
        if (existingSurvey.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        survey.setSurveyId(id);
        surveyRepo.save(survey);
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/surveys/{id}/fb_responses")
    public List<FeedbackResponse> getAllFeedback(){
        return feedbackResponseRepo.findAll();
    }
    @GetMapping("/surveys/{id}/score_responses")
    public List<ScoreResponse> getAllScore(){
        return scoreResponseRepo.findAll();
    }
   /* @GetMapping("/surveys/{id}/all_responses")
    public String  getAllResponses(@RequestBody Survey survey, @PathVariable Long id){
        Optional<Survey> existingSurvey = surveyRepo.findById(id);
        if(existingSurvey.equals(survey)) {
            return "Survey name: " + survey.getSurveyTitle() + survey.getFeedbackQ() + survey.getFeedbackResponse() +
                    survey.getScoreQ() + survey.getScoreResponse();
        }

    }*/


}
