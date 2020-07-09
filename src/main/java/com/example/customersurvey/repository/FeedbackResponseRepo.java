package com.example.customersurvey.repository;

import com.example.customersurvey.model.FeedbackResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ozgeonec
 */
@Repository
public interface FeedbackResponseRepo extends JpaRepository<FeedbackResponse, Long> {
    //List<FeedbackResponse> findAllBySurveyBySurveyId(Long surveyId);
}
