package com.rpt.parsingservice.model;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class CountReviewRateResponse {
    Long reviewsCount;
    Double rating;
}
