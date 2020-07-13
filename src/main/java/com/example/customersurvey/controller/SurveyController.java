package com.example.customersurvey.controller;

import com.example.customersurvey.model.Survey;
import com.example.customersurvey.repository.SurveyRepo;
import com.example.customersurvey.service.SurveyService;
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

    @Autowired
    private SurveyService surveyService;


    @GetMapping("/surveys")
    public List<Survey> retrieveAllSurveys(){
        return surveyService.retrieveAllSurveys();
    }

    @GetMapping("/surveys/{id}")
    public Survey retrieveItem(@PathVariable Long id){
       return surveyService.retrieveItem(id);
    }

    @DeleteMapping("/surveys/{id}")
    public void deleteItem(@PathVariable Long id) {
        surveyService.deleteItem(id);
    }

    @PostMapping("/surveys")
    public ResponseEntity<Object> createSurvey(@RequestBody Survey survey){
        return surveyService.createSurvey(survey);
    }
    @PutMapping("/surveys/{id}")
    public ResponseEntity<Object> updateSurvey(@RequestBody Survey survey, @PathVariable Long id){
       return surveyService.updateSurvey(survey,id);
    }
   /* @GetMapping("/titles")
    public List<String> getAllTitles(){
        return surveyService.getAllTitles();
    }*/

    @GetMapping("/titles/{id}")
    public String getTitle(Long id){
        return surveyService.getTitleById(id);
    }

    //NPM score Calculations
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
