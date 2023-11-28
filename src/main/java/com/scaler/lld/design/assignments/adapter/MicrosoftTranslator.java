package com.scaler.lld.design.assignments.adapter;

import com.scaler.lld.design.assignments.adapter.external.MicrosoftTranslateApi;

import java.util.List;

public class MicrosoftTranslator implements TranslationProviderAdapter{
    MicrosoftTranslateApi microsoftTranslateApi = new MicrosoftTranslateApi();
    @Override
    public String translate(TranslationRequest request) {
        return microsoftTranslateApi.translate(request.getText(),request.getSourceLanguage(),request.getTargetLanguage());
    }

    @Override
    public List<String> getSupportedLanguage() {
        return microsoftTranslateApi.getSupportedLanguages();
    }
}
