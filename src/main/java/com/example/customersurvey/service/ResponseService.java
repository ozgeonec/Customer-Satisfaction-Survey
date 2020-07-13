package com.example.customersurvey.service;

import com.example.customersurvey.model.Responses;
import com.example.customersurvey.repository.ResponsesRepo;
import com.example.customersurvey.repository.SurveyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ozgeonec
 */
@Service
public class ResponseService {

    @Autowired
    private ResponsesRepo responsesRepo;

    //Get responses of 1 survey
    public List<Responses> retrieveResponsesBySurvey(Long surveyId){
        return responsesRepo.findAllBySurveySurveyId(surveyId);
    }

    //Save Responses
    public Responses submitResponse(Responses response) {
        return responsesRepo.save(response);
    }

    //Get All Responses
    public List<Responses> getResponses() {
        return responsesRepo.findAll();
    }

}
