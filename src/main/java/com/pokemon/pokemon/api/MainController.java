package com.pokemon.pokemon.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Value("${application.version}")
    private String applicationVersion;

    @GetMapping("/version")
    public String getApplicationVersion() {
        return applicationVersion;
    }
}
