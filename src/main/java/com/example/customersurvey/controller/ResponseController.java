package com.example.customersurvey.controller;

import com.example.customersurvey.model.Responses;
import com.example.customersurvey.repository.ResponsesRepo;
import com.example.customersurvey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ozgeonec
 */
@RequestMapping("/responses")
@RestController
public class ResponseController {

    private ResponsesRepo responsesRepo;


    @Autowired
    public ResponseController(ResponsesRepo responsesRepo) {
        this.responsesRepo = responsesRepo;
    }
    @GetMapping
    public List<Responses> retrieveAllResponses(){
        return  responsesRepo.findAll();
    }

    @GetMapping("/surveys/{id}")
    public List<Responses> getResponsesFromSurveyId(@PathVariable Long surveyId){
        return responsesRepo.getResponsesFromSurveyId(surveyId);
    }

}
