package com.rpt.parsingservice.service;

import com.rpt.parsingservice.model.CountReviewRateResponse;
import reactor.core.publisher.Mono;

public interface ParsingService {
    Mono<CountReviewRateResponse> extractBusinessUnitInfo(String businessUnitName);
}
