package com.example.customersurvey.controller;

import com.example.customersurvey.model.Survey;
import com.example.customersurvey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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



}
