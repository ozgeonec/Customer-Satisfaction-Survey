package com.example.customersurvey.repository;

import com.example.customersurvey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ozgeonec
 */
public interface SurveyRepo extends JpaRepository<Survey,Long> {

}
