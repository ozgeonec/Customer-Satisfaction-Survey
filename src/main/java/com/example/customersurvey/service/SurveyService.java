package com.example.customersurvey.service;

import com.example.customersurvey.controller.SurveyItemNotFoundException;
import com.example.customersurvey.model.Survey;
import com.example.customersurvey.repository.ResponsesRepo;
import com.example.customersurvey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 * @author ozgeonec
 */
@Service
public class SurveyService {


    //private Survey survey;
    @Autowired(required=true)
    private SurveyRepo surveyRepo;
    @Autowired(required=true)
    private ResponsesRepo responsesRepo;

    //Get Survey Title by SurveyId
    public String getTitleById(Long id){
        Optional<Survey> surveyItem = surveyRepo.findById(id);
        if(surveyItem.isEmpty()){
            throw new SurveyItemNotFoundException(id);
        }
        return surveyItem.get().getSurveyTitle();
    }
    //Save Survey
    public Survey saveSurvey(Survey survey){
        return surveyRepo.save(survey);
    }
    //Retrieve all surveys
    public List<Survey> retrieveAllSurveys(){
        return surveyRepo.findAll();
    }

    //Delete Survey by id
    public void deleteItem( Long id) {
        surveyRepo.deleteById(id);
    }

    //Retrieve 1 survey from id
    public Survey retrieveItem(Long id){
        Optional<Survey> surveyItem = surveyRepo.findById(id);
        if(surveyItem.isEmpty()){
            throw new SurveyItemNotFoundException(id);
        }
        return surveyItem.get();
    }

    //Update survey
    public ResponseEntity<Object> updateSurvey(Survey survey, Long id){
        Optional<Survey> existingSurvey = surveyRepo.findById(id);
        if (existingSurvey.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        survey.setSurveyId(id);
        surveyRepo.save(survey);
        return ResponseEntity.noContent().build();
    }

}
