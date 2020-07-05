package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

/**
 * @author ozgeonec
 */
@Data
@Entity
public class Survey {

    private @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    private String title;
    private FeedbackQ feedbackQ;
    private ScoreQ scoreQ;

    public Survey(Long id, String title, FeedbackQ feedbackQ, ScoreQ scoreQ) {
        this.id = id;
        this.title = title;
        this.feedbackQ = feedbackQ;
        this.scoreQ = scoreQ;
    }
    public Survey(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FeedbackQ getFeedbackQ() {
        return feedbackQ;
    }

    public void setFeedbackQ(FeedbackQ feedbackQ) {
        this.feedbackQ = feedbackQ;
    }

    public ScoreQ getScoreQ() {
        return scoreQ;
    }

    public void setScoreQ(ScoreQ scoreQ) {
        this.scoreQ = scoreQ;
    }

}
