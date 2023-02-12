package com.rpt.parsingservice.webclient;

import reactor.core.publisher.Mono;

public interface TrustPilotClient {
    Mono<String> getBusinessUnitInfoWebPage(String businessUnitDomainName);
}
