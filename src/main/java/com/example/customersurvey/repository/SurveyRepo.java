package com.example.customersurvey.repository;

import com.example.customersurvey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author ozgeonec
 */

public interface SurveyRepo extends JpaRepository<Survey,Long> {

}
