package com.rpt.parsingservice.service;

import com.rpt.parsingservice.model.CountReviewRateResponse;
import com.rpt.parsingservice.utils.WebPageMappingUtils;
import com.rpt.parsingservice.webclient.TrustPilotClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ParsingServiceImpl implements ParsingService{

    private final TrustPilotClient client;

    @Override
    public Mono<CountReviewRateResponse> extractBusinessUnitInfo(String businessUnitName) {
        return client.getBusinessUnitInfoWebPage(businessUnitName)
                .map(WebPageMappingUtils::mapHtmlResponse);
    }
}
