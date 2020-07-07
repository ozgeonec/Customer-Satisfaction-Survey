package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="feedback_response")
public class FeedbackResponse {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long fbResponseID;

    @OneToOne
    @JoinColumn(name ="FBQ_ID")
    private FeedbackQ fbQ;

    @Column
    private String fbResponse;


    public FeedbackResponse(Long fbResponseID, FeedbackQ fbQ, String fbResponse) {
        this.fbResponseID = fbResponseID;
        this.fbQ = fbQ;
        this.fbResponse = fbResponse;
    }

    public FeedbackResponse(){}

   /* @ManyToOne
    @JoinColumn(name = "survey_id")
    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) { this.survey = survey; }*/

    public Long getResponseID() { return fbResponseID; }

    public void setResponseID(Long fbResponseID) { this.fbResponseID = fbResponseID; }

    public String getFbResponse() {
        return fbResponse;
    }

    public void setFbResponse(String fbResponse) {
        this.fbResponse = fbResponse;
    }

    public FeedbackQ getFbQ() { return fbQ; }

    public void setFbQ(FeedbackQ fbQ) { this.fbQ = fbQ; }

   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "score_type_id",insertable = false, updatable = false)*/


    public String toString(){
        return "Feedback " + fbQ.getResponse();
    }
}
