package com.example.customersurvey.controller;

import com.example.customersurvey.model.Responses;
import com.example.customersurvey.repository.ResponsesRepo;
import com.example.customersurvey.repository.SurveyRepo;
import com.example.customersurvey.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * @author ozgeonec
 */

@RestController
public class ResponseController {
    @Autowired
    private ResponseService responseService;


    @GetMapping("/responses")
    public List<Responses> retrieveAllResponses(){
        return  responseService.getResponses();
    }

    @PostMapping("/responses")
    public Responses submitResponse(@RequestBody Responses response) {
        if ((response.getSurvey() != null) && (response.getScore() >= 0 || response.getScore() <= 10)) {
            return responseService.submitResponse(response);
        }else throw new SurveyItemNotFoundException(response.getSurvey().getSurveyId());
    }
    @GetMapping("/title/{surveyId}")
    public List<Responses> getResponseByTitle(Long surveyId){
        return responseService.retrieveResponsesBySurvey(surveyId);
    }

}
