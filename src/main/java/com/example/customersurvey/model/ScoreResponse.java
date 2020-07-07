package com.example.customersurvey.model;

import javax.persistence.*;

/**
 * @author ozgeonec
 */
@Entity
@Table(name="score_response")
public class ScoreResponse {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long scoreResponseID;

    @OneToOne
    @JoinColumn(name ="SCOREQ_ID")
    private ScoreQ scoreQ;

    @Column
    private int scoreResponse;

    public ScoreResponse(Long scoreResponseID, ScoreQ scoreQ, int scoreResponse) {
        this.scoreResponseID = scoreResponseID;
        this.scoreQ = scoreQ;
        this.scoreResponse = scoreResponse;
    }
    public ScoreResponse(){}

    public Long getScoreResponseID() {
        return scoreResponseID;
    }

    public void setScoreResponseID(Long scoreResponseID) {
        this.scoreResponseID = scoreResponseID;
    }

    public ScoreQ getScoreQ() {
        return scoreQ;
    }

    public void setScoreQ(ScoreQ scoreQ) {
        this.scoreQ = scoreQ;
    }

    public int getScoreResponse() {
        return scoreResponse;
    }

    public void setScoreResponse(int scoreResponse) {
        this.scoreResponse = scoreResponse;
    }
}
