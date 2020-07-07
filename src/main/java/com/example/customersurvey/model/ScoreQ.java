package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name= "score_type")
public class ScoreQ {
    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long scoreID;
    @Column(name="score_question")
    private String scoreQuestion;
    @Column(name="score_response")
    public int scoreResponse;

    public ScoreQ(Long scoreID, String scoreQuestion, int scoreResponse) {
        this.scoreID = scoreID;
        this.scoreQuestion = scoreQuestion;
        this.scoreResponse = scoreResponse;
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
