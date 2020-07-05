package com.example.customersurvey.controller;

/**
 * @author ozgeonec
 */
public class SurveyItemNotFoundException extends RuntimeException {
    public SurveyItemNotFoundException(Long id) {
        super("Survey with ID " + id + " could not be found");
    }
}
