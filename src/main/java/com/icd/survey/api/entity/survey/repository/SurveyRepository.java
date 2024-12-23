package com.icd.survey.api.entity.survey.repository;

import com.icd.survey.api.entity.survey.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SurveyRepository extends JpaRepository<Survey, Long> {
    Optional<Survey> findBySurveyNameAndIpAddress(String surveyName, String ipAddress);
    Boolean existsBySurveyNameAndIpAddress(String surveyName, String ipAddress);

}
