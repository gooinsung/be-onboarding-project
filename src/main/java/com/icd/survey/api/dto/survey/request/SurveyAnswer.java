package com.icd.survey.api.dto.survey.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SurveyAnswer {
    private String answer;
    private Long optionalAnswer;
    private List<Long> optionalAnswerList;
}
