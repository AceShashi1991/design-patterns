package com.scaler.lld.design.assignments.adapter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// DO NOT REMOVE THE NO-ARG CONSTRUCTOR ANNOTATION
@NoArgsConstructor
@Getter
@Setter
public class TranslationRequest {
    private String text;
    private String sourceLanguage;
    private String targetLanguage;
    private Double confidenceThreshold;
}