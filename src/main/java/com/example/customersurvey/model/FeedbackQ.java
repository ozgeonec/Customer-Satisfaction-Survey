package com.example.customersurvey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="feedback_question")
public class FeedbackQ extends Questions {
    @Column(name="feedback_response")
    public String response;

    protected FeedbackQ(Long id, String title, String response) {
        super(id, title);
        this.response=response;
    }
    public FeedbackQ(){ }
    public String getResponse(){
        return response;
    }
    public void setResponse(String response){
        this.response=response;
    }
}
