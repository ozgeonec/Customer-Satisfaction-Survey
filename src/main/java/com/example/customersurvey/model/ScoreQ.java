package com.example.customersurvey.model;

/**
 * @author ozgeonec
 */
public class ScoreQ extends Questions {
    public int response;

    protected ScoreQ(Long id, String title, int response) {
        super(id, title);
        this.response=response;
    }

    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}
