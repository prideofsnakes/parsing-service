package com.rpt.parsingservice.webclient;

import lombok.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("module.integrations.trustpilot.client")
@Value
public class TrustPilotProps {
    String reviewEndpoint;
    String url;
}
