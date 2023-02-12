package com.rpt.parsingservice.service;

import com.rpt.parsingservice.model.CountReviewRateResponse;

public interface ParsingService {
    CountReviewRateResponse extractBusinessUnitInfo(String businessUnitName);
}
