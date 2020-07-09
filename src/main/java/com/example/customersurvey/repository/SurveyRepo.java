package com.example.customersurvey.repository;

import com.example.customersurvey.model.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ozgeonec
 */
@Repository
public interface SurveyRepo extends JpaRepository<Survey,Long> {
   /* @Query("select title from Survey")
    List<String> findAllTitles();*/
}
