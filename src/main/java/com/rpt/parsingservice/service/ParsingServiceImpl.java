package com.rpt.parsingservice.service;

import com.rpt.parsingservice.model.CountReviewRateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ParsingServiceImpl implements ParsingService{

    @Override
    public Mono<CountReviewRateResponse> extractBusinessUnitInfo(String businessUnitName) {
        return null;
    }
}
