package com.icd.survey.common;

import jakarta.servlet.http.HttpServletRequest;

public class CommonUtils {
    public static String getRequestIp(HttpServletRequest request) {
        return request.getHeader("X-Forwarded-For");
    }
}
