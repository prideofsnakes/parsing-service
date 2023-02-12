package com.rpt.parsingservice.controller;

import com.rpt.parsingservice.model.CountReviewRateResponse;
import com.rpt.parsingservice.service.ParsingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class ParsingController {
    private final ParsingService service;

    @GetMapping
    public Mono<CountReviewRateResponse> getBusinessUnitInfo(){
        return Mono.empty();
    }
}
