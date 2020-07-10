package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="Responses")
public class Responses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long responseId;

    private String feedback;

    private int score;

    //foreign key
    @ManyToOne
    @JoinColumn(name = "surveyId")
    private Survey survey;

    public Responses(Long responseId, String feedback, int score, Survey survey) {
        this.responseId = responseId;
        this.feedback = feedback;
        this.score = score;
        this.survey = survey;
    }
    public Responses(){}

    public Long getResponseId() { return responseId; }

    public void setResponseId(Long responseId) { this.responseId = responseId; }

    public String getFeedback() { return feedback; }

    public void setFeedback(String feedback) { this.feedback = feedback; }

    public int getScore() { return score; }

    public void setScore(int score) { this.score = score; }

    public Survey getSurvey() { return survey; }

    public void setSurvey(Survey survey) { this.survey = survey; }
}
