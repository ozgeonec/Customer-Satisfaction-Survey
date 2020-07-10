package com.example.customersurvey.repository;

import com.example.customersurvey.model.Responses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ozgeonec
 */
@Repository
public interface ResponsesRepo extends JpaRepository<Responses, Long> {

    @Query("SELECT feedback, score FROM responses r  WHERE r.survey_id = s.survey_id ")
    List<Responses> getResponsesFromSurveyId(Long surveyId);
}
