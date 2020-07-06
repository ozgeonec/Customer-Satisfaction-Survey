package com.example.customersurvey.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ozgeonec
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SurveyItemNotFoundException extends RuntimeException {
    public SurveyItemNotFoundException(Long id) {
        super("Survey with ID " + id + " could not be found");
    }
}
