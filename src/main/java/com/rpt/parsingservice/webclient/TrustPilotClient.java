package com.rpt.parsingservice.webclient;

import org.jsoup.nodes.Document;
import reactor.core.publisher.Mono;

public interface TrustPilotClient {
    Mono<Document> getBusinessUnitInfoWebPage(String businessUnitDomainName);
}
