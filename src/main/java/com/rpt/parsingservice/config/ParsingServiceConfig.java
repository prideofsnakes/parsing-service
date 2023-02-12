package com.rpt.parsingservice.config;

import com.rpt.parsingservice.webclient.TrustPilotProps;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@EnableConfigurationProperties(TrustPilotProps.class)
@Configuration
public class ParsingServiceConfig {

    @Bean
    public WebClient client() {
        return WebClient.builder().build();
    }
}
