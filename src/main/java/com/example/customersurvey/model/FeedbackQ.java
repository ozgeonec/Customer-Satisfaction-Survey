package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="feedback_type")
public class FeedbackQ {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long fbID;
    @Column(name="feedback_question")
    private String fbQuestion;
    @Column(name="feedback_response")
    public String fbResponse;

    public FeedbackQ(Long fbID, String fbQuestion, String fbResponse) {
        this.fbID = fbID;
        this.fbQuestion = fbQuestion;
        this.fbResponse = fbResponse;
    }

    public FeedbackQ(){ }

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
