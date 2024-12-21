package com.openclassrooms.webapp;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConfigurationProperties(prefix = "com.openclassrooms.webapp")

public class CustomProperties {

    private String apiUrl;


    // Getter pour apiUrl
    public String getApiUrl() {
        return apiUrl;
    }

    // Setter pour apiUrl
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }
}
