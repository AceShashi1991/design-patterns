package com.scaler.lld.design.assignments.adapter;

import java.util.List;

public interface TranslationProviderAdapter {

    String translate(TranslationRequest request);

    List<String> getSupportedLanguage();


}