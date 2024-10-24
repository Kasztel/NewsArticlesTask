package com.example.newsarticles.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.http.HttpClient;
import java.time.Duration;

@Configuration
public class OpenAIConfig {

    @Value("${api.key}")
    private String apiKey;

    @Value("${openai.api.url}")
    private String apiUrl;

    // Timeout configuration (optional)
    @Value("${openai.api.timeout}")
    private Long timeout;

    // HTTP Client Bean to be used across the application
    @Bean
    public HttpClient httpClient() {
        return HttpClient.newBuilder()
                .connectTimeout(Duration.ofMillis(timeout))
                .build();
    }

    // Getter for API Key
    public String getApiKey() {
        return apiKey;
    }

    // Getter for Base URL
    public String getApiUrl() {
        return apiUrl;
    }
}
