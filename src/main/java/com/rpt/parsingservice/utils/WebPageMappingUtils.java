package com.rpt.parsingservice.utils;

import com.rpt.parsingservice.model.CountReviewRateResponse;
import lombok.experimental.UtilityClass;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static com.rpt.parsingservice.constants.ElementClasses.RATING_HTML_CLASS;
import static com.rpt.parsingservice.constants.ElementClasses.REVIEW_COUNT_HTML_CLASS;

@UtilityClass
public class WebPageMappingUtils {

    public CountReviewRateResponse mapHtmlResponse(String page) {
        Document doc = Jsoup.parse(page);
        Elements ratingElements = doc.getElementsByClass(RATING_HTML_CLASS);
        Elements reviewElements = doc.getElementsByClass(REVIEW_COUNT_HTML_CLASS);
        if (ratingElements.isEmpty() || reviewElements.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Domain not found");
        }
        String ratingText = ratingElements.get(0).text();
        Long reviewsCount = Long.parseLong(reviewElements.get(0).text().replaceAll("\\D", ""));
        Double rating = Double.parseDouble(ratingText.split(" ")[0].replace(",", "."));
        return new CountReviewRateResponse(reviewsCount, rating);
    }
}
