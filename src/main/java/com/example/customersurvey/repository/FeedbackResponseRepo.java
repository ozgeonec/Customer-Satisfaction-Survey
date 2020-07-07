package com.example.customersurvey.repository;

import com.example.customersurvey.model.FeedbackResponse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ozgeonec
 */
public interface FeedbackResponseRepo extends JpaRepository<FeedbackResponse, Long> {
}
