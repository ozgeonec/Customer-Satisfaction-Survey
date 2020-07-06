package com.example.customersurvey.model;

import javax.persistence.Entity;

/**
 * @author ozgeonec
 */
@Entity
public class ScoreQ extends Questions {
    public int response;

    protected ScoreQ(Long id, String title, int response) {
        super(id, title);
        this.response=response;
    }
    public ScoreQ(){}
    public int getResponse() {
        return response;
    }

    public void setResponse(int response) {
        this.response = response;
    }
}
