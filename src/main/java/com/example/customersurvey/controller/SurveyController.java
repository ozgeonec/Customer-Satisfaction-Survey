package com.example.customersurvey.controller;

import com.example.customersurvey.model.Survey;
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
   /* @GetMapping("/surveys/{id}/fb_responses")
    public List<FeedbackResponse> getAllFeedback(){
        return feedbackResponseRepo.findAll();
    }
    @GetMapping("/surveys/{id}/score_responses")
    public List<ScoreResponse> getAllScore(){
        return scoreResponseRepo.findAll();
    }
    @GetMapping("/surveys/{id}/all_responses")
    public String getAllResponses(@RequestBody Survey survey, @PathVariable Long id){
       String responses = feedbackResponseRepo.toString() + scoreResponseRepo.toString();
        Optional<Survey> existingSurvey = surveyRepo.findById(id);
        if(existingSurvey.isPresent()) {
            return responses;
        }else throw new SurveyItemNotFoundException(id);
    }*/
  /*  public int getNpmScore(){
        int NPS=0;
        for (Survey survey : surveyRepo.findAll()) {
            List<ScoreResponse> scores = scoreResponseRepo.findAllById(survey.getSurveyId());
            int promoterCount = 0;
            int detractorCount = 0;
            for (ScoreResponse score : scores) {
                if (score.getScoreResponse() >= 9) {
                    promoterCount++;
                } else if (score.getScoreResponse() <= 6) {
                    detractorCount++;
                }
            }
            int answerCount = scores.size();
            NPS = (100 * (promoterCount - detractorCount)) / answerCount;
        }

        return NPS;
    }*/
   /* public void listNpmScores(){
        int NPS= getNpmScore();
        List<Survey> surveyList = surveyRepo.findAll();
        for(Survey survey : surveyRepo.findAll()){

        }
        existingSurvey.setScoreResponse(Collections.singletonList(NPS));
        surveyRepo.save(existingSurvey);
    }*/

}
