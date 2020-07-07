package com.example.customersurvey.repository;

import com.example.customersurvey.model.ScoreResponse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ozgeonec
 */
public interface ScoreResponseRepo extends JpaRepository<ScoreResponse, Long> {
}
