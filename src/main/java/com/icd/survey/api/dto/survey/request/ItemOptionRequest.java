package com.icd.survey.api.dto.survey.request;

import com.icd.survey.api.entity.survey.ItemResponseOption;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ItemOptionRequest {
    private Long optionSeq;
    private String option;

    public void validationCheck() {
        if (option.isEmpty()) {
            throw new IllegalArgumentException("옵션 정보를 확인하세요.");
        }
    }

}
