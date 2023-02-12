package com.rpt.parsingservice.webclient;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Component
@Slf4j
public class TrustPilotClientImpl implements TrustPilotClient {

    private final WebClient client;
    private final TrustPilotProps props;

    @Override
    public Mono<String> getBusinessUnitInfoWebPage(String businessUnitDomainName) {
        return client.get()
                .uri(UriComponentsBuilder
                        .fromUriString(props.getUrl())
                        .path(props.getReviewEndpoint() + businessUnitDomainName)
                        .build()
                        .toUri())
                .retrieve()
                .bodyToMono(String.class)
                .doOnError(WebClientResponseException.class, this::handleError);
    }

    private void handleError(WebClientResponseException error) {
        log.error("Error during request {} - response: {}", error.getRequest() == null ? "'null'" : error.getRequest().getURI(), error.getResponseBodyAsString());
    }
}
