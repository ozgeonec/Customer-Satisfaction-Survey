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
    @GeneratedValue(strategy = GenerationType.AUTO) Long surveyId;

    @Column
    private String surveyTitle;

    @Transient
    private List<String> FeedbackQ;
    @Transient
    private List<String> FeedbackResponse;

    @Transient
    private List<String> ScoreQ;
    @Transient
    private List<Integer> ScoreResponse;

    public Survey(Long surveyId, String surveyTitle) {
        this.surveyId = surveyId;
        this.surveyTitle = surveyTitle;
    }

    public Survey(){}

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

    public List<String> getFeedbackQ() {
        return FeedbackQ;
    }

    public void setFeedbackQ(List<String> feedbackQ) {
        FeedbackQ = feedbackQ;
    }

    public List<String> getFeedbackResponse() {
        return FeedbackResponse;
    }

    public void setFeedbackResponse(List<String> feedbackResponse) {
        FeedbackResponse = feedbackResponse;
    }

    public List<String> getScoreQ() {
        return ScoreQ;
    }

    public void setScoreQ(List<String> scoreQ) {
        ScoreQ = scoreQ;
    }

    public List<Integer> getScoreResponse() {
        return ScoreResponse;
    }

    public void setScoreResponse(List<Integer> scoreResponse) {
        ScoreResponse = scoreResponse;
    }
}
