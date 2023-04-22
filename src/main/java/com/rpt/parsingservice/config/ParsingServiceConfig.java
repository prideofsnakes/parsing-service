package com.rpt.parsingservice.config;

import com.rpt.parsingservice.webclient.TrustPilotProps;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

@EnableConfigurationProperties(TrustPilotProps.class)
@Configuration
public class ParsingServiceConfig {

    @Bean
    @Scope(value = "singleton")
    public WebClient client() {
        final int memorySize = 16 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(memorySize))
                .build();
        return WebClient.builder()
                .exchangeStrategies(strategies)
                .build();
    }
}
