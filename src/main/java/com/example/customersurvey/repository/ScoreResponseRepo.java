package com.example.customersurvey.repository;

import com.example.customersurvey.model.ScoreResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ozgeonec
 */
@Repository
public interface ScoreResponseRepo extends JpaRepository<ScoreResponse, Long> {
    //List<ScoreResponse> findAllBySurveyId(Long surveyId);
}
