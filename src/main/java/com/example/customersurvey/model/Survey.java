package com.example.customersurvey.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;

/**
 * @author ozgeonec
 */
@Data
@Entity
@Table(name="surveys")
public class Survey {

    private Long id;
    private String title;
    private FeedbackQ feedbackQ;
    private ScoreQ scoreQ;

    public Survey(Long id, String title, FeedbackQ feedbackQ, ScoreQ scoreQ) {
        this.id = id;
        this.title = title;
        this.feedbackQ = feedbackQ;
        this.scoreQ=scoreQ;
    }

    public Survey(){}

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Column(name="Title", nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "feedback_type_id")
    public FeedbackQ getFeedbackQ() {
        return feedbackQ;
    }

    public void setFeedbackQ(FeedbackQ feedbackQ) {
        this.feedbackQ = feedbackQ;
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "score_type_id")
    public ScoreQ getScoreQ() { return scoreQ; }

    public void setScoreQ(ScoreQ scoreQ) { this.scoreQ = scoreQ;}

}
