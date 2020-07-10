package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * @author ozgeonec
 */

@Entity
@Table(name="Survey")
public class Survey {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long surveyId;

    @Column
    private String surveyTitle;

    @Column
    private int npmScore;

    public Survey(Long surveyId, String surveyTitle, int npmScore) {
        this.surveyId = surveyId;
        this.surveyTitle = surveyTitle;
        this.npmScore = npmScore;
    }

    public Survey(){}

    public int getNpmScore() { return npmScore; }

    public void setNpmScore(int npmScore) { this.npmScore = npmScore; }

    public Long getSurveyId() {
        return surveyId;
    }

    public void setSurveyId(Long surveyId) {
        this.surveyId = surveyId;
    }

    public String getSurveyTitle() {
        return surveyTitle;
    }

    public void setSurveyTitle(String surveyTitle) {
        this.surveyTitle = surveyTitle;
    }


}
