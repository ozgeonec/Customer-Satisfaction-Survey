package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="feedbackQ_type")
public class FeedbackQ {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long fbID;

    @Column(name="feedback_question")
    private String fbQuestion;

    @Transient
    public String fbResponse;

    @ManyToOne
    @JoinColumn(name ="SURVEY_ID")
    private Survey survey;

    public FeedbackQ(Long fbID, String fbQuestion, Survey survey) {
        this.fbID = fbID;
        this.fbQuestion = fbQuestion;
        this.survey = survey;
    }

    public FeedbackQ(){ }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Long getId() {
        return fbID;
    }

    public void setId(Long fbID) {
        this.fbID = fbID;
    }

    public String getQuestion() {
        return fbQuestion;
    }

    public void setQuestion(String fbQuestion) {
        this.fbQuestion = fbQuestion;
    }

    public String getResponse(){
        return fbResponse;
    }

    public void setResponse(String fbResponse){
        this.fbResponse=fbResponse;
    }

}
