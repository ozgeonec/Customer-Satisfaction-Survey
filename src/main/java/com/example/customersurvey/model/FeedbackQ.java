package com.example.customersurvey.model;

/**
 * @author ozgeonec
 */
public class FeedbackQ extends Questions {

    public String response;

    protected FeedbackQ(Long id, String title, String response) {
        super(id, title);
        this.response=response;
    }
    public String getResponse(){
        return response;
    }
    public void setResponse(String response){
        this.response=response;
    }
}
