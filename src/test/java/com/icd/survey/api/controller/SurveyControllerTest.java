package com.icd.survey.api.controller;

import com.icd.survey.api.controller.survey.SurveyController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(SurveyController.class)
class SurveyControllerTest {

    @Autowired
    MockMvc mockMvc;


}