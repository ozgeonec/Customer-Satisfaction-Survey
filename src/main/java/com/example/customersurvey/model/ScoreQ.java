package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name= "scoreQ_type")
public class ScoreQ {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long scoreID;

    @Column(name="score_question")
    private String scoreQuestion;

    @Transient
    public int scoreResponse;

    @ManyToOne
    @JoinColumn(name ="SURVEY_ID")
    private Survey survey;

    public ScoreQ(Long scoreID, String scoreQuestion, Survey survey) {
        this.scoreID = scoreID;
        this.scoreQuestion = scoreQuestion;
        this.survey = survey;

    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public ScoreQ(){}

    public Long getId() {
        return scoreID;
    }

    public void setId(Long scoreID) {
        this.scoreID = scoreID;
    }

    public String getQuestion() {
        return scoreQuestion;
    }

    public void setQuestion(String scoreQuestion) {
        this.scoreQuestion = scoreQuestion;
    }

    public int getResponse() {
        return scoreResponse;
    }

    public void setResponse(int scoreResponse) {
        this.scoreResponse = scoreResponse;
    }
}
