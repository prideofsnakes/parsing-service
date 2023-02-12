package com.rpt.parsingservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
public class CountReviewRateResponse {
    Long reviewsCount;
    Double rating;
}
