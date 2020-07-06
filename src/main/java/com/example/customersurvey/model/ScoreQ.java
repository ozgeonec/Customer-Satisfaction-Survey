package com.example.customersurvey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author ozgeonec
 */
@Entity
@Table(name= "score_question")
public class ScoreQ extends Questions {
    @Column(name="score_response")
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
