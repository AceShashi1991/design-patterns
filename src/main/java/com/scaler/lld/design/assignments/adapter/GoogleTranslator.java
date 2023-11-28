package com.scaler.lld.design.assignments.adapter;

import com.scaler.lld.design.assignments.adapter.external.GoogleTranslateApi;
import com.scaler.lld.design.assignments.adapter.external.GoogleTranslationRequest;

import java.util.List;

public class GoogleTranslator implements TranslationProviderAdapter{
    GoogleTranslateApi googleTranslateApi = new GoogleTranslateApi();
    @Override
    public String translate(TranslationRequest request) {
        GoogleTranslationRequest googleRequest = new GoogleTranslationRequest(request.getText(),
                request.getSourceLanguage(),
                request.getTargetLanguage(),
                request.getConfidenceThreshold());
        return googleTranslateApi.convert(googleRequest);
    }

    @Override
    public List<String> getSupportedLanguage() {
        return googleTranslateApi.getLanguages();
    }
}
